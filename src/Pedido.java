/**
 * P2 Orientação a Objetos
 * @author perico
 * @version 1.0
 */

import java.util.ArrayList;

// esta classe está pronta!
public class Pedido {

    public Pedido(Cliente cliente, ArrayList<Pizza> pizzas) {
        this.cliente = cliente;
        this.pizzas = new ArrayList<>(pizzas);
        num_comum += 1;
        this.numero = num_comum;
    }
  
    public ArrayList<Pizza> pizzas; 

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
 
    
    private Cliente cliente;
    private int numero;
    private static int num_comum = 0; 
}
