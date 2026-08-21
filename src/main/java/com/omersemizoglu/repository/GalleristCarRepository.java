package com.omersemizoglu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omersemizoglu.model.GalleristCar;

@Repository
public interface GalleristCarRepository extends JpaRepository<GalleristCar, Long>{

}
