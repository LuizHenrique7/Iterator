public class Computador {
    private String nome;

    private boolean ativo;

    public Computador(String nome, boolean ativo) {
        this.nome = nome;
        this.ativo = ativo;


    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome;}

    public boolean isAtivo() {return ativo;}

    public void setAtivo(boolean ativo) { this.ativo = ativo;}
}