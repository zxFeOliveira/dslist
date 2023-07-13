package com.zxfeoliveira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zxfeoliveira.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
