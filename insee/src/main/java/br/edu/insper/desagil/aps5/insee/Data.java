package br.edu.insper.desagil.aps5.insee;

import java.util.HashMap;
import java.util.Map;

public class Data extends Referencia{
    public int ano;
    public int mes;
    public int dia;
    public Map<Integer, Integer> limites;

    public Data() {
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        this.limites=new HashMap<>();
        limites.put(1, 31);
        limites.put(2, 28);
        limites.put(3, 31);
        limites.put(4, 30);
        limites.put(5, 31);
        limites.put(6, 30);
        limites.put(7, 31);
        limites.put(8, 31);
        limites.put(9, 30);
        limites.put(10, 31);
        limites.put(11, 30);
        limites.put(12, 31);
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public void atualiza(int ano, int mes, int dia) {
        if(ano<1970) {
            this.ano = 1970;
        }
        else{
            this.ano = ano;
        }
        if(mes<1){
            this.mes=1;
        }
        else if(mes>12){
            this.mes=12;
        }
        else{
            this.mes = mes;
        }

        if(dia<1){
            this.dia=1;
        }
        else if(dia > limites.get(this.mes)){
            this.dia= limites.get(this.mes);
        }
        else{
            this.dia = dia;
        }
    }

    @Override
    public int contaDias(int dia, int mes, int ano){
        int soma=0;
        int difAno=ano-1970;
        for(int i=1;i<this.mes;i++){
            soma+=limites.get(mes);
        }
        int difDia=dia-1;
        soma+=difDia+difAno;
        return soma;
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
        return 0;
    }

    @Override
    public int metodoDataTempo() {
        return 0;
    }


}


