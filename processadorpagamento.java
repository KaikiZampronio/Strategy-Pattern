public class ProcessadorPagamento {
    private EstrategiaPagamento estrategiaPagamento;

    public void definirEstrategiaPagamento(EstrategiaPagamento estrategia) {
        this.estrategiaPagamento = estrategia;
    }

    public void processar(double valor) {
        if (estrategiaPagamento != null) {
            estrategiaPagamento.processarPagamento(valor);
        } else {
            System.out.println("Nenhuma estratégia de pagamento definida!");
        }
    }
}
