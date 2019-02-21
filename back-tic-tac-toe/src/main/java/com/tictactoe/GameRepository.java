package com.tictactoe;
import org.springframework.data.repository.CrudRepository;
import com.tictactoe.Game;
public interface GameRepository extends CrudRepository<Game,Integer>{

}
