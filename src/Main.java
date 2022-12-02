import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String palavraChave = "bicicleta";
        String letrasUltilizadas= "";
        String palavraAdivinhada = "";
        int maxDeTentativas = 10;

        for(int i = 0; i < palavraChave.length(); i++){
            palavraAdivinhada = "-";

            for(int tentativas = 0; ; tentativas++){
                if(tentativas == maxDeTentativas){
                    System.out.printf("Foram 10 tentativas!! \nA palavra era '%s'", palavraChave);
                    System.exit(0);
                }

                System.out.printf("Rodada %d. Até agora a palavra está %s. Digite a proxima letra:%n", tentativas, palavraAdivinhada);

                char letraInserida = new Scanner(System.in).next().charAt(0);

                if(letrasUltilizadas.indexOf(letraInserida) >= 0){ // O "indexof() >= 0 " significa que a letra já está presente na string
                    System.out.printf("Você já tentou a letra %c.%n", letraInserida);
                }else {
                    letrasUltilizadas += letraInserida;

                    if(palavraChave.indexOf(letraInserida) >= 0){

                        palavraAdivinhada = "";

                        for(int j = 0; j < palavraChave.length(); j++){
                            palavraAdivinhada += letrasUltilizadas.indexOf(palavraChave.charAt(j)) >= 0 ? palavraChave.charAt(j) : "-";
                        }

                        if(palavraAdivinhada.contains("-")){
                            System.out.printf("%s existe na palavra.\nAche as outras letras escondidas%n", letraInserida);
                        }else{
                            System.out.printf("Parabens! A palavra adivinhada era '%s'", palavraAdivinhada);
                            System.exit(0);
                        }
                    }else {
                        System.out.printf("A letra %c não existe na palavra!\n", letraInserida);
                    }
                }
            }
        }
    }
}