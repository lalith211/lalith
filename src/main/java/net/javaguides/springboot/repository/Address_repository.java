package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entity.Address;

@Repository
public interface Address_repository extends JpaRepository<Address, Integer>{

}
