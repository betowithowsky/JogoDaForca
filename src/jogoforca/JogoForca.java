/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoforca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yuri.jwsilva
 */
public class JogoForca {
    static Random gerador = new Random();
    public static void main(String[] args){
        String palavra = sorteiaPalavra();  
        String dica = daDica();
        
        String letrasUtilizadas = "", letrasDescartadas = "";
        //desenhaHumano(0);
        int tentativas = 0;
        while (true) {   
            char letra = ' ';
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
                desenhaHumano(tentativas);
                tentativas++;
            }
            if(ganhou(palavra, letrasUtilizadas)) {
                System.out.println("Você ganhou! Parabéns!");
                break;
            } else if(tentativas >= 7) {
                System.out.println("Você perdeu! Tente novamente!");
                break;
            }
            desenhaCampo(palavra, "");
            letra = digitarLetra(letrasUtilizadas, letrasDescartadas);
        }
    }
    
    
    public static String[] sorteiaPalavra (){ 
        
        int nPalavra = gerador.nextInt(10);            
        
        String[][] palavras = new String[10][10];
        
        palavras[0][0] = "arroz";
        palavras[0][1] = "alimento"; //dica
        
        palavras[1][0] = "violino";
        palavras[1][1] = "instrumento musical";//dica
        
        palavras[2][0] = "bicicleta";
        palavras[2][1] = "meio de transporte";//dica
        
        palavras[3][0] = "programador";
        palavras[3][1] = "profissao";
        
        palavras[4][0] = "programacao";
        palavras[4][1] = "bacon";
        
        palavras[5][0] = "senac";
        palavras[5][1] = "tecnologia";
        
        palavras[6][0] = "recife";
        palavras[6][1] = "cidade";
        
        palavras[7][0] = "pandeiro";
        palavras[7][1] = "instrumento musical";
        
        palavras[8][0] = "melancia";
        palavras[8][1] = "Fruta";
        
        palavras[9][0] = "veterinario";
        palavras[9][1] = "profissão";        
        
        String[] palavraEdica = new String[2];
        palavraEdica[0] = palavras[nPalavra][0];
        palavraEdica[1] = palavras[nPalavra][1];

        return palavraEdica; 
    }
    
    public static String daDica(){
        
        int nDica = gerador.nextInt(10);
        
        String[] dicas = new String[10];
        
        dicas[0] = "comida";
        dicas[1] = "dica2";
        dicas[2] = "dica3";
        dicas[3] = "dica4";
        dicas[4] = "dica5";
        dicas[5] = "";
        dicas[6] = "";
        dicas[7] = "";
        dicas[8] = "";
        dicas[9] = "";
        
        String dica = dicas[nDica];
        System.out.println("Dica: " + dica);
        return dica;
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
            System.out.print("Digite uma letra: ");
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
                desenho += " ||               \n";
                desenho += " ||               \n";
                desenho += " ||               \n";
                desenho += " ||               \n";
                desenho += " ||               \n";
                desenho += " ||               \n";
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
            case 3:
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
                desenho += " ||     `-..===..-' \n";
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
