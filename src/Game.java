public class Game {
    public String Shoot() {
        var humanMove = new HumanPlayer().GetMove();
        var computerMove = new ComputerPlayer().GetMove();
        System.out.println("Computer Played " + computerMove);
        System.out.println("You Played " + humanMove);

        String whoWon = DetermineWinner(computerMove, humanMove);

        return whoWon + " won!";
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
            return "computer";
        if(computerMove == Move.PAPER && humanMove == Move.SCISSORS)
            return "you";

        return "error";
    }
}
