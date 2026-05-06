package vendapedidos;

public class PagamentoBoleto implements FormaPagamento {
    public void processar(double valor) {
        // Lógica para processar pagamento com boleto
        System.out.println("Processando pagamento com boleto no valor de: " + valor);
    }
  
}
