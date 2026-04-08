# csc340-assignment3
Name: Isabel Barboza
Date: 4/7/2026

Assignment #4: MVC App

## Description

This is a full-stack MVC web application built using Spring Boot and FreeMarker.
The application allows users to manage a collection of characters by performing full CRUD (Create, Read, Update, Delete) operations.
Users can also search for characters and upload images associated with each character.
All data is stored persistently in a database.

## How to Run the Application

Clone the repository
Open the project in VS Code
Make sure your database is running
Run the application using:  DemoApplication.java
Open your browser and go to:   http://localhost:8080/characters/all

## Endpoints:

View All Characters

GET /characters/all

View Character Details

GET /characters/{id}

Create Character Form

GET /characters/add

Create Character

POST /characters/add

Update Character Form

GET /characters/update/{id}

Update Character

POST /characters/update/{id}

Delete Character

GET /characters/delete/{id}

Search by Name

GET /characters/search?name=value

Search by Role

GET /characters/search/role?role=value

About Page

GET /characters/about


# Demo Video:

