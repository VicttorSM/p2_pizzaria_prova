/**
 * P2 Orientação a Objetos
 * @author perico
 * @version 1.0
 */

public class FrangoCheddar extends PizzaFrango{
    // TODO
    public FrangoCheddar(String tam) {
        super(tam);
        setNome("Frango com Cheddar");
        ingredientes.add("Cheddar");
    }

    @Override
    public void montarPizza() {
        double preco = 26;
        if (getTamanho().equals("M")) {
            preco += 5;
        }
        else if(getTamanho().equals("G")) {
            preco += 10;
        }
        setPreco(preco);
    }
}
