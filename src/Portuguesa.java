/**
 * P2 Orientação a Objetos
 * @author perico
 * @version 1.0
 */

public class Portuguesa extends Pizza{
    // TODO
    public Portuguesa(String tam) {
        super(tam);
        setNome("Portuguesa");
        ingredientes.add("Presunto");
        ingredientes.add("Queijo");
        ingredientes.add("Ovo");
    }

    @Override
    public void montarPizza() {
        double preco = 26.5;
        if (getTamanho().equals("M")) {
            preco += 5;
        }
        else if(getTamanho().equals("G")) {
            preco += 10;
        }
        setPreco(preco);
    }
}
