import org.example.AvionComercial;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class TestAvionComercial {
    AvionComercial avion = new AvionComercial(100, 10);
    @Test
    public void testVolarComercial(){
        int resultado = avion.volar(1000);
        Assertions.assertEquals(10000, resultado);
    }
    @Test
    public void testCapacidadCombustible(){
        int rta = avion.getCapacidadCombustible();
        Assertions.assertEquals(100, rta);
    }
    @Test
    public void testConsumoCombustible(){
        int rta = avion.getConsumoCombustible();
        Assertions.assertEquals(10, rta);
    }
}
