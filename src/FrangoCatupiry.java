/**
 * P2 Orientação a Objetos
 * @author perico
 * @version 1.0
 */

public class FrangoCatupiry extends PizzaFrango{
// TODO
    public FrangoCatupiry(String tam) {
        super(tam);
        setNome("Frango com Catupiry");
        ingredientes.add("Catupiry");
    }

    @Override
    public void montarPizza() {
        double preco = 25;
        if (getTamanho().equals("M")) {
            preco += 5;
        }
        else if(getTamanho().equals("G")) {
            preco += 10;
        }
        setPreco(preco);
    }
}