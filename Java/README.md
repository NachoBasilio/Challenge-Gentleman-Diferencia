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

En Java los archivos llevan la extensión `.java` y para compilarlos se utiliza el comando `javac` seguido del nombre del archivo. Por ejemplo:

```bash
javac MiPrograma.java
```

Esto generará un archivo con extensión `.class` que contiene el bytecode de la aplicación. Para ejecutarlo, se utiliza el comando `java` seguido del nombre de la clase principal (sin la extensión `.class`). Por ejemplo:

```bash 
java MiPrograma
```

## Primer "Hola mundo en Java"

```java 
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
    }
}
```

Como puede ver el codigo se divide en varias partes:

1. **public:** Es un modificador de acceso que indica que la clase es accesible desde cualquier otra clase.
2. **class:** Es una palabra clave que se utiliza para definir una clase.
3. **HolaMundo:** Es el nombre de la clase, tiene que coincidir con el nombre del archivo y tiene que estar en UpperCamelCase.
4. **public static void main(String[] args):** Es el método principal de la clase. Es el punto de entrada de la aplicación y se ejecuta cuando se inicia el programa.
5. **System.out.println("¡Hola, mundo!");:** Es una instrucción que imprime el texto "¡Hola, mundo!" en la consola.

## Cómo Crear y Ejecutar un Archivo JAR en Java 

### Estructura de Archivos
1. Código fuente: .java
2. Directorio de salida: dist/
3. Archivo de manifiesto: MANIFEST.MF

Pasos: 

1. Compilar el codigo Java:

```bash
javac -d dist nombreDelArchivo.java
```

* nombreDelArchivo es el nombre del archivo que contiene el código fuente.
* -d dist indica que los archivos compilados se guardarán en el directorio dist/.

2. Crear el achivo MANIFEST.MF:

```plaintext
Manifest-Version: 1.0
Main-Class: NombreDeLaClasePrincipal
```

* Main-Class: NombreDeLaClasePrincipal es el nombre de la clase principal que contiene el método main.

3. Crear el archivo JAR:

```bash
jar cfm NombreDelArchivo.jar MANIFEST.MF -C dist .
```
* NombreDelArchivo es el nombre del archivo JAR que se creará.
* MANIFEST.MF es el archivo de manifiesto que se utilizará.
* -C dist . indica que se incluirán los archivos del directorio dist/ en el archivo JAR.

4. Ejecutar el archivo JAR:

```bash
java -jar NombreDelArchivo.jar
```

#### Notas:

* Archivo MANIFEST.MF debe estar en el directiorio principal.
* Estructura del JAR: El archivo MANIFEST.MF se incluirá en el directorio META-INF dentro del archivo JAR.

## Declara variables en Java

En Java, las variables se declaran especificando el tipo de dato seguido del nombre de la variable. Por ejemplo:

```java
int numero = 10;
String nombre = "Juan";
double precio = 19.99;
boolean activo = true;
```

### Convenciones de nomenclatura

#### En variables:

- **LowerCamelCase:** Es una convención de nomenclatura que se utiliza para nombrar variables, métodos y clases en Java. Consiste en escribir la primera palabra en minúscula y las palabras siguientes en mayúscula. Por ejemplo: `nombreDeVariable`, `nombreDeMetodo`, `NombreDeClase`.

#### En constantes:

- **UPPER_CASE:** Es una convención de nomenclatura que se utiliza para nombrar constantes en Java. Consiste en escribir todas las letras en mayúscula y separar las palabras con guiones bajos. Por ejemplo: `NOMBRE_DE_CONSTANTE`, `PI`, `TAMANIO_MAXIMO`.

Hablando de constantes, estas se declaran con la palabra clave `final`, ademas de respetar la convención de nomenclatura `UPPER_CASE`. Por ejemplo:

```java
final double PI = 3.14159;
final int TAMANIO_MAXIMO = 100;
```

### Tipos de Datos en Java

Java ofrece varios tipos de datos primitivos, cada uno con un tamaño específico:

- int: Entero de 32 bits. Ejemplo: int n = 1234567890;
- long: Entero de 64 bits. Ejemplo: long nL = 12345678901L;
- float: Número decimal de 32 bits con precisión simple. Ejemplo: float nF = 123.456F;
- double: Número decimal de 64 bits con precisión doble. Ejemplo: double nD = 123.456;
- char: Carácter de 2 bits. Ejemplo: char nC = 'a';
- boolean: Valor lógico que ocupa 2 bits. Ejemplo: boolean nB = true;

Desde Java 10, también es posible utilizar la inferencia de tipos con var para crear variables con el tipo inferido automáticamente.

### Operadores

Java ofrece una variedad de operadores que permiten realizar diferentes tipos de operaciones:

- Operadores aritméticos: +, -, *, /, %
- Incremento y decremento:
   - Pre-incremento/decremento (++a, --a) modifica el valor antes de asignarlo.
   - Post-incremento/decremento (a++, a--) asigna el valor antes de modificarlo.
     
- Clase Math: Ofrece funciones matemáticas avanzadas como:
   - Raíz cuadrada: Math.sqrt(9)
   - Potencias: Math.pow(3, 2)
   - Redondeo: Math.round(5.6), Math.ceil(5.1), Math.floor(5.9)
   - Valor absoluto: Math.abs(-5)
   - Máximo y mínimo: Math.max(5, 10), Math.min(5, 10)

### Casting (Conversión de Tipos)

El casting permite convertir un tipo de dato en otro, ya sea de forma implícita o explícita:

- Casting implícito: Sucede automáticamente cuando no hay pérdida de información. Ejemplo: double c = a / b;
- Casting explícito: Se usa cuando puede haber pérdida de información o cuando se quiere ser específico. Ejemplo: int i = (int) d;

### Estructuras Condicionales

- if, else if, else: Permiten ejecutar código condicionalmente dependiendo de una expresión booleana.

```java
if (age >= 18) {
    System.out.println("Eres mayor de edad");
} else {
    System.out.println("Eres menor de edad");
}
```

- Operadores de equidad y comparación: ==, !=, <, >, <=, >=
- Operadores lógicos: &&, ||, !
- switch: Evalúa una variable y ejecuta el bloque correspondiente al valor que coincida.

```java
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    // Otros casos...
    default:
        System.out.println("Día no válido");
}
```
### Funciones en Java

Una función es un bloque de código que realiza una tarea específica y puede devolver un valor.

- Funciones con retorno:

```java
public static int suma(int a, int b) {
    return a + b;
}
```

- Funciones sin retorno (void):

```java
public static void imprimirMensaje(String mensaje) {
    System.out.println(mensaje);
}
```

- Ejemplo de cálculo:
   - Área de un círculo:
     ```java
     public static double areaDeUnCirculo(int radio) {
       return (Math.PI * Math.pow(radio, 2));
     }
     ```
