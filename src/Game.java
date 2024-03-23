public class Game {
    private IPlayer _player1;
    private IPlayer _player2;

    public Game(IPlayer player1, IPlayer player2) {
        _player1 = player1;
        _player2 = player2;
    }
    public String Shoot() {
        var humanMove = _player1.GetMove();//new HumanPlayer().GetMove();
        var computerMove = _player2.GetMove();//new ComputerPlayer().GetMove();
        System.out.println(_player1.toString().split("@")[0] + "1 Played " + computerMove);
        System.out.println(_player2.toString().split("@")[0] + "2 Played " + humanMove);

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
