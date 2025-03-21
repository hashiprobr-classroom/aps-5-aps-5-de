package br.edu.insper.desagil.aps5.insee;

public abstract class DataTempo extends Referencia{
    Data data;
    Tempo tempo;

    public Data getData() {
        return data;
    }

    public Tempo getTempo() {
        return tempo;
    }

    public DataTempo(Data data, Tempo tempo) {
        this.data = data;
        this.tempo = tempo;
    }
    @Override
    public int metodoDataTempo(){
        return contaDias();
    }
}
