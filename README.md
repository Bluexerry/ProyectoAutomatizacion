# QAutomation

## Descripción del Proyecto

QAutomation es un marco de automatización de pruebas orientado al ámbito educativo, desarrollado en lenguaje Java y gestionado mediante Maven. Este proyecto está diseñado para facilitar la creación, ejecución y gestión de pruebas automatizadas utilizando tecnologías modernas como Selenium WebDriver, TestNG y Allure para la generación de reportes detallados.

A continuación, se presenta una descripción completa y profesional de las funcionalidades, estructura y componentes clave del proyecto.

---

## Estructura del Proyecto

El proyecto sigue una estructura organizada que permite una fácil navegación y mantenimiento. A continuación, se detalla la estructura principal del workspace:

### Descripción de Componentes Clave

- **pom.xml**: Archivo de configuración de Maven que gestiona las dependencias del proyecto, plugins y configuraciones necesarias para la compilación y ejecución de pruebas.
- **testng.xml**: Archivo de configuración de TestNG que define las suites de pruebas, incluyendo la especificación de clases de prueba a ejecutar y parámetros de configuración.
- **.gitignore**: Archivo que especifica qué archivos y directorios deben ser ignorados por Git, asegurando que solo el código fuente relevante sea rastreado.
- **src/test/java/Pages/**: Directorio que contiene todas las clases de prueba organizadas por funcionalidad o módulo de la aplicación bajo prueba.
- **allure-results/**: Directorio donde Allure almacena los resultados de las pruebas para la generación de reportes detallados.

---

## Tecnologías y Dependencias

El proyecto utiliza una serie de tecnologías y librerías que facilitan la automatización de pruebas:

- **Java 1.8**: Lenguaje de programación principal utilizado para el desarrollo de las pruebas automatizadas.
- **Maven**: Herramienta de gestión y compilación de proyectos que maneja las dependencias y los ciclos de vida de construcción.
- **Selenium WebDriver 3.141.59**: Biblioteca para la automatización de navegadores web, permitiendo la interacción con elementos de la interfaz de usuario.
- **TestNG 6.14.3**: Framework de pruebas que proporciona funcionalidades avanzadas como la gestión de suites de pruebas, parametrización y reportes.
- **Allure TestNG 2.13.7 y Allure 1.5.4**: Herramientas para la generación de reportes visuales y detallados de las ejecuciones de pruebas.
- **Apache Commons Lang3 3.8**: Librería que ofrece utilidades adicionales para el manejo de cadenas y objetos.
- **SLF4J 1.7.30**: Framework de logging para la gestión eficiente de registros durante la ejecución de pruebas.
- **Otras dependencias** incluyen `opencsv` para el manejo de archivos CSV y `appium-java-client` para potencial integración con pruebas móviles, aunque el foco principal del proyecto actual es la automatización web.

---

## Funcionalidades Principales

### Automatización de Pruebas Web

El proyecto está diseñado para automatizar pruebas funcionales en aplicaciones web, específicamente orientadas a la plataforma **Demo QA**. Las funcionalidades clave incluyen:

- **Validación de Contenidos**: Verificación de la presencia y estado de elementos en la página, asegurando que la interfaz de usuario cumpla con los requisitos especificados.
- **Interacciones con Elementos Web**: Automatización de acciones como clics, envíos de formularios, selecciones en listas desplegables y entradas de texto.
- **Gestión de Condiciones y Validaciones**: Implementación de lógica condicional para validar estados específicos de la aplicación bajo prueba, con mensajes de consola detallados en caso de fallos.
- **Uso de XPaths Avanzados**: Empleo de expresiones XPath complejas para localizar elementos dinámicos y específicos dentro del DOM de la página web.

### Organización y Mantenimiento de Pruebas

- **Estructuración Modular**: Las clases de prueba están organizadas por módulos o funcionalidades de la aplicación, facilitando el mantenimiento y la escalabilidad del proyecto.
- **Configuración de Entorno**: Uso de anotaciones `@BeforeSuite` y `@AfterSuite` para la inicialización y cierre de sesiones de navegador, garantizando un entorno limpio para cada ejecución de prueba.
- **Reportes Detallados**: Integración con Allure para la generación de reportes que ofrecen una visión clara de los resultados de las pruebas, incluyendo capturas de pantalla y registros de ejecución.

### Gestión de Dependencias y Compilación

- **Maven**: Gestión centralizada de dependencias y facilidad para la construcción del proyecto mediante comandos simples como `mvn test`.
- **Plugins de Maven**: Uso del `maven-surefire-plugin` para la ejecución de pruebas TestNG y otras configuraciones necesarias para la integración continua y despliegue.

### Ejecución de Pruebas

Para ejecutar las pruebas automatizadas, se utiliza el siguiente comando Maven:

```sh
mvn test
```

Este comando desencadena la ejecución de las pruebas definidas en `testng.xml`, utilizando las clases de prueba especificadas. Los resultados se almacenan en el directorio `target` y los reportes detallados son generados en `allure-results`.

---

## Configuración de Git

El archivo `.gitignore` está cuidadosamente configurado para excluir archivos y directorios que no son necesarios para el control de versiones, como archivos de configuración de IDE, dependencias descargadas y resultados de pruebas.

---

## Resumen Profesional

QAutomation representa una solución robusta y extensible para la automatización de pruebas web en entornos educativos. Su diseño modular, combinado con el uso de tecnologías líderes en la industria, permite a los usuarios crear scripts de prueba eficientes y mantenibles, asegurando un flujo de trabajo optimizado y sostenible.

---

## Estructura del Proyecto

```
.
├── .gitignore
├── .vscode/
│   └── settings.json
├── allure-results/
│   ├── 002653fe-e112-40c7-b099-e8477b079ed6-container.json
│   ├── 002696ef-a685-4ec5-b277-bb82c55d7750-result.json
│   ├── 002c54fe-013e-4c21-8a88-11f86fbfa8b2-result.json
│   ├── 00301899-7ff7-4b47-90df-b53ea1ef0750-container.json
│   ├── 0030ad17-a99c-478d-ac39-d4783ea275c9-result.json
│   ├── 003584c7-19ab-4f54-a9d1-efb26ebe3e26-container.json
│   ├── 003cdc6a-b889-4a02-a78b-0d5d73fdd92f-container.json
│   └── ...
├── pom.xml
├── README.md
├── src/
│   └── test/
│       └── java/
│           └── Pages/
│               ├── AlertsFrameWindows.java
│               ├── Elements.java
│               ├── ExamenT3.java
│               ├── Forms.java
│               ├── Home.java
│               ├── TestPlan1.java
│               └── Widgets.java
├── target/
│   ├── classes/
│   └── ...
├── testng.xml
```
