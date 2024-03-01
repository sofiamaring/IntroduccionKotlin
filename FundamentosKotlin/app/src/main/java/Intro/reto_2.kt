package Intro

class reto_2 {
    fun sumar() {
        println("Ingrese los meses del meses del bebe")
        val mesesbebe = readLine()?.toDoubleOrNull()

        println("Ingrese el peso del bebe")
        val pesobebe = readLine()?.toDoubleOrNull()

        if (mesesbebe != null && pesobebe != null) {
            val resultado = ((pesobebe + 10) / (mesesbebe * 10)) * 8
            println("La dosis del bebe es: $resultado")
        } else {
            println("Por favor, ingrese datos válidos.")
        }
    }
}