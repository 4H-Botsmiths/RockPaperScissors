import java.util.Random;

public class ComputerPlayer {
    public Move GetMove() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        return Move.values()[randomNumber];
    }
}
