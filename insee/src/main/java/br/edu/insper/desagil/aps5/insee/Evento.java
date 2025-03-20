package br.edu.insper.desagil.aps5.insee;

public class Evento {
    DataTempo inicio;
    DataTempo fim;

    public DataTempo getInicio() {
        return inicio;
    }

    public DataTempo getFim() {
        return fim;
    }

    public Evento(DataTempo inicio, DataTempo fim) {
        this.inicio = inicio;
        this.fim = fim;
    }
    public boolean valido(){
        if(fim.metodoDataTempo()>inicio.metodoDataTempo()){
            return true;
        }
        else{
            return false;
        }
    }
}
