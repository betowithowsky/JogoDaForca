/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoForca;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yuri.jwsilva
 */
public class JogoForca {
    public static void main(String[] args) {
        String palavra = sorteiaPalavra();
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
                tentativas++;
                desenhaHumano(tentativas);
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
    
    public static String sorteiaPalavra (){
        Random gerador = new Random();
        
        int nPalavra = gerador.nextInt(10);    
        
        String[] palavras = new String[10];
        
        palavras[0] = "arroz";
        palavras[1] = "fabrica";
        palavras[2] = "algoritimo";
        palavras[3] = "computador";
        palavras[4] = "logica";
        palavras[5] = "programacao";
        palavras[6] = "bacon";
        palavras[7] = "senac";
        palavras[8] = "sao paulo";
        palavras[9] = "tecnologia";
        
        String palavra = palavras[nPalavra];
        return palavra;
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
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += "/||\\";
                break;
            case 1:
                desenho += " ||=========||\n";
                desenho += " ||     .-\"\"\"\"\"\"\"-. \n";
                desenho += " || /^\\/  _.   _.  \\/^\\\n";
                desenho += " || \\(   /__\\ /__\\   )/\n";
                desenho += " ||  \\,  \\o_/_\\o_/  ,/\n";
                desenho += " ||    \\    (_)    /\n";
                desenho += " ||     `-.'==='.-' \n";
                desenho += " ||      __) - (__\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += "/||\\";
                break;
            case 2:
                desenho += " ||=========||\n";
                desenho += " ||     .-\"\"\"\"\"\"\"-. \n";
                desenho += " || /^\\/  _.   _.  \\/^\\\n";
                desenho += " || \\(   /__\\ /__\\   )/\n";
                desenho += " ||  \\,  \\o_/_\\o_/  ,/\n";
                desenho += " ||    \\    (_)    /\n";
                desenho += " ||     `-.'==='.-' \n";
                desenho += " ||      __) - (__\n";
                desenho += " ||         `~~~` \n";
                desenho += " ||       /     \\\n";
                desenho += " ||      :       ;\n";
                desenho += " ||      |==(*)==|\n";
                desenho += " ||      :       :\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += "/||\\";
                break;
            case 3:
                desenho += " ||=========||\n";
                desenho += " ||     .-\"\"\"\"\"\"\"-. \n";
                desenho += " || /^\\/  _.   _.  \\/^\\\n";
                desenho += " || \\(   /__\\ /__\\   )/\n";
                desenho += " ||  \\,  \\o_/_\\o_/  ,/\n";
                desenho += " ||    \\    (_)    /\n";
                desenho += " ||     `-.'==='.-' \n";
                desenho += " ||      __) - (__\n";
                desenho += " ||     /  `~~~`\n";
                desenho += " ||    / //     \\\n";
                desenho += " ||   / /:       ;\n";
                desenho += " ||  / / |==(*)==|\n";
                desenho += " || ///\\ :       :\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += "/||\\";
                break;
            case 4:
                desenho += " ||=========||\n";
                desenho += " ||     .-\"\"\"\"\"\"\"-. \n";
                desenho += " || /^\\/  _.   _.  \\/^\\\n";
                desenho += " || \\(   /__\\ /__\\   )/\n";
                desenho += " ||  \\,  \\o_/_\\o_/  ,/\n";
                desenho += " ||    \\    (_)    /\n";
                desenho += " ||     `-.'==='.-' \n";
                desenho += " ||      __) - (__\n";
                desenho += " ||     /  `~~~`  \\\n";
                desenho += " ||    / //     \\\\ \\\n";
                desenho += " ||   / /:       ;\\ \\\n";
                desenho += " ||  / / |==(*)==| \\ \\\n";
                desenho += " || ///\\ :       : /\\\\\\\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += " ||\n";
                desenho += "/||\\";
                break;
            case 5:
                desenho += " ||=========||\n";
                desenho += " ||     .-\"\"\"\"\"\"\"-. \n";
                desenho += " || /^\\/  _.   _.  \\/^\\\n";
                desenho += " || \\(   /__\\ /__\\   )/\n";
                desenho += " ||  \\,  \\o_/_\\o_/  ,/\n";
                desenho += " ||    \\    (_)    /\n";
                desenho += " ||     `-.'==='.-' \n";
                desenho += " ||      __) - (__\n";
                desenho += " ||         `~~~` \n";
                desenho += " ||     /  `~~~`  \\\n";
                desenho += " ||    / //     \\\\ \\\n";
                desenho += " ||   / /:       ;\\ \\\n";
                desenho += " ||  / / |==(*)==| \\ \\\n";
                desenho += " || ///\\ :       : /\\\\\\\n";
                desenho += " ||       \\  |\n";
                desenho += " ||     ___)=|\n";
                desenho += " ||    {____/\n";
                desenho += "/||\\";
                break;
            case 6:
                desenho += " ||=========||\n";
                desenho += " ||     .-\"\"\"\"\"\"\"-. \n";
                desenho += " || /^\\/  _.   _.  \\/^\\\n";
                desenho += " || \\(    X    X     )/\n";
                desenho += " ||  \\,            ,/\n";
                desenho += " ||    \\    (_)    /\n";
                desenho += " ||     `-.,===,.-'\n";
                desenho += " ||      __) - (__\n";
                desenho += " ||     /  `~~~`  \\ \n";
                desenho += " ||    / //     \\\\ \\ \n";
                desenho += " ||   / /:       ;\\ \\ \n";
                desenho += " ||  / / |==(*)==| \\ \\ \n";
                desenho += " || ///\\ :       : /\\\\\\ \n";
                desenho += " ||       \\  |  / \n";
                desenho += " ||     ___)=|=(___\n";
                desenho += " ||    {____/ \\____} \n";
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