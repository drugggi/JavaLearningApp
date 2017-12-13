package com.example.laakso.javalearningapp;

// import Luku;

/**
 * Created by Laakso on 12.12.2017.
 */

public class IntegerLuku extends Luku {

    private enum operandi {JAKO, MOD, KERTO}

    @Override
    String Muunna() {


        switch(randomOperandi() ) {
            case JAKO:
                return jakoOperandi();
            case MOD:
                return modOperandi();
            case KERTO:
                return kertoOperandi();
            default:
                return null;
        }

    }

    private String kertoOperandi() {
        int n = super.rng.nextInt(128);
        int m = super.rng.nextInt(128);
        int ans;
        String problem;

        ans = n*m;
        problem = "int ans = " + n + "*" + m +";\n" + "What value ans holds?";
        super.answer = "" + ans;

        return problem;
    }

    private String modOperandi() {
        int n = super.rng.nextInt(128);
        int m = super.rng.nextInt(64);
        int ans;
        String problem;

        ans = n%m;
        problem = "int ans = " + n + "%" + m +";\n" + "What value ans holds?";
        super.answer = "" + ans;

        return problem;
    }

    private String jakoOperandi() {
        int n = super.rng.nextInt(128);
        int m = super.rng.nextInt(64);
        int ans;
        String problem;

        ans = n/m;
        problem = "int ans = " + n + "/" + m +";\n" + "What value holds?";
        super.answer = "" + ans;

        return problem;
    }

    private operandi randomOperandi() {
        int pick = super.rng.nextInt(operandi.values().length);
        return operandi.values()[pick];
    }

    @Override
    String GetAnswer() {
        return super.answer;
    }
}
