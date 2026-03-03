package com.example.demo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "characters")
public class Character {
     @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long characterId;

  @Column(nullable = false)
  public String name;

  @Column(nullable = false)
  public String description;

  public String role;
  public String universe;
  

  public Character() {
  }

  public Character(String name, String description, String role, String universe) {
    this.name = name;
    this.description = description;
    this.role = role;
    this.universe = universe;
  }



  public Character(Long characterId, String name, String description, String role, String universe) {
    this.characterId = characterId;
    this.name = name;
    this.description = description;
    this.role = role;
    this.universe = universe;
  }

  public Long getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Long characterId) {
    this.characterId = characterId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getUniverse() {
    return universe;
  }

  public void setUniverse(String universe) {
    this.universe = universe;
  }


}




