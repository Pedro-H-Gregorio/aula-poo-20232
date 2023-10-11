package Personagens;

import modelos.Arma;
import modelos.Armadura;
import modelos.Pocao;

import java.util.List;

public class Bardo {

    private String nome;
    private Arma arma;
    private int atordoamento;

    private List<Pocao> mochila;
    public Bardo(String nome, Arma instrumento) {
        this.nome = nome;
        this.arma = instrumento;
        this.atordoamento = 10;
    }

    public void getMochila() {
        System.out.println("Suas poções são:");
        for(int i = 0; i <= mochila.size(); i++){
            System.out.printf("%d | %s", i,mochila.get(i).getNome());
        }
    }

    public void addPocao(Pocao pocao) {
        this.mochila.add(pocao);
    }

    public Pocao getPocao(int index){
        return this.mochila.remove(index);
    }

    public String getNome() {
        return nome;
    }

    public Arma getArma() {
        return arma;
    }

    public void atacar(Boss outro) {
        System.out.printf("%s Ta tocando com %s e causando um atodoarmento em %s%n",
                this.getNome(), getArma().getNome(), outro.getNome());
        outro.receberDano(getArma().getDano() + atordoamento);
    }

}
