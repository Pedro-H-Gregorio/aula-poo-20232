package modelos;

import Personagens.Bardo;
import Personagens.Boss;

public abstract class Personagem {
    private String nome;
    private int vida;
    private Arma arma;
    private Bardo bardo;
    private Armadura armadura;


    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public Bardo getBardo() {
        return bardo;
    }

    public void setBardo(Bardo bardo) {
        this.bardo = bardo;
    }

    public void receberDano(int dano) {
        this.vida -= dano - armadura.getProtecao();
        System.out.printf("%s recebeu dano de %d (Vida: %d)%n",
                this.getNome(), dano, this.getVida());
    }

    public void atacar(Boss outro) {
        if (arma == null) {
            System.out.printf("%s atacou %s com a mão%n",
                    this.getNome(), outro.getNome());
            outro.receberDano(1);
            return;
        }

        System.out.printf("%s atacou %s com %s%n",
                this.getNome(), outro.getNome(), arma.getNome());
        outro.receberDano(arma.getDano());
    }

    public void recuperarVida(Pocao pocao) {
        this.setVida(this.getVida() + pocao.getCura());
        System.out.printf("%s tomou %s e recuperou %d pontos de vida.%n",
                this.getNome(), pocao.getNome(), pocao.getCura());
    }

    public void quebrarCaixa(Caixa caixa){
        this.bardo.addPocao(caixa.getItem());
        System.out.printf("%s quebrou a caixa e pegou %s.%n",this.getNome(), caixa.getItem().getNome());
    }

    public  void pedirBardoTocar(Bardo bardo, Boss personagem){
        bardo.atacar(personagem);
    };
    public abstract void bardoPara();

    public void subirDeNivel(){
        this.vida += 100;
        this.arma.setDano(arma.getDano() + 40);
        this.armadura.setProtecao(armadura.getProtecao() + 20);
    }
}
