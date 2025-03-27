# 📝 Journal API with Spring Web

A simple RESTful API for managing journal entries built with Spring Web and in-memory storage.

## Features
- REST endpoints for CRUD operations
- In-memory storage using Java Collections
- Spring Web for HTTP handling
- No database dependencies

## Technologies
- Java 17
- Spring Boot 3.x
- Spring Web
- Maven

## API Structure


## Endpoints

| HTTP Method | Endpoint            | Description                     |
|-------------|---------------------|---------------------------------|
| POST        | /Journal/           | Create a new journal entry      |
| GET         | /Journal/           | Retrieve all journal entries    |
| GET         | /Journal/id/{myid}  | Get a specific journal entry    |
| PUT         | /Journal/id/{id}    | Update a journal entry          |
| DELETE      | /Journal/id/{myid}  | Delete a journal entry          |

Get Entry (GET /Journal/id/1)
{
  "id": 1,
  "title": "happy",
  "content": "i am happy"
}


# Future Improvements

Add persistent storage

Implement input validation

Add error handling

Include unit tests
