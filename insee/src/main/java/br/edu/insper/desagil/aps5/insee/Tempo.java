package br.edu.insper.desagil.aps5.insee;

public class Tempo extends Referencia{
    int hora=0;
    int minuto=0;

    public Tempo(String observacao) {
        super(observacao);
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void atualiza(int hora, int minuto){
        if(hora<0){
            this.hora=0;
        }
        if(hora>24){
            this.hora=23;
        }
        if(minuto<0){
            this.minuto=0;
        }
        if(minuto>59){
            this.minuto=59;
        }
    }

    @Override
    public int contaDias(int ano, int mes, int dia) {
        return 0;
    }

    @Override
    public int contaMinutos(int ano, int mes, int dia) {
        return 0;
    }

    @Override
    public int metodo() {
        return 0;
    }

    @Override
    public int contaMinutos(int hora, int minuto) {
        return (hora*60)+minuto;
    }

    @Override
    public int metodoDataTempo() {
        return 0;
    }
}
