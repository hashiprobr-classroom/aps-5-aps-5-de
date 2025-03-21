package br.edu.insper.desagil.aps5.insee;

public abstract class DataTempo extends Referencia{
    Data data;
    Tempo tempo;

    public DataTempo(Data data, Tempo tempo) {
        this.data = data;
        this.tempo = tempo;
    }
    public Data getData() {
        return data;
    }

    public Tempo getTempo() {
        return tempo;
    }

    @Override
    public int conta(){
        int soma = 0;
        soma += this.data.conta() * 24 * 60;
        soma += this.tempo.conta();
        return soma;
    }

}
