# Exploratory Testing

## Definición

El **Exploratory Testing** es un enfoque de testing **no estructurado y simultáneo** donde el tester **diseña, ejecuta y evalúa pruebas al mismo tiempo** mientras explora el software. A diferencia de otros enfoques, no se siguen casos de prueba predefinidos, sino que se **investiga el comportamiento del sistema de forma libre y creativa**.

El objetivo es **descubrir defectos inesperados, problemas de usabilidad y comportamientos no documentados** que pueden pasar desapercibidos en testing estructurado.

## Enfoque del Tester

En Exploratory Testing, el tester necesita:
- **Mentalidad curiosa e investigativa** para explorar diferentes caminos
- **Conocimiento del dominio** y experiencia en testing
- **Capacidad de adaptación** para cambiar el enfoque sobre la marcha
- **Habilidades de observación** para detectar anomalías sutiles
- **Pensamiento crítico** para cuestionar el comportamiento del sistema

**El enfoque principal es aprender sobre el software mientras se prueba, dejando que la exploración guíe el proceso.**

## Características principales

- **Testing simultáneo**: Diseño, ejecución y evaluación ocurren al mismo tiempo
- **No estructurado**: Sin casos de prueba predefinidos
- **Dirigido por el aprendizaje**: Cada hallazgo guía los próximos pasos
- **Centrado en el descubrimiento** de lo inesperado
- **Flexible y adaptativo** según lo que se encuentra
- **Dependiente de la habilidad** y experiencia del tester

## Técnicas de Exploratory Testing

### **Touring Techniques** (Técnicas de Recorrido):
- **Business District Tour**: Explorar las funcionalidades principales del negocio
- **Historical Tour**: Probar funcionalidades en orden de implementación
- **Money Tour**: Enfocarse en características que generan ingresos
- **Landmark Tour**: Explorar características distintivas y únicas
- **Intellectual Tour**: Probar funcionalidades más complejas o técnicas

### **Testing Heuristics** (Heurísticas):
- **Consistency**: ¿El comportamiento es consistente en toda la aplicación?
- **Boundaries**: Probar límites y valores extremos
- **CRUD**: Create, Read, Update, Delete en todas las entidades
- **Interruptions**: Interrumpir procesos a la mitad
- **Data Variations**: Probar con diferentes tipos y formatos de datos

## Ejemplo de Exploratory Testing

```
Test Case ID: EXP001
Unit to Test: E-commerce - Exploración libre del proceso de compra
Assumptions: Aplicación accesible, tester con experiencia en e-commerce

Sesión de Exploración: 90 minutos
Objetivo inicial: Explorar el flujo de compra buscando inconsistencias

Charter: "Explorar el proceso de compra desde diferentes perspectivas 
         para identificar problemas de usabilidad y bugs no documentados"

Steps Executed (evolución durante la sesión):
1. Comenzar como usuario nuevo navegando productos
2. [DESCUBRIMIENTO] Noté que los filtros no se mantienen al cambiar página
3. Investigar filtros en diferentes categorías
4. [DESCUBRIMIENTO] Filtro de precio no funciona con productos en oferta
5. Agregar productos al carrito desde diferentes páginas
6. [DESCUBRIMIENTO] Contador del carrito no se actualiza inmediatamente
7. Probar checkout con diferentes métodos de pago
8. [DESCUBRIMIENTO] Botón "Atrás" en checkout pierde información ingresada
9. Explorar comportamiento con productos agotados
10. [DESCUBRIMIENTO] Se puede agregar productos sin stock al carrito

Issues Encontrados:
- Filtros se resetean al paginar (Severidad: Media)
- Filtro precio ignora promociones (Severidad: Alta)  
- Carrito no se actualiza en tiempo real (Severidad: Baja)
- Pérdida de datos en checkout (Severidad: Alta)
- Stock no validado correctamente (Severidad: Crítica)

Áreas para futura exploración:
- Comportamiento con conexión lenta
- Funcionalidad en diferentes dispositivos
- Integración con sistemas de pago

Comments: La exploración libre permitió descubrir 5 bugs no documentados
          que probablemente no se habrían encontrado con casos estructurados
```

## Session-Based Test Management (SBTM)

### Estructura de una sesión:
- **Charter**: Objetivo y alcance de la exploración (30-120 minutos)
- **Time Boxing**: Tiempo definido para mantener foco
- **Note Taking**: Documentación continua de hallazgos
- **Debriefing**: Revisión y análisis posterior

### Elementos del Charter:
- **Target**: ¿Qué se va a explorar?
- **Resources**: ¿Qué herramientas/datos se necesitan?
- **Information**: ¿Qué se busca descubrir?

## Cuándo usar Exploratory Testing

### **Ideal para**:
- **Nuevas funcionalidades** sin documentación completa
- **Después de cambios significativos** en el sistema
- **Evaluación de usabilidad** y experiencia de usuario
- **Cuando el tiempo es limitado** para crear casos estructurados
- **Complementar testing automatizado** con perspectiva humana

### **No recomendado para**:
- **Testing de regresión** rutinario
- **Validación de requisitos específicos** y detallados
- **Cumplimiento regulatorio** que requiere trazabilidad exacta
- **Testing que debe ser repetible** de forma idéntica

## Herramientas útiles

### **Documentación y Captura**:
- **Rapid Reporter**: Herramienta específica para exploratory testing
- **Session Tester**: Gestión de sesiones exploratorias
- **Screen Recording**: OBS, Camtasia para capturar hallazgos
- **Mind Mapping**: Para organizar ideas y descubrimientos

### **Testing Aids**:
- **Postman**: Para explorar APIs
- **Browser DevTools**: Para investigar comportamiento web
- **Mobile Device Farms**: Para exploración en dispositivos reales

## Ventajas

- **Descubrimiento de bugs inesperados** que casos estructurados podrían omitir
- **Evaluación real de usabilidad** desde perspectiva del usuario
- **Flexibilidad** para adaptarse a lo que se encuentra
- **Aprendizaje continuo** sobre el sistema
- **Eficiente** cuando se tiene poco tiempo o documentación

## Desafíos

- **Difícil de planificar** y estimar tiempo exacto
- **Dependiente de la habilidad** del tester individual
- **Resultados variables** entre diferentes testers
- **Documentación** puede ser menos estructurada
- **Difícil de repetir** exactamente la misma exploración

## Mejores Prácticas

- **Definir charters claros** para mantener enfoque
- **Timeboxing** para evitar sesiones demasiado largas
- **Documentar hallazgos** inmediatamente
- **Combinar con testing estructurado** para cobertura completa
- **Rotar testers** para obtener diferentes perspectivas
- **Hacer debriefing** después de cada sesión