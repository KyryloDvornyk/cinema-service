# Cinema service

Cinema service is a Java project for client for working with server and database. This is my second pet project. 
Client can use postman or other API testing tool to send requests to server. Client can register, login, add, update, 
delete, get data from db.

## Installation

```
1. Fork and copy this project
2. Install MySQL
3. Change data in db.properties file to connect db
4. Install Tomcat and run the server
```

## Usage

Open API testing tool, go on request http://yourlocalhost/register-user or /register-admin to register user with different roles to db.
Use your credentials from register body to log in by Authorization tab(if you use Postman). 
Then you can send requests to create data in db, update, delete, get. You can use next end points(listed by (REQUEST_TYPE - ENDPOINTS_NAMES - AUTHORIZED_ROLE)): 
GET - /cinema-halls, /movies, /movie-sessions/available - all roles, GET - /users/by-email?email - ADMIN role,
GET - /orders, /shopping-carts/by-user - USER role; 
POST - /register-user, /register-admin - unauthorized, POST - /cinema-halls, /movies, /movie-sessions - ADMIN role, 
POST - /orders/complete - USER role; PUT /movie-sessions/id - ADMIN role, PUT - /shopping-carts/movie-sessions?movieSessionId - USER role; 
DELETE - /movie-sessions/id - ADMIN role.  
Example for body params for POST and PUT requests  
POST /register-user, /register-admin: {"password" : "12345678", "repeatPassword" : "12345678", "email" : "email@gmail.com"}   
POST /cinema-halls: {"capacity" : 180, "description" : "description"}  
POST /movies: {"title" : "title", "description" : "description"}  
POST /movie-sessions: {"movieId" : 1, "cinemaHallId" : 1, "showTime" : "01.01.2021"}  

## Technologies
```
1. Java 11
2. MySQL
3. Spring (Spring Core, Spring Security, Spring Web)
4. Tomcat 9.0.50
5. Hibernate
6. JSON
7. Maven 
```
