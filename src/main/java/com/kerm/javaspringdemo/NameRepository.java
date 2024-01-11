package com.kerm.javaspringdemo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing NameEntity objects using Spring Data JPA.
 * Extends JpaRepository, providing CRUD (Create, Read, Update, Delete) operations.
 */
public interface NameRepository extends JpaRepository<NameEntity, Integer> {}
