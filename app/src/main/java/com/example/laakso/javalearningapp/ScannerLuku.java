package com.example.laakso.javalearningapp;

// import Luku;

import java.util.Scanner;

/**
 * Created by Laakso on 1.2.2018.
 */

public class ScannerLuku extends Luku {

    private enum operandi {NEXT}
    static final String merkit = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnpqrstuvwxyz";
    static final char W = '"';

    @Override
    String Muunna() {
        switch (randomOperandi()) {
            case NEXT:
                return nextOperandi();

            default:
                return null;
        }
    }

    private String nextOperandi() {
        String problem="";
        int i = super.rng.nextInt(7) + 3;

        String sc_string = W +"";

        while (i > 0 ) {
            sc_string = sc_string + randomMerkit(super.rng.nextInt(15)+ 5) + "\n";
            --i;
        }
        sc_string = sc_string + "4" + W;
        Scanner sc = new Scanner(sc_string);
        int k = 124421;
        if (sc.hasNextInt() ) { k = sc.nextInt(); }
        //super.answer = Integer.toString(sc.nextInt());
        problem = "String h = " + k +sc_string + "\n";

        sc.close();
        return problem;
    }

    private String randomMerkit(int pituus) {
        int i = 0;
        String palautus = new String();
        while (i < pituus) {
            palautus = palautus + merkit.charAt(super.rng.nextInt(merkit.length() ) ) ;
            // palautus.append( merkit.charAt(super.rng.nextInt(merkit.length() ) ) );
            i++;
        }
        return palautus;

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
