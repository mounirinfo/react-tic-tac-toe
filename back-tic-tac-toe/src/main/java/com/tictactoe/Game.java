package com.tictactoe;

@Entity
public class Game{

  private Integer id;
  private List<Integer> squares;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public List<Integer>  getSquares() {
  return squares;
}

public void setSquares(List<Integer> pSquares) {
  this.squares = pSquares;
}

}
