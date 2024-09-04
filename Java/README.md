# Java

Java es un lenguaje de programación de alto nivel, orientado a objetos y diseñado para tener pocas dependencias de implementación. Fue desarrollado por Sun Microsystems (ahora propiedad de Oracle Corporation) y lanzado por primera vez en 1995. Su característica más destacada es su capacidad de ser ejecutado en cualquier dispositivo que tenga una máquina virtual de Java (JVM), lo que lo hace multiplataforma. Esto significa que el mismo código Java puede ejecutarse en diferentes sistemas operativos sin necesidad de modificaciones, bajo el principio "Write Once, Run Anywhere" (Escribe una vez, ejecuta en cualquier lugar).

## Particularidades de Java

### 1. **Orientación a objetos**
   - Java es un lenguaje basado en clases y sigue los principios de la programación orientada a objetos (POO). Esto significa que todo en Java se organiza en torno a objetos y clases, lo que promueve la modularidad, reutilización de código y facilita el mantenimiento y escalabilidad de aplicaciones.

### 2. **Portabilidad**
   - La portabilidad es una de las mayores fortalezas de Java. Gracias a la JVM, el bytecode generado por el compilador de Java puede ser interpretado en cualquier sistema operativo que tenga instalada una JVM compatible, sin necesidad de recompilación.

### 3. **Gestión automática de memoria**
   - Java incluye un recolector de basura (Garbage Collector) que se encarga de gestionar la memoria automáticamente. Esto libera a los desarrolladores de la tarea de gestionar manualmente la asignación y liberación de memoria, reduciendo así los errores y fugas de memoria.

### 4. **Seguridad**
   - Java fue diseñado con la seguridad en mente. Incluye características como la gestión de memoria segura, la verificación de bytecode y el sandboxing (aislamiento) de aplicaciones, lo que lo convierte en una opción confiable para desarrollar aplicaciones seguras.

### 5. **Multihilo**
   - Java soporta la programación multihilo (multithreading), lo que permite que varias partes de un programa se ejecuten de manera concurrente, mejorando el rendimiento y la eficiencia en la ejecución de tareas.

### 6. **Ecosistema rico y vasto**
   - Java cuenta con un amplio ecosistema de bibliotecas, frameworks y herramientas que facilitan el desarrollo de una gran variedad de aplicaciones, desde aplicaciones móviles hasta sistemas empresariales robustos.

## Java SE vs. Java EE

### Java SE (Standard Edition)
Java SE, o Java Standard Edition, es la versión base de Java. Incluye la plataforma estándar para desarrollar aplicaciones de escritorio y servidores simples. Java SE proporciona las bibliotecas y APIs esenciales necesarias para desarrollar aplicaciones básicas, como las siguientes:

- **JVM (Java Virtual Machine):** El entorno de ejecución para aplicaciones Java.
- **Core Libraries:** Conjunto de bibliotecas fundamentales como `java.lang`, `java.util`, `java.io`, entre otras, que proporcionan funcionalidades básicas como colecciones, entrada/salida, manejo de excepciones, y concurrencia.
- **JavaFX:** Para el desarrollo de interfaces gráficas (GUIs).
- **Swing/AWT:** Herramientas más antiguas para GUIs.
- **Java Database Connectivity (JDBC):** API para la interacción con bases de datos.
- **Networking:** Para trabajar con redes y protocolos como HTTP, TCP/IP, etc.

Java SE es ideal para el desarrollo de aplicaciones de escritorio, utilidades, herramientas, y servicios básicos de servidor.

### Java EE (Enterprise Edition)
Java EE, o Java Enterprise Edition, es una extensión de Java SE que añade funcionalidades adicionales necesarias para el desarrollo de aplicaciones empresariales de gran escala. Java EE está diseñado para soportar aplicaciones distribuidas, robustas y de alto rendimiento que suelen ser necesarias en entornos corporativos. Algunas de las características de Java EE incluyen:

- **Enterprise JavaBeans (EJB):** Componente que permite la creación de aplicaciones escalables y distribuidas.
- **Java Persistence API (JPA):** Framework de mapeo objeto-relacional para la gestión de datos persistentes en bases de datos.
- **JavaServer Faces (JSF):** Framework para la creación de interfaces de usuario basadas en web.
- **Servlets y JSP (JavaServer Pages):** Tecnologías para el desarrollo de aplicaciones web dinámicas.
- **Java Message Service (JMS):** API para la comunicación asincrónica entre componentes distribuidos.
- **Web Services:** Soporte para crear y consumir servicios web (SOAP, REST).
- **Contextos y Dependencias de Inyección (CDI):** Framework para la inyección de dependencias y manejo de ciclo de vida de componentes.

Java EE se utiliza principalmente en entornos empresariales para construir aplicaciones robustas y escalables que requieren gestión de transacciones, seguridad avanzada, y servicios distribuidos.

### Diferencias clave entre Java SE y Java EE
- **Enfoque:** Java SE es la base para cualquier aplicación Java, mientras que Java EE está diseñado específicamente para aplicaciones empresariales.
- **Componentes:** Java EE incluye todos los componentes de Java SE, más una serie de APIs y servicios adicionales para la creación de aplicaciones complejas y distribuidas.
- **Uso:** Java SE se utiliza principalmente para aplicaciones de escritorio y servidores simples, mientras que Java EE es más común en entornos empresariales donde se necesitan aplicaciones robustas y escalables.

## JDK (Java Development Kit)

- Java Runtime Environment: Este es la maquina virtual de Java que permite ejecutar aplicaciones Java en cualquier dispositivo. Es lo que lo hace multiplataforma.
- Compilador de Java: Permite compilar el código fuente de Java en bytecode que puede ser interpretado por la JVM.
- Bibliotecas y APIs: Conjunto de bibliotecas y APIs que proporcionan funcionalidades esenciales para el desarrollo de aplicaciones Java.

### Nosotros vamos a usar openjdk que es una implementación de código abierto de la plataforma Java SE.

## Instalación de OpenJDK en Ubuntu

Para instalar OpenJDK en Ubuntu, puedes utilizar el siguiente comando:

```bash
sudo apt update
sudo apt install openjdk-[version]-jdk
```

Si quieres cambiar de version puedes usar el siguiente comando:

```bash
sudo update-alternatives --config java
```

