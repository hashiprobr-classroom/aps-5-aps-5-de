package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    private Data data;

    @BeforeEach
    void setUp(){
        data = new Data();
    }
    @Test
    void constroi(){
        assertEquals(1970,data.getAno());
        assertEquals(1,data.getMes());
        assertEquals(1,data.getDia());
    }
    @Test
    void naoAtualizaMenor(){
        data.atualiza(1969,0,0);
        assertEquals(1970,data.getAno());
        assertEquals(1,data.getMes());
        assertEquals(1,data.getDia());
    }
    @Test
    void atualizaMaior(){
        assertEquals();
    }
    @Test
    void atualiza(){

    }
    //@Test
    //void comoZero(){
       // assertEquals(0,contaDias(1,1,1970));
    //}
    //@Test
    //void comoAgora(){
    //    novaData.atualiza(26,9,2024);

    //    assertEquals(19978,novaData.contaDias(1,1,1970));
    //}
}
