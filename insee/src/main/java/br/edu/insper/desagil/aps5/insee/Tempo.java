package br.edu.insper.desagil.aps5.insee;

public class Tempo extends Referencia{
    int hora;
    int minuto;

    public void atualiza(int hora,int minuto){
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
    public int contaMinutos(int ano, int mes, int dia) {
        int difHora=hora;
        int difMin=minuto;
        return (difHora*60)+difMin;
    }
}
