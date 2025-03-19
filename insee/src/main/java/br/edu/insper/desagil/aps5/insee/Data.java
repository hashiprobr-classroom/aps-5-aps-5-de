package br.edu.insper.desagil.aps5.insee;

import java.util.Map;

public abstract class Data extends Referencia{
    public int ano = 1970;
    public int mes = 1;
    public int dia = 1;

    public Map<Integer, Integer> limites;

    public Data(Map<Integer, Integer> limites) {
        this.limites = limites;
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
        if(mes<1){
            this.mes=1;
        }
        if(mes>12){
            this.mes=12;
        }
        if(dia<1){
            this.dia=1;
        }
        if(dia>limites.get(mes)){
            this.dia=limites.get(mes);
        }
    }
    @Override
    public int contaDias(int ano, int mes, int dia){
        int soma=0;
        int difAno=ano-1970;
        for(int i=1;i<this.mes;i++){
            soma+=limites.get(mes);
        }
        int difDia=dia-1;
        soma+=difDia+difAno;
        return soma;
    }
    }


