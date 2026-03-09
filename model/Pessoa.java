package model;

public class Pessoa {
    
    private String  nome;
    private int idade;


    //construtores
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(){
        this.nome = "Teste";
        this.idade = 20;
    }
    //Metodo especifico
    public void saudacao(){
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
    }
    //Getters e Setters
    //Get
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    //set
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override
    public String toString(){
        return"Pessoa [nome = " + nome + ",idade = " + idade + "]";
    }
}