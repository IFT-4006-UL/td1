# TD1
## Setup de projet Java et création de routes API

### Démarrer le serveur

1. Démarrer le serveur en exécutant `Main`.

OU
2. Démarrer le serveur via maven:
```bash
mvn clean install
mvn exec:java
```

Le serveur est accessible à l'adresse: http://localhost:8181. Vérifiez que tout fonctionne en accédant à http://localhost:8181/health

### Objectifs
Ajouter les routes API suivantes à l'application:

1. GET /books

Réponse:
- HTTP 200 OK
```json
[
    {
        "title": "string",
        "author": "string",
        "year": "int"
    }
]
```

2. GET /books/{title}

Réponses:

- HTTP 200 OK
```json
{
    "title": "string",
    "author": "string",
    "year": "int"
}
```

Si le livre avec ce titre n'existe pas:
- HTTP 404 NOT FOUND
```json
{
    "error": "BOOK_NOT_FOUND",
    "message": "Book not found"
}
```

3. POST /books
```json
{
    "title": "string",
    "author": "string",
    "year": "int"
}
```
Réponses:
- HTTP 201 CREATED

Si un livre avec le même titre existe déjà:
- HTTP 400 BAD REQUEST
```json
{
    "error": "BOOK_ALREADY_EXISTS",
    "message": "Book already exists"
}
```
