# spring-practices
Proyecto de spring boot para probar, ensayar, romper y armar codigo.

### Dependencias
- Spring web
- Spring devtools
- MySql
- Lombok
- DataFaker
- Docker

---
### User
Tiene una relacion 1 a N con Account.

### Atributos:
- id
- name
- lastname
- age
### Endpoints

  - `/api/users/all`
    - Consulta todos los usuarios de la base de datos. (GET)
  - `/api/users/search/id`
    - Busca a un usuario por su id. (GET)
  - `/api/users/save`
     - Crea usuarios con nombre, apellido y edad. (POST)
  - `/api/users/delete/id`
    - Elimina el usuario con el id pasado como argumento. (DELETE)
  - `/api/users/generate/quantity`
    - Este endpoint me genera un User con datos aleatorios y se insertan en la base de datos, quantity `int` es la cantidad de usuarios que se desean crear. (GET) 
  - `/api/users/create-account/id`
    - Redirecciona a `/account/id` con el id del usuario. (POST)     
  
### Account
Tiene una relacion N a 1 con User.

### Atributos:
- id
- username
- password
- amount
### Endpoints

  - `/api/accounts/all`
    - Consulta las cuentas en la base de datos. (GET)
  - `/api/accounts/save`
    - Crea una cuenta con y la vincula al usuario con ese id. (POST) 
  - `/api/accounts/search/id`
    - Recupera un account de la bases de datos mediuante si id. (GET)  
  - `/accounts/id/newUsername`
    - Me permite modificar el username de account. (PATCH)  