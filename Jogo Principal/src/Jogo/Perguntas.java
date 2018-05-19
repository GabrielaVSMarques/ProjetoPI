package Jogo;

import java.util.Scanner;
import javax.swing.*;

public class Perguntas {

    static Scanner input = new Scanner(System.in);
    //  int nota = 0; //mudar para contador

    static int pergunta1() {
        int pergunta1;
//        pergunta1 =Integer.parseInt(JOptionPane.showInputDialog 
        System.out.println("Os números -3, 15, -9 pertencem ao conjunto dos números Racionais (Q)? \n 1) SIM \n 2) NÃO");
        pergunta1 = input.nextInt();
        if (pergunta1 == 2) {
            System.out.println("Resposta Correta!");
            Pontuacao.somar();
            Pontuacao.mostrarPontuacao();
        } else {
            System.out.println("Resposta Incorreta!");
            Pontuacao.incrementar();
            Pontuacao.mostrarPontuacao();
        }
        FaseDois.escolhaCenarioFaseDois(); // ao final das perguntas correspondentes da fase 1 chamar a introdução da fase 2 e vice e versa para as outras perguntas
        return pergunta1;
       
    }

    static int pergunta2() {
        int pergunta2;
        System.out.println("A soma de quatro números consecutivos naturais (N), é igual a 1234, quais são esses números?\n"
                + "1)	308, 309, 310, 311\n"
                + "2)	307, 308, 309, 310\n"
                + "3)	305, 306, 307, 308");
        pergunta2 = input.nextInt();
        if (pergunta2 == 2) {
            System.out.println("Resposta Correta!");
            Pontuacao.somar();
            Pontuacao.mostrarPontuacao();
        } else {
            System.out.println("Resposta Incorreta!");
            Pontuacao.incrementar();
            Pontuacao.mostrarPontuacao();
        } FaseDois.escolhaCenarioFaseDois();
        return pergunta2;
    }

    static int pergunta3() {
        int pergunta3;
        System.out.println("Delta é igual, “b” ao quadrado, menos quatro, vezes “a”, vezes “c” \n "
                + "1)Fórmula de Fibonacci?\n"
                + "2)Fórmula de Bháskara?\n"
                + "3)Fórmula de Pitágoras?");
        pergunta3 = input.nextInt();
        if (pergunta3 == 2) {
            System.out.println("Resposta Correta!");
            Pontuacao.somar();
            Pontuacao.mostrarPontuacao();
        } else {
            System.out.println("Resposta Incorreta!");
            Pontuacao.incrementar();
            Pontuacao.mostrarPontuacao();
        }
        return pergunta3;
    }

    static int pergunta4() {
        int pergunta4;
        System.out.println("PERGUNTA CENÁRIO 4 E SUAS OPÇÕES");
        pergunta4 = input.nextInt();
        if (pergunta4 == 2) {
            System.out.println("Resposta Correta!");
            Pontuacao.somar();
            Pontuacao.mostrarPontuacao();
        } else {
            System.out.println("Resposta Incorreta!");
            Pontuacao.incrementar();
            Pontuacao.mostrarPontuacao();
        }
        return pergunta4;
    }

    static int pergunta5() {
        int pergunta5;
        System.out.println("PERGUNTA CENÁRIO CINCO E SUAS OPÇÕES");
        pergunta5 = input.nextInt();
        if (pergunta5 == 2) {
            System.out.println("Resposta Correta!");
            Pontuacao.somar();
            Pontuacao.mostrarPontuacao();
        } else {
            System.out.println("Resposta Incorreta!");
            Pontuacao.incrementar();
            Pontuacao.mostrarPontuacao();
        }
        return pergunta5;
    }

    static int pergunta6() {
        int pergunta6;
        System.out.println("PERGUNTA CENÁRIO SEIS E SUAS OPÇÕES");
        pergunta6 = input.nextInt();
        if (pergunta6 == 2) {
            System.out.println("Resposta Correta!");
            Pontuacao.somar();
            Pontuacao.mostrarPontuacao();
        } else {
            System.out.println("Resposta Incorreta!");
            Pontuacao.incrementar();
            Pontuacao.mostrarPontuacao();
        }
        return pergunta6;
    }

    static int pergunta7() {
        int pergunta7;
        System.out.println("PERGUNTA CENÁRIO SETE E SUAS OPÇÕES");
        pergunta7 = input.nextInt();
        if (pergunta7 == 2) {
            System.out.println("Resposta Correta!");
            Pontuacao.somar();
            Pontuacao.mostrarPontuacao();
        } else {
            System.out.println("Resposta Incorreta!");
            Pontuacao.incrementar();
            Pontuacao.mostrarPontuacao();
        }
        return pergunta7;
    }

    static int pergunta8() {
        int pergunta8;
        System.out.println("PERGUNTA CENÁRIO OITO E SUAS OPÇÕES");
        pergunta8 = input.nextInt();
        if (pergunta8 == 2) {
            System.out.println("Resposta Correta!");
            Pontuacao.somar();
            Pontuacao.mostrarPontuacao();
        } else {
            System.out.println("Resposta Incorreta!");
            Pontuacao.incrementar();
            Pontuacao.mostrarPontuacao();
        }
        return pergunta8;
    }

    static int pergunta9() {
        int pergunta9;
        System.out.println("PERGUNTA CENÁRIO NOVE E SUAS OPÇÕES");
        pergunta9 = input.nextInt();
        if (pergunta9 == 2) {
            System.out.println("Resposta Correta!");
            Pontuacao.somar();
            Pontuacao.mostrarPontuacao();
        } else {
            System.out.println("Resposta Incorreta!");
            Pontuacao.incrementar();
            Pontuacao.mostrarPontuacao();
        }
        return pergunta9;
    }

    static int pergunta10() {
        int pergunta10;
        System.out.println("PERGUNTA CENÁRIO DEZ E SUAS OPÇÕES");
        pergunta10 = input.nextInt();
        if (pergunta10 == 2) {
            System.out.println("Resposta Correta!");
            Pontuacao.somar();
            Pontuacao.mostrarPontuacao();
        } else {
            System.out.println("Resposta Incorreta!");
            Pontuacao.incrementar();
            Pontuacao.mostrarPontuacao();
        }
        return pergunta10;
    }

    public static void main(String[] args) {
        int Perguntas = pergunta1();
    }

}
