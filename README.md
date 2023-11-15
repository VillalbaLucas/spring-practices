# spring-practices
Proyecto de spring boot para probar, ensayar, romper y armar codigo.
Tiene como objetivo tambien poder probar y entrenar para un mejor manejo de git y github.

### Dependencias
- Spring web
- Spring devtools
- MySql
- Lombok
- DataFaker

---
### User
Tiene una relacion 1 a N con Account.

### Atributos:
- id
- name
- lastname
- age

### Endpoints

  - `/users`
    - Crea usuarios con nombre, apellido y edad. (POST)
    - Consulta todos los usuarios de la base de datos. (GET)
  - `/users/id`
    - Busca a un usuario por su id. (GET)
    - Elimina el usuario con el id pasado como argumento. (DELETE)
  - `/users/generate/quantity`
    - Este endpoint me genera un User con datos aleatorios y se insertan en la base de datos, quantity `int` es la cantidad de usuarios que se desean crear. (GET) 
  - `/users/create-account/id`
    - Redirecciona a `/account/id` con el id del usuario. (POST)     
  
### Account
Tiene una relacion N a 1 con User.

### Atributos:
- id
- username
- password
- amount
### Endpoints

  - `/accounts`
    - Consulta las cuentas en la base de datos. (GET)
  - `/accounts/id`
    - Crea una cuenta con y la vincula al usuario con ese id. (POST)
    - Recupera un account de la bases de datos. (GET)  
  - `/accounts/id/newUsername`
    - Me permite modificar el username de account. (PATCH)  