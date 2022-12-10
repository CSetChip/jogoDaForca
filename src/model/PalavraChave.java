package model;

public class PalavraChave{

    private String palavra;
    private String[] dicas;

    public PalavraChave(String palavra){
        setPalavra(palavra);
    }

//    public void adicionarDicas(){
//        System.out.print("Você Pode Adicionar Dicas!! \n");
//        int continuarAdicionando = 1;
//
//        while (continuarAdicionando == 1){
//
//        }
//    }

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
