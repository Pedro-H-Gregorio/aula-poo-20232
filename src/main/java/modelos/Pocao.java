package modelos;

public class Pocao {
    private String nome;
    private int cura;
    private String detalhes;

    public Pocao(String nome, int cura, String detalhes) {
        this.nome = nome;
        this.cura = cura;
        this.detalhes = detalhes;
    }

    public String getNome() {
        return nome;
    }

    public int getCura() {
        return cura;
    }

    public String getDetalhes() {
        return detalhes;
    }
}
