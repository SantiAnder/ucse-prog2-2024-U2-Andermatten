package org.example.ClasesEjercicioTests;

import org.example.ClasesEjercicio.CalculadorCombustible;
import org.example.ClasesEjercicio.AvionComercial;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class TestCalculadorCombustible {
    CalculadorCombustible calculador = CalculadorCombustible.getInstance();
    @Test
    public void testInstanciayaCreada(){
        CalculadorCombustible c = CalculadorCombustible.getInstance();
        Assertions.assertEquals(calculador, c);
    }
    @Test
    public void testCalcularCombustible(){
        int resultado = calculador.calcularCombustible(new AvionComercial(100, 10), 1000);
        Assertions.assertEquals(resultado, 10000);
    }

}
