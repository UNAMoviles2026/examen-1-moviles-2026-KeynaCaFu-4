## Diseño de Interfaz de Usuario

Estructura de la Interfaz de la aplicación está diseñada para ser intuitiva y 
limpia siguiendo las guías de Material 3. Consiste en un contenedor principal con un sistema de navegación.

### Flujo de Pantallas

1 Pantalla de Lista Muestra una lista vertical de espacios de coworking disponibles.
2 Pantalla de Detalle Muestra la información completa de un espacio específico cuando se selecciona.

### Composables Creados

Pantallas
CoworkingListScreen Punto de entrada principal que muestra todos los espacios.
CoworkingDetailScreen Vista detallada para un solo espacio.

### Componentes Reutilizables

CoworkingItem Una tarjeta que representa un solo espacio en la lista.
BottomNavigationBar Navegación persistente en la parte inferior de la pantalla.
SpaceHeader Sección superior de la pantalla de detalle con imagen e información básica.
InfoTag Pequeñas etiquetas reutilizables para mostrar capacidad y precio.

### Identificación de Componentes Reutilizables

CoworkingItem Se utiliza varias veces en la lista.
Botones Personalizados Estilos estandarizados para las acciones de reservar y regresar.
Barras de Navegación Estructura compartida entre pantallas mediante el uso de Scaffold.

### Justificación de la Organización

La interfaz está dividida en paquetes de pantallas y componentes para promover la reutilización del código y 
el mantenimiento. Al usar Scaffold aseguramos un diseño consistente con la barra inferior correctamente posicionada proporcionando una experiencia de navegacion estandar para el usuario.
