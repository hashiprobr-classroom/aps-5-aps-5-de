package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AgendaTest {
    private Agenda agenda;
    private Evento evento;


    @BeforeEach
    void setUp(){
        agenda = new Agenda();
    }

    @Test
    void constroi(){
        assertEquals(0, agenda.getEventos().size());
    }

    @Test
    void adicionaValido(){
        evento = mock(Evento.class);
        agenda.adiciona(evento);
        assertEquals(1, agenda.getEventos().size());
    }

    @Test
    void adicionaInvalido(){
        evento = mock(Evento.class);
        when(evento.valido()).thenReturn(false);
        assertThrows(IllegalArgumentException.class, () -> agenda.adiciona(evento));

    }


}
