import org.example.StreamBenchmark;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class TestStreamBenchmark {
    StreamBenchmark st = new StreamBenchmark();
    @Test
    public void testCargarLista() {
       List<Integer> list = st.getList();
       boolean rta = false;
       if (!list.isEmpty()){
           rta = true;
       }
       Assertions.assertTrue(rta);
    }
    @Test
    public void testListaSecuencial(){
        List<Integer> list = st.ListaSecuencial();
        Assertions.assertNotEquals(st.getList(),list);
    }
    @Test
    public void testListaParalela(){
        List<Integer> list = st.ListaParalela();
        Assertions.assertNotEquals(st.getList(),list);
    }

}
