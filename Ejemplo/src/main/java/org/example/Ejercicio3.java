package org.example;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class Ejercicio3 {
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
        CompletableFuture<Void> allOf = CompletableFuture.allOf(numero1, numero2, numero3, numero4);
        allOf.join();
        int suma = numero1.join() + numero2.join() + numero3.join() + numero4.join();
        System.out.println("Los valores de los números son: " + numero1.join() + ", " + numero2.join() + ", " + numero3.join() + ", " + numero4.join());
        System.out.println("La suma de los 4 números es: " + suma);
    }
}
