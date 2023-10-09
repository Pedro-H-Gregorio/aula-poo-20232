package interfaces;

import modelos.Personagem;

public interface IFases {
    void preparacao();
    void iniciacao();
    void mapaPrincipal();
    void movimentacao();
    void lutaContrBoss();
    void lutaContraBossFinal();
    Personagem finalDeFase();
    int jogaDado();
}
