//Exercicio 4//

import java.util.Scanner;

public class Main {
    
    
    public static void isPar(int numero){
        
    if (numero % 2 == 0){
        System.out.println("true");
        System.out.println("número par");
    }
    else {
        System.out.println("False");
        System.out.println("número ímpar");
    }
    
        
    }
    
    public static void main (String[]args){
        
    Scanner sc = new Scanner(System.in);
           
    System.out.println("Digite um numero inteiro ");
    int numero = sc.nextInt();
    isPar(numero);
        
    }
}