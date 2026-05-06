package entities;

import java.time.LocalDate;

public class Parcelas {
    LocalDate dataParcela;
    double valorParcela;

    public Parcelas(double valorParcela, LocalDate dataParcela) {
        this.valorParcela = valorParcela;
        this.dataParcela = dataParcela;
    }

    public LocalDate getDataParcela() {
        return dataParcela;
    }

    public void setDataParcela(LocalDate dataParcela) {
        this.dataParcela = dataParcela;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("valorParcela= ").append(valorParcela);
        sb.append(" dataParcela= ").append(dataParcela);
        return sb.toString();
    }
}
