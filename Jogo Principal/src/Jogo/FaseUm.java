package Jogo;

import javax.swing.*;

import java.util.Scanner;

/**
 *
 * @author mikael.asilva3
 */
public class FaseUm {

    static Scanner input = new Scanner(System.in);

    static int escolhaCenarioFaseUm() {
        int n = 0;
        System.out.println("Escolha uma porta (1 | 2 | 3) ");
        do{
            n = input.nextInt();
            if (n == 1) {
                cenarioUm();
            } else if (n == 2) {
                cenarioDois();
            } else if (n == 3) {
                cenarioTres();
            }else{
                System.err.println("NÚMERO INCORRETO!");
                escolhaCenarioFaseUm();
            }
        }while ((n > 3));
        return n;
    }

    static void cenarioUm() {
//       JOptionPane.showMessageDialog(null, 
        System.out.println("Você se depara com algo que parece o jantar da semana passada na casa de sua família no campo,\n"
                + "você está do lado de fora, sentado no macio da grama verde, olhando para as estrelas,\n"
                + "enquanto espera sua mãe gritar de dentro que o jantar está na mesa, de repente começa\n"
                + "a ouvir ao fundo rosnados do que parecem ser cães, malditos cães aqueles que você xingou \n"
                + "quando passava no caminho para a casa na manhã do mesmo dia, o rosnado se aproxima, \n"
                + "você sente que deve levantar, SAIA DAÍ, você começa a correr, ao olhar para trás \n"
                + "percebe que não consegue mais ver a casa onde estava, em sua frente árvores \n"
                + "fecham o caminho, quanto mais corre, mais próximo percebe os rosnados dos malditos cachorros, e de repente...\n"
                + "BUM...\n"
                + "Você dá de encontro com uma árvore, você se levanta e antes de voltar a correr, na árvore percebe aquele mesmo padrão de placas, nele contém o escrito \n "
                + "“Pertencem ao conjunto dos números Racionais (Q), qualquer número que possa ser escrito na forma de fração, onde o numerador e o denominador são números inteiros”\n"
                + "Que placa estranha para uma árvore!” você pensa...\n"
                + "Logo então volta a correr, os cachorros já parecem mais próximos, \n "
                + "o medo toma conta de seu redor, enquanto corre, \n"
                + "você nota que o caminho está acabando, porém vê que mais à frente, uma ponte de madeira \n "
                + "com aparência acabada e cordas longas tomam forma, e ao se deparar com ela, vê novamente mais uma placa, \n"
                + "desta vez com uma seta que aponta para a ponte com os seguintes dizeres... \n"
                + "PARA ATRAVESSAR RESPONDA \n\n");

        Perguntas.pergunta1();
    }

    static void cenarioDois() {
        System.out.println("Você está em uma montanha russa, a semelhança com aquela que andou alguns dias atrás com sua família \n"
                + "é muito grande, porém, desta vez você está sozinho, de longe, lá em baixo no pátio do parque,\n"
                + "seus amigos acenam para você, eles parecem felizes, embora você se sinta em um ambiente tenso, \n"
                + "o carrinho parece não ter proteção, você sente que não consegue se segurar, \n"
                + "ao mesmo tempo que percebe que a velocidade do carrinho começa a aumentar gradativamente, você se preocupa \n"
                + "ao avistar mais a longe que uma subida seguida de uma descida lhe esperam, esta montanha muito conhecida por \n"
                + "seus loops enormes carrega má fama pelo efeito que causa nos estômagos de quem a encaram. \n"
                + "A velocidade está aumentando, você se aproxima da subida, AH NÃO!, alguém me tira daqui!,\n"
                + "não é possível que isto seja realidade!, você pensa. \n "
                + "Desesperado, ao olhar para o chão do carrinho, você nota, no canto, escondido sobre a junção do banco, \n"
                + "um pergaminho, ao desenrolar com pressa, aparecem os seguintes descritos:\n\n");

        Perguntas.pergunta2();
    }

    static void cenarioTres() {
        System.out.println("PORTA TRANCADA!!!");

       // Perguntas.pergunta3();
       escolhaCenarioFaseUm();
    }

    public static void main(String[] args) {
        Introducoes.introducaoFase1();
        int n = escolhaCenarioFaseUm();

    }

}
