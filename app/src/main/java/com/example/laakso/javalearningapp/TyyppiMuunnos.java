package com.example.laakso.javalearningapp;

import java.util.Random;

/**
 * Created by Laakso on 11.12.2017.
 */

public class TyyppiMuunnos {

    private enum operandi {DOUBLE, INTEGER, BINARY, STRING }
    Luku operoitava;
   // String answer;
    Random rng;

    public TyyppiMuunnos() {
        rng = new Random();
    }

    public String GetNewProblem() {

        switch(randomOperandi()) {
            case DOUBLE:
                operoitava = new DoubleLuku();
                return operoitava.Muunna();
            case INTEGER:
                operoitava = new IntegerLuku();
                return operoitava.Muunna();
            case BINARY:
                operoitava = new BinaryLuku();
                return operoitava.Muunna();
            case STRING:
                operoitava = new StringLuku();
                return operoitava.Muunna();
            default:
                return null;
        }


    }

    // MUISTA MUUTTAA TAKASIN RANDOMIKSI !!!!!
    private operandi randomOperandi() {

        int pick = rng.nextInt(operandi.values().length);
        return operandi.STRING;
        // return operandi.values()[pick];
    }

    public String GetAnswer() {
        return operoitava.GetAnswer();
    }

}
