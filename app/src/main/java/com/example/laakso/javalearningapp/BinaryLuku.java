package com.example.laakso.javalearningapp;

// import Luku;

/**
 * Created by Laakso on 12.12.2017.
 */

public class BinaryLuku extends Luku {

    private enum operandi{JA,TAI,UP,TILDE,SHIFT_L, SHIFT_R, SHIFT_RR}

    @Override
    String Muunna() {

        switch(randomOperandi()) {
            case JA:
                return jaOperandi();
            case TAI:
                return taiOperandi();
            case UP:
                return upOperandi();
            case TILDE:
                return tildeOperandi();
            case SHIFT_L:
                return shiftLOperandi();
            case SHIFT_R:
                return shiftROperandi();
            case SHIFT_RR:
                return shiftRROperandi();
            default:
                return null;
        }

        // return null;
    }

    @Override
    String GetAnswer() {
        return super.answer;
    }
    private String shiftRROperandi() {
        String problem;

        int a = super.rng.nextInt(128);
        int b = super.rng.nextInt(8);
        int ans = a >>> b;

        problem = "int ans = " + Integer.toBinaryString(a) + " >>> " + Integer.toBinaryString(b) + ";\n";
        problem = problem + "What value ans holds in binary ";

        super.answer = "" + Integer.toBinaryString(ans);
        return problem;
    }


    private String shiftROperandi() {
        String problem;

        int a = super.rng.nextInt(128);
        int b = super.rng.nextInt(8);
        int ans = a >> b;

        problem = "int ans = " + Integer.toBinaryString(a) + " >> " + Integer.toBinaryString(b) + ";\n";
        problem = problem + "What value ans holds in binary ";

        super.answer = "" + Integer.toBinaryString(ans);
        return problem;
    }

    private String shiftLOperandi() {
        String problem;

        int a = super.rng.nextInt(128);
        int b = super.rng.nextInt(8);
        int ans = a << b;

        problem = "int ans = " + Integer.toBinaryString(a) + " << " + Integer.toBinaryString(b) + ";\n";
        problem = problem + "What value ans holds in binary ";

        super.answer = "" + Integer.toBinaryString(ans);
        return problem;
    }

    private String tildeOperandi() {
        String problem;

        int a = super.rng.nextInt(10000);

        int ans = ~a;
        // int ans = ansa;
        problem = "int ans = ~" + a +";\n";
        problem = problem + "What value ans holds in binary";

        super.answer = "" + ans;
        return problem;
    }

    private String upOperandi() {
        String problem;

        int a = super.rng.nextInt(128);
        int b = super.rng.nextInt(128);
        int ans = a ^ b;

        problem = "int ans = " + Integer.toBinaryString(a) + " ^ " + Integer.toBinaryString(b) + ";\n";
        problem = problem + "What value ans holds in binary ";

        super.answer = "" + Integer.toBinaryString(ans);
        return problem;
    }

    private String taiOperandi() {
        String problem;

        int a = super.rng.nextInt(128);
        int b = super.rng.nextInt(128);
        int ans = a | b;

        problem = "int ans = " + Integer.toBinaryString(a) + " | " + Integer.toBinaryString(b) + ";\n";
        problem = problem + "What value ans holds in binary";

        super.answer = "" + Integer.toBinaryString(ans);
        return problem;
    }

    private String jaOperandi() {
        String problem;

        int a = super.rng.nextInt(128);
        int b = super.rng.nextInt(128);
        int ans = a & b;

        problem = "int ans = " + Integer.toBinaryString(a) + " & " + Integer.toBinaryString(b) + ";\n";
        problem = problem + "What value ans holds in binary";

        super.answer = "" + Integer.toBinaryString(ans);
        return problem;
    }

    private operandi randomOperandi() {
        int pick = super.rng.nextInt(operandi.values().length);
        return operandi.values()[pick];
    }

}
