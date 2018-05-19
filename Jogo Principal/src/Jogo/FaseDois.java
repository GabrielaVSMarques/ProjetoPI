package Jogo;

import java.util.Scanner;
import javax.swing.*;


/**
 *
 * @author mikael.asilva3
 */
public class FaseDois {

    static Scanner input = new Scanner(System.in);

    static int escolhaCenarioFaseDois() {
        int n = 0;
        
        System.out.println("Escolha uma porta (4 | 5 | 6) ");
        do{
            n = input.nextInt();
            if (n == 4) {
                cenarioQuatro();
            } else if (n == 5) {
                cenarioCinco();
            } else if (n == 6) {
                cenarioSeis();
            }else{
                System.err.println("NÚMERO INCORRETO!");
                escolhaCenarioFaseDois();
            }
        }while ((n > 6) && (n < 4));
        return n;
    }

    static void cenarioQuatro() {
        System.out.println("Você acordou? Você sente que sim, ao levantar a cabeça da mesa, e limpar a baba de sua boca,"
                + " você percebe que não está em casa, que lugar estranho, se parece com o lugar onde você trabalha,"
                + " Ah não, você olha pra baixo, você teme dizer pra si mesmo, mas ao encarar suas vestimentas percebe que está de pijamas,"
                + " NO ESCRITÓRIO DO TRABALHO, me diz que isso é um pesadelo, me diz que é um pesadelo,"
                + " você pensa incontáveis vezes. Ao fundo consegue ouvir a voz da secretária de seu chefe,"
                + " saltitando em seus saltos barulhentos pelo chão de madeira velha do escritório,"
                + " ela está se dirigindo a sua porta... GRISELDA, você ouve seu chefe a chamando. \n"
                + "Pelo vão da porta você percebe a sombra dela desaparecendo junto com o barulho de seus saltos,"
                + " a qualquer momento Griselda entrará na sala onde você está, o que você fará, você pensa. Preciso fazer alguma coisa, você diz.\n"
                + "Ao se levantar da cadeira, você percebe que esta pisando numa pilha de folhas espalhadas pelo chão,"
                + " QUE BAGUNÇA, você se abaixa para ver no que pisa e mais uma vez percebe que seu cérebro o prega uma peça,"
                + " nas folhas os seguintes dizeres o perseguem, escolha uma porta, escolha uma porta, cada um escritos"
                + " com fontes diferentes de tamanhos diferentes, você continua folheando, até que em baixo de tantos rascunhos acha"
                + " uma folha diferente das demais, nela está escrito: ");

        Perguntas.pergunta4();

        System.out.println("Você responde, nada acontece, novamente se vê falando sozinho,"
                + " continua procurando nas pilhas de papel por algo que te tire daqui, desta situação vergonhosa. \n"
                + "Toc, toc, toc, toc, você ouve os saltos da secretária se aproximando.\n"
                + "Você corre para a porta para trancá-la, mas, não vê a chave, a maçaneta começa a girar,"
                + " você olha para trás procurando por algo para se esconder, mas, não vê nada além de mesa"
                + " e cadeira, você segura a maçaneta, atrás da porta pode-se ouvir Griselda reclamar “Mas é o que?”,"
                + " sua força para impedir a abertura da porta é grande, mas sem efeito, Griselda usa de força bruta"
                + " para empurrar a porta, ao mesmo passo que você a impede com a força de seu corpo, quando num empurrão"
                + " forte a porta é aberta...\n"
                + " Você fecha o olho no susto, e ao não ouvir nada os abre com medo...\n"
                + "VOCÊ ESTÁ NO BREU!\n"
                + " NÃÃÃÃO, você grita, ISSO DE NOVO NÃO!\n"
                + "À sua frente a seguinte placa: ");
    }

    static void cenarioCinco() {
        System.out.println("TEXTO DO CENÁRIO CINCO!");

        Perguntas.pergunta5();
    }

    static void cenarioSeis() {
        System.out.println("TEXTO DO CENÁRIO SEIS!");

        Perguntas.pergunta6();
    }

    public static void main(String[] args) {
        Introducoes.introducaoFase1();
        int n = escolhaCenarioFaseDois();

    }

}
