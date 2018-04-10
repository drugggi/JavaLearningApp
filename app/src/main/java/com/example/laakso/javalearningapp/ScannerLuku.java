package com.example.laakso.javalearningapp;

// import Luku;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Laakso on 1.2.2018.
 */

public class ScannerLuku extends Luku {

    private enum operandi {NEXTINT, NEXT}
    static final String merkit = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnpqrstuvwxyz";
    static final char W = '"';

    @Override
    String Muunna() {
        switch (randomOperandi()) {
            case NEXTINT:
                return nextIntOperandi();
            case NEXT:
                return nextOperandi();

            default:
                return null;
        }
    }

    private String nextOperandi() {
        String problem;
        int i = super.rng.nextInt(4) +2;

        String sc_string = W + "";
        sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " ";
        sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " ";
        sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + "";

        while (i > 0 ) {
            sc_string =  sc_string +" \n" + randomMerkit(super.rng.nextInt(4)+ 1) + " ";
if(super.rng.nextBoolean()) {
            sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " "; }
            if (super.rng.nextBoolean()) {
            sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " "; }
            sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + "";
            --i;
        }



        sc_string = sc_string + W + "\n";

        Scanner sc = new Scanner(sc_string);

        ArrayList<String> hList = new ArrayList<String>();
        while (sc.hasNext() ) {
            hList.add(sc.next());
        }
        i = super.rng.nextInt(hList.size()-2)+1;
        String ans = hList.size() + hList.get(i);

        sc_string = sc_string + "Scanner sc = new Scanner(h);\n" +
                "\n" +
                "        ArrayList<String> hList = new ArrayList<String>();\n" +
                "        while (sc.hasNext() ) {\n" +
                "            hList.add(sc.next());\n" +
                "        }\n" +
                "        i = super.rng.nextInt(hList.size()-2)+1;\n" +
                "        String ans = hList.size() + hList.get("+i+");\n" +
                "   What value ans holds?";

        super.answer = ans;
        problem = "String h = "  +sc_string;

        sc.close();
        return problem;

    }

    private String nextIntOperandi() {
        String problem;
        int i = super.rng.nextInt(6) +3;

        String sc_string = W + "";
        sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " ";
        sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " ";
        sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " ";
        sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " ";
        sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " ";
        sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " ";
        sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " ";
        sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " ";

        while (i > 0 ) {
            sc_string =  sc_string +" \n" + randomMerkit(super.rng.nextInt(4)+ 1) + " ";
            if (super.rng.nextBoolean()) {
            sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " ";
            sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " "; }
            if (super.rng.nextBoolean()) {
            sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " ";
            sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " "; }
            if (super.rng.nextBoolean()) {
            sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " "; }
            sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " ";
            sc_string = sc_string + randomMerkit(super.rng.nextInt(4)+ 1) + " ";
            --i;
        }

        sc_string = sc_string + W + "\n";
        sc_string = sc_string + "Scanner sc = new Scanner(h);\n" +
                "\n" +
                "        int h = 0;\n" +
                "        while (sc.hasNext() ) {\n" +
                "            if (sc.hasNextInt() ) {\n" +
                "                h = h + sc.nextInt();\n" +
                "            }\n" +
                "            else { String jama = sc.next();}\n" +
                "        } \n\n" +
        "What value parameter h holds";

        Scanner sc = new Scanner(sc_string);

        int h = 0;
        while (sc.hasNext() ) {
            if (sc.hasNextInt() ) {
                h = h + sc.nextInt();
            }
            else { String jama = sc.next();}
        }
        /*
        int k = 0;
        if (sc.hasNextInt() ) {
            k = sc.nextInt();
           super.answer = Integer.toString(k);
        }*/

        super.answer = Integer.toString(h);
         problem = "String h = "  +sc_string;

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
