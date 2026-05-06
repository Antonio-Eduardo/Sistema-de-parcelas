package Servicos;

public interface Pagamento {
    double calcularParcela(int meses, double valor);
    void processarPagamento(double valor);
}
