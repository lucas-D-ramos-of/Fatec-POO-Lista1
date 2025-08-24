package org.com.aula;

public class Churrasco {
    
    private double qtdCarne;

    public void verificarConsumo(Pessoa p){

        if (p.getIdade() <= 3){
            qtdCarne = 0;
        } else {

            if (p.getVegetariana()){

                qtdCarne = 0;

            } else {

                if (p.getIdade() <= 12){
                    qtdCarne = 1;
                } else {

                    qtdCarne = 2;
                }

            }

        }

        System.out.println("A quantiade de carne consumida foi de " + qtdCarne);

    }
}
