import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void DetermineWinner_Player1_Rock_vs_Player2_Rock() {
        // arrange
        var player1 = new TestPlayer(Move.ROCK);
        var player2 = new TestPlayer(Move.ROCK);
        var game = new Game(player1, player2);

        // act
        var winner = game.DetermineWinner();

        // assert
        assertEquals(Result.Tie, winner);
    }
    
    @Test
    public void DetermineWinner_Player1_Paper_vs_Player2_Paper() {
        // arrange
        var player1 = new TestPlayer(Move.PAPER);
        var player2 = new TestPlayer(Move.PAPER);
        var game = new Game(player1, player2);

        // act
        var winner = game.DetermineWinner();

        // assert
        assertEquals(winner, Result.Tie);
    }
    
    @Test
    public void DetermineWinner_Player1_Scissors_vs_Player2_Scissors() {
        // arrange
        var player1 = new TestPlayer(Move.SCISSORS);
        var player2 = new TestPlayer(Move.SCISSORS);
        var game = new Game(player1, player2);

        // act
        var winner = game.DetermineWinner();

        // assert
        assertEquals(winner, Result.Tie);
    }

    @Test
    public void DetermineWinner_Player1_Scissors_vs_Player2_Rock() {
        // arrange
        var player1 = new TestPlayer(Move.SCISSORS);
        var player2 = new TestPlayer(Move.ROCK);
        var game = new Game(player1, player2);

        // act
        var winner = game.DetermineWinner();

        // assert
        assertEquals(winner, Result.Player2);
    }

    @Test
    public void DetermineWinner_Player1_Rock_vs_Player2_Scissors() {
        // arrange
        var player1 = new TestPlayer(Move.ROCK);
        var player2 = new TestPlayer(Move.SCISSORS);
        var game = new Game(player1, player2);

        // act
        var winner = game.DetermineWinner();

        // assert
        assertEquals(Result.Player1, winner);
    }

    @Test
    public void DetermineWinner_Player1_Paper_vs_Player2_Scissors() {
        // arrange
        var player1 = new TestPlayer(Move.PAPER);
        var player2 = new TestPlayer(Move.SCISSORS);
        var game = new Game(player1, player2);

        // act
        var winner = game.DetermineWinner();

        // assert
        assertEquals(winner, Result.Player2);
    }

    @Test
    public void DetermineWinner_Player1_Scissors_vs_Player2_Paper() {
        // arrange
        var player1 = new TestPlayer(Move.SCISSORS);
        var player2 = new TestPlayer(Move.PAPER);
        var game = new Game(player1, player2);

        // act
        var winner = game.DetermineWinner();

        // assert
        assertEquals(winner, Result.Player1);
    }

    @Test
    public void DetermineWinner_Player1_Rock_vs_Player2_Paper() {
        // arrange
        var player1 = new TestPlayer(Move.ROCK);
        var player2 = new TestPlayer(Move.PAPER);
        var game = new Game(player1, player2);

        // act
        var winner = game.DetermineWinner();

        // assert
        assertEquals(winner, Result.Player2);
    }

    @Test
    public void DetermineWinner_Player1_Paper_vs_Player2_Rock() {
        // arrange
        var player1 = new TestPlayer(Move.PAPER);
        var player2 = new TestPlayer(Move.ROCK);
        var game = new Game(player1, player2);

        // act
        var winner = game.DetermineWinner();

        // assert
        assertEquals(winner, Result.Player1);
    }
}
