# Test Cases

## Definición

Los **TEST CASES** son un **conjunto de acciones y condiciones específicas diseñadas para verificar el correcto funcionamiento de una parte del software**.

## Test Case Templates

Existen **TEST CASE TEMPLATES** con distinta información a rellenar para identificar los diferentes casos y saber qué vamos a hacer en cada uno de estos casos.

### Ejemplo de Test Case Template

Un template típico incluye las siguientes partes:

| Campo | Descripción |
|-------|-------------|
| **Test Case ID** | Identificador único del caso de prueba |
| **Unit to Test** | Componente o módulo específico que se va a probar |
| **Assumptions** | Suposiciones o precondiciones que deben cumplirse |
| **Test Data** | Datos de entrada necesarios para la prueba |
| **Steps to be Executed** | Pasos específicos a seguir durante la ejecución |
| **Expected Result** | Resultado que se espera obtener |
| **Actual Result** | Resultado real obtenido (se completa durante ejecución) |
| **Pass/Fail** | Estado final de la prueba |
| **Comments** | Observaciones adicionales o notas relevantes |

### Ejemplo Práctico

```
Test Case ID: TC001
Unit to Test: Login Module
Assumptions: 
- Usuario registrado en el sistema
- Base de datos accesible
- Página de login funcional

Test Data: 
- Email: test@example.com
- Password: 123456

Steps to be Executed:
1. Navegar a la página de login
2. Introducir email en el campo correspondiente
3. Introducir contraseña en el campo correspondiente
4. Hacer clic en el botón "Iniciar Sesión"

Expected Result: 
- Usuario es redirigido al dashboard principal
- Se muestra mensaje de bienvenida
- Sesión se establece correctamente

Actual Result: [Se completa durante la ejecución]

Pass/Fail: [Se determina después de la ejecución]

Comments: Caso base para verificar funcionalidad principal de login
```

## Cómo escribir buenos TEST CASES

### Principios fundamentales:

- **Atomicidad**: Mientras sea posible, cada caso tiene que ser atómico. ¿Qué quiere decir esto? Que no debe hacer más de una cosa a la vez.

- **Cobertura completa**: Tenemos que asegurarnos de tener contemplado el **escenario positivo** y el **escenario negativo**.

- **Lenguaje claro**: Tienen que estar escritos en un lenguaje simple, pasivo, siempre haciendo énfasis en "haz esto".

- **Consistencia**: Usar nombres consistentes en todos los casos.

- **Características de calidad**: Tiene que ser:
  - **Preciso**: Sin ambigüedades
  - **Trazable**: Capaz de ser rastreado
  - **Repetible**: Se puede ejecutar múltiples veces con el mismo resultado
  - **Reutilizable**: Se puede adaptar para casos similares si es necesario

### Ejemplos de buenos vs malos casos:

#### ❌ Mal ejemplo (No atómico):
```
Steps to be Executed:
1. Hacer login
2. Crear un nuevo producto
3. Editar el producto
4. Eliminar el producto
```

#### ✅ Buen ejemplo (Atómico):
```
Test Case ID: TC002
Unit to Test: Product Creation Module
Steps to be Executed:
1. Navegar a la sección "Productos"
2. Hacer clic en "Nuevo Producto"
3. Completar los campos obligatorios
4. Hacer clic en "Guardar"
```

## Beneficios de usar Templates

- **Estandarización**: Formato consistente para todos los casos
- **Trazabilidad**: Fácil seguimiento y documentación
- **Reutilización**: Casos base que se pueden adaptar
- **Comunicación**: Información clara para todo el equipo