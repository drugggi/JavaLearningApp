package com.example.laakso.javalearningapp;

// import Luku;

/**
 * Created by Laakso on 12.12.2017.
 */

public class DoubleLuku extends Luku {


    @Override
    String Muunna() {
        String problem;
        double i = super.rng.nextDouble()*100;
        problem = "double i = " + i + "\n";
        int h = (int)i;
        problem = problem + "int h = (int)i;\n";
        problem = problem + "what is the value of h?";

        super.answer = "" + h;

        return problem;
    }

    @Override
    String GetAnswer() {
        return super.answer;
    }
}
