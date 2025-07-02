package com.example.HibernateOneToMany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HibernateOneToMany.Model.Manufactures;

/**
 * Spring Data JPA repository for the Manufacture entity. This interface extends
 * JpaRepository and provides basic CRUD operations for Manufactures entities.
 */
public interface ManufacturesRepo extends JpaRepository<Manufactures, Integer> {
}
