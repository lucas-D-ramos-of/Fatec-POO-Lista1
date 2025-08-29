
package org.aula;

import java.util.Scanner;

/**
 Implemente uma classe Lˆampada com os seguintes componentes
e fa¸ca um teste ao final: Atributos: estado(Enum) M´etodos:
• click(): ao chamar este m´etodo a lˆampada ´e colocada no estado 
”apagada” caso esteja ”acesa” e ´e colocado no estado ”acesa” caso esteja ”apagada”.
• qtdAcendimentos(): retorna quantas vezes a lˆampada foi acesa (DICA:
este m´etodo deve ser chamada no m´etodo acima).
• checaEstado(): retorna o estado atual da Lˆampada.
 */
public class Ex2 {

    public static void main(String[] args) {
        Scanner lerEntrada = new Scanner(System.in);
        int menu;
        boolean continuar = true;
        Lampada lampada = new Lampada(Estado.DESLIGADA);

        while(continuar){

            System.out.println("---------------------------------------");
            System.out.println("| -- MENU ------------|");
            System.out.println("| 1 - Trocar estado da Lampada (click)");
            System.out.println("| 2 - Qtd de acendimentos");
            System.out.println("| 3 - Checar estado");
            System.out.println("| 4 - Sair");
            System.out.println("---------------------------------------");

            menu = lerEntrada.nextInt();
            switch(menu){
                case 1 -> lampada.click();
                case 2 -> System.out.println("Quandidade de acendimentos: "+lampada.qtdAcendimentos());
                case 3 -> System.out.println("Estado da lâmpada: "+lampada.estadoLampada());
                case 4 -> continuar = false;
                default -> System.out.println("Opção inválida!");

            }

        }

    }
}
