package br.edu.insper.desagil.aps5.insee;

public abstract class Referencia {
    String observacao;
    public Referencia() {
        this.observacao = "";
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public abstract int conta();

}
