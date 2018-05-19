package Jogo;

import java.util.Scanner;
import javax.swing.*;


/**
 *
 * @author mikael.asilva3
 */
public class FaseTres {

    static Scanner input = new Scanner(System.in);

    static int escolhaCenarioFaseTres() {
        int n = 0;
        
        System.out.println("Escolha uma porta (7 | 8 | 9)");
        do{
            n = input.nextInt();
            if (n == 7) {
                cenarioSete();
            } else if (n == 8) {
                cenarioOito();
            } else if (n == 9) {
                cenarioNove();
            }else{
                System.err.println("NÚMERO INCORRETO!");
                escolhaCenarioFaseTres();
            }
        }while ((n > 9) && (n < 7));
        return n;
    }

    static void cenarioSete() {
        System.out.println("TEXTO DO CENÁRIO SETE!");

        Perguntas.pergunta7();
    }

    static void cenarioOito() {
        System.out.println("TEXTO DO CENÁRIO OITO!");

        Perguntas.pergunta8();
    }

    static void cenarioNove() {
        System.out.println("TEXTO DO CENÁRIO NOVE!");

        Perguntas.pergunta9();
    }

    static void cenarioFinal() {
        System.out.println("TEXTO DO CENÁRIO FINAL!");

        Perguntas.pergunta10();
    }

    public static void main(String[] args) {
        Introducoes.introducaoFase1();
        int n = escolhaCenarioFaseTres();

    }

}

