package vendapedidos;

public class PagamentoCartao implements FormaPagamento {
  public void processar(double valor) {
        // Lógica para processar pagamento com cartão
        System.out.println("Processando pagamento com cartão no valor de: " + valor);
    }
  
}
