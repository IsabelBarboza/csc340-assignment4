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
  public String name="";

  @Column(nullable = false)
  public String description="";

  public String role="";
  public String universe ="";
  public String abilities="";

  private String characterPicturePath="";

  public Character() {
  }

  public Character(String name, String description, String role, String universe, String abilities) {
    this.name = name;
    this.description = description;
    this.role = role;
    this.universe = universe;
    this.abilities = abilities;
  }



  public Character(Long characterId, String name, String description, String role, String universe, String abilities) {
    this.characterId = characterId;
    this.name = name;
    this.description = description;
    this.role = role;
    this.universe = universe;
    this.abilities = abilities;
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

  public String getAbilities() {
    return abilities;
  }

  public void setAbilities(String abilities) {
    this.abilities = abilities;
  }

   public void setCharacterPicturePath(String fileName) {
        this.characterPicturePath = fileName;
    }

  public String getCharacterPicturePath() {
        return characterPicturePath;
    }

}




