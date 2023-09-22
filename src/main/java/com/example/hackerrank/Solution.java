package com.example.hackerrank;

import java.util.Scanner;

public class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = 0;
            int sum = 0;
            for(int j=0; j<=n-1; j++){
                sum += (int)Math.pow(2, j)*b;
                result = a + sum;
                System.out.print(result+" ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
