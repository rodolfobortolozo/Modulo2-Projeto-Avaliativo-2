# **Devin[_Philips_] - LABMedical**

## **Módulo 2 - Projeto Avaliativo 2**

A **LABMedicine LTDA**, empresa líder no segmento tecnológico para gestão hospitalar, está atualizando o seu sistema **LABMedical**, um software para gestão de inventário médico.
Você participou da criação do Front-End da aplicação, e por esse motivo o seu perfil chamou a atenção dos gestores, para agora criar a aplicação Back-End, que deverá ser construída utilizando **Spring** com **Java**.

## **Ferramentas Utilizadas para Desenvolvimento**
```
Intellij
PL/SQL Developer
Spring Boot     
Java
Oracle 19c
```

## **Dependências**

O desenvolvimento de código em Java, em geral, usufrui de um significativo conjunto de bibliotecas e _frameworks_. Esta
reutilização é incorporada em um projeto por meio de dependências. Para gerenciar foi utiliado o _Maven_. 
```
Spring Web MVC
Spring JPA
Oracle jdbc
Lombok
Flyway
MapStruct
DevTools
Validation
```

## **Scripts**

Todo script para criação do banco de dados se encontra na pasta **resources/db/migration**

## **Métodos**
Requisições para a API devem seguir os padrões:
| Método | Descrição |
|---|---|
| `GET` | Retorna informações de um ou mais registros. |
| `POST` | Utilizado para criar um novo registro. |
| `PUT` | Atualiza dados de um registro ou altera sua situação. |
| `DELETE` | Remove um registro do sistema. |


## **Respostas**

| Código | Descrição |
|---|---|
| `200` | Requisição executada com sucesso (success).|
| `201` | Requisição executada com sucesso (success).|
| `400` | Erros de validação ou os campos informados não existem no sistema.|
| `409` | Conflito.|
| `405` | Método não implementado.|


# **Recursos da Api**

| Tipo       | End Point                   |
|------------|-----------------------------|
| `GET`      | /api/especialidades         |
| `GET`      | /api/especialidades/{id}    |
| `POST`     | /api/especialidades         |
| `PUT`      | /api/especialidades/{id}    |
| `DELETE`   | /api/especialidades/{id}    |
| ---------- | --------------------------  |
| `GET`      | /api/usuarios               |
| `GET`      | /api/usuarios/{id}          |
| `POST`     | /api/usuarios               |
| `PUT`      | /api/usuarios/{id}          |
| `PUT`      | /api/usuarios/{id}/senha    |
| `DELETE`   | /api/usuarios/{id}          |
| ---------- | --------------------------  |
| `GET`      | /api/pacientes              |
| `GET`      | /api/pacientes/{id}         |
| `GET`      | /api/pacientes/?name={name} |
| `POST`     | /api/pacientes              |
| `PUT`      | /api/pacientes/{id}         |
| `DELETE`   | /api/pacientes/{id}         |
| ---------- | --------------------------  |
| `GET`      | /api/consultas              |
| `GET`      | /api/consultas/{id}         |
| `POST`     | /api/consultas              |
| `PUT`      | /api/consultas/{id}         |
| `DELETE`   | /api/consultas/{id}         |
| ---------- | --------------------------  |
| `GET`      | /api/exames                 |
| `GET`      | /api/exames/{id}            |
| `POST`     | /api/exames                 |
| `PUT`      | /api/exames/{id}            |
| `DELETE`   | /api/exames/{id}            |
| ---------- | --------------------------  |
| `GET`      | /api/enderecos              |
| `GET`      | /api/enderecos/{id}         |
| `POST`     | /api/enderecos              |
| `PUT`      | /api/enderecos/{id}         |
| ---------- | --------------------------  |
| `GET`      | /api/estatisticas           |


# **Especialidades Médicas** [_/api/especialidades_]

Buscar detalhes da especialidades.

### Listar [**GET** _/api/especialidades_]


Response 200 (application/json)

        {
            "id": "1acc0ada-0894-4b41-884a-ddc99013bc05",
            "specialization": "Ortopedia",
            "dtaCreated": "24/04/2023 11:01:35",
            "dtaUpdated": "24/04/2023 11:01:35"
        }

### Listar por Id [**GET** _/api/especialidades/{id}_]


Response 200 (application/json)

        {
            "id": "1acc0ada-0894-4b41-884a-ddc99013bc05",
            "specialization": "Ortopedia",
            "dtaCreated": "24/04/2023 11:01:35",
            "dtaUpdated": "24/04/2023 11:01:35"
        }


### Cadastrar [**POST** _/api/especialidades_]

Request (application/json)

        {
            "specialization" : "Ortopedia"
        }

Response 201 (application/json)

        {
            "id": "1acc0ada-0894-4b41-884a-ddc99013bc05",
            "specialization": "Ortopedia",
            "dtaCreated": "24/04/2023 11:01:35",
            "dtaUpdated": "24/04/2023 11:01:35"
        }

### Atualizar [**PUT** _/api/especialidades/**{id}**_]

Request (application/json)

    {
        "specialization" : "Ortopedia II"
    }

Response 200 (application/json)

    {
    "id": "1acc0ada-0894-4b41-884a-ddc99013bc05",
    "specialization": "Ortopedia II",
    "dtaCreated": "24/04/2023 11:01:35",
    "dtaUpdated": "24/04/2023 11:10:17"
    }

### Deletar [**DELETE** _/api/especialidades/**{id}**_]

    Response 200 (application/json)


# **Usuários** [_/api/usuarios_]

Buscar detalhes da especialidades.

### Listar [**GET** _/api/usuarios_]


Response 200 (application/json)

        {
            "id": "d44bfb27-93cf-496b-910c-8ce248a6e47b",
            "name": "Rodolfo Rodriges Bortolozo",
            "gender": "Masculino",
            "bithhDay": "03/04/1989",
            "cpf": "0000000000",
            "rg": "4444444444",
            "maritalStatus": "CASADO",
            "phoneNumber": "1799999999",
            "email": "rodolfo@teste.com",
            "naturalness": "Fernandópolis",
            "dtaCreated": "24/04/2023 08:28:44",
            "dtaUpdated": "24/04/2023 08:28:44",
            "crm": "1234-SP",
            "specializations": [
                {
                    "id": "40e38ff0-ec99-4186-a65f-4009f772c78f",
                    "specialization": "Ortopedia",
                    "dtaCreated": "24/04/2023 08:28:44",
                    "dtaUpdated": "24/04/2023 08:28:44"
                }
            ]
        }

### Listar por Id [**GET** _/api/usuarios/**{id}**_]


Response 200 (application/json)

        {
            "id": "d44bfb27-93cf-496b-910c-8ce248a6e47b",
            "name": "Rodolfo Rodriges Bortolozo",
            "gender": "Masculino",
            "bithhDay": "03/04/1989",
            "cpf": "0000000000",
            "rg": "4444444444",
            "maritalStatus": "CASADO",
            "phoneNumber": "1799999999",
            "email": "rodolfo@teste.com",
            "naturalness": "Fernandópolis",
            "dtaCreated": "24/04/2023 08:28:44",
            "dtaUpdated": "24/04/2023 08:28:44",
            "crm": "1234-SP",
            "specializations": [
                {
                    "id": "40e38ff0-ec99-4186-a65f-4009f772c78f",
                    "specialization": "Ortopedia",
                    "dtaCreated": "24/04/2023 08:28:44",
                    "dtaUpdated": "24/04/2023 08:28:44"
                }
            ]
        }

### Cadastrar [**POST** _/api/usuarios_]

            Valores aceitos pelo campo maritalStatus
                SOLTEIRO
                CASADO
                SEPARADO
                DIVORCIADO
                VIUVO


Request (application/json)

        {
            "name": "Rodolfo Rodriges Bortolozo",
            "gender": "Masculino",
            "bithhDay": "03/04/1989",
            "cpf": "0000000000",
            "rg": "4444444444",
            "maritalStatus": "CASADO",
            "phoneNumber": "1799999999",
            "email": "rodolfo@teste.com",
            "naturalness": "FERPA",
            "crm": "1234-SS",
            "password": "123123123",
            "specializations": [
                {
                "id": "45f4194a-7784-41f9-958a-51746500ad20"
                }
            ]
        }

Response 201 (application/json)

        {
            "id": "d44bfb27-93cf-496b-910c-8ce248a6e47b",
            "name": "Rodolfo Rodriges Bortolozo",
            "gender": "Masculino",
            "bithhDay": "03/04/1989",
            "cpf": "0000000000",
            "rg": "4444444444",
            "maritalStatus": "CASADO",
            "phoneNumber": "1799999999",
            "email": "rodolfo@teste.com",
            "naturalness": "Fernandópolis",
            "dtaCreated": "24/04/2023 08:28:44",
            "dtaUpdated": "24/04/2023 08:28:44",
            "crm": "1234-SP",
            "specializations": [
                {
                    "id": "40e38ff0-ec99-4186-a65f-4009f772c78f",
                    "specialization": "Ortopedia",
                    "dtaCreated": "24/04/2023 08:28:44",
                    "dtaUpdated": "24/04/2023 08:28:44"
                }
            ]
        }

### Atualizar [**PUT** _/api/usuarios/**{id}**_]

Request (application/json)

        {
            "name": "Rodolfo R B",
            "gender": "Masculino",
            "bithhDay": "03/04/1989",
            "cpf": "0000000000",
            "rg": "4444444444",
            "maritalStatus": "CASADO",
            "phoneNumber": "1799999999",
            "email": "rodolfo@teste.com",
            "naturalness": "FERPA",
            "crm": "1234-SS",
            "password": "123123123",
            "specializations": [
                {
                "id": "45f4194a-7784-41f9-958a-51746500ad20"
                }
            ]
        }

Response 200 (application/json)

        {
            "id": "d44bfb27-93cf-496b-910c-8ce248a6e47b",
            "name": "Rodolfo R B",
            "gender": "Masculino",
            "bithhDay": "03/04/1989",
            "cpf": "0000000000",
            "rg": "4444444444",
            "maritalStatus": "CASADO",
            "phoneNumber": "1799999999",
            "email": "rodolfo@teste.com",
            "naturalness": "Fernandópolis",
            "dtaCreated": "24/04/2023 08:28:44",
            "dtaUpdated": "24/04/2023 09:17:03",
            "crm": "1234-SP",
            "specializations": [
                {
                    "id": "40e38ff0-ec99-4186-a65f-4009f772c78f",
                    "specialization": "Ortopedia",
                    "dtaCreated": "24/04/2023 08:28:44",
                    "dtaUpdated": "24/04/2023 08:28:44"
                }
            ]
        }

### Atualizar Senha [**PUT** _/api/usuarios/**{id}/senha**_]

Request (application/json)

        {
            "password": "string",
            "newPassword": "string"
        }

Response 200 (application/json)

        {
            "id": "d44bfb27-93cf-496b-910c-8ce248a6e47b",
            "name": "Rodolfo R B",
            "gender": "Masculino",
            "bithhDay": "03/04/1989",
            "cpf": "0000000000",
            "rg": "4444444444",
            "maritalStatus": "CASADO",
            "phoneNumber": "1799999999",
            "email": "rodolfo@teste.com",
            "naturalness": "Fernandópolis",
            "dtaCreated": "24/04/2023 08:28:44",
            "dtaUpdated": "24/04/2023 09:17:03",
            "crm": "1234-SP",
            "specializations": [
                {
                    "id": "40e38ff0-ec99-4186-a65f-4009f772c78f",
                    "specialization": "Ortopedia",
                    "dtaCreated": "24/04/2023 08:28:44",
                    "dtaUpdated": "24/04/2023 08:28:44"
                }
            ]
        }

### Deletar [**DELETE** _/api/usuarios/**{id}**_]

    Response 200 (application/json)

# **Pacientes** [_/api/usuarios_]

Buscar detalhes da especialidades.

### Listar [**GET** _/api/pacientes_]


Response 200 (application/json)

        {
            "id": "e1e6d22c-4eb8-48d2-b592-a60d0d730841",
            "name": "Alberto Goes",
            "gender": "Masculino",
            "bithhDay": "02/04/1999",
            "cpf": "00000000",
            "rg": "44444444",
            "maritalStatus": "SOLTEIRO",
            "phoneNumber": "1799999999",
            "email": "albertoo@teste.com",
            "naturalness": "São Paulo",
            "dtaCreated": "24/04/2023 10:27:16",
            "dtaUpdated": "24/04/2023 10:27:16",
            "phoneEmergency": "1799999999",
            "agreement": "UNIMED",
            "agreementNumber": "999999-00",
            "agreementValidity": "01/12/2024",
            "allergies": [
                {
                    "id": "6e0b133f-09b5-4696-abec-e63be701ff8c",
                    "allergy": "Leite",
                    "dtaCreated": "24/04/2023 10:27:16",
                    "dtaUpdated": "24/04/2023 10:27:16"
                }
            ],
            "cautionLists": [
                {
                    "id": "6a738c8d-e4c7-447f-baf5-00c4d938fe93",
                    "caution": "Repouso",
                    "dtaCreated": "24/04/2023 10:27:16",
                    "dtaUpdated": "24/04/2023 10:27:16"
                }
            ],
            "address": {
                "id": "1ac17263-e8a6-4151-bf4c-ac15b902e782",
                "zipCode": "15600070",
                "city": "Fernandópolis",
                "country": "Brasil",
                "publicPlace": "Rua Brasil",
                "houseNumber": "2274",
                "complement": "apto 04",
                "district": "Centro",
                "landmark": "Edificio parati"
            }
        }

### Listar por Id [**GET** _/api/pacientes/**{id}**_]


Response 200 (application/json)

        {
            "id": "e1e6d22c-4eb8-48d2-b592-a60d0d730841",
            "name": "Alberto Goes",
            "gender": "Masculino",
            "bithhDay": "02/04/1999",
            "cpf": "00000000",
            "rg": "44444444",
            "maritalStatus": "SOLTEIRO",
            "phoneNumber": "1799999999",
            "email": "albertoo@teste.com",
            "naturalness": "São Paulo",
            "dtaCreated": "24/04/2023 10:27:16",
            "dtaUpdated": "24/04/2023 10:27:16",
            "phoneEmergency": "1799999999",
            "agreement": "UNIMED",
            "agreementNumber": "999999-00",
            "agreementValidity": "01/12/2024",
            "allergies": [
                {
                    "id": "6e0b133f-09b5-4696-abec-e63be701ff8c",
                    "allergy": "Leite",
                    "dtaCreated": "24/04/2023 10:27:16",
                    "dtaUpdated": "24/04/2023 10:27:16"
                }
            ],
            "cautionLists": [
                {
                    "id": "6a738c8d-e4c7-447f-baf5-00c4d938fe93",
                    "caution": "Repouso",
                    "dtaCreated": "24/04/2023 10:27:16",
                    "dtaUpdated": "24/04/2023 10:27:16"
                }
            ],
            "address": {
                "id": "1ac17263-e8a6-4151-bf4c-ac15b902e782",
                "zipCode": "15600070",
                "city": "Fernandópolis",
                "country": "Brasil",
                "publicPlace": "Rua Brasil",
                "houseNumber": "2274",
                "complement": "apto 04",
                "district": "Centro",
                "landmark": "Edificio parati"
            }
        }


### Cadastrar [**POST** _/api/pacientes_]

Request (application/json)

        {
            "name": "Alberto Goes",
            "gender": "Masculino",
            "bithhDay": "02/04/1999",
            "cpf": "00000000",
            "rg": "44444444",
            "maritalStatus": "SOLTEIRO",
            "phoneNumber": "1799999999",
            "email": "albertoo@teste.com",
            "naturalness": "São Paulo",
            "dtaCreated": "24/04/2023 10:27:16",
            "dtaUpdated": "24/04/2023 10:27:16",
            "phoneEmergency": "1799999999",
            "agreement": "UNIMED",
            "agreementNumber": "999999-00",
            "agreementValidity": "01/12/2024",
            "allergies": 
            [
                {
                    "allergy": "Leite"
                }
            ],
            "cautionLists":
            [
                {
                    "caution": "Repouso"
                }
            ],
            "address": {
                "zipCode": "15600070",
                "city": "Fernandópolis",
                "country": "Brasil",
                "publicPlace": "Rua Brasil",
                "houseNumber": "2274",
                "complement": "apto 04",
                "district": "Centro",
                "landmark": "Edificio parati"
            }
        }

Response 201 (application/json)

        {
            "id": "e1e6d22c-4eb8-48d2-b592-a60d0d730841",
            "name": "Alberto Goes",
            "gender": "Masculino",
            "bithhDay": "02/04/1999",
            "cpf": "00000000",
            "rg": "44444444",
            "maritalStatus": "SOLTEIRO",
            "phoneNumber": "1799999999",
            "email": "albertoo@teste.com",
            "naturalness": "São Paulo",
            "dtaCreated": "24/04/2023 10:27:16",
            "dtaUpdated": "24/04/2023 10:27:16",
            "phoneEmergency": "1799999999",
            "agreement": "UNIMED",
            "agreementNumber": "999999-00",
            "agreementValidity": "01/12/2024",
            "allergies": [
                {
                    "id": "6e0b133f-09b5-4696-abec-e63be701ff8c",
                    "allergy": "Leite",
                    "dtaCreated": "24/04/2023 10:27:16",
                    "dtaUpdated": "24/04/2023 10:27:16"
                }
            ],
            "cautionLists": [
                {
                    "id": "6a738c8d-e4c7-447f-baf5-00c4d938fe93",
                    "caution": "Repouso",
                    "dtaCreated": "24/04/2023 10:27:16",
                    "dtaUpdated": "24/04/2023 10:27:16"
                }
            ],
            "address": {
                "id": "1ac17263-e8a6-4151-bf4c-ac15b902e782",
                "zipCode": "15600070",
                "city": "Fernandópolis",
                "country": "Brasil",
                "publicPlace": "Rua Brasil",
                "houseNumber": "2274",
                "complement": "apto 04",
                "district": "Centro",
                "landmark": "Edificio parati"
            }
        }

### Cadastrar pelo Id do Edereço [**POST** _/api/pacientes_]

Request (application/json)

        {
            "name": "Alberto Goes",
            "gender": "Masculino",
            "bithhDay": "02/04/1999",
            "cpf": "00000000",
            "rg": "44444444",
            "maritalStatus": "SOLTEIRO",
            "phoneNumber": "1799999999",
            "email": "albertoo@teste.com",
            "naturalness": "São Paulo",
            "dtaCreated": "24/04/2023 10:27:16",
            "dtaUpdated": "24/04/2023 10:27:16",
            "phoneEmergency": "1799999999",
            "agreement": "UNIMED",
            "agreementNumber": "999999-00",
            "agreementValidity": "01/12/2024",
            "allergies": 
            [
                {
                    "allergy": "Leite"
                }
            ],
            "cautionLists":
            [
                {
                    "caution": "Repouso"
                }
            ],
            "idAddress": "e1e6d32c-4eb8-48d2-b785-a60d0d747852"
        }

Response 201 (application/json)

        {
            "id": "e1e6d22c-4eb8-48d2-b592-a60d0d730841",
            "name": "Alberto Goes",
            "gender": "Masculino",
            "bithhDay": "02/04/1999",
            "cpf": "00000000",
            "rg": "44444444",
            "maritalStatus": "SOLTEIRO",
            "phoneNumber": "1799999999",
            "email": "albertoo@teste.com",
            "naturalness": "São Paulo",
            "dtaCreated": "24/04/2023 10:27:16",
            "dtaUpdated": "24/04/2023 10:27:16",
            "phoneEmergency": "1799999999",
            "agreement": "UNIMED",
            "agreementNumber": "999999-00",
            "agreementValidity": "01/12/2024",
            "allergies": [
                {
                    "id": "6e0b133f-09b5-4696-abec-e63be701ff8c",
                    "allergy": "Leite",
                    "dtaCreated": "24/04/2023 10:27:16",
                    "dtaUpdated": "24/04/2023 10:27:16"
                }
            ],
            "cautionLists": [
                {
                    "id": "6a738c8d-e4c7-447f-baf5-00c4d938fe93",
                    "caution": "Repouso",
                    "dtaCreated": "24/04/2023 10:27:16",
                    "dtaUpdated": "24/04/2023 10:27:16"
                }
            ],
            "address": {
                "id": "e1e6d32c-4eb8-48d2-b785-a60d0d747852",
                "zipCode": "15600070",
                "city": "Fernandópolis",
                "country": "Brasil",
                "publicPlace": "Rua Brasil",
                "houseNumber": "2274",
                "complement": "apto 04",
                "district": "Centro",
                "landmark": "Edificio parati"
            }
        }

### Atualizar [**PUT** _/api/pacientes/**{id}**_]

Request (application/json)

        {
            "name": "Alberto Goes",
            "gender": "Masculino",
            "bithhDay": "02/04/1999",
            "cpf": "00000000",
            "rg": "44444444",
            "maritalStatus": "SOLTEIRO",
            "phoneNumber": "1799999999",
            "email": "albertoo@teste.com",
            "naturalness": "São Paulo",
            "dtaCreated": "24/04/2023 10:27:16",
            "dtaUpdated": "24/04/2023 10:27:16",
            "phoneEmergency": "1799999999",
            "agreement": "UNIMED",
            "agreementNumber": "999999-00",
            "agreementValidity": "01/12/2024",
            "allergies": 
            [
                {
                    "allergy": "Leite"
                }
            ],
            "cautionLists":
            [
                {
                    "caution": "Repouso"
                }
            ],
            "address": {
                "zipCode": "15600070",
                "city": "Fernandópolis",
                "country": "Brasil",
                "publicPlace": "Rua Brasil",
                "houseNumber": "2274",
                "complement": "apto 04",
                "district": "Centro",
                "landmark": "Edificio parati"
            }
        }

Response 200 (application/json)

        {
            "id": "e1e6d22c-4eb8-48d2-b592-a60d0d730841",
            "name": "Alberto Goes",
            "gender": "Masculino",
            "bithhDay": "02/04/1999",
            "cpf": "00000000",
            "rg": "44444444",
            "maritalStatus": "SOLTEIRO",
            "phoneNumber": "1799999999",
            "email": "albertoo@teste.com",
            "naturalness": "São Paulo",
            "dtaCreated": "24/04/2023 10:27:16",
            "dtaUpdated": "24/04/2023 11:00:08",
            "phoneEmergency": "1799999999",
            "agreement": "UNIMED",
            "agreementNumber": "999999-00",
            "agreementValidity": "01/12/2024",
            "allergies": [
                {
                    "id": "6e0b133f-09b5-4696-abec-e63be701ff8c",
                    "allergy": "Leite",
                    "dtaCreated": "24/04/2023 10:27:16",
                    "dtaUpdated": "24/04/2023 10:27:16"
                }
            ],
            "cautionLists": [
                {
                    "id": "6a738c8d-e4c7-447f-baf5-00c4d938fe93",
                    "caution": "Repouso",
                    "dtaCreated": "24/04/2023 10:27:16",
                    "dtaUpdated": "24/04/2023 10:27:16"
                }
            ],
            "address": {
                "id": "1ac17263-e8a6-4151-bf4c-ac15b902e782",
                "zipCode": "15600070",
                "city": "Fernandópolis",
                "country": "Brasil",
                "publicPlace": "Rua Brasil",
                "houseNumber": "2274",
                "complement": "apto 04",
                "district": "Centro",
                "landmark": "Edificio parati"
            }
        }

### Deletar [**DELETE** _/api/pacientes/**{id}**_]

    Response 200 (application/json)

# **Exames** [_/api/exames_]

### Listar [**GET** _/api/exames_]


Response 200 (application/json)

        {
            "id": "eb60bd54-9f9e-4142-b8ed-017553a7dd9c",
            "exam": "EXAME",
            "dtaHourExam": "01/12/2023 18:55:45",
            "examType": "Gripal",
            "urlFile": "http://www.",
            "result": "Nada COnsta",
            "user": {
              "id": "5aea1883-c22d-4d03-8b91-73dc007d2918",
              "name": "Rodolfo Rodriges Bortolozo",
              "crm": "1234-SP"
            },
            "patient": {
              "id": "70345fa3-199f-4374-8885-f77b3ea65212",
              "name": "Leonardo"
            },
            "dtaCreated": "23/04/2023 22:10:26",
            "dtaUpdated": "23/04/2023 22:10:26"
        }

### Listar por Id [**GET** _/api/exames/{id}_]


Response 200 (application/json)

        {
            "id": "eb60bd54-9f9e-4142-b8ed-017553a7dd9c",
            "exam": "EXAME",
            "dtaHourExam": "01/12/2023 18:55:45",
            "examType": "Gripal",
            "urlFile": "http://www.",
            "result": "Nada COnsta",
            "user": {
              "id": "5aea1883-c22d-4d03-8b91-73dc007d2918",
              "name": "Rodolfo Rodriges Bortolozo",
              "crm": "1234-SP"
            },
            "patient": {
              "id": "70345fa3-199f-4374-8885-f77b3ea65212",
              "name": "Leonardo"
            },
            "dtaCreated": "23/04/2023 22:10:26",
            "dtaUpdated": "23/04/2023 22:10:26"
        }


### Cadastrar [**POST** _/api/exames_]

Request (application/json)

       {
            "exam": "EXAME",
            "dtaHourExam": "01/01/2023 18:55:45",
            "examType": "Gripal",
            "urlFile": "http://www.",
            "result": "neusa",
            "iddoctor": "5aea1883-c22d-4d03-8b91-73dc007d2918",
            "idpatient": "70345fa3-199f-4374-8885-f77b3ea65212"
        }

Response 201 (application/json)

        {
            "id": "eb60bd54-9f9e-4142-b8ed-017553a7dd9c",
            "exam": "EXAME",
            "dtaHourExam": "01/12/2023 18:55:45",
            "examType": "Gripal",
            "urlFile": "http://www.",
            "result": "Nada COnsta",
            "user": {
              "id": "5aea1883-c22d-4d03-8b91-73dc007d2918",
              "name": "Rodolfo Rodriges Bortolozo",
              "crm": "1234-SP"
            },
            "patient": {
              "id": "70345fa3-199f-4374-8885-f77b3ea65212",
              "name": "Leonardo"
            },
            "dtaCreated": "23/04/2023 22:10:26",
            "dtaUpdated": "23/04/2023 22:10:26"
        }

### Atualizar [**PUT** _/api/exames/**{id}**_]

Request (application/json)

        {
            "exam": "EXAME",
            "dtaHourExam": "01/01/2023 18:55:45",
            "examType": "Gripal",
            "urlFile": "http://www.",
            "result": "neusa",
            "iddoctor": "5aea1883-c22d-4d03-8b91-73dc007d2918",
            "idpatient": "70345fa3-199f-4374-8885-f77b3ea65212"
        }

Response 200 (application/json)

    {
            "id": "eb60bd54-9f9e-4142-b8ed-017553a7dd9c",
            "exam": "EXAME",
            "dtaHourExam": "01/12/2023 18:55:45",
            "examType": "Gripal",
            "urlFile": "http://www.",
            "result": "Nada COnsta",
            "user": {
              "id": "5aea1883-c22d-4d03-8b91-73dc007d2918",
              "name": "Rodolfo Rodriges Bortolozo",
              "crm": "1234-SP"
            },
            "patient": {
              "id": "70345fa3-199f-4374-8885-f77b3ea65212",
              "name": "Leonardo"
            },
            "dtaCreated": "23/04/2023 22:10:26",
            "dtaUpdated": "23/04/2023 22:10:26"
        }

### Deletar [**DELETE** _/api/exames/**{id}**_]

    Response 200 (application/json)

# **Consultas** [_/api/consultas_]

### Listar [**GET** _/api/consultas_]


Response 200 (application/json)

         {
            "id": "4afe4288-e21d-40e2-a069-ea500c1e6855",
            "motive": "Gripe",
            "dtaHourConsult": "01/01/2023 18:55:45",
            "description": "Nariz Entupido",
            "medication": "neusa",
            "precautions": "descansar",
            "user": {
              "id": "5aea1883-c22d-4d03-8b91-73dc007d2918",
              "name": "Rodolfo Rodriges Bortolozo",
              "crm": "1234-SS"
            },
            "patient": {
              "id": "70345fa3-199f-4374-8885-f77b3ea65212",
              "name": "Rodolfo END 2"
            },
            "dtaCreated": "24/04/2023 22:02:12",
            "dtaUpdated": "24/04/2023 22:02:12"
        }

### Listar por Id [**GET** _/api/consultas/{id}_]


Response 200 (application/json)

         {
            "id": "4afe4288-e21d-40e2-a069-ea500c1e6855",
            "motive": "Gripe",
            "dtaHourConsult": "01/01/2023 18:55:45",
            "description": "Nariz Entupido",
            "medication": "neusa",
            "precautions": "descansar",
            "user": {
              "id": "5aea1883-c22d-4d03-8b91-73dc007d2918",
              "name": "Rodolfo Rodriges Bortolozo",
              "crm": "1234-SS"
            },
            "patient": {
              "id": "70345fa3-199f-4374-8885-f77b3ea65212",
              "name": "Rodolfo END 2"
            },
            "dtaCreated": "24/04/2023 22:02:12",
            "dtaUpdated": "24/04/2023 22:02:12"
        }


### Cadastrar [**POST** _/api/consultas_]

Request (application/json)

       {
            "motive": "Gripe",
            "dtaHourConsult": "01/01/2023 18:55:45",
            "description": "Nariz Entupido",
            "medication": "neusa",
            "precautions": "descansar",
            "iddoctor": "5aea1883-c22d-4d03-8b91-73dc007d2918",
            "idpatient": "70345fa3-199f-4374-8885-f77b3ea65212"
        }

Response 201 (application/json)

        {
            "id": "4afe4288-e21d-40e2-a069-ea500c1e6855",
            "motive": "Gripe",
            "dtaHourConsult": "01/01/2023 18:55:45",
            "description": "Nariz Entupido",
            "medication": "neusa",
            "precautions": "descansar",
            "user": {
              "id": "5aea1883-c22d-4d03-8b91-73dc007d2918",
              "name": "Rodolfo Rodriges Bortolozo",
              "crm": "1234-SS"
            },
            "patient": {
              "id": "70345fa3-199f-4374-8885-f77b3ea65212",
              "name": "Rodolfo END 2"
            },
            "dtaCreated": "24/04/2023 22:02:12",
            "dtaUpdated": "24/04/2023 22:02:12"
        }

### Atualizar [**PUT** _/api/consultas/**{id}**_]

Request (application/json)

        {
            "motive": "Gripe",
            "dtaHourConsult": "01/01/2023 18:55:45",
            "description": "Nariz Entupido",
            "medication": "neusa",
            "precautions": "descansar",
            "iddoctor": "5aea1883-c22d-4d03-8b91-73dc007d2918",
            "idpatient": "70345fa3-199f-4374-8885-f77b3ea65212"
        }

Response 200 (application/json)

    {
            "id": "eb60bd54-9f9e-4142-b8ed-017553a7dd9c",
            "exam": "EXAME",
            "dtaHourExam": "01/12/2023 18:55:45",
            "examType": "Gripal",
            "urlFile": "http://www.",
            "result": "Nada COnsta",
            "user": {
              "id": "5aea1883-c22d-4d03-8b91-73dc007d2918",
              "name": "Rodolfo Rodriges Bortolozo",
              "crm": "1234-SP"
            },
            "patient": {
              "id": "70345fa3-199f-4374-8885-f77b3ea65212",
              "name": "Leonardo"
            },
            "dtaCreated": "23/04/2023 22:10:26",
            "dtaUpdated": "23/04/2023 22:10:26"
        }

### Deletar [**DELETE** _/api/exames/**{id}**_]

    Response 200 (application/json)

# **Endereços** [_/api/enderecos_]

### Listar [**GET** _/api/enderecos_]


Response 200 (application/json)

         {
            "id": "b6e12001-21fe-4825-96b3-296281dfd2f9",
            "zipCode": "15600076",
            "city": "Fernandópolis",
            "country": "Brasil",
            "publicPlace": "Rua Brasil",
            "houseNumber": "2274",
            "complement": "apto 03",
            "district": "centro",
            "landmark": "Edificio parati",
            "patient": {
              "id": "70345fa3-199f-4374-8885-f77b3ea65212",
              "name": "Rodolfo"
        }


### Listar por Id [**GET** _/api/enderecos/{id}_]


Response 200 (application/json)

         {
            "id": "b6e12001-21fe-4825-96b3-296281dfd2f9",
            "zipCode": "15600076",
            "city": "Fernandópolis",
            "country": "Brasil",
            "publicPlace": "Rua Brasil",
            "houseNumber": "2274",
            "complement": "apto 03",
            "district": "centro",
            "landmark": "Edificio",
            "patient": {
              "id": "70345fa3-199f-4374-8885-f77b3ea65212",
              "name": "Rodolfo"
        }


### Cadastrar [**POST** _/api/enderecos_]

Request (application/json)

        {
            "id": "b6e12001-21fe-4825-96b3-296281dfd2f9",
            "zipCode": "15600076",
            "city": "Fernandópolis",
            "country": "Brasil",
            "publicPlace": "Rua Brasil",
            "houseNumber": "2274",
            "complement": "apto 03",
            "district": "centro",
            "landmark": "Edificio",
        }

Response 201 (application/json)

        {
            "id": "b6e12001-21fe-4825-96b3-296281dfd2f9",
            "zipCode": "15600076",
            "city": "Fernandópolis",
            "country": "Brasil",
            "publicPlace": "Rua Brasil",
            "houseNumber": "2274",
            "complement": "apto 03",
            "district": "centro",
            "landmark": "Edificio",
            "patient": {
              "id": "70345fa3-199f-4374-8885-f77b3ea65212",
              "name": "Rodolfo"
        }

### Atualizar [**PUT** _/api/enderecos/**{id}**_]

Request (application/json)

       {
            "id": "b6e12001-21fe-4825-96b3-296281dfd2f9",
            "zipCode": "15600076",
            "city": "Fernandópolis",
            "country": "Brasil",
            "publicPlace": "Rua Brasil",
            "houseNumber": "2274",
            "complement": "apto 03",
            "district": "centro",
            "landmark": "Edificio",
        }

Response 200 (application/json)

        {
            "id": "b6e12001-21fe-4825-96b3-296281dfd2f9",
            "zipCode": "15600076",
            "city": "Fernandópolis",
            "country": "Brasil",
            "publicPlace": "Rua Brasil",
            "houseNumber": "2274",
            "complement": "apto 03",
            "district": "centro",
            "landmark": "Edificio",
            "patient": {
              "id": "70345fa3-199f-4374-8885-f77b3ea65212",
              "name": "Rodolfo"
        }
