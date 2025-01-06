# FoodApp

**FoodApp** es una aplicación sencilla de frontend desarrollada en **Java** y **XML** utilizando **Android Studio**. Esta aplicación está diseñada para mostrar una interfaz básica que permite explorar opciones de comida y menús.

## Características

- Pantallas para visualizar menús de comida.
- Diseño sencillo y fácil de navegar.
- Compatible con dispositivos Android modernos.

## Tecnologías Utilizadas

- **Java**: Lenguaje principal para la lógica de la aplicación.
- **XML**: Para el diseño de las interfaces de usuario.
- **Android Studio**: Entorno de desarrollo integrado (IDE) para aplicaciones Android.

## Requisitos Previos

Asegúrate de tener las siguientes herramientas instaladas antes de comenzar:

- **Android Studio** (última versión recomendada).
- **JDK** (Java Development Kit).
- Un dispositivo Android físico o un emulador configurado.

## Instalación y Ejecución

1. Clona este repositorio:

   ```bash
   git clone https://github.com/gonzalodominguez39/FoodApp.git
   ```

2. Abre **Android Studio** y selecciona la opción **Open an Existing Project**.

3. Navega hasta la carpeta del proyecto y cárgalo.

4. Descarga las dependencias necesarias y sincroniza el proyecto.

5. Conecta un dispositivo Android o inicia un emulador.

6. Ejecuta la aplicación seleccionando **Run 'app'** en Android Studio o presionando `Shift + F10`.

## Estructura del Proyecto

```plaintext
FoodApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/foodapp/  # Código fuente Java
│   │   │   ├── res/                      # Recursos XML (layouts, valores, etc.)
│   │   │   └── AndroidManifest.xml       # Configuración del manifiesto de la app
├── gradle/                               # Archivos de configuración de Gradle
├── build.gradle                          # Configuración del proyecto
└── README.md                             # Documentación del proyecto
```

## Personalización

Puedes personalizar esta aplicación modificando los siguientes archivos:

- **Layouts XML**: Ubicados en `res/layout/`, aquí puedes cambiar la apariencia de las pantallas.
- **Strings**: En `res/values/strings.xml` puedes actualizar los textos de la app.
- **Java Files**: En `java/com/example/foodapp/` puedes modificar la lógica de la aplicación.

## Contribuciones

¡Las contribuciones son bienvenidas! Si tienes ideas o mejoras, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una rama para tu funcionalidad o corrección:

   ```bash
   git checkout -b feature/nueva-funcionalidad
   ```

3. Realiza los cambios y haz un commit:

   ```bash
   git commit -m "Añadir nueva funcionalidad"
   ```

4. Envía los cambios al repositorio remoto:

   ```bash
   git push origin feature/nueva-funcionalidad
   ```

5. Abre un **pull request**.

## Licencia

Este proyecto está licenciado bajo la [MIT License](LICENSE).

---

Desarrollado con ❤️ por [Gonzalo Domínguez](https://github.com/gonzalodominguez39).
