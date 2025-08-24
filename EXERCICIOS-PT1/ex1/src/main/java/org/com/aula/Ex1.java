package org.com.aula;

import java.util.Scanner;

/**
 *Exerc´ıcio 1. Dada a classe Pessoa que possui os atributos: String nome,
String sexo, int idade, boolean vegetariana. 
Fa¸ca agora uma classe Churrasco que possua: Atributos: qtdCarne(double); M´etodo: verificarConsumo():
Recebe via parˆametro uma Pessoa e com isto define a consuma¸c˜ao m´edia de
carne (quantidade de carne consumida) pessoas de 0 a 3 anos n˜ao consomem,
vegetarianos tamb´em n˜ao. Pessoas de 4 a 12 anos consomem 1 kilo de carne e
de 13 anos em diante 2 kilos de carne
 */
public class Ex1 {

    public static Sexo definirSexo(String sexo){
       return (sexo.equals("MASCULINO")) ? Sexo.MASCULINO : Sexo.FEMININO;
    }

    public static boolean definirVegetariana(String veg){
        return (veg.equals("S")) ? true : false;
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        String nome = leitura.nextLine();

        System.out.println("Digite seu sexo:  [MASCULINO, FEMININO]");
        String sexo = leitura.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = leitura.nextInt();

        System.out.println("Vegetariana? [S/N]");
        String veg = leitura.nextLine();

        Pessoa p = new Pessoa(nome, definirSexo(sexo), idade, definirVegetariana(veg));

    }
}
