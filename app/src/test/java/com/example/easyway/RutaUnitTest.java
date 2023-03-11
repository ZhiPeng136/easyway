package com.example.easyway;

import org.junit.Test;

import static org.junit.Assert.*;

public class RutaUnitTest {


    @Test
    public void testEqualsTrue(){
        Ruta ruta = new Ruta("Ciudad universitaria","Moncloa","100" ,"1km","12:00","12:15",3600);
        Ruta ruta2 = new Ruta("Ciudad universitaria","Moncloa","100" ,"1km","12:00","12:15",3600);
        assertTrue(ruta.equals(ruta2));
    }

    @Test
    public void testEqualsFalse(){
        Ruta ruta = new Ruta("Ciudad universitaria","Moncloa","100min" ,"1km","12:00","12:15",3600);
        Ruta ruta2 = new Ruta("El Berrueco","Moncloa","130min" ,"30km","12:00","12:15",3600);
        assertFalse(ruta.equals(ruta2));
    }


}
