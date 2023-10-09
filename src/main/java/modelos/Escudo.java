package modelos;

public class Escudo {
    private String material;

    public Escudo(String material){
        this.material = material;
    }

    public boolean protege(int numeroDado){
        return numeroDado >= 2;
    }
}
