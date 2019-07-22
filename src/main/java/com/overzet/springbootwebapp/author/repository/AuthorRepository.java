package com.overzet.springbootwebapp.author.repository;

import com.overzet.springbootwebapp.author.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
