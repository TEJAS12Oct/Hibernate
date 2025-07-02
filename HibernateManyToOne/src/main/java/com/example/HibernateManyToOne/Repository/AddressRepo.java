package com.example.HibernateManyToOne.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HibernateManyToOne.Model.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
