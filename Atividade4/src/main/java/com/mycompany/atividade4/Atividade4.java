package com.mycompany.atividade4;

public class Atividade4 {

    public static void main(String[] args) {
       int[] A = {5, 6, 8, 10, 15, 20,25,30, 35, 40};
       int par = 0;
       int impar = 0;
    
       for (int i= 0; i <A.length;i++){
        if(A[i] % 2 == 0){
            par++;
        }
        else{
            impar++;
        }
    }
       double Ppar = (double) par / A.length * 100;
       double Pimpar = (double) impar / A.length * 100;
       
       for (int i = 0; i < A.length; i++){
            System.out.println("A[" + i + "] = " + A[i]);
        }
       
        System.out.println("\nPercentual de numeros pares: " + Ppar + "%");  
        System.out.println("Percentual de numeros impares: " + Pimpar + "%");
       
    }
}
