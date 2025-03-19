package br.edu.insper.desagil.aps5.insee;

public abstract class DataTempo extends Referencia{
    String data;
    int tempo;
    public DataTempo(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public DataTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getTempo() {
        return tempo;
    }

}
