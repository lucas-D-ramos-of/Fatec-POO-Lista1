package org.aula;

public class Lampada {

    private Estado es;
    private int qtdAcendimentos;

    public Lampada(Estado es) {
        this.es = es;
    }

    public void click() {

        if (es == es.LIGADA) {

            es = es.DESLIGADA;

        } else {

            es = es.LIGADA;
            qtdAcendimentos++;

        }

    }

    public int qtdAcendimentos(){
        return qtdAcendimentos;
    }
    public Estado estadoLampada() {

        return es;
    }
}
