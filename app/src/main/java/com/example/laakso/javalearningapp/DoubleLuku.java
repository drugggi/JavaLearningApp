package com.example.laakso.javalearningapp;

// import Luku;

/**
 * Created by Laakso on 12.12.2017.
 */

public class DoubleLuku extends Luku {

    private enum operandi {DOUBLE, JAKO, CHARKERTO}

    @Override
    String Muunna() {

        switch (randomOperandi()) {
            case DOUBLE:
                return doubleOperandi();
            case JAKO:
                return jakoOperandi();
            case CHARKERTO:
                return charKertoOperandi();
            default:
                return null;
        }

    }

    private String charKertoOperandi() {
        String problem;

        //double h = 100*super.rng.nextDouble();
        String h = Double.toString(100*(super.rng.nextDouble()/super.rng.nextDouble()) );
        problem = "String h = Double.toString("+ h + ");\n";

        int n = super.rng.nextInt(15);
        int m = super.rng.nextInt(15);
        int pilkku = h.indexOf(".");

        if ( n == pilkku) {n++;}
        if ( m == pilkku) {m++;}
        problem = problem + "int ans = Character.getNumericValue(h.charAt("+n+"));\n";
        problem = problem + "ans = ans * Character.getNumericValue(h.charAt("+m+"));\n";
        problem = problem + "What value ans holds?";

        int ans = Character.getNumericValue(h.charAt(n))*Character.getNumericValue(h.charAt(m)) ;

        super.answer = Integer.toString(ans);

        return problem;
    }

    private String doubleOperandi() {
        String problem;
        double i = super.rng.nextDouble() * 100;
        problem = "double i = " + i + "\n";
        int h = (int) i;
        problem = problem + "int h = (int)i;\n";
        problem = problem + "what is the value of h?";

        super.answer = "" + h;

        return problem;
    }

    private String jakoOperandi() {
        String problem;
        int o = super.rng.nextInt(32);
        int n = super.rng.nextInt(32);

        if (o/n > 10) { n = 10; }

        double ans = (double)o / (double)n;
        problem = "double ans = (double)"+ o +" / "+ "(double)"+n+";\n";
        problem = problem + "What value double ans holds with one decimal\n" +
                " precision without rounding up";

        super.answer = "" + Double.toString(ans);
        super.answer = super.answer.substring(0,3);

        return problem;
    }


    @Override
    String GetAnswer() {
        return super.answer;
    }

    private operandi randomOperandi() {
        int pick = super.rng.nextInt(operandi.values().length);
        return operandi.values()[pick];
    }
}
