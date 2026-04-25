### App de Gestion de Espacios de Coworking PoC

Este repositorio contiene una propuesta técnica y una Prueba de Concepto (PoC) para una aplicación de gestión de espacios de coworking desarrollada como parte de una evaluación técnica

Estructura del Proyecto

app Proyecto Android implementado con Jetpack Compose
- Sigue la arquitectura MVVM
- Utiliza datos simulados para la demostración
- Navegación entre pantallas de Lista y Detalle
docs Documentación técnica completa
- architecture Diseño de la arquitectura del sistema y patrones
- backend Diseño conceptual del backend y flujos de petición
- api Definiciones de contratos de API para funcionalidades clave
- ui Estructura de la interfaz y documentación de componentes
- Toma de decisiones clave para el diseño Justificaciones técnicas y hoja de ruta futura

Funcionalidades Clave PoC
- Lista visual de espacios de coworking disponibles usando LazyColumn
- Vista detallada de cada espacio incluyendo precio capacidad y disponibilidad
- Navegación persistente usando una barra inferior BottomBar
- Flujo de reservación simulado

Tecnologías Utilizadas
- Kotlin Lenguaje de programación principal
- Jetpack Compose Kit de herramientas moderno para construir UI nativa
- Compose Navigation Para las transiciones entre pantallas
- Material 3 Sistema de diseño para una mejor apariencia que sea más moderna

Como Ejecutar
1 Abrir el proyecto en Android Studio Ladybug o mas reciente
2 Sincronizar el proyecto con los archivos de Gradle
3 Ejecutar el módulo app en un emulador o dispositivo fisico

