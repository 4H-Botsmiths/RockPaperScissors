import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test
  public void DetermineWinner_Computer_Rock_vs_Human_Rock() {
    //arrange
    var game = new Game();
    var computerMove = Move.ROCK;
    var humanMove = Move.ROCK;

    //act
    var winner = game.DetermineWinner(computerMove, humanMove);

    //assert
    assertEquals("no one", winner);
  }
}
