package vendapedidos;

import java.util.ArrayList;
import java.util.List;

public class SistemaPedidos {
  private List<Pedido> pedidos = new ArrayList<>();

  public void processarPedido(Pedido pedido, FormaPagamento forma) {
        double total = pedido.calcularTotal();
        forma.processar(total);
        
        pedidos.add(pedido);
        System.out.println("Pedido salvo: " + pedido.getId());
    } 
  
}
