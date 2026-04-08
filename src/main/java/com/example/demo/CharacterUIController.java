package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/characters")
public class CharacterUIController {

    @Autowired
    private final CharacterService characterService;

    public CharacterUIController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/all")
    public String getAllCharacters(Model model) {
        List<Character> characters = characterService.getAllCharacters(); 
        model.addAttribute("characterList", characters);
        model.addAttribute("title", "All Heroes");
        return "character-list";
    
    }

    @GetMapping("/add")
    public String showAddCharacterForm(Model model) {
        model.addAttribute("character", new Character());
        model.addAttribute("title", "Add Character");
        return "character-create";
    }
    
    @GetMapping("/{characterId}")
    public String getCharacterByID(@PathVariable long characterId, Model model) {
        Character character = characterService.getCharacterById(characterId);
        if (character != null) {
                model.addAttribute("character", character);
                model.addAttribute("title", "Hero Details");
            }else {
                model.addAttribute("errorMessage", "Character not found with ID: " + characterId);
                model.addAttribute("title", "Error");
                return "error";
        }
        return "character-details";
    }

    @GetMapping("/search")
    public String searchCharactersByName(@RequestParam String name, Model model) {
        model.addAttribute("characterList", characterService.searchCharactersByName(name));
        model.addAttribute("title", "Search Results for: " + name);
        return "character-list";
    }

    @GetMapping("/search/role")
    public String searchCharactersByRole(@RequestParam String role, Model model) {
        model.addAttribute("characterList", characterService.getCharactersByRole(role));
        model.addAttribute("title", "Heroes with Role: " + role);
        return "character-list";
    }



    @PostMapping("/add")
    public String addCharacter(Character character,MultipartFile picture)  {
        Character newCharacter = characterService.createCharacter(character);
        if (newCharacter != null) {
            characterService.saveCharacterPicture(newCharacter, picture);
            return "redirect:/characters/"+ newCharacter.getCharacterId();
        } else {
            return "redirect:/characters/add?error=true";
        }

    }

    @GetMapping("/update/{characterId}")
    public String showUpdateForm(@PathVariable long characterId, Model model) {
        Character character = characterService.getCharacterById(characterId);
        if (character != null) {
            model.addAttribute("character", character);
            model.addAttribute("title", "Update Hero");
            return "character-update";
        } else {
            model.addAttribute("errorMessage", "Character not found with ID: " + characterId);
            model.addAttribute("title", "Error");
            return "error";
        }
    }

    

    @GetMapping("/delete/{characterId}")
    public String deleteCharacterPost(@PathVariable long characterId, Model model) {
        Character character = characterService.getCharacterById(characterId);
        if (character != null) {
            characterService.deleteCharacter(characterId);
            return "redirect:/characters/all";
        } else {
            model.addAttribute("errorMessage", "Delete failed. Character not found with ID: " + characterId);
            model.addAttribute("title", "Error");
            return "error";
        }
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About");
        return "about";
    }

    @PostMapping("/update/{characterId}")
    public String updateCharacter(@PathVariable long characterId, Character updatedCharacter, MultipartFile picture, Model model) {
        Character character = characterService.updateCharacter(characterId, updatedCharacter);
        if (character != null ) {
            characterService.saveCharacterPicture( character, picture);
            return "redirect:/characters/" + character.getCharacterId();
        } else {
            model.addAttribute("errorMessage", "Update failed. Character not found with ID: " + characterId);
            model.addAttribute("title", "Error");
            return "error";
        }
    }

}
