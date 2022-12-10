package model;

public class PalavraChave{

    private String palavra;
    private String[] dicas;

    public PalavraChave(String palavra){
        setPalavra(palavra);
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String[] getDicas() {
        return dicas;
    }

    public void setDicas(String[] dicas) {
        this.dicas = dicas;
    }
}
