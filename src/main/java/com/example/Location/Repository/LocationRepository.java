package com.example.Location.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Location.Entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {



}
