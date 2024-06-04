package aula_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu peso (kg)");
        float peso = sc.nextFloat();

        System.out.println("Digite a sua altura (metros):");
        float altura = sc.nextFloat();

        sc.close();

        float imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } 
        else if (imc < 25) {
            System.out.println("Peso normal");
        } 
        else if (imc < 30) {
            System.out.println("Sobrepeso");
        }
        else if (imc < 35) {
            System.out.println("Obesidade grau I");
        } 
        else if (imc < 40) {
            System.out.println("Obesidade grau II");
        } 
        else {
            System.out.println("Obesidade grau III");
        }
    }
}
