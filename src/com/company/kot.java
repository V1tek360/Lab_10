package com.company;
import java.util.Scanner;
public class kot {
    static  {
        Scanner in = new Scanner(System.in);
        int r = 200;
        int j = 2;
        int s = 0;
        int k = in.nextInt();
        switch (k) {
            case (1):
                System.out.println("Напишите расстояние: ");
                int ras = in.nextInt();
                if (ras > r) {
                    System.out.println("False");
                } else {
                    System.out.println("True");
                }
                break;
            case (2):
                System.out.println("Напишите высоту: ");
                int vis = in.nextInt();
                if (vis > j) {
                    System.out.println("False");
                } else {
                    System.out.println("True");
                }
                break;
            case (3):
                System.out.println("Кот не умеет плавать");
                break;
        }
    }
}
