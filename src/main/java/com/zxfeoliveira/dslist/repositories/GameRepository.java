package com.zxfeoliveira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zxfeoliveira.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
