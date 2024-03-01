package Intro

import kotlin.math.pow
import kotlin.math.sqrt

class reto_1 {
    fun main() {

        while (true) {
            println("Por favor, seleccione una operación:")
            println("1. Suma")
            println("2. Resta")
            println("3. Multiplicación")
            println("4. División")
            println("5. Potencia")
            println("6. Raiz")
            println("7. Salir")

            val opcion = readLine()?.toIntOrNull()

            when (opcion) {
                1 -> sumar()
                2 -> restar()
                3 -> multiplicar()
                4 -> dividir()
                5 -> potencia()
                6 -> raiz()
                7 -> {
                    return
                }
                else -> println("Opción no válida. Por favor, seleccione una opción del 1 al 5.")
            }
        }
    }

    fun sumar() {
        println("Ingrese el primer número:")
        val numero1 = readLine()?.toDoubleOrNull()

        println("Ingrese el segundo número:")
        val numero2 = readLine()?.toDoubleOrNull()

        if (numero1 != null && numero2 != null) {
            val resultado = numero1 + numero2
            println("La suma de $numero1 y $numero2 es: $resultado")
        } else {
            println("Por favor, ingrese números válidos.")
        }
    }

    fun restar() {
        println("Ingrese el primer número:")
        val numero1 = readLine()?.toDoubleOrNull()

        println("Ingrese el segundo número:")
        val numero2 = readLine()?.toDoubleOrNull()

        if (numero1 != null && numero2 != null) {
            val resultado = numero1 - numero2
            println("La resta de $numero1 menos $numero2 es: $resultado")
        } else {
            println("Por favor, ingrese números válidos.")
        }
    }

    fun multiplicar() {
        println("Ingrese el primer número:")
        val numero1 = readLine()?.toDoubleOrNull()

        println("Ingrese el segundo número:")
        val numero2 = readLine()?.toDoubleOrNull()

        if (numero1 != null && numero2 != null) {
            val resultado = numero1 * numero2
            println("El resultado de multiplicar $numero1 por $numero2 es: $resultado")
        } else {
            println("Por favor, ingrese números válidos.")
        }
    }

    fun dividir() {
        println("Ingrese el dividendo:")
        val dividendo = readLine()?.toDoubleOrNull()

        println("Ingrese el divisor:")
        val divisor = readLine()?.toDoubleOrNull()

        if (dividendo != null && divisor != null && divisor != 0.0) {
            val resultado = dividendo / divisor
            println("El resultado de dividir $dividendo entre $divisor es: $resultado")
        } else {
            println("Por favor, ingrese números válidos y asegúrese de que el divisor no sea cero.")
        }
    }

    fun potencia() {
        println("Ingrese el número base:")
        val base = readLine()?.toDoubleOrNull()

        println("Ingrese la potencia:")
        val exponente = readLine()?.toDoubleOrNull()

        if (base != null && exponente != null) {
            val resultado = base.pow(exponente)
            println("El resultado de elevar $base a la potencia $exponente es: $resultado")
        } else {
            println("Por favor, ingrese números válidos.")
        }
    }

    fun raiz() {
        println("Ingrese un número:")
        val numero = readLine()?.toDoubleOrNull()

        if (numero != null && numero >= 0) {
            val raizCuadrada = sqrt(numero)
            println("La raíz cuadrada de $numero es: $raizCuadrada")
        } else {
            println("Por favor, ingrese un número válido y positivo.")
        }

    }
}