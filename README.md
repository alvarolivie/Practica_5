# Practica_5
## Guia

### Front-end:
Paginas:
- La primera pagina, index.html, es la pagina principal.
- La pagina login.html es un formulario que pide la informacion necesaria para contactar al cliente.
- La pagina information.html contiene la historia de la marca.
- La ultima pagina, others.html, contiene links en forma de imagenes a las diferentes paginas de inditex.

Navegación:
Hay una barra de navegación en la parte superior para cambiar de paginas y tambien se puede usar el logo FREAKS para volver a la pagina principal.

Javascript
Contiene una función para mandar los datos del formulario a un servidor mediante un post. Comprueba la respuesta recibida y notifica al usuario del resultado.

### Back-end:
Controller:
El controller recive los datos enviados y crea un objeto de tipo user con los datos proporcionados. La validacion esta directamente en la clase user. El controller envia el objeto a la clase service. Reenvia lo que este le devuelve como un http response a la pagina web.

Service:
La clase service se encarga de guardar el usuario en un array. Devuelve al usuario con un ID.
