package com.example.demo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CharacterService {

  private final CharacterRepository characterRepository;

  private static final String UPLOAD_DIR = "src/main/resources/static/image/";

  public CharacterService(CharacterRepository characterRepository) {
    this.characterRepository = characterRepository;
  }

  public List<Character> getAllCharacters() {
    return characterRepository.findAll();
  }

  public Character createCharacter(Character character) {
    return characterRepository.save(character);
  }

  public Character getCharacterById(Long id) {
    return characterRepository.findById(id).orElse(null);
  }

  public Character updateCharacter(Long id, Character updatedCharacter) {
    return characterRepository.findById(id)
        .map(character -> {
          character.setName(updatedCharacter.getName());
          character.setDescription(updatedCharacter.getDescription());
          character.setRole(updatedCharacter.getRole());
          character.setUniverse(updatedCharacter.getUniverse());
          character.setAbilities(updatedCharacter.getAbilities());
          return characterRepository.save(character);
        })
        .orElse(null);
  }

 
  public void deleteCharacter(Long id) {
    characterRepository.deleteById(id);
  }

  
  public List<Character> getCharactersByRole(String role) {
    return characterRepository.findByRoleContainingIgnoreCase(role);
  }

  public List<Character> getCharactersByUniverse(String universe) {
    return characterRepository.findByUniverse(universe);
  }

  public List<Character> searchCharactersByName(String name) {
    return characterRepository.findByNameContainingIgnoreCase(name);
  }

  public List<Character> searchCharactersByDescription(String description) {
    return characterRepository.findByDescription(description);
  }

  public List<Character> searchCharactersByAbilities(String abilities) {
    return characterRepository.findByAbilitiesContainingIgnoreCase(abilities);
  }

  public void saveCharacterPicture(Character character, MultipartFile characterPicture) {
    if (characterPicture == null ||  characterPicture.isEmpty()) {
      return;
    }
    String originalFilename = characterPicture.getOriginalFilename();
        try {
          if (originalFilename != null && originalFilename.contains(".")) {
            String fileExtension = originalFilename.substring(originalFilename.lastIndexOf(".")+1);
            String fileName = character.getCharacterId() + "."+ fileExtension;
            Path filePath=Paths.get(UPLOAD_DIR + fileName);

            Files.createDirectories(Paths.get(UPLOAD_DIR));
            Files.copy(characterPicture.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
            character.setCharacterPicturePath(fileName);
            characterRepository.save(character);
          }
        } catch (Exception e) {
            e.printStackTrace();
        }
  }

  
}
  

