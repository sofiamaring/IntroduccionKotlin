package Intro

class reto_3 {
    fun sumar() {
        println("Ingrese los grados en F°:")
        val fahrenheit = readLine()?.toDoubleOrNull()

        if (fahrenheit != null) {
            val resultado = (fahrenheit - 32) / 1.8
            println("Los grados que ingreso son equivalentes a $resultado grados centigrados")
        } else {
            println("Por favor, ingrese un valor válido.")
        }
    }
}