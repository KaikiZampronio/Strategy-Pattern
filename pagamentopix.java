import java.util.Random;

public class PagamentoPix implements EstrategiaPagamento {
    public void processarPagamento(double valor) {
        String codigoPix = "PIX-" + new Random().nextInt(1000000);
        System.out.println("Pagamento via Pix realizado com sucesso!");
        System.out.println("Código Pix: " + codigoPix);
        System.out.println("Valor: R$" + valor);
    }
}
