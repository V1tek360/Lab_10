package com.company;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите питомца: ");
        System.out.println("1)Кот");
        System.out.println("2)Собака");
        int s=in.nextInt();
        if (s==1) {
            System.out.println("Выберите действие");
            System.out.println("1)Бег");
            System.out.println("2)Прыжок через препятствие");
            System.out.println("3)Плавание");
            kot kot1 = new kot();
            }
        if (s==2){
            System.out.println("Выберите действие");
            System.out.println("1)Бег");
            System.out.println("2)Прыжок через препятствие");
            System.out.println("3)Плавание");
            dog dog1 = new dog();
        }
    }
}
