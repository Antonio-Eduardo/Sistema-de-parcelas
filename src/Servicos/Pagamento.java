package Servicos;

public interface  Pagamento {
    void processarPagamento(double valor);
    public double calcularTaxa(double valor);
    public double calcularJurosSimples(double valor, int mes);
}
