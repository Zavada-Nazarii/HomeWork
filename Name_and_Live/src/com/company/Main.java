package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String text = scanner.nextLine();
        System.out.println("Where are you live," + " " + text + " " + "?");
        String textLive = scanner.nextLine();
        System.out.println("Nice too meet," + " " + text + " " + "from" + " " + textLive + " " + ":)");
    }
}
