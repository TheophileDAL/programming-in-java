package agh.ii.prinjava.lab05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Integer> l2 = new ArrayList<>(List.of(1,2,3,4));
        System.out.print(l2);
        for (int i = 0; i < l2.size(); i++)
            System.out.print(l2.remove(i));
    }
}
