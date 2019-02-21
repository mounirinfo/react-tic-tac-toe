package com.tictactoe;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game{
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  @ElementCollection
  private List<String> squares=new ArrayList<String>();

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public List<String>  getSquares() {
  return squares;
}

public void setSquares(List<String> pSquares) {
  this.squares = pSquares;
}

}
