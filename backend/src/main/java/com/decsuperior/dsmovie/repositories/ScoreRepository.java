package com.decsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.decsuperior.dsmovie.ScorePK;
import com.decsuperior.dsmovie.entities.Score;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
