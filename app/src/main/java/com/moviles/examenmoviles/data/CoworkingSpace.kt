package com.moviles.examenmoviles.data

data class CoworkingSpace(
    val id: String,
    val name: String,
    val description: String,
    val location: String,
    val capacity: Int,
    val pricePerHour: Double,
    val isAvailable: Boolean,
    val imageUrl: String
)

object MockDataProvider {
    val spaces = listOf(
        CoworkingSpace(
            id = "1",
            name = "Centro Urbano",
            description = "Un espacio moderno y dinámico en el corazon de la ciudad perfecto para emprendedores y pequenos equipos",
            location = "Calle Principal 123, Centro",
            capacity = 20,
            pricePerHour = 8500.0,
            isAvailable = true,
            imageUrl = "coworking_default.jpg"
        ),
        CoworkingSpace(
            id = "2",
            name = "Rincon del Silencio",
            description = "El enfoque y la productividad son las prioridades aqui Diseno minimalista y ambiente silencioso",
            location = "Segunda Avenida 456, Lado Norte",
            capacity = 10,
            pricePerHour = 6000.0,
            isAvailable = true,
            imageUrl = "coworking_default.jpg"
        ),
        CoworkingSpace(
            id = "3",
            name = "El Loft Creativo",
            description = "Techos altos mucha luz natural y mucho espacio para la colaboracion",
            location = "Distrito de las Artes, Camino Industrial 78",
            capacity = 35,
            pricePerHour = 12000.0,
            isAvailable = false,
            imageUrl = "coworking_default.jpg"
        ),
        CoworkingSpace(
            id = "4",
            name = "Oficina Parque Tecnológico",
            description = "Equipada con la ultima tecnología internet de alta velocidad y salas de reuniones privadas",
            location = "Parque Tecnológico, Av Innovación 10",
            capacity = 15,
            pricePerHour = 15000.0,
            isAvailable = true,
            imageUrl = "coworking_default.jpg"
        ),
        CoworkingSpace(
            id = "5",
            name = "Espacio de Trabajo Verde",
            description = "Espacio de coworking ecológico con plantas de interior y energía sostenible",
            location = "Distrito Ecológico, Calle Jardin 5",
            capacity = 12,
            pricePerHour = 7500.0,
            isAvailable = true,
            imageUrl = "coworking_default.jpg"
        )
    )
}
