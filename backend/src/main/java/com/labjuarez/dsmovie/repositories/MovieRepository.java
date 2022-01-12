package com.labjuarez.dsmovie.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.labjuarez.dsmovie.entities.Movie;

public interface  MovieRepository extends JpaRepository<Movie, Long>{

}
