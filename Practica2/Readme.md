# Estructura del proyecto
Proyecto que busca presentar los vuelos disponibles de determinadas aerolíneas y asociarlos a los pasajeros
## Paquetes y clases
El paquete raíz es es.indra.aerolinea

### .beans
Paquete para interfaces de beans

*Interfaces*

* IAerolinea: interfaz que define el comportamiento de la gestión de vuelos paquete para las implementaciones de interfaces o POJOs

### .beans.impl
Paquete para las implementaciones de interfaces o POJOs

*Clases*

* Aerolinea:implementacion de la interfaz IAerolinea. Da cuerpo a los metodos:... y las variables
  + nombre:nombre de la aerolinea
  + id: identificador de la aerolinea
  + vuelos[]: +array de todos los vuelos disponibles
  
* Vuelo: POJO que representa el vuelo con origen, destino, etc..
  + origen: origen del vuelo
  + destino: destino del vuelo
  + numeroVuelo: string que identifica el vuelo
  + numeroPasajeros: entero para indicar la capacidad de pasajeros
  + disponible: boolean que indica si el vuelo está disponible

 * Persona: clase abstracta para representar a todas las personas del sisyema.Contiene
  + nombre
  + apellido
  + dni
  + id
 
* Empleado: clase que hereda de Persona y no añade propiedas extra, solo sobreescribe el método getNombre()

* Pasajero: clase que hereda de Persona y añade un array de vuelos:
  + vuelos[ ]: array de objetos Vuelo

### .main
  * Venta: clase que tiene método main que arranca la aplicación

### .services
  * ReadFile: clase que gestiona la lectura de archivos
