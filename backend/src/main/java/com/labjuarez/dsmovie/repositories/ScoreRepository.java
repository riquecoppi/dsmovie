package com.labjuarez.dsmovie.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.labjuarez.dsmovie.entities.Score;
import com.labjuarez.dsmovie.entities.ScorePK;

public interface  ScoreRepository extends JpaRepository<Score, ScorePK>{

}
