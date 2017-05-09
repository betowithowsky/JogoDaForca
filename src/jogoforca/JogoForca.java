/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoForca;

import java.util.Scanner;

/**
 *
 * @author yuri.jwsilva
 */
public class JogoForca {
    public static void main(String[] args) {
        String palavra = "Macarrao";
        String letrasUtilizadas = "", letrasDescartadas = "";
        desenhaHumano(0);
        desenhaCampo(palavra, "");
        int tentativas = 0;
        while (true) {   
            char letra = digitarLetra(letrasUtilizadas, letrasDescartadas);

            boolean possuiLetra = false;

            for (int i = 0; i < palavra.length(); i++) {
                if(letra == palavra.toUpperCase().charAt(i)) {
                    letrasUtilizadas += letra;
                    desenhaCampo(palavra, letrasUtilizadas);
                    possuiLetra = true;
                    break;
                }
            }
            if(!possuiLetra) {
                letrasDescartadas += letra;
                desenhaHumano(0);
            }
            if(ganhou(palavra, letrasUtilizadas)) {
                System.out.println("Você ganhou! Parabéns!");
                break;
            } else if(tentativas >= 6) {
                System.out.println("Você perdeu! Tente novamente!");
                break;
            }
        }
    }
    
    public static void desenhaCampo (String palavraInicial, String letrasValidadas) {
        String campo = "";
        palavraInicial = palavraInicial.toUpperCase();
        
        for (int i = 0; i < palavraInicial.length(); i++) {
            boolean validado = false;
            for (int j = 0; j < letrasValidadas.length(); j++) {
                if(palavraInicial.charAt(i) == letrasValidadas.charAt(j)) {
                    campo += " " + letrasValidadas.charAt(j) + " ";
                    validado = true;
                    break;
                }
            }
            if(!validado)
                campo += " _ ";
        }
        System.out.println("Palavra: " + campo);
    }
    
    public static char digitarLetra (String letrasUtilizadas, String letrasDescartadas) {
        Scanner console = new Scanner(System.in);
        char letra;
        letrasDescartadas = letrasDescartadas.toUpperCase();
        letrasUtilizadas = letrasUtilizadas.toUpperCase();
        
        while (true) {            
            System.out.println("Digite uma letra: ");
            letra = console.nextLine().toUpperCase().charAt(0);
            
            boolean letraUsada = false;
            for (int i = 0; i < letrasUtilizadas.length(); i++) {
                if(letra == letrasUtilizadas.charAt(i)) {
                    System.out.println("A letra " + letra + " já foi utilizada. Tente novamente.");
                    letraUsada = true;
                    break;
                }
            }
            if(!letraUsada) {
                for (int i = 0; i < letrasDescartadas.length(); i++) {
                    if(letra == letrasDescartadas.charAt(i)) {
                        System.out.println("A letra " + letra + " já foi utilizada. Tente novamente.");
                        letraUsada = true;
                        break;
                    }
                }
            }
            
            if(!letraUsada)
                break;
        }
        return letra;
    }
    
    public static void desenhaHumano(int nivel) {
        String desenho = "";
        switch(nivel) {
            case 0:
                desenho += " ||=========||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += "/||\\";
                break;
        }
        System.out.println(desenho);
    }
  
    public static boolean ganhou (String palavra, String letrasUtilizadas) {
        int letrasConfirmadas = 0;
        palavra = palavra.toUpperCase();
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 0; j < letrasUtilizadas.length(); j++) {
                if(palavra.charAt(i) == letrasUtilizadas.charAt(j))
                    letrasConfirmadas++;
            }
        }
        if(letrasConfirmadas >= palavra.length())
            return true;
        return false;
    }
}