# Black Box Testing

## Definición

En este tipo de pruebas vamos a **evaluar la funcionalidad sin saber mucho del diseño en cuanto al código** de lo que estamos testeando. Principalmente lo que hacemos es **comparar el valor de entrada y el de salida** corroborando que el resultado es el esperado.

## Enfoque del Tester

Nosotros como testers vamos a conocer:
- Los **datos de entrada** 
- Los **datos de salida esperados**
- Para casos **negativos** o **positivos**

**Desde ahí, sin conocer el comportamiento interno, vamos a evaluar.**

## Características principales

- **No se requiere conocimiento del código interno**
- **Enfoque en inputs y outputs**
- **Evaluación desde la perspectiva del usuario final**
- **Verificación de requisitos funcionales**

## Ejemplo de Black Box Testing

```
Test Case ID: TC003
Unit to Test: Calculadora - Función Suma
Assumptions: Calculadora funcional y accesible

Test Data: 
- Número 1: 5
- Número 2: 3

Steps to be Executed:
1. Abrir la calculadora
2. Ingresar el número 5
3. Presionar el botón "+"
4. Ingresar el número 3
5. Presionar el botón "="

Expected Result: Se muestra el resultado "8"

Actual Result: [Se completa durante la ejecución]

Pass/Fail: [Se determina después de la ejecución]

Comments: No necesitamos saber cómo funciona internamente la suma, 
          solo verificamos que 5 + 3 = 8
```