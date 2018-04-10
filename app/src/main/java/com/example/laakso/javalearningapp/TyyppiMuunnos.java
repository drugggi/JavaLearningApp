package com.example.laakso.javalearningapp;

import java.util.Random;

/**
 * Created by Laakso on 11.12.2017.
 */

public class TyyppiMuunnos {

    private enum operandi {DOUBLE, INTEGER, BINARY, STRING, SCANNER, CONTAINERS }
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
            case SCANNER:
                operoitava = new ScannerLuku();
                return operoitava.Muunna();
            case CONTAINERS:
                operoitava = new Containers();
                return operoitava.Muunna();
            default:
                 operoitava = new IntegerLuku();
        }
        return operoitava.Muunna();

    }

    // MUISTA MUUTTAA TAKASIN RANDOMIKSI !!!!!
    private operandi randomOperandi() {

        int pick = rng.nextInt(operandi.values().length);
        //return operandi.CONTAINERS;
         return operandi.values()[pick];
    }

    public String GetAnswer() {
        return operoitava.GetAnswer();
    }

}
