import java.util.Scanner;

    public class Main{
        
        public static void calcularFatorial(){
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Digite um numero inteiro a ser calculado seu fatorial");
            int num = sc.nextInt();
            
            long fatorial = 1 ;
            
            for (int i = 1 ; i <= num; i++){
                
            fatorial *= i ;
                
            }
            
            System.out.println( fatorial );
        }
        
        public static void main (String[]args){
            
            calcularFatorial();
        }
    }
    
       