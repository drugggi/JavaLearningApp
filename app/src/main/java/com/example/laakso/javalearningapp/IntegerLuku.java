package com.example.laakso.javalearningapp;

// import Luku;

/**
 * Created by Laakso on 12.12.2017.
 */

public class IntegerLuku extends Luku {

    @Override
    String Muunna() {
        boolean jako = super.rng.nextBoolean();
        int n = super.rng.nextInt(100);
        int m = super.rng.nextInt(50);
        int ans;
        String problem;

        if (jako) {
            ans = n/m;
            problem = "int ans = " + n + "/" + m +";\n" + "What value holds?";
            super.answer = "" + ans;
        }
        else {
            ans = n%m;
            problem = "int ans = " + n + "%" + m +";\n" + "What value ans holds?";
            super.answer = "" + ans;
        }

        return problem;
    }

    @Override
    String GetAnswer() {
        return super.answer;
    }
}
