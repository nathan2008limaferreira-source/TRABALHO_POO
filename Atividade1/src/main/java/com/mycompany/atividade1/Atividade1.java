package com.mycompany.atividade1;

public class Atividade1 {

    public static void main(String[] args) {
        int[] A = {5, 6, 8, 10, 15, 20,25,30, 35, 40};
        
        int[] B = new int[10];
        
        for (int i = 0; i < A.length; i++){
            B[i] = A[i] * i;
        }
        
        for (int i = 0; i <A.length; i++){
        System.out.println("A[" + i + "] = " + A[i]);
    }
        
        System.out.println("\n");
        
        for (int i = 0; i < B.length; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
}
}
