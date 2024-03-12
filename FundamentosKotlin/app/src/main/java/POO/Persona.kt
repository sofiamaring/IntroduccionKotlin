package POO

class Persona {
    /*atributos*/
    var nombre: String = "None"
        get() {
            TODO()
        }
        set(value) {}
    var edad: Int = 0
        get() {
            TODO()
        }
        set(value){}
    var estatura: Double = 0.0
        get() {
            TODO()
        }
        set(value) {}
    var sexo: Boolean = true
        get() {
            TODO()
        }
    constructor()
    /*constructor (estatura: Double, seco: Boolean, edad: Int, nombre: String) {
        this.estatura = estatura
        this.sexo = sexo
        this.edad = edad
        this.nombre = nombre
     } */

    fun pedirDatos(){
        println()("por favor ingrese su nombre")
        this.nombre = readLine()
        println("Por favor ingrese su edad")
        this.edad = readLine().toInt()
    }
}

fun main(){
    val person1=Persona()
    person1.pedirDatos()
    person1.edad=10
}