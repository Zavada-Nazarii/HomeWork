package com.company;

import java.util.Scanner;

public class Main {

    private static Object Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву країни із наступного переліку - Poland/German/Spanish." + "" + " " +  "Вартість розмови за годину із" + " " + "Poland - 10/60 min," + " " + "German - 20/60 min," + " " + "Spanish - 35/60 min,");
        String text = scanner.nextLine();
        System.out.println("Введіть час розмови у хвилинах -" + " ");
        int allTime = scanner.nextInt();
        int c1 = 10;
        int c2 = 20;
        int c3 = 35;
        String t1 = "Poland";
        String t2 = "German";
        String t3 = "Spanish";
        String empty = "";
        if (text.equals(t1))
        {
            System.out.println("Вартість вашої розмови" + " " + (allTime * c1) + " " + "гривень.");
        }
        else if (text.equals(t2))
        {
            System.out.println("Вартість вашої розмови" + " " + (allTime * c2) + " " + "гривень.");
        }
        else if (text.equals(t3))
        {
            System.out.println("Вартість вашої розмови" + " " + (allTime * c3) + " " + "гривень.");
        }
        else if (text.equals(empty))
        {
            System.out.println("Ви не ввели одного із параметрів, запустіть програму знову.");
        }
    }
}