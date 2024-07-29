package org.example;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class Ejercicio4 {
    public static void main(String[] args) {
        int min = 100;
        int max = 500;
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



