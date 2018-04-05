public class Usuario{
    private String nome;
    private int pontos;
    private boolean moderador;

    public Usuario(String nome, int pontos){
        this.nome = nome;
        this.pontos = pontos;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPontos(int pontos){
        this.pontos = pontos;
    }

    public int getPontos(){
        return this.pontos;
    }

    public void tornaModerador(){
        this.moderador = true;
    }

    public boolean isModerador(){
        return this.moderador;
    }

}