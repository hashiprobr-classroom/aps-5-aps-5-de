package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    private static int ano;
    private static int dia;
    private static int mes;
    @BeforeEach
    void setUp(){
        int ano=1970;
        int mes=1;
        int dia=1;

    }
    @Test
    void constroi(){
        assertEquals(1970,ano);
        assertEquals(1,dia);
        assertEquals(1,mes);
    }
    @Test
    void naoAtualizaMenor(){
        assertEquals();
    }
    @Test
    void atualizaMaior(){

    }
    @Test
    void atualiza(){
        assertEquals("26/9/2024",novaData.atualiza(26,9,2024));
    }
    @Test
    void comoZero(){
        assertEquals(0,contaDias(1,1,1970));
    }
    @Test
    void comoAgora(){
        novaData.atualiza(26,9,2024);

        assertEquals(19978,novaData.contaDias(1,1,1970));
    }
}
