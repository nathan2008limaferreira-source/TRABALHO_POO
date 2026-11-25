package com.mycompany.atividade6;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tam = 6;
        int[] A = new int[tam];
        int[] B = new int[tam];

        for(int i = 0; i < tam; i++){
            System.out.print("Digite o valor para A[" + i + "]: ");
            A[i] = scanner.nextInt();
            
            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else {
                B[i] = 0;
            }
        }
        
        System.out.print("\nVetor A: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(A[i] + " ");
        }    
        System.out.print("\nVetor B: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
        
    }
}