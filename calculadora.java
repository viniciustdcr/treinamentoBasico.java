package projetos;
import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System .in);

        System.out.println("Bem vindo! Vamos calcular, defina numero 1 :");
        double numero1 = scanner.nextDouble();
       
        System.out.println(" Escolha o numero da operação operação");
        System.out.println("1 [+] 2 [-] 3 [x] 4 [/] 5 [%]");
        int operação = scanner.nextInt();

        System.out.println("Defina numero 2 :");
        double numero2 = scanner.nextDouble();

        if (operação == 1) {
            soma1(numero1, numero2);

        }else if (operação == 2) {
            subtração2(numero1, numero2);
            
        }else if (operação == 3) {
            multiplicação3(numero1, numero2);
            
        }else if (operação == 4) {
            divisão4(numero1, numero2);
            
        }else if (operação == 5) {
            porcentagem5(numero1, numero2);
            
        } else if (operação > 5) {
            System.out.println("OPERAÇÃO INVALIDA");
        } 
        
        scanner.close();       
         }
         

    public static void soma1 (double numero1, double numero2){
        double resultadoSoma = numero1 + numero2;
        System.out.println("o resultado é: " + resultadoSoma);
       
        
    }
    public static void subtração2 (double numero1, double numero2){
        double resultadoSubtração = numero1 - numero2;
        System.out.println("o resultado da soma é: " + resultadoSubtração);
    }
    public static void multiplicação3 (double numero1, double numero2){
        double resultadoMultiplicação = numero1 * numero2;
        System.out.println("o resultado da soma é: " + resultadoMultiplicação);
    }
    public static void divisão4 (double numero1, double numero2){
        double resultadoDivisão = numero1 / numero2;
        System.out.println("o resultado da soma é: " + resultadoDivisão);
    }
    public static void porcentagem5 (double numero1, double numero2){
        double resultadoPorcentagem = (numero1 * numero2)/100 ;
        System.out.println("o resultado da soma é: " + resultadoPorcentagem);
    }
    
}
