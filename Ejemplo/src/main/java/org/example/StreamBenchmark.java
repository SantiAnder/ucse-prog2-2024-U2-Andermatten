package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamBenchmark {
        int size = 10000000;
        Random random = new Random();
        private List<Integer> list = new ArrayList<>();
        public StreamBenchmark() {
        this.list = new ArrayList<>();
        CargarLista();
        }
        public List<Integer> CargarLista(){
            for (int i = 0; i < size; i++) {
                getList().add(random.nextInt(1, 50000));
            }
            return getList();
        }
        public List<Integer> ListaSecuencial(){
            List<Integer> resultSecuencial = getList().stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());
            return resultSecuencial;
        }
        public List<Integer> ListaParalela() {
            List<Integer> resultParalelo = getList().parallelStream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());
            return resultParalelo;
        }

    public List<Integer> getList() {
        return list;
    }
}

