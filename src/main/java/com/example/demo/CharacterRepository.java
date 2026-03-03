package com.example.demo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {

  List<Character> findByRole(String role);

  List<Character> findByUniverse(String universe);

  @Query(value = "SELECT c.* FROM characters c WHERE c.name like %?1%", nativeQuery = true)
  List<Character> findByNameContaining(String name);

  Character findByName(String name);

}
