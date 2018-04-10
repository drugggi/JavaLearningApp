package com.example.laakso.javalearningapp;

// import com.example.laakso.Luku;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Laakso on 10.4.2018.
 */

public class Containers extends Luku {

    private enum operandi {FORLOOP, CONTAINS};

    private String forLoopOperandi() {
        String problem = "ArrayList<Integer> ints = new ArrayList<Integer>();\nint ans = 0;\n";
        ArrayList<Integer> ints = new ArrayList<Integer>();

        int i = super.rng.nextInt(6)+1;
        while ( i > 0) {
            ints.add(super.rng.nextInt(100));
            i--;
        }

        for (Integer number: ints) {
            problem = problem + "ints.add("+number+");\n";

        }

        problem = problem + "        for (Integer number: ints) {\n" +
                "            ans = ans + number;\n" +
                "        }\n" +
                "What value ans holds?";

        int ans = 0;

        for (Integer number: ints) {
            ans = ans + number;
        }

        super.answer = Integer.toString(ans);
        return problem;

    }

    private String containsOperandi() {
        String problem = "List<Integer> ints = new ArrayList<>();\n ";

        List<Integer> ints = new ArrayList<>();
        ints.addAll(Arrays.asList(super.rng.nextInt(10),super.rng.nextInt(10),super.rng.nextInt(10)
        ,super.rng.nextInt(10),super.rng.nextInt(10),super.rng.nextInt(10),
                super.rng.nextInt(10),super.rng.nextInt(10),super.rng.nextInt(10)
        ,super.rng.nextInt(10)));

        problem = problem + "ints.addAll(Arrays.asList(\n";
        for (Integer number: ints) {
            problem = problem + number + " , ";
        }
        problem = problem + ")));\n";

        int ans;
        int i = super.rng.nextInt(10);
        problem = problem + "int ans;\nint i = " + i +";\n";
        if (ints.contains(i)) {
            ans = ints.indexOf(i) * ints.get(ints.indexOf(i));
        }
        else { ans = ints.get(i)*i;}

        problem = problem + "        if (ints.contains(i)) {\n" +
                "            ans = ints.indexOf(i) * ints.get(ints.indexOf(i));\n" +
                "        }\n" +
                "        else { ans = ints.get(i)*i;}\n";
        problem = problem + "What value ans holds?";

        super.answer = Integer.toString(ans);

        return problem;
    }

    @Override
    String Muunna() {

        // Lets generate random operandi enum
        switch (operandi.values()[super.rng.nextInt(operandi.values().length)]) {
            case FORLOOP:
                return forLoopOperandi();
//                return forLoopOperandi();
            case CONTAINS:
                return containsOperandi();
            default:
                return null;
        }
    }

    @Override
    String GetAnswer() {
        return super.answer;
    }
}
