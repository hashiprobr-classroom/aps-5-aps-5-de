package br.edu.insper.desagil.aps5.insee;

public abstract class Referencia {
    String observacao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Referencia(String observacao) {
        this.observacao = "";
    }

    public abstract int contaDias(int ano, int mes, int dia);

    public abstract int contaMinutos(int ano, int mes, int dia);

    public abstract int metodo();

    public abstract int contaMinutos(int hora, int minuto);

    public abstract int metodoDataTempo();
}
