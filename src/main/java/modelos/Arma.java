package modelos;

import enums.tipoArma;

public class Arma {
    private String nome;
    private int dano;
    private int mana;
    private tipoArma tipo;



    public Arma(String nome, int dano, int mana, tipoArma tipo) {
        this.nome = nome;
        this.dano = dano;
        this.mana = mana;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public tipoArma getTipo() {
        return tipo;
    }

    public void setTipo(tipoArma tipo) {
        this.tipo = tipo;
    }
}
