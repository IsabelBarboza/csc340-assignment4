# csc340-assignment3
Name: Isabel Barboza
Date: 3/6/2026

Assignment #3: CRUD API

This project is a REST API built with Spring Boot that manages characters from the Dota universe.

# SQL on Neon.tech:
 
CREATE TABLE "characters" (
	"character_id"	SERIAL PRIMARY KEY,
	"name"	TEXT NOT NULL,
	"description"	TEXT NOT NULL,
	"role"	TEXT NOT NULL,
	"universe"	TEXT NOT NULL
);

INSERT INTO characters (name, role, universe, description) VALUES
('Invoker', 'Carry', 'Dota', 'Master of spells, versatile mid-laner'),
('Crystal Maiden', 'Support', 'Dota', 'Provides mana regen and crowd control'),
('Axe', 'Initiator', 'Dota', 'Tanky hero that starts fights with Berserker'),
('Juggernaut', 'Carry', 'Dota', 'Agile melee hero with healing and Blade Fury'),
('Lion', 'Support', 'Dota', 'High burst damage with disables and mana drain'),
('Phantom Assassin', 'Carry', 'Dota', 'Critical strike assassin with high damage potential'),
('Bloodseeker', 'Fighter / Carry', 'Dota', 'Fast hunter who tracks wounded enemies'),
('Morphling', 'Carry / Agility', 'Dota', 'Agility hero who can adapt and replicate enemies'),
('Mirana', 'Support / Carry', 'Dota', 'Archer hero with moonlight powers and mobility'),
('Shadow Fiend', 'Carry', 'Dota', 'High damage hero that collects souls to increase attack power');


# Installation: 

1. Clone repository
2. Open project in Vs Code 
3. Run the Spring Boot application
4. The API will run on: http://localhost:8080/api/characters/ 

Api Endpoints on echoAPI:

GET /api/characters/


GET /api/characters/2


POST /api/characters/


PUT /api/characters/3


DELETE /api/characters/5


GET /api/characters/category/Support


GET /api/characters/search?name=Mirana


# Demo Video:


https://uncg-my.sharepoint.com/:v:/r/personal/idbarbozate_uncg_edu/Documents/Videos/Clipchamp/Video%20Project%205/Exports/VideoAPI.mp4?csf=1&web=1&e=bGhey0&nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZy1MaW5rIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXcifX0%3D