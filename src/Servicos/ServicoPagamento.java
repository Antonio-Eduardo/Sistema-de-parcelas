package Servicos;

import entities.Contrato;
import entities.Parcelas;

import java.time.LocalDate;

public class ServicoPagamento {
    public void processarContrato(Contrato contrato, Pagamento pagamento, int meses){
        double valorBase = contrato.getValorContrato()/meses;
        for (int i = 1; i <= meses; i++){
            LocalDate dataVencimento = contrato.getDataContrato().plusMonths(i);
            double juros =  pagamento.calcularJurosSimples(valorBase, i);
            double taxa =  pagamento.calcularTaxa(valorBase + juros);
            double valorFinal =  valorBase + juros + taxa;
            Parcelas parcela = new Parcelas(valorFinal,dataVencimento);
            contrato.getParcelas().add(parcela);
        }
    }
}
