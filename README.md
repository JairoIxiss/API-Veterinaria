<h1 align="center"> API para una Veterinaria </h1>
<div align="justify">
API que ayuda a tener una mejor administración de los datos que maneja día a día, como poder relacionar los clientes con sus mascotas, en la cual puede crear, modificar, y obtener datos de las mascotas y sus dueños, como también poder hacer consultas de datos personalizadas. 
Todo esto con el lenguaje de programación Java con buenas prácticas y con una arquitectura multicapas, implementando una API REST usando el FrameWork Spring Boot. Como proveedor de ORM se utilizó JPA + Hibernate. Para realizar las pruebas de la API se utilizó Postman. Y todos los objetos fueron almacenados en una base de datos MySQL con la herramienta de PhpMyAdmin. Video demostrativo: https://youtu.be/F_CqB8CExUc
</div>


## Modelado
De acuerdo a los datos necesarios en una veterinaria, se agregaron las siguientes clases:
- Dueño
- Mascota


En donde cada mascota puede tener asociado un solo dueño como responsable.

## :hammer:Funcionalidades del proyecto

- `CRUD completo Mascota y Dueño`
-  `Obtener la lista de todas las mascotas de especie "perro" y razza "caniche"`
-  `Obtener una lista de: nombre de la mascota, especie, raza, nombre y apellido del dueño`

Encuentra aquí el [link de PostMan](https://www.postman.com/jairoixis/workspace/portafolio/collection/36228688-7239b36e-ae51-4c02-ad97-39505ab32219?action=share&creator=36228688) en donde se enceuntran todos los endpoints para realizar las pruebas de la API.
