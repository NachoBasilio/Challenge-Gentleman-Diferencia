# Arquitectura

Lo primero que tenemos el es host donde consumimos el modelo de IA, este host puede ser una app móvil, una app web, un bot de discord, etc. Este host se encarga de enviar las solicitudes al modelo de IA y recibir las respuestas. El MCP va a estar embebido en el host, y se encarga de manejar la comunicación entre el host y el modelo de IA. El MCP es un protocolo que define las acciones que el host puede solicitar al modelo de IA, y el modelo de IA se encarga de implementar esas acciones.

Luego con el protocolo vamos a conectarnos a servidores MCP, los cuales se encargan de recibir las solicitudes del host, procesarlas y enviarlas al modelo de IA. El servidor MCP es el encargado de manejar la lógica de negocio, es decir, de decidir qué acción se debe realizar en función de la solicitud recibida. El servidor MCP también se encarga de manejar la comunicación con el modelo de IA, es decir, de enviar las solicitudes al modelo de IA y recibir las respuestas.

¿Por que hay un cliente MCP y un servidor MCP? La razón es que el cliente MCP se encarga de manejar la comunicación con el host, mientras que el servidor MCP se encarga de manejar la lógica de negocio y la comunicación con el modelo de IA. Esto permite una mayor flexibilidad y escalabilidad, ya que podemos tener múltiples clientes MCP conectados a un mismo servidor MCP, y el servidor MCP puede manejar múltiples solicitudes simultáneamente. Además, esta arquitectura permite una mayor modularidad, ya que podemos separar la lógica de negocio del cliente MCP, lo cual facilita el mantenimiento y la evolución del código.

## Diagrama de arquitectura

### Diagrama simple de conexión Host ↔ Servidor MCP

```text
[ Usuario ]
      |
      v
[ Host ]
(app web / app móvil / bot)
      |
      v
[ Cliente MCP ]
(vive dentro del host)
      |
      |  stdio / HTTP / SSE
      v
[ Servidor MCP ]
      |
      +--> Tools
      +--> Resources
      \--> Prompts
```

Este diagrama muestra la conexión base de forma simple:

1. El **usuario** interactúa con un **host**.
2. El **host** tiene adentro un **cliente MCP**.
3. El **cliente MCP** se conecta a un **servidor MCP**.
4. El **servidor MCP** expone capacidades como **tools**, **resources** y **prompts**.
