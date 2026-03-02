package model;

public class Carro {

    private String nome;
    private float preco;
    private int ano;

public Carro(String nome, float preco, int ano) {
    this.nome = nome;
    this.preco = preco;
    this.ano = ano;
}

public Carro() {
    
}

public void vender() {
    System.out.println("O carro " + this.nome + " está a caminho...");  
}

public String getnome() {
    return nome;
}

public float getpreco() {
    return preco;
}

public int getano() {
    return ano;
}

public void setnome(String nome) {
    this.nome = nome;
}



public void setpreco(float preco) {
    this.preco = preco;
}

public void setano(int ano) {
    this.ano = ano;
}





@Override 
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", ano =" +ano +
                '}';
    }
}

