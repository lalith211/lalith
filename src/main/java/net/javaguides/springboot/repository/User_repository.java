package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entity.Users;

@Repository
public interface User_repository extends JpaRepository<Users, Integer>{

}
