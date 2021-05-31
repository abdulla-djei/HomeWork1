package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final String name = "Samat";
        System.out.println("Саламатсызбы " + name );
        System.out.println("Введите имя");
        Scanner getName = new Scanner(System.in);
        String s = getName.nextLine();
        System.out.println("Саламатсызбы "+ s);
        

    }
}
