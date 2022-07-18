package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entity.Posts;

@Repository
public interface Posts_Repository
extends JpaRepository<Posts,
Integer>{
	

}
