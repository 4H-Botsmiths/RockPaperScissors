public class Game {
    private IPlayer _player1;
    private IPlayer _player2;

    public Game() {
        _player1 = new HumanPlayer();
        _player2 = new ComputerPlayer();
    }
    public String Shoot() {
        var humanMove = _player1.GetMove();//new HumanPlayer().GetMove();
        var computerMove = _player2.GetMove();//new ComputerPlayer().GetMove();
        System.out.println("Computer Played " + computerMove);
        System.out.println("You Played " + humanMove);

        String whoWon = DetermineWinner(computerMove, humanMove);

        return whoWon + " won!";
    }

    protected String DetermineWinner(Move computerMove, Move humanMove) {
        if(computerMove.equals(humanMove))
            return "no one";

        if(computerMove == Move.PAPER && humanMove == Move.ROCK)
            return "computer";
        if(computerMove == Move.ROCK && humanMove == Move.PAPER)
            return "you";

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
