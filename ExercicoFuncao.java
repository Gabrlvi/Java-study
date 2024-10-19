//Exercicio 5//

import java.util.Scanner;

public class Main {
    
    
    public static void exibirDiaSemana(int numero){
    
    switch (numero){
        
        case 1 :
        System.out.println("Domingo");
            break;
        
        case 2 :
        System.out.println("Segunda Feira");
            break;
            
        case 3 :
        System.out.println("Terça Feira");
            break;
            
        case 4 :
        System.out.println("Quarta Feira");
            break;
        
        case 5 :
    System.out.println("Quinta Feira");
            break;
            
        case 6 :
        System.out.println("Sexta Feira");
            break;
         
        case 7 :
        System.out.println("Sabado");
            break;
            
        default :
        System.out.println("Dia da semana invalido");
            break;

    }

    
        
    }
    
    public static void main (String[]args){
        
        exibirDiaSemana(1);
        exibirDiaSemana(2);
        exibirDiaSemana(3);
        exibirDiaSemana(4);
        exibirDiaSemana(5);
        exibirDiaSemana(6);
        exibirDiaSemana(7);
        exibirDiaSemana(10);


    }
}