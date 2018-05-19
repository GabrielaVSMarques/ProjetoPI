package Jogo;

public class Pontuacao {
    static int  pontuacao;//variavel global para a pontuação
    static int contador;//variavel global para armazenar quantas portas o jogador passou para realizar a média
    
    static int inicializar(){ //a função inicializar esta no menu, onde, quando o jogador começa o jogo, a pontuação e o numero de portas que o jogador passou é zerado
        pontuacao = 0;
        contador = 0;
        return pontuacao;
    }
    
    static int somar(){//somar esta nas respostas corretas
        pontuacao = pontuacao + 10; //soma 10 pontos a pontuacão anterior
        contador++; //incrementa o contador de portas 
        return pontuacao;
    }
    
    static int incrementar(){ //incrementar esta nas respostas incorretas
        contador++; //incrementa o contador de portas, nota 0 em uma media ainda contribui como uma nota
        return pontuacao;
    }
    
    static String mostrarPontuacao(){ //mostra a pontuação do jogador com uma variavel de String
        String Tpontuacao;
        Tpontuacao = "Sua pontuação é: " + pontuacao;
        System.out.println(Tpontuacao);
        return Tpontuacao;
    }
}
