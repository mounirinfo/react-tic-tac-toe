package com.tictactoe;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path="/tictactoe")
public class MainController{

  @Autowired
  private GameRepository gameRepository;

  @PostMapping(path="/add")
  public @ResponseBody String addNewGame(@RequestBody List<String> pSquares){

    Game newGame = new Game();
    if(!CollectionUtils.isEmpty(pSquares)) {
    	newGame.setSquares(pSquares);
    }
    gameRepository.save(newGame);
    return "saved";

  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Game> getAllGames(){
    return gameRepository.findAll();
  }

  @GetMapping(path="/game")
  public @ResponseBody Game getById(Integer pId){
    Optional<Game> returnGame = gameRepository.findById(pId);
    if(returnGame.isPresent()) {
    	return returnGame.get();
    }
    return null;
  }

}
