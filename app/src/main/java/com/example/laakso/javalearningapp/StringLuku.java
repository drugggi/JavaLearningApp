package com.example.laakso.javalearningapp;

// import Luku;

/**
 * Created by Laakso on 13.12.2017.
 */

public class StringLuku extends Luku {

    private enum operandi {PLUS, SUBSTRING, LENGTH, INDEXOF}
    static final String merkit = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnpqrstuvwxyz";
    static final char W = '"';
    @Override
    String Muunna() {

        switch (randomOperandi()) {
            case PLUS:
                return plusOperandi();
            case SUBSTRING:
                return substringOperandi();
            case LENGTH:
                return lengthOperandi();
            case INDEXOF:
                return indexofOperandi();
            default:
                return null;
        }

    }

    private String indexofOperandi() {
        String problem;
        String a = randomMerkit(super.rng.nextInt(20)+10);

        String b;
        if (super.rng.nextBoolean() ) { b = randomMerkit(1);}
        else { b = Character.toString(a.charAt(super.rng.nextInt(a.length()))); }

        int h = a.indexOf(b);
        problem = "String a = " + W + a + W + ";\n";
        problem = problem + "int h = a.indexOf(" + b + ");\n What is the value of h?";

        super.answer = Integer.toString(h);

        return problem;
    }

    private String lengthOperandi() {
        String problem;
        String a = randomMerkit(super.rng.nextInt(15)+1);
        problem = "String a = " + W + a + W + ";\n";
        problem = problem + "int h = a.length();\n What is the value of h?";

        // int prob = a.length();
        super.answer = Integer.toString(a.length());

        return problem;
    }

    private String substringOperandi() {
        String problem;
        String a = randomMerkit(super.rng.nextInt(10)+5);
        int alku = super.rng.nextInt(a.length()-1);
        int loppu = super.rng.nextInt(a.length() - alku) + 1;
        loppu = alku + loppu;

        // Safety check, this should never be true, if alku and loppu have been correctly calculated.
        if (alku >= loppu || loppu >= a.length() ) { alku = 2; loppu = 4; }

        problem = "String a = " + W + a + W + ";\n";
        problem = problem + "String h = a.substring(" + alku +"," + loppu + ");\n What is the value of h?";
//        problem = "alku: " + alku + " loppu: " + loppu + " a: "+ a + " subS: " +  a.substring(alku,loppu);

        super.answer = a.substring(alku,loppu);

        return problem;
    }

    private String plusOperandi() {
        String problem;

        String a = randomMerkit(super.rng.nextInt(5)+1);
        String b = randomMerkit(super.rng.nextInt(5)+1);
        String h = a + b ;
        problem = "String h = "+ W + a + W + " + " + W + b + W + ";\n" + "What is the value of h?";
        super.answer = h;
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

    private operandi randomOperandi() {
        int pick = super.rng.nextInt(operandi.values().length);
        return operandi.values()[pick];
    }

    @Override
    String GetAnswer() {
        return super.answer;
    }
}
