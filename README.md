# Spring Boot Book API

This is a simple Spring Boot application that provides a RESTful API for managing books. It uses Spring Data JPA for data persistence and MySQL as the database.
## Getting Started

### Prerequisites

Make sure you have the following installed:

- Java (version 8 or later)
- Maven
- MySQL
1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/spring-boot-book-api.git

## API Endpoints
- GET /books: Get a list of all books.
- GET /books/{bookId}: Get details of a specific book.
- POST /books: Add a new book.
- PUT /books: Update an existing book.
- DELETE /books/{bookId}: Delete a book.

## Sample Requests
### Get All Books
GET http://localhost:8097/books
### Get a Specific Book
GET http://localhost:8097/books/1
### Add a New Book
POST http://localhost:8097/books

{
  "bookName": "The Great Gatsby",
  "authorName": "F. Scott Fitzgerald",
  "ISBN": "978-3-16-148410-0",
  "price": 20.99
}
### Update a Book
PUT http://localhost:8097/books

{
  "id": 1,
  "bookName": "Updated Book Title",
  "authorName": "Updated Author",
  "ISBN": "978-1-23-456789-0",
  "price": 25.99
}
### Delete a Book
DELETE http://localhost:8097/books/1

## Contributing
Feel free to contribute to the project by opening issues or submitting pull requests.
