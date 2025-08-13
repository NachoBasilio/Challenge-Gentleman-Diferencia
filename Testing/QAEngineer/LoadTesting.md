# Load Testing

## Definición

El **Load Testing** es un tipo de prueba de rendimiento que evalúa **cómo responde el sistema bajo una carga específica de trabajo**, normalmente equivalente al uso esperado en producción.  
Su objetivo es **medir la estabilidad, tiempos de respuesta y uso de recursos** cuando múltiples usuarios o procesos interactúan simultáneamente con la aplicación.

La meta es garantizar que **el sistema pueda manejar la carga prevista sin degradar el rendimiento** más allá de los límites aceptables.

## Enfoque del Tester

En Load Testing, el tester debe:
- **Definir la carga objetivo** (número de usuarios concurrentes, transacciones por segundo).
- **Diseñar escenarios realistas** que reflejen patrones de uso habituales.
- **Medir métricas clave**: tiempo de respuesta, throughput, errores y uso de recursos.
- **Comparar resultados con los SLA** (acuerdos de nivel de servicio).
- **Detectar signos tempranos de saturación**.

## Características principales

- **Centrado en el uso esperado**: No busca romper el sistema, sino probar la carga normal.
- **Medición continua**: Observación durante y después de la carga.
- **Orientado a la experiencia del usuario**: Se evalúa si el rendimiento sigue siendo aceptable.
- **Base para pruebas posteriores**: Precede a Stress y Soak Testing.

## Cuándo usar Load Testing

### **Ideal para**:
- Antes de lanzamientos a producción.
- Validar nuevos módulos o integraciones en sistemas existentes.
- Comprobar el cumplimiento de SLA y tiempos de respuesta.
- Simular uso en campañas, temporadas altas o eventos planificados.

### **No recomendado para**:
- Evaluar comportamiento fuera de los límites esperados (eso es Stress Testing).
- Medir almacenamiento de datos masivos sin usuarios concurrentes (eso es Volume Testing).

## Ventajas

- Garantiza que el sistema **cumpla con el rendimiento esperado** bajo uso normal.
- Ayuda a **detectar cuellos de botella en recursos** antes de que impacten al usuario final.
- Permite optimizar configuraciones de red, servidores y balanceadores de carga.
- Mejora la **confianza en despliegues**.

## Desafíos

- Requiere **simulación precisa del tráfico real** para obtener resultados fiables.
- La infraestructura de prueba debe soportar la carga simulada.
- Puede ser difícil obtener **patrones de uso reales** si no hay historial.
