package com.example.HibernateOneToMany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HibernateOneToMany.Model.Model;

/**
 * Spring Data JPA repository for the Model entity. This interface extends
 * JpaRepository and provides basic CRUD operations for Model entities.
 */
public interface ModelRepo extends JpaRepository<Model, Integer> {
}
