/**
 * P2 Orientação a Objetos
 * @author perico
 * @version 1.0
 */

public class Queijo extends Pizza{
    // TODO 
    public Queijo(String tam) {
        super(tam);
        setNome("Queijo");
        ingredientes.add("Queijo");
    }

    @Override
    public void montarPizza() {
        double preco = 19.5;
        if (getTamanho().equals("M")) {
            preco += 5;
        }
        else if(getTamanho().equals("G")) {
            preco += 10;
        }
        setPreco(preco);
    }
}
