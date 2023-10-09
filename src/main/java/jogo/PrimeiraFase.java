package jogo;

import Personagens.Guerreiro;
import modelos.Arma;
import modelos.Armadura;

import java.util.Scanner;

public class PrimeiraFase {
    Scanner teclado = new Scanner(System.in);
    public void preparacao(){
        // Abertura do jogo
        System.out.println("Aqui começa a sua jornada como jogador de RPG.\n Um mundo de possibilidades se expandem para você fugir da sua realidade\n" +
                "E poder lutar contra os terriveis monstros dessa aventura. Então boa sorte e aproveite!\n\n" +
                "Agora informe o tipo do seu personagem: (1 - Guerreiro | 2 - Mago)  ");
        String tipoGuerreiro = teclado.next();

        // Inserção do nome, arma e armadura
        switch (tipoGuerreiro){
            case "1":
                System.out.println("Informe o nome do seu guerreiro: ");
                Guerreiro guerreiro = new Guerreiro(teclado.next());
                System.out.println("Informe a arma do seu guerreiro: ");
                guerreiro.setArma(new Arma(teclado.next(), 30, 0));
                guerreiro.setArmadura(new Armadura(15));
                break;
            case "2":
                System.out.println("Ainda está em produção esse personagem");
        }
    }

    public void iniciacao(){
        System.out.println("Parabens pelas suas escolhas! Agora que você oficialmente entrou neste universo, deixe-me lhe apresentar um pouco mais sobre ele.\n" +
                "A cidade de Stownfield já foi um dia muito bela e bem habitada, era a única da região que produzia ferramentas de guerra, e isso gerava um ótimo desempenho para cidade.\n" +
                "porém, a diferença de classes sociais era exorbitante, o que gerava ódio na população de classe mais baixa.\n" +
                "Um dia os guerreiros e toda a população de classe baixa se revoltou, causando a grande revolta de Stownfield.\n A grande revolta acabou com a cidade, e hoje não há mais habitantes comuns lá," +
                "a guerra ainda continua.\n Você, grande guerreiro, foi o escolhido e contratado pela província de Musting, indicado pelo ministério de magos e guerreiros para acabar com esse caos.\n" +
                "Vale lembrar que neste universo a magia existe, você poderá encontrar grandes problemas em sua trajetória. Você agora se encontra no portão principal da cidade, boa sorte!");
    }
    public void mapPrincipal(){
        System.out.println("       Y\n" +
                        "       |\n" +
                        "       S---------R---------R---------S\n" +
                        "       |         |         |         |\n" +
                        "       |         |         |T        |\n" +
                        "       |         |         |         |\n" +
                        "       R---------R---------R---------I\n" +
                        "       |         |         |         |\n" +
                        "       |         |T        |         |\n" +
                        "       |         |         |         |\n" +
                        "       S---------R---------R---------S\n" +
                        "                       |\n" +
                        "                       C\n\n"+
                "Esse é o mapa total do jogo, mas lembre, você precisa passar de fase,\n" +
                "não pense que as coisas vão ser fáceis assim.\n\n" +
                "A letra 'R' representam as ruas,\n" +
                "a letra 'I' representa a igreja,\n" +
                "a letra 'P' representa as casas das pessoas \"comuns\",\n" +
                "a letra 'C' representa o castelo do rei,\n" +
                "A letra 'T' representa as árvores da cidade,\n" +
                "A letra 'Y' representa você, que se localiza no portão principal da cidade.");
    }

    public  void movimentacao(){
        String[] map = {"L---------J---------K---------X" +
                "/         /         -         -" +
                "/         /         -         -" +
                "/         /         -         -" +
                "B---------Z---------S---------I" +
                "-         -         -         -" +
                "-         -         -         -" +
                "-         -         -         -" +
                "S---------G---------H---------U" +
                "-" +
                "C"};
        int posX = 1;
        int posY = 1;
        boolean vacilou = false;

        while(!vacilou){
            System.out.println("Digite a direção (w, s, d, a): ");
            char direcao = teclado.nextLine().charAt(0);
            switch (direcao){
                case 'w':
                    posY -= 1;
                    break;
                case 's':
                    posY += 1;
                    break;
                case 'd':
                    posX += 1;
                    break;
                case 'a':
                    posX -= 1;
                    break;
                default:
                    System.out.println("Direção inválida!!");
                    continue;
            }
            if(posX<0 || posX >= map[0].length() || posY<0 || posY>= map.length){
                System.out.println("Você saiu do cenário! Fim de jogo.");
                vacilou = true;
            }else{
                char pontoParada = map[posY].charAt(posX);

                switch (pontoParada){
                    case 'Y':
                        System.out.println("Você esta no portão principal");
                        System.out.println(pontoParada);
                        break;
                    case 'S':
                        System.out.println("Você esta em um ponto de enrolada para a esquerda.");
                        System.out.println(pontoParada);
                        break;
                    case 'R':
                        System.out.println("Você está em um cruzamento.");
                        System.out.println(pontoParada);
                        break;
                    case 'T':
                        System.out.println("Você esta embaixo de uma árvore.");
                        System.out.println(pontoParada);
                        break;
                    case '-':
                        System.out.println("Você esta em uma rua.");
                        System.out.println(pontoParada);
                        break;
                    case ' ':
                        System.out.println("Você está entre ruas, em um quarteirão, cuidado!");
                        System.out.println(pontoParada);
                        break;
                    default:
                        System.out.println("Você encontrou um ponto desconhecido!");
                        System.out.println(pontoParada);
                        break;
                }
            }

        }

    }
}
