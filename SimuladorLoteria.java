package projetos.Loteria;

import java.util.Scanner;
import java.util.ArrayList;




public class SimuladorLoteria {

    public static void main(String[] args) {

        ArrayList<Bilhete>bilhetes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

    //Solicitando Bilhete do usuario
        while (true){

            System.out.println("Digite 6 números para o seu bilhete (entre 1 e 60: ");
        int [] numerosEscolhidos = new int[6];

        //Usuario escolhe os numeros

            for (int i = 0; i < numerosEscolhidos.length; i++){
                System.out.println("Digite o numero " + (i + 1) + ": " );
                numerosEscolhidos[i] = scanner.nextInt();
            }
            //criamos o bilhete com os numeros escolhidos

            Bilhete bilhete = new Bilhete(numerosEscolhidos);

            bilhetes.add(bilhete);

            // pergunta se o usuario quer continuar
            System.out.println("Deseja registrar outro bilhete? (s / n)");

            String resposta = scanner.next();

            if(resposta.equals("n")) {
                break;
            }
        }
// Realizar o sorteio para cada bilhete
        System.out.println("Realizando o sorteio...");

        for(Bilhete bilhete : bilhetes) {
            bilhete.realizarSorteio();
            bilhete.exibirResultado();
        }

        scanner.close();
    }
}
