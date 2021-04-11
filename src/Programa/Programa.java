package Programa;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] A = new int[10];

        for(int i=0; i< 10; i++){
            System.out.println("Digite um número a variável A:" + (i+1));
            A[i] = ler.nextInt();
            ler.nextLine();
        }
        for(int i=0; i < 10; i++){
        if(A[i] == 2) {
            System.out.println("É um número primo.\n" + A[i]);
        } else
        if(A[i] == 3){
           System.out.println("É um número primo.\n" + A[i]);
        } else
        if(A[i] == 5){
            System.out.println("É um número primo.\n" + A[i]);
        } else
        if(A[i] == 7){
            System.out.println("É um número primo.\n" + A[i]);
        } else
        if(A[i] == 11){
            System.out.println("É um número primo.\n" + A[i]);
        } else
            System.out.println("Não é um número primo.\n" + A[i]);
         }
        ler.close();
       
    }
    
}
