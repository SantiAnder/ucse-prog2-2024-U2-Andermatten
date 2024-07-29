package org.example;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.LongSummaryStatistics;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(BenchMark.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(10)
                .forks(1)
                .build();
        new Runner(opt).run();

        int min = 100;
        int max = 500;
        /*Espera a que terminen los 4 */
        /*
        CompletableFuture<Integer> numero1 = CompletableFuture.supplyAsync(() -> {
            Random random = new Random();
            int num = random.nextInt((max - min) + 1) + min;
            try{
                Thread.sleep(num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return num;
        });
        CompletableFuture<Integer> numero2 = CompletableFuture.supplyAsync(() -> {
            Random random = new Random();
            int num = random.nextInt((max - min) + 1) + min;
            try{
                Thread.sleep(num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return num;
        });
        CompletableFuture<Integer> numero3 = CompletableFuture.supplyAsync(() -> {
            Random random = new Random();
            int num = random.nextInt((max - min) + 1) + min;
            try{
                Thread.sleep(num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return num;
        });
        CompletableFuture<Integer> numero4 = CompletableFuture.supplyAsync(() -> {
            Random random = new Random();
            int num = random.nextInt((max - min) + 1) + min;
            try{
                Thread.sleep(num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return num;
        });
        CompletableFuture<Void> allOf = CompletableFuture.allOf(numero1, numero2, numero3, numero4);
        allOf.join();
        int suma = numero1.join() + numero2.join() + numero3.join() + numero4.join();
        System.out.println("Los valores de los números son: " + numero1.join() + ", " + numero2.join() + ", " + numero3.join() + ", " + numero4.join());
        System.out.println("La suma de los 4 números es: " + suma);
        */
        /*Espera a que termine el más rápido */
        CompletableFuture<Integer> numero1 = CompletableFuture.supplyAsync(() -> {
            Random random = new Random();
            int num = random.nextInt((max - min) + 1) + min;
            try{
                Thread.sleep(num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return num;
        });
        CompletableFuture<Integer> numero2 = CompletableFuture.supplyAsync(() -> {
            Random random = new Random();
            int num = random.nextInt((max - min) + 1) + min;
            try{
                Thread.sleep(num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return num;
        });
        CompletableFuture<Integer> numero3 = CompletableFuture.supplyAsync(() -> {
            Random random = new Random();
            int num = random.nextInt((max - min) + 1) + min;
            try{
                Thread.sleep(num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return num;
        });
        CompletableFuture<Integer> numero4 = CompletableFuture.supplyAsync(() -> {
            Random random = new Random();
            int num = random.nextInt((max - min) + 1) + min;
            try{
                Thread.sleep(num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return num;
        });
        CompletableFuture<Object> masrapido = CompletableFuture.anyOf(numero1, numero2, numero3, numero4);
        int nro = (int)masrapido.join();
        System.out.println("El número que se generó más rápido fue: " + nro);
    }

}
