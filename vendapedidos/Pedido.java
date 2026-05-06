package vendapedidos;

import java.util.List;

public class Pedido {
    private List<Item> itens;
    private int id;

    public Pedido(int id) {
        this.id = id;
    }

    public double calcularTotal() {
    double total = 0;
    for (Item item : itens) {
        total += item.getPreco() * item.getQuantidade();
    }
    return total;
}

    public int getId() {
        return id;
    }
}
