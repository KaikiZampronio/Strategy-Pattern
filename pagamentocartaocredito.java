import java.util.Scanner;

public class PagamentoCartaoCredito implements EstrategiaPagamento {
    public void processarPagamento(double valor) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do cartão de crédito: ");
        String numeroCartao = scanner.nextLine();
        System.out.println("Pagamento via Cartão de Crédito realizado com sucesso!");
        System.out.println("Número do Cartão: " + numeroCartao);
        System.out.println("Valor: R$" + valor);
    }
}
