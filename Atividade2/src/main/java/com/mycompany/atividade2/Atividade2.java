package com.mycompany.atividade2;

public class Atividade2 {

    public static void main(String[] args) {
        int[] A = {5, 6, 8, 10, 15, 20,25,30, 35, 40};
        
        int[] B = {1,2,3,4,5,6,7,8,9,10};
        
        int[] C = new int[10];
         
        for (int i = 0; i <10; i++){
            C[i] = A[i] + B[i];
        }
        
         for (int i = 0; i <A.length; i++){
        System.out.println("A[" + i + "] = " + A[i]);
    }
        
        System.out.println("\n");
        
        for (int i = 0; i < B.length; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        } 
                
        System.out.println("\n");
        
        for (int i = 0; i < C.length; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }
    }
}
