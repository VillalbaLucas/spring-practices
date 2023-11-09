# spring-practices
Proyecto de spring boot para probar, ensayar, romper y armar codigo.
Tiene como objetivo tambien poder probar y entrenar para un mejor manejo de git y github.

## Dependencias
- Spring web
- Spring devtools
- MySql
- Lombok

## Recursos
### User
  - `/users`
    - Crea usuarios con nombre, apellido y edad. (POST)
    - Consulta todos los usuarios de la base de datos. (GET)
  - `/users/id`
    - Busca a un usuario por su id. (GET)
    - Elimina el usuario con el id pasado como argumento. (DELETE)
  - `/users/generate/quantity`
    - Este endpoint me genera un User con datos aleatorios y se insertan en la base de datos, quantity `int` es la cantidad de usuarios que se desean crear. (GET)   
  