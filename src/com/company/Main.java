package com.company;

import java.util.Scanner;

public class Main {
  static   Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
   boolean a=getBoolean();


    }
    public static boolean getBoolean(){
        if (scanner.hasNextBoolean()){
            boolean isBool = scanner.nextBoolean();
            scanner.nextLine();
            return isBool;
        }
        System.out.println(scanner.nextLine() + "- вы ввели, а не число. Повторите ввод");
        return getBoolean();
    }


}
