import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test
  public void DetermineWinner_Player1_Rock_vs_Player2_Rock() {
    //arrange
    var game = new Game(new TestPlayer(Move.ROCK), new TestPlayer(Move.ROCK));

    //act
    var winner = game.DetermineWinner();

    //assert
    assertEquals("no one", winner);
  }

  @Test
  public void DetermineWinner_Player1_Rock_vs_Player2_Paper() {
    //arrange
    var game = new Game(new TestPlayer(Move.ROCK), new TestPlayer(Move.PAPER));

    //act
    var winner = game.DetermineWinner();

    //assert
    assertEquals("TestPlayer2", winner);
  }

  @Test
  public void DetermineWinner_Player1_Rock_vs_Player2_Scissors() {
    //arrange
    var game = new Game(new TestPlayer(Move.ROCK), new TestPlayer(Move.SCISSORS));

    //act
    var winner = game.DetermineWinner();

    //assert
    assertEquals("TestPlayer1", winner);
  }

  @Test
  public void DetermineWinner_Player1_Paper_vs_Player2_Rock() {
    //arrange
    var game = new Game(new TestPlayer(Move.PAPER), new TestPlayer(Move.ROCK));

    //act
    var winner = game.DetermineWinner();

    //assert
    assertEquals("TestPlayer1", winner);
  }

  @Test
  public void DetermineWinner_Player1_Paper_vs_Player2_Scissors() {
    //arrange
    var game = new Game(new TestPlayer(Move.PAPER), new TestPlayer(Move.SCISSORS));

    //act
    var winner = game.DetermineWinner();

    //assert
    assertEquals("TestPlayer2", winner);
  }

  @Test
  public void DetermineWinner_Player1_Paper_vs_Player2_Paper() {
    //arrange
    var game = new Game(new TestPlayer(Move.PAPER), new TestPlayer(Move.PAPER));

    //act
    var winner = game.DetermineWinner();

    //assert
    assertEquals("no one", winner);
  }

  @Test
  public void DetermineWinner_Player1_Scissors_vs_Player2_Rock() {
    //arrange
    var game = new Game(new TestPlayer(Move.SCISSORS), new TestPlayer(Move.ROCK));

    //act
    var winner = game.DetermineWinner();

    //assert
    assertEquals("TestPlayer2", winner);
  }

  @Test
  public void DetermineWinner_Player1_Scissors_vs_Player2_Paper() {
    //arrange
    var game = new Game(new TestPlayer(Move.SCISSORS), new TestPlayer(Move.PAPER));

    //act
    var winner = game.DetermineWinner();

    //assert
    assertEquals("TestPlayer1", winner);
  }

  @Test
  public void DetermineWinner_Player1_Scissors_vs_Player2_Scissors() {
    //arrange
    var game = new Game(new TestPlayer(Move.SCISSORS), new TestPlayer(Move.SCISSORS));

    //act
    var winner = game.DetermineWinner();

    //assert
    assertEquals("no one", winner);
  }
}
