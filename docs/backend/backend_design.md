## Diseño del Backend Conceptual

### Arquitectura en Capas

En el backend se propone seguir una arquitectura limpia organizada en capas para asegurar la escalabilidad y el mantenimiento.

1 Capa de Controladores API Gestiona las peticiones HTTP entrantes y las dirige al servicio correspondiente.
2 Capa de Servicio Lógica de Negocio Contiene la lógica principal de la aplicación, como la validación de disponibilidad y 
el cálculo de precios.
3 Capa de Acceso a Datos Repositorio Gestiona la comunicación con la base de datos o APIs externas.
4 Capa de Modelos o Entidades Define las estructuras de datos utilizadas en todo el sistema.

### Flujo de una Petición

1 La petición del Cliente La aplicación móvil envía una petición HTTP por ejemplo POST para una reserva.
2 Seguridad o Filtros La petición pasa por filtros de autenticación y autorización.
3 El Controlador Recibe la petición, extrae los datos y llama al servicio.
4 Lógica del Servicio El servicio valida los datos del usuario y verifica si el espacio esta disponible para el horario solicitado.
5 Repositorio Ejecuta la consulta en la base de datos.
6 Respuesta Los datos regresan a traves de las capas y se envían al cliente como una respuesta JSON con el codigo de estado adecuado.

### Justificación de Decisiones

Este enfoque de capas ayuda a que se desacople la tecnología de la base de datos de la lógica de negocio, 
permitiendo cambiar el sistema de almacenamiento con un impacto mínimo en el resto de la aplicación.
