/**
 * P2 Orientação a Objetos
 * @author perico
 * @version 1.0
 */

import java.util.ArrayList;

// esta classe está pronta!
public abstract class Pizza {

    public Pizza(String tamanho) {
        this.tamanho = tamanho;
        ingredientes.add("Massa");
        ingredientes.add("Molho de tomate");
    }
    
    public ArrayList<String> ingredientes = new ArrayList<>();
    
    public abstract void montarPizza();
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    private String tamanho;
    private String nome;
    private double preco;
}
