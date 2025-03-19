package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    private static String novaData;
    @BeforeEach
    void setUp(){
        novaData="1/1/1970";
    }
    @Test
    void constroi(){
        assertEquals("1/1/1970",novaData);
    }
    @Test
    void naoAtualizaMenor(){
        String teste=novaData.atualiza(0,0,1969);
        assertEquals(novaData,teste);
    }
    @Test
    void atualizaMaior(){
        String teste=novaData.atualiza(32,13,2024);
        assertEquals("31/12/2024",teste);
    }
    @Test
    void atualiza(){
        assertEquals("26/9/2024",novaData.atualiza(26,9,2024));
    }
    @Test
    void comoZero(){
        assertEquals(0,novaData.contaDias(1,1,1970));
    }
    @Test
    void comoAgora(){
        novaData.atualiza(26,9,2024);

        assertEquals(19978,novaData.contaDias(1,1,1970));
    }
}
