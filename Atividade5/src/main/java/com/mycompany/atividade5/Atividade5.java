package com.mycompany.atividade5;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int TotalAlunos = 2;
                
        double[] nota1 = new double[TotalAlunos];
        double[] nota2 = new double[TotalAlunos];
        double[] Result = new double[TotalAlunos];
        
        for (int i = 0; i< TotalAlunos; i++){
           System.out.println("\nAluno " + (i + 1) + ":");
           
            System.out.print("Digite a 1ª nota: ");
            nota1[i] = scanner.nextDouble();
            System.out.print("Digite a 2ª nota: ");
            nota2[i] = scanner.nextDouble();
            
            Result[i] = (nota1[i] + nota2[i]) / 2.0;
        } 
               
        System.out.print("\n");
        
        for (int i = 0; i< TotalAlunos; i++){
            String Situacao;
            if(Result[i] >= 7.0){
                Situacao = "Aprovado";
            }
            else{
                Situacao = "Reprovado";
            }
                   
            System.out.println("Aluno " + (i + 1) + " | Nota 1: " + nota1[i] + " | Nota 2: " + nota2[i] + " | Média: " + Result[i] + " | Situação: " + Situacao);
        }
        }
    }
