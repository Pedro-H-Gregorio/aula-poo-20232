package Personagens;

import modelos.Arma;
import modelos.Armadura;
import modelos.Personagem;
import modelos.Pocao;

import java.util.List;

public class Bardo {

    private String nome;
    private int vida;
    private Arma arma;
    private Armadura armadura;
    private int atordoamento;

    private List<Pocao> mochila;
    public Bardo(String nome, Arma instrumento) {
        this.nome = nome;
        this.vida = 100;
        this.arma = instrumento;
        this.atordoamento = 10;
    }

    public void getMochila() {
        System.out.println("Suas poções são:");
        for(Pocao pocao : mochila){
            System.out.println(pocao);
        }
    }

    public void addPocao(Pocao pocao) {
        this.mochila.add(pocao);
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Arma getArma() {
        return arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void atacar(Boss outro) {
        System.out.printf("%s Ta tocando com %s e causando um atodoarmento em %s%n",
                this.getNome(), getArma().getNome(), outro.getNome());
        outro.receberDano(getArma().getDano() + atordoamento);
    }

    public void receberDano(int dano) {
         setVida(getVida() - (dano - getArmadura().getProtecao()) - atordoamento);
        System.out.printf("%s recebeu dano de %d (Vida: %d)%n",
                this.getNome(), dano, this.getVida());
    }


}
