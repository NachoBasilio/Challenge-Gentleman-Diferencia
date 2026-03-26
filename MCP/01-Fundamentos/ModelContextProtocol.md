# Model Context Protocol

Un MCP no es mas que un protocolo con el cual por medio de un servidor le comunicamos a nuestro modelo que es lo que queremos hacer, y el modelo se encarga de realizar la acción solicitada.

Por ejemplo, existe un MCP de github, el cual se encarga de realizar acciones como crear un repositorio, eliminarlo, etc. Todas estas funciones ya están definidas en el protocolo, y el modelo se encarga de implementarlas.

Nosotros podriamos crear nuestro propio MCP, el cual se encargue de realizar acciones que tengan sentido con nuestra app, por ejemplo, si estamos creando una app de tareas, podríamos crear un MCP que se encargue de crear una tarea, eliminarla, marcarla como completada, etc.

Actualmente con los AGENTS.md y los Skills.md, se puede suplir la necesidad de crear un MCP, ya que con los AGENTS.md podemos crear agentes que se encarguen de realizar acciones específicas, y con los Skills.md podemos crear habilidades que se encarguen de realizar acciones específicas. Pero es importante mencionar que un MCP es una forma mas estructurada de organizar nuestro código, ya que nos permite tener una interfaz clara y definida para interactuar con nuestro modelo, lo cual puede ser beneficioso en proyectos grandes o complejos.
