public class Game {
    public String Shoot() {
        var computerMove = new ComputerPlayer().GetMove();
        var humanMove = new HumanPlayer().GetMove();

        String whoWon = DetermineWinner(computerMove, humanMove);

        return STR."\{whoWon} won!";
    }

    private String DetermineWinner(Move computerMove, Move humanMove) {
        if(computerMove.equals(humanMove))
            return "no one";

        if(computerMove == Move.PAPER && humanMove == Move.ROCK)
            return "you";
        if(computerMove == Move.ROCK && humanMove == Move.PAPER)
            return "computer";

        if(computerMove == Move.SCISSORS && humanMove == Move.ROCK)
            return "you";
        if(computerMove == Move.ROCK && humanMove == Move.SCISSORS)
            return "computer";

        if(computerMove == Move.SCISSORS && humanMove == Move.PAPER)
            return "you";
        if(computerMove == Move.PAPER && humanMove == Move.SCISSORS)
            return "computer";

        return "error";
    }
}
