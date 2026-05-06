package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private int numeroContrato;
    private LocalDate dataContrato;
    private double valorContrato;
    private List<Parcelas> parcelas = new ArrayList<>();

    public Contrato() {
    }

    ;

    public Contrato(int numeroContrato, LocalDate dataContrato, double valorContrato) {
        this.numeroContrato = numeroContrato;
        this.dataContrato = dataContrato;
        this.valorContrato = valorContrato;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public void addParcela(Parcelas p) {
        parcelas.add(p);
    }

    public List<Parcelas> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcelas> parcelas) {
        this.parcelas = parcelas;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contrato\n");
        sb.append("\ndataContrato= ").append(dataContrato);
        sb.append("\nnumeroContrato= ").append(numeroContrato);
        sb.append("\nvalorContrato= ").append(valorContrato);
        sb.append("\nParcelas\n");
        for (Parcelas p :parcelas){
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}
