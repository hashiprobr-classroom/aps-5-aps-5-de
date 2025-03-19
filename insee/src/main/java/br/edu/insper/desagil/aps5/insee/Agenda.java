package br.edu.insper.desagil.aps5.insee;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public List<Evento> eventos;

    public Agenda(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public List<Evento> getEventos() {
        return eventos;
    }
    public void adiciona(Evento evento){
        if(evento.getInicio().valido(evento.getFim())){
            eventos.add(evento);
        }
    }
}
