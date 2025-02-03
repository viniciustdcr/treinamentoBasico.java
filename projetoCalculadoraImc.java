package projetos;
import java.util.Scanner;
public class projetoCalculadoraImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Bem vindo a calculadora IMC");
        System.out.println("Qual o seu peso? ");
        double peso = scanner.nextDouble();
        System.out.println("Qual sua altura? ");
        double altura = scanner.nextDouble();
        
        double calculoAltura = altura * altura;

       double imc = peso / calculoAltura ;

         if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }
        if (imc >= 18.5 && (imc <=24.9)) {
            System.out.println("Peso normal");
        }
        if (imc >=25 &&(imc <40)) {
            System.out.println("sobre peso");
        } if (imc > 40.0 ) {
            System.out.println("Obesidade morbida");
        }


        
        scanner.close();
    }
}
