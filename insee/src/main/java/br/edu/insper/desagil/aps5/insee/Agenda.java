package br.edu.insper.desagil.aps5.insee;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public List<Evento> eventos;

    public Agenda(List<Evento> eventos) {
        this.eventos = new ArrayList<>();
    }

    public List<Evento> getEventos() {
        return eventos;
    }
    public void adiciona(Evento evento){
        if(evento.valido()){
            eventos.add(evento);
        }
        else{
            throw new IllegalArgumentException("Evento inválido!");
        }
    }
}
