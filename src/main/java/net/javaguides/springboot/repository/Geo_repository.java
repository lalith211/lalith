package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entity.Geo;

@Repository
public interface Geo_repository extends JpaRepository<Geo, Integer> {

}
