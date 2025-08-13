# User Acceptance Testing (UAT)

## Definición

El **User Acceptance Testing (UAT)** es el proceso de **validación final del software realizado por los usuarios finales** para determinar si el sistema cumple con sus necesidades y requisitos de negocio. Es la **última fase de testing antes del lanzamiento** a producción.

El objetivo es verificar que el software **funciona en escenarios reales de uso** y que los usuarios pueden completar sus tareas de manera efectiva.

## Enfoque del Tester

En UAT, los **usuarios finales** actúan como testers y necesitan:
- **Comprender los objetivos de negocio** del software
- **Probar escenarios reales** de su trabajo diario
- **Validar que el software resuelve** sus problemas específicos
- **Identificar gaps** entre lo desarrollado y lo necesitado

**El enfoque principal es confirmar que el software está listo para el uso real y cumple las expectativas del negocio.**

## Características principales

- **Realizado por usuarios finales**, no por el equipo técnico
- **Enfoque en escenarios reales** de negocio
- **Validación de requisitos** funcionales y no funcionales
- **Última barrera** antes del lanzamiento
- **Criterios de aceptación** claramente definidos
- **Ambiente similar** o idéntico a producción

## Tipos de User Acceptance Testing

- **Business Acceptance Testing (BAT)**: Verificación de que el software cumple los objetivos de negocio
- **Alpha Testing**: Realizado internamente por usuarios de la organización
- **Beta Testing**: Realizado por un grupo limitado de usuarios externos
- **Contract Acceptance Testing**: Verificación de que se cumplen los términos contractuales

## Ejemplo de User Acceptance Testing

```
Test Case ID: UAT001
Unit to Test: Sistema de facturación - Proceso completo de venta
Assumptions: Usuario final con conocimiento del proceso de negocio

Test Data: 
- Cliente: Empresa ABC S.A.
- Productos: 3 items del catálogo
- Método de pago: Transferencia bancaria
- Usuario tester: Contador de la empresa

Steps to be Executed:
1. Iniciar sesión como usuario contador
2. Crear una nueva factura
3. Buscar y seleccionar cliente "Empresa ABC S.A."
4. Agregar 3 productos del catálogo
5. Aplicar descuento por volumen (si corresponde)
6. Calcular impuestos automáticamente
7. Generar factura PDF
8. Enviar factura por email al cliente
9. Registrar el cobro cuando se reciba el pago

Expected Result: 
- El contador puede completar el proceso sin ayuda técnica
- Los cálculos de impuestos son correctos
- La factura PDF se genera con el formato legal requerido
- El email se envía correctamente
- El sistema registra adecuadamente el estado de la factura
- El proceso toma menos de 5 minutos

Actual Result: [Completado por el usuario final durante la ejecución]

Pass/Fail: [Determinado por criterios de aceptación predefinidos]

Comments: Validar que el flujo coincida con el proceso real de facturación
          de la empresa y que no requiera capacitación adicional
```

## Criterios de entrada para UAT

- **Todas las pruebas del sistema** completadas exitosamente
- **Ambiente de UAT** configurado y estable
- **Datos de prueba** realistas disponibles
- **Usuarios finales** identificados y disponibles
- **Casos de prueba UAT** definidos y aprobados

## Criterios de salida para UAT

- **Todos los casos críticos** ejecutados satisfactoriamente
- **Defectos bloqueantes** resueltos
- **Sign-off formal** de los usuarios finales
- **Documentación** de resultados completa 
- **Plan de rollback** definido (si es necesario)

## Roles involucrados

- **Product Owner/Business Analyst**: Define criterios de aceptación
- **Usuarios finales**: Ejecutan las pruebas
- **UAT Manager**: Coordina el proceso
- **Equipo de desarrollo**: Da soporte para resolución de issues

## Ventajas

- **Validación real** por usuarios que conocen el negocio
- **Detección de problemas** de usabilidad y flujos
- **Mayor confianza** en el lanzamiento
- **Alineación** entre desarrollo y necesidades reales

## Desafíos

- **Coordinación** con usuarios finales ocupados
- **Subjetividad** en los criterios de aceptación
- **Presión de tiempo** por fechas de lanzamiento
- **Resistencia al cambio** por parte de algunos usuarios