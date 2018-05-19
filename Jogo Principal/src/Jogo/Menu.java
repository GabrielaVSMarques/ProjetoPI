package Jogo;

import javax.swing.*;
import java.util.Scanner;

/**
 * Este programa Menu
 *
 * @author mikael.asilva
 */
public class Menu {

    static Scanner input = new Scanner(System.in);

    static int menu() {
        int opcoes;
        System.out.println("\t \t MENU \n \n"
                + "\t 1 - Jogar \n"
                + "\t 2 - Pontuações \n"
                + "\t 3 - Instruções \n"
                + "\t 4 - Sair \n");
        opcoes = input.nextInt();
        return opcoes;
    }

    static String recebeNome() {
        String nome;
        System.out.print("\t\t DIGITE SEU NOME: ");
        nome = input.next();
        return nome;
    }

    static void instrucoesJogo() {

        System.out.println("\t\t\t INTRUÇÕES \n \n"
                + "OBJETIVOS: Chegar ao final do labirinto através da escolha de opções (portas), respondendo\n"
                + " questões de Pré-Cálculo que serão ambientadas através de cenários diversos.\n\n"
                + "Jogadores: 1 \n"
                + "Idade: A partir de 16 anos \n"
                + "Requisitos: Boas noções de Matemática/ Pré-Cálculo \n \n"
                + "\t PREPARE O FÔLEGO, você será conduzido a um ambiente caótico de sua mente semelhante à um labirinto,"
                + "enquanto está adormecido em cima da mesa de jantar de sua casa!\n"
                + "\t Neste sonho lhe serão apresentadas situações hipotéticas e diversas que lhe farão desacreditar estar sonhando! \n\n"
                + "\t RESPONDA AS PERGUNTAS CORRETAMENTE E SAIA DESSE LABIRINTO ANGUSTIANTE! \n \n"
                + "\t\t\t MAS... ATENÇÃO!!! \n Você poderá voltar ao Menu Inicial, a qualquer momento digitando, 4 para SAIR \n\n");
        menu();

    }

    static int switchCase() {
        String rNome;
        int opcoes = menu();

        switch (opcoes) {
            case 1:
                System.out.println("\t\t JOGAR \n\n");
                Introducoes.introducao1();
                Introducoes.introducaoFase1();
                Pontuacao.inicializar();
                FaseUm.escolhaCenarioFaseUm();
                
                break;
            case 2:
                System.out.println("\t\t PONTUAÇÕES \n\n");
                break;
            case 3:
                System.out.println("\t\t INSTRUÇÕES \n\n");
                instrucoesJogo();
                break;
            case 4:
                System.out.println("\t\t SAIR");
                break;
        }
        return opcoes;
    }

    public static void main(String[] args) {
        
        switchCase();
        // Introducoes.introducao();

    }

}
