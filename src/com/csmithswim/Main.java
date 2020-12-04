package com.csmithswim;
import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String even="";
            String odd="";
            String inputString = sc.next();
            String[] stringArray = inputString.split("");

            for (int j = 0; j < stringArray.length; j += 2) {
                even += stringArray[j];}
            for (int k = 1; k < stringArray.length; k +=2){
                odd += stringArray[k];
            }
            System.out.println(even + " " + odd);
       }
    }
}


