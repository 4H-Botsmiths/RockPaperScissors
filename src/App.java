public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        var game = new Game();
        var result = game.Shoot();
        System.out.println(result);
    }
}
