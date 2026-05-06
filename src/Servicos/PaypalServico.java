package Servicos;

public class PaypalServico implements Pagamento{

    @Override
    public void processarPagamento(double valor){}

    @Override
    public double calcularTaxa(double valor){
        return valor * 0.02;
    }
    @Override
    public double calcularJurosSimples(double valor, int mes){
        double taxa = ((double) mes/100.00);
        return valor * taxa;
    }
}
