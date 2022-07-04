package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entity.Company;

@Repository
public interface CompanyRepository
extends JpaRepository<Company,
Integer>{
	

}
