package org.com.aula;

public class Pessoa {
    private String nome;
    private Sexo sexo;
    private int idade;
    private boolean vegetariana;

    public Pessoa(String nome, Sexo sexo, int idade, boolean vegetariana){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.vegetariana = vegetariana;
    }

    public String getNome() {
        return nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public boolean  getVegetariana() {
        return vegetariana;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVegetariana(boolean vegetariana) {
        this.vegetariana = vegetariana;
    }

}
