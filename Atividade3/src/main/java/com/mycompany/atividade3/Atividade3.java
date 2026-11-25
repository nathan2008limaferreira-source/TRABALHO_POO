package com.mycompany.atividade3;

public class Atividade3 {

    public static void main(String[] args) {
        int[] A = {5, 6, 8, 10, 15, 20,25,30, 35, 40};
        int soma = 0;
         
        for (int i = 0; i < A.length; i++){
            soma += A[i];
        }
        for(int i=0; i < A.length; i++){
        System.out.println("A[" + i + "] = " + A[i]);
        }
        
        System.out.println("\nA soma de todos os numeros e: " + soma);
    }
}
