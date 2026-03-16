package lab2;

import java.util.*;

public class Problema251 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for(int i=0; i<5; i++) x.add(rand.nextInt(11));
        for(int i=0; i<7; i++) y.add(rand.nextInt(11));

        Collections.sort(x);
        Collections.sort(y);

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        List<Integer> xPlusY = new ArrayList<>(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        Set<Integer> zSet = new TreeSet<>(x);
        zSet.retainAll(y);

        List<Integer> xMinusY = new ArrayList<>(x);
        xMinusY.removeAll(y);

        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();
        for (Integer val : xPlusY) {
            if (val <= p) xPlusYLimitedByP.add(val);
        }

        System.out.println("a) xPlusY: " + xPlusY);
        System.out.println("b) zSet: " + zSet);
        System.out.println("c) xMinusY: " + xMinusY);
        System.out.println("d) xPlusYLimitedByP: " + xPlusYLimitedByP);
    }
}