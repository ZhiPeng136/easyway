package com.example.easyway;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonRutaUnitTest {
    @Test
    public void testSort() {
        Ruta ruta1 = new Ruta("Ciudad universitaria", "Moncloa", "110", "4 km", "12:00", "12:15", 100);
        Ruta ruta2 = new Ruta("Ciudad universitaria", "Moncloa", "99", "2 km", "12:00", "12:15", 100);
        Ruta ruta3 = new Ruta("Ciudad universitaria", "Moncloa", "101", "3 km", "12:00", "12:15", 110);

        ListRutaSingleton lista = ListRutaSingleton.getInstance();
        lista.addElement(ruta1);
        lista.addElement(ruta2);
        lista.addElement(ruta3);
        lista.onSort();
        assertTrue(lista.getRutas().get(0).equals(ruta2) && lista.getRutas().get(1).equals(ruta1) && lista.getRutas().get(2).equals(ruta3));
    }
}