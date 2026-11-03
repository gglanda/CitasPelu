package com.iessanalberto.dam2.gerardo.citaspelu.data


val listaCitas: MutableList<Cita> = mutableListOf(
    Cita(
        nombre = "Juan",
        empleado = "Maria",
        fecha = "20/11/2026 17:00:00",
        descripcion = "Lavar y marcar",
        estado.EN_PROGRESO
    ),
    Cita(
        nombre = "Maria",
        responsable = "Daniel",
        descripcion = "Lavar la bici con agua y jabón"
    ),
    Cita(
        nombre = "Comprar fruta",
        responsable = "Rubén",
        descripcion = "Comprar aguacates, limones y sandías",
        estado = Estado.EN_PROGRESO
    ),
    Cita(
        nombre = "Estudiar",
        responsable = "Todos",
        descripcion = "Estudiar y practicar y sobre todo programar"
    ),
    Cita(
        nombre = "Ofrenda de flores",
        responsable = "Todos",
        descripcion = "Ir a llevar flores a quien queráis"
    )
)

fun buscarTarea(id: Int): Tarea? {
    var task: Tarea? = null
    for (tarea in listaTareas){
        if (tarea.id == id){
            task =  tarea
        }
    }
    return task
}
