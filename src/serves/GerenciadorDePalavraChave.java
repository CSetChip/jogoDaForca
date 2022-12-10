package serves;

import model.PalavraChave;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDePalavraChave {

    private Scanner leitor = new Scanner(System.in);
    private ArrayList<PalavraChave> palavras;
    private int maxdeTentativas;
    private String palavraAdivinhada = "";
    private String palavraChave;
    private String letrasUltilizadas;

    public void sortearPalavra() {

        int index = (int) Math.random()*palavras.size();
        this.palavraChave = palavras.get(index).getPalavra();

    }

    public void adicionarNovaPalavra(){

        if(palavras == null){
            palavras = new ArrayList<PalavraChave>();
        }

        System.out.print("Adicione uma palavra: ");
        String novaPalavraInserida = leitor.nextLine();
        PalavraChave palavra = new PalavraChave(novaPalavraInserida);
        palavras.add(palavra);

    }

    public void escolheNumeroMaximoDetentativas() {
        maxdeTentativas  = palavraChave.length() + 1;
    }

    public ArrayList<PalavraChave> getPalavras() {
        return palavras;
    }

    public void setPalavras(ArrayList<PalavraChave> palavras) {
        this.palavras = palavras;
    }

    public int getMaxdeTentativas() {
        return maxdeTentativas;
    }

    public void setMaxdeTentativas(int maxdeTentativas) {
        this.maxdeTentativas = maxdeTentativas;
    }

    public String getPalavraAdivinhada() {
        return palavraAdivinhada;
    }

    public void setPalavraAdivinhada(String palavraAdivinhada) {
        this.palavraAdivinhada = palavraAdivinhada;
    }

    public String getLetrasUltilizadas() {
        return letrasUltilizadas;
    }

    public void setLetrasUltilizadas(String letrasUltilizadas) {
        this.letrasUltilizadas = letrasUltilizadas;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }
}
