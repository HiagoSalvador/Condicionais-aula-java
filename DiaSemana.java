package aula_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da semana:");
        int numero_dia = sc.nextInt();
        String nome_dia;

        switch (numero_dia) {
            case 1:
                nome_dia = "Domingo";
                break;
            case 2:
                nome_dia = "Segunda-feira";
                break;
            case 3:
                nome_dia = "Terça-feira";
                break;
            case 4:
                nome_dia = "Quarta-feira";
                break;
            case 5:
                nome_dia = "Quinta-feira";
                break;
            case 6:
                nome_dia = "Sexta-feira";
                break;
            case 7:
                nome_dia = "Sábado";
                break;
            default:
                nome_dia = "Dia inválido";
                break;
        }

        System.out.println("O dia é: " + nome_dia);
        sc.close();
    }
}
