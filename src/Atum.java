/**
 * P2 Orientação a Objetos
 * @author perico
 * @version 1.0
 */

public class Atum extends Pizza{
    // TODO
    public Atum(String tam) {
        super(tam);
        setNome("Atum");
        ingredientes.add("Atum");
    }

    @Override
    public void montarPizza() {
        double preco = 21;
        if (getTamanho().equals("M")) {
            preco += 5;
        }
        else if(getTamanho().equals("G")) {
            preco += 10;
        }
        setPreco(preco);
    }
}
