### Contratos de la API

1 Crear Reservación
Permite a un usuario reservar un espacio de coworking para un horario específico.

Punto de acceso API v1 reservations

Descripción Crea una nueva reserva para un espacio de coworking.
Estructura de la petición JSON
{
  "spaceId": "uuid-12345",
  "userId": "uuid-67890",
  "startTime": "2026-05-01T10:00:00Z",
  "endTime": "2026-05-01T14:00:00Z",
  "totalPrice": 60.00
}

Respuestas

201 Creado Reservación creada exitosamente.
400 Petición Incorrecta Datos inválidos o espacio no disponible.
401 No Autorizado Usuario no autenticado.

2 Actualizar Perfil de Usuario
Permite a un usuario actualizar su información personal.

Punto de acceso API v1 users userId
Descripción Actualiza la información de perfil de un usuario existente.
Estructura de la petición JSON
{
  "fullName": "Keyna Castro",
  "phoneNumber": "+123456789",
  "email": "keynacastro@gmail.com"
}

Respuestas

200 OK Perfil actualizado exitosamente.
404 No Encontrado El ID de usuario no existe.
400 Petición Incorrecta Error de validación.
