package com.example.laakso.javalearningapp;

import java.util.Random;

/**
 * Created by Laakso on 12.12.2017.
 */

public abstract class Luku {
    protected Random rng;
    protected String answer;

    public Luku() {
        rng = new Random();
    }

    abstract String Muunna();
    abstract String GetAnswer();

}
