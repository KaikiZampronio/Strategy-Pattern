import java.util.Random;

public class PagamentoBoleto implements EstrategiaPagamento {
    public void processarPagamento(double valor) {
        String codigoBoleto = "BOLETO-" + new Random().nextInt(1000000);
        System.out.println("Pagamento via Boleto gerado com sucesso!");
        System.out.println("Código do Boleto: " + codigoBoleto);
        System.out.println("Valor: R$" + valor);
    }
}
