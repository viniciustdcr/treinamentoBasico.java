package projetos.Loteria;

import java.util.Arrays;
import java.util.Random;
public class Bilhete {

    private int [] resultadoSorteio;
    private int [] numerosEscolhidos;
    

        public Bilhete (int [] numerosEscolhidos) {
            this.numerosEscolhidos = numerosEscolhidos;

        }
// metodos p realizar sorteio
        public void realizarSorteio(){
        Random random = new Random();

        resultadoSorteio = new int [6];

            for (int i = 0; i < 6; i++) {
                resultadoSorteio[i] = random.nextInt(60) + 1; // gera numeros entre 1 e 60.
            }
            Arrays.sort(resultadoSorteio);   //Ordena os numeros do Array.
        }
//Metodo para contar quantos numeros o jogador acertou

        public int contarAcertor(){
            int acerto = 0;
            for (int numeroEscolhido : numerosEscolhidos){
                for(int numeroSorteado: resultadoSorteio){
                    if (numeroEscolhido == numeroSorteado){
                        acerto++;
                    }
                }
            }
            return acerto;
        }
    //exibir acertos
        public void exibirResultado(){
            System.out.println("Numeros escolhidos: "+  Arrays.toString(numerosEscolhidos));
            System.out.println("Numeros sorteados: "+  Arrays.toString(resultadoSorteio));

            int acerto = contarAcertor();

            System.out.println("Você acertou " + acerto + " acertos.");


        }

}
