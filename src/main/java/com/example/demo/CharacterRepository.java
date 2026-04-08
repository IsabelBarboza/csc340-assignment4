package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {


  List<Character> findByRoleContainingIgnoreCase(String role);

  List<Character> findByUniverse(String universe);

  @Query(value = "SELECT c.* FROM characters c WHERE upper(c.name) like upper(concat('%', ?1, '%'))", nativeQuery = true)
  List<Character> findByNameContainingIgnoreCase(String name);

  List<Character> findByAbilitiesContainingIgnoreCase(String abilities);

  List<Character> findByDescription(String description);



}
