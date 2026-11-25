package com.mycompany.atividade7;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] A = new int[10];
        
        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor para a posicao " + i + ": ");
            A[i] = scanner.nextInt();
        }
        
        Arrays.sort(A);
        
        System.out.print("\nVetor Ordenado: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " | ");
        }
    }
}
