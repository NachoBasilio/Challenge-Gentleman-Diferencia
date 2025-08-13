# White Box Testing

## Definición

En este tipo de pruebas **sí conocemos el código interno y la estructura del software** que estamos testeando. El tester tiene acceso completo al código fuente y utiliza este conocimiento para **diseñar casos de prueba que cubran todas las rutas posibles** del programa.

## Enfoque del Tester

Como testers en White Box necesitamos:
- **Conocimiento del código fuente**
- **Comprensión de la arquitectura interna**
- **Análisis de flujos de control y datos**
- **Identificación de todas las rutas de ejecución posibles**

**Desde este conocimiento interno, diseñamos pruebas para cubrir el máximo de código posible.**

## Características principales

- **Requiere acceso al código fuente**
- **Enfoque en la estructura interna del software**
- **Cobertura de código (líneas, ramas, condiciones)**
- **Detección de código muerto o no utilizado**
- **Optimización del rendimiento**
- **Verificación de la lógica interna**

## Tipos de cobertura

- **Cobertura de sentencias**: Cada línea de código se ejecuta al menos una vez
- **Cobertura de ramas**: Cada rama de decisión (if/else) se ejecuta
- **Cobertura de condiciones**: Cada condición booleana se evalúa como verdadera y falsa
- **Cobertura de rutas**: Se prueban todas las rutas posibles del programa

## Ejemplo de White Box Testing

```
Test Case ID: TC004
Unit to Test: Función validatePassword(password)
Assumptions: Función accesible, conocemos la lógica interna

Código interno conocido:
function validatePassword(password) {
    if (password.length < 8) return false;        // Rama 1
    if (!password.match(/[A-Z]/)) return false;   // Rama 2  
    if (!password.match(/[0-9]/)) return false;   // Rama 3
    return true;                                   // Rama 4
}

Test Data: 
- Caso 1: "abc" (cubre Rama 1)
- Caso 2: "abcdefgh" (cubre Rama 2) 
- Caso 3: "Abcdefgh" (cubre Rama 3)
- Caso 4: "Abcdefg1" (cubre Rama 4)

Steps to be Executed:
1. Llamar validatePassword() con cada caso
2. Verificar que se ejecute la rama esperada
3. Confirmar el valor de retorno correcto

Expected Result: 
- Caso 1: false (longitud < 8)
- Caso 2: false (sin mayúscula)
- Caso 3: false (sin número)
- Caso 4: true (cumple todos los criterios)

Comments: Diseñamos casos específicos para cubrir cada rama del código
          y alcanzar 100% de cobertura de ramas
```

## Ventajas

- **Cobertura exhaustiva** del código
- **Detección temprana** de errores lógicos
- **Optimización** del rendimiento
- **Identificación de código innecesario**

## Desventajas

- **Requiere conocimientos técnicos** avanzados
- **Consume más tiempo** en la preparación
- **Dependiente de la calidad del código** fuente
- **No evalúa** la experiencia del usuario final