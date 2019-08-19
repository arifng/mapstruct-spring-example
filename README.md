# mapstruct-spring-example

An example project of mapstruct in spring framework


Run the project, then request http://localhost:8080/person/ from any rest client, it will show the following value:

    {
        "id": 1000,
        "name": "Rana",
        "birthDate": "2019-08-19T07:35:48.313+0000"
    }

When user hit the url, system load model and convert it to DTO using Mapstruct and then resturn DTO.
