package org.example.ClasesEjercicioTests;

import org.example.ClasesEjercicio.AvionPrivado;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class TestAvionPrivado {
    AvionPrivado avionp = new AvionPrivado(100, 10);
    @Test
    public void testVolarPrivado(){
        int rta = avionp.volar(1000);
        Assertions.assertEquals(10050, rta);
    }
    @Test
    public void testConsumoCombustible() {
        int rta = avionp.getConsumoCombustible();
        Assertions.assertEquals(10, rta);
    }
    @Test
    public void testCapacidadCombustible() {
        int rta = avionp.getCapacidadCombustible();
        Assertions.assertEquals(100, rta);
    }
}
