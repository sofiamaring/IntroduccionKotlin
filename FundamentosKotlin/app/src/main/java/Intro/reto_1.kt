package Intro

class reto_1 {
    fun main() {
        println("Bienvenido a la calculadora básica en Kotlin!")

        while (true) {
            println("Por favor, seleccione una operación:")
            println("1. Suma")
            println("2. Resta")
            println("3. Multiplicación")
            println("4. División")
            println("5. Salir")

            val opcion = readLine()?.toIntOrNull()

            when (opcion) {
                1 -> sumar()
                2 -> restar()
                3 -> multiplicar()
                4 -> dividir()
                5 -> {
                    println("Gracias por usar la calculadora. ¡Hasta luego!")
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

}