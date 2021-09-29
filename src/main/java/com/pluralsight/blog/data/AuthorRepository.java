package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(exported = false)
public interface AuthorRepository extends JpaRepository<Author,Long>{
}