# Regression Testing

## Definición

El **Regression Testing** es el proceso de **volver a ejecutar pruebas existentes después de realizar cambios en el software** para asegurar que las funcionalidades que previamente funcionaban correctamente **no se hayan visto afectadas** por las nuevas modificaciones, correcciones de bugs o nuevas características.

El objetivo es **detectar defectos introducidos accidentalmente** en partes del sistema que no deberían haber cambiado.

## Enfoque del Tester

Como testers en Regression Testing necesitamos:
- **Identificar qué areas pueden verse afectadas** por los cambios
- **Seleccionar casos de prueba relevantes** del conjunto existente
- **Priorizar pruebas críticas** y de alto riesgo
- **Automatizar casos repetitivos** cuando sea posible
- **Mantener actualizados** los casos de prueba regression

**El enfoque principal es garantizar que los cambios no rompan funcionalidades existentes.**

## Características principales

- **Re-ejecución de pruebas existentes** después de cambios
- **Enfoque en funcionalidades previamente estables**
- **Detección temprana** de efectos secundarios no deseados
- **Ideal para automatización** por su naturaleza repetitiva
- **Ejecutado en múltiples ciclos** durante el desarrollo
- **Cobertura de funcionalidades críticas** del negocio

## Tipos de Regression Testing

- **Regression Testing Completo**: Se ejecutan todos los casos de prueba existentes
- **Regression Testing Selectivo**: Solo se ejecutan casos relacionados con los cambios
- **Regression Testing Progresivo**: Se escriben nuevos casos cuando cambian los requisitos
- **Regression Testing Parcial**: Combinación de casos nuevos y existentes

## Cuándo ejecutar Regression Testing

- **Después de fix de bugs** críticos o menores
- **Cuando se agregan nuevas características**
- **Antes de cada release** o deployment
- **Después de cambios en configuración** o ambiente
- **Cuando se integran** módulos o componentes
- **Periódicamente** en ciclos de desarrollo ágil

## Ejemplo de Regression Testing

```
Test Case ID: REG001
Unit to Test: Módulo de Login - Después de fix en recuperación de contraseña
Assumptions: Fix aplicado en producción, funcionalidad de login previamente estable

Test Data: 
- Usuario existente: test@company.com
- Contraseña: ValidPass123
- Cambio realizado: Se corrigió bug en "Olvidé mi contraseña"

Steps to be Executed:
1. Navegar a la página de login
2. Ingresar credenciales válidas
3. Hacer clic en "Iniciar Sesión"
4. Verificar redirección al dashboard
5. Cerrar sesión
6. Intentar login con credenciales incorrectas
7. Verificar mensaje de error apropiado
8. Verificar que botón "Olvidé mi contraseña" sigue visible

Expected Result: 
- Login con credenciales válidas funciona normalmente
- Redirección al dashboard ocurre sin problemas
- Logout funciona correctamente
- Mensaje de error para credenciales inválidas se muestra
- Botón "Olvidé mi contraseña" permanece accesible
- No se introducen nuevos bugs en el flujo de login

Actual Result: [Se completa durante la ejecución]

Pass/Fail: [Se determina después de la ejecución]

Comments: Aunque el fix fue solo en recuperación de contraseña,
          verificamos que el login principal no se vio afectado
```

## Estrategias de selección de casos

### 1. **Análisis de Impacto**
- Identificar módulos afectados directa e indirectamente
- Mapear dependencias entre componentes
- Priorizar áreas de alto riesgo

### 2. **Casos Críticos**
- Funcionalidades core del negocio
- Flujos de usuario más frecuentes  
- Integraciones con sistemas externos

### 3. **Casos de Borde**
- Validaciones de entrada
- Manejo de errores
- Límites del sistema

## Regression Testing Suite

### Casos que SIEMPRE deben incluirse:
- **Smoke Tests**: Funcionalidades básicas del sistema
- **Sanity Tests**: Funcionalidades relacionadas con el cambio
- **Critical Path Tests**: Flujos principales de negocio
- **Integration Tests**: Interfaces entre módulos

### Casos que pueden EXCLUIRSE temporalmente:
- Tests de características obsoletas
- Tests redundantes o duplicados
- Tests de muy bajo riesgo
- Tests que toman mucho tiempo y rara vez fallan

## Herramientas para Regression Testing

### Automatización:
- **Selenium**: Para aplicaciones web
- **Cypress**: Testing end-to-end moderno
- **TestComplete**: Suite completa de automatización
- **Postman/Newman**: Para APIs

### Gestión:
- **TestRail**: Gestión de casos de regression
- **JIRA**: Tracking de bugs y cambios
- **Jenkins**: CI/CD para ejecución automatizada

## Ventajas

- **Detección temprana** de efectos secundarios
- **Mayor confianza** en releases
- **Reducción de bugs** en producción
- **Mantiene calidad** del software a lo largo del tiempo
- **Ideal para automatización**

## Desafíos

- **Mantenimiento** de casos de prueba obsoletos
- **Tiempo de ejecución** puede ser largo
- **Selección adecuada** de casos a ejecutar
- **Balance** entre cobertura y tiempo
- **Costo** de automatización inicial

## Mejores Prácticas

- **Automatizar casos repetitivos** y estables
- **Mantener casos actualizados** con los cambios
- **Priorizar por riesgo** e impacto en el negocio  
- **Ejecutar continuamente** en pipelines CI/CD
- **Documentar resultados** y tendencias de fallos