public class LaunchGame {

    public static void main(String[] args) {

        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }

}