package com.iessanalberto.dam2.gerardo.citaspelu.models

data class Cita(
    var nombre: String,
    var empleado: String,
    var descripcion: String,
    var estado: Estado.PENDIENTE
) {
    constructor(nombre: String, responsable: String, descripcion: String, estado: String) : this(
        nombre,
        responsable,
        descripcion,
        estado
    )

    companion object {
        var contador = 0
        fun siguienteId():Int {
            return ++contador
        }
    }
    val id: Int = siguienteId()
}

enum class Estado(val etiqueta: String) {
    PENDIENTE(etiqueta = "Concertada"),
    EN_PROGRESO(etiqueta = "En progreso"),
    COMPLETADO(etiqueta = "Realizada");
}
