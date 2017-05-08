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
        String palavra = "Queijo";
        String letrasUtilizadas = "";
        desenhaHumano(0);
        desenhaCampo(palavra);
        digitarLetra();     
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
                desenho += "/||\\";
                break;
        }
        System.out.println(desenho);
    }
}