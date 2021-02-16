package com.company;
import java.util.Scanner;
public class dog{
    static{
        Scanner in = new Scanner(System.in);
        int r = 500;
        int j = 1/2;
        int s = 10;
        int d=in.nextInt();
        switch (d){
            case (1):
                System.out.println("Напишите расстояние: ");
                int ras=in.nextInt();
                if (ras>r){
                    System.out.println("False");
                }
                else{
                    System.out.println("True");
                }break;
            case(2):
                System.out.println("Напишите высоту: ");
                int vis=in.nextInt();
                if (vis>j){
                    System.out.println("False");
                }
                else{
                    System.out.println("True");
                }break;
            case(3):
                System.out.println("Напишите расстояние: ");
                int swi=in.nextInt();
                if (swi>s){
                    System.out.println("False");
                }
                else{
                    System.out.println("True");
                }break;
        }
    }
}
