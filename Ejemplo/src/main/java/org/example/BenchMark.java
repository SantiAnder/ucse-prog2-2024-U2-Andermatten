package org.example;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class BenchMark {
    StreamBenchmark st = new StreamBenchmark();
    @Benchmark
    public void secuencialStream(Blackhole bh) {
        bh.consume(st.ListaSecuencial());

    }
    @Benchmark
    public void parallelStream(Blackhole bh) {
        bh.consume(st.ListaParalela());
    }
}
