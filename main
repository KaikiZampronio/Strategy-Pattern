import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProcessadorPagamento processador = new ProcessadorPagamento();

        System.out.println("Escolha um método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o valor da transação: R$");
        double valor = scanner.nextDouble();

        switch (opcao) {
            case 1:
                processador.definirEstrategiaPagamento(new PagamentoPix());
                break;
            case 2:
                processador.definirEstrategiaPagamento(new PagamentoCartaoCredito());
                break;
            case 3:
                processador.definirEstrategiaPagamento(new PagamentoBoleto());
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        processador.processar(valor);
    }
}
