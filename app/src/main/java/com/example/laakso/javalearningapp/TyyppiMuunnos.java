package com.example.laakso.javalearningapp;

import java.util.Random;

/**
 * Created by Laakso on 11.12.2017.
 */

public class TyyppiMuunnos {

    private enum operandi {BOOLEAN, CHAR, BYTE, SHORT, INT, LONG, FLOAT, DOUBLE };
    String answer;
    Random rng;

    public TyyppiMuunnos() {
    }

    public String GetNewProblem() {
        String problem;


        rng = new Random();
        double i = rng.nextDouble()*100;
        problem = "double i = " + i + "\n";
        int h = (int)i;
        problem = problem + "int h = (int)i\n";
        problem = problem + "what is the value of h?";

        answer = "" + h;

        return problem;
    }

    public String GetAnswer() {
        return answer;
    }

}
