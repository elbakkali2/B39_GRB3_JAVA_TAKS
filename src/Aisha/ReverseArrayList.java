package Aisha;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.reverse(list);
        System.out.println(list);






    }
}
