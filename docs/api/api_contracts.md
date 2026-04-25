Contratos de la API

1 Crear Reservacion
Permite a un usuario reservar un espacio de coworking para un horario especifico.

Punto de acceso API v1 reservations
Descripcion Crea una nueva reserva para un espacio de coworking.
Estructura de la peticion JSON
{
  "spaceId": "uuid-12345",
  "userId": "uuid-67890",
  "startTime": "2026-05-01T10:00:00Z",
  "endTime": "2026-05-01T14:00:00Z",
  "totalPrice": 60.00
}

Respuestas
201 Creado Reservacion creada exitosamente.
400 Peticion Incorrecta Datos invalidos o espacio no disponible.
401 No Autorizado Usuario no autenticado.

2 Actualizar Perfil de Usuario
Permite a un usuario actualizar su informacion personal.

Punto de acceso API v1 users userId
Descripcion Actualiza la informacion de perfil de un usuario existente.
Estructura de la peticion JSON
{
  "fullName": "John Doe",
  "phoneNumber": "+123456789",
  "email": "john.doe@example.com"
}

Respuestas
200 OK Perfil actualizado exitosamente.
404 No Encontrado El ID de usuario no existe.
400 Peticion Incorrecta Error de validacion.
