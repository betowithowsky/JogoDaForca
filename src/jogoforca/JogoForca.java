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
        
        String letrasUtilizadas = "";
        desenhaHumano(0);
        desenhaCampo(sorteiaPalavra());
        digitarLetra();
    }
    
    public static String sorteiaPalavra (){
        Random gerador = new Random();
        
        int nPalavra = gerador.nextInt(10);    
        
        String[] palavras = new String[10];
        
        palavras[0] = "arroz";
        palavras[1] = "fabrica";
        palavras[2] = "algoritimo";
        palavras[3] = "computador";
        palavras[4] = "lógica";
        palavras[5] = "programação";
        palavras[6] = "bacon";
        palavras[7] = "senac";
        palavras[8] = "são paulo";
        palavras[9] = "tecnologia";
        
        String palavra = palavras[nPalavra];
        return palavra;
    }
    
    
    
    public static void desenhaCampo (String palavra) {
        String campo = "";
        for (int i = 0; i < palavra.length(); i++) {
            campo += " _ ";
        }
        System.out.println("Palavra: " + campo);
    }
    
    public static char digitarLetra() {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Digite uma letra:");
        char letra = 'A';
        return 'A';
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
                desenho += " || \\(   /\\_/\\ /\\_/\\   )/\n";
                desenho += " ||  \\,  \\/_\\/_\\/_\\/  ,/\n";
                desenho += " ||    \\    (_)    /\n";
                desenho += " ||     `-.'==='.-' \n";
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
}