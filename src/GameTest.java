import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void DetermineWinner_Computer_Rock_vs_Human_Rock() {
        // arrange
        var game = new Game();
        var computerMove = Move.ROCK;
        var humanMove = Move.ROCK;

        // act
        var winner = game.DetermineWinner(computerMove, humanMove);

        // assert
        assertEquals(winner, "no one");
    }
    
    @Test
    public void DetermineWinner_Computer_Paper_vs_Paper() {
        // arrange
        var game = new Game();
        var computerMove = Move.PAPER;
        var humanMove = Move.PAPER;

        // act
        var winner = game.DetermineWinner(computerMove, humanMove);

        // assert
        assertEquals(winner, "no one");
    }
    
    @Test
    public void DetermineWinner_Computer_SCISSORS_vs_SCISSORS() {
        // arrange
        var game = new Game();
        var computerMove = Move.SCISSORS;
        var humanMove = Move.SCISSORS;

        // act
        var winner = game.DetermineWinner(computerMove, humanMove);

        // assert
        assertEquals(winner, "no one");
    }

    @Test
    public void DetermineWinner_Computer_Scissors_vs_Human_Rock() {
        // arrange
        var game = new Game();
        var computerMove = Move.SCISSORS;
        var humanMove = Move.ROCK;

        // act
        var winner = game.DetermineWinner(computerMove, humanMove);

        // assert
        assertEquals(winner, "you");
    }

    @Test
    public void DetermineWinner_Computer_Rock_vs_Human_Scissors() {
        // arrange
        var game = new Game();
        var computerMove = Move.ROCK;
        var humanMove = Move.SCISSORS;

        // act
        var winner = game.DetermineWinner(computerMove, humanMove);

        // assert
        assertEquals(winner, "computer");
    }

    @Test
    public void DetermineWinner_Computer_Paper_vs_Human_Scissors() {
        // arrange
        var game = new Game();
        var computerMove = Move.PAPER;
        var humanMove = Move.SCISSORS;

        // act
        var winner = game.DetermineWinner(computerMove, humanMove);

        // assert
        assertEquals(winner, "you");
    }

    @Test
    public void DetermineWinner_Computer_Scissors_vs_Human_Paper() {
        // arrange
        var game = new Game();
        var computerMove = Move.SCISSORS;
        var humanMove = Move.PAPER;

        // act
        var winner = game.DetermineWinner(computerMove, humanMove);

        // assert
        assertEquals(winner, "computer");
    }

    @Test
    public void DetermineWinner_Computer_Rock_vs_Human_Paper() {
        // arrange
        var game = new Game();
        var computerMove = Move.ROCK;
        var humanMove = Move.PAPER;

        // act
        var winner = game.DetermineWinner(computerMove, humanMove);

        // assert
        assertEquals(winner, "you");
    }

    @Test
    public void DetermineWinner_Computer_Paper_vs_Human_Rock() {
        // arrange
        var game = new Game();
        var computerMove = Move.PAPER;
        var humanMove = Move.ROCK;

        // act
        var winner = game.DetermineWinner(computerMove, humanMove);

        // assert
        assertEquals(winner, "computer");
    }
}
