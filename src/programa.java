import Servicos.PaypalServico;
import Servicos.ServicoPagamento;
import entities.Contrato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class programa {
    public static void main(String[] args){
        ServicoPagamento servicoPagamento = new ServicoPagamento();
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = "18/06/2026";
        LocalDate datA = LocalDate.parse(data,fmt);

        Contrato contrato1 =new Contrato(8028,datA,600);
        servicoPagamento.processarContrato(contrato1, new PaypalServico(), 3);
        System.out.println(contrato1);
    }

}
