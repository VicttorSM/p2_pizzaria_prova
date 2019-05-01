/**
 * P2 Orientação a Objetos
 * @author perico
 * @version 1.0
 */

public class Calabresa extends Pizza {
    // TODO
    public Calabresa(String tam) {
        super(tam);
        setNome("Calabresa");
        ingredientes.add("Calabresa");
    }

    @Override
    public void montarPizza() {
        double preco = 20.5;
        if (getTamanho().equals("M")) {
            preco += 5;
        }
        else if(getTamanho().equals("G")) {
            preco += 10;
        }
        setPreco(preco);
    }
}
