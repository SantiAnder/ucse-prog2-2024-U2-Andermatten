Punto 1-
![image](https://github.com/user-attachments/assets/00879ae2-6b08-4e0b-9885-158eebf71bdb)

Podemos observar en la imágen que la cobertura de los tests sobre el trabajo base es del 100%. Podemos encontrar la misma jerarquía de paquetes tanto en el paquete "main" como en el paquete "test", y dentro salvo la clase abstracta, cada clase tiene su clase de test.
Punto 2- 

![image](https://github.com/user-attachments/assets/22eb5b46-635c-4029-adc7-ced960b29078)

Podemos observar que el parallelstream es más rápido, dado que conlleva 5.222 ms/op (milisegundos por operación) vs 5.629 ms/op del secuencialstream. Sin embargo podemos ver que también tiene mayor variabilidad de errores, con 0.493. Por lo que podemos decir que el parallelstream es más rápido en promedio que el secuencialstream pero tiene un rendimiento menos consistente.



