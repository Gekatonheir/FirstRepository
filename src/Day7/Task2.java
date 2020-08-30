package Day7;

public class Task2 {
    public static void main(String[] args) {
        Player [] gamer = new Player[6];
        for(int i =0; i<6; i++)
            gamer[i] = new Player();
        Player.info();
        for(int i = 0; i<100; i++){
            for(int j =0; j<5; j++) {
                gamer[j].run();
            }
            if(gamer[0].stamina==0&&gamer[1].stamina==0&&gamer[2].stamina==0&&gamer[3].stamina==0&&gamer[4].stamina==0)
                break;
        }
        Player.info();

        Player [] winner = new Player[6];
        for(int i =0; i<6; i++) {
            winner[i] = new Player();
            Player.info();
        }
    }
}
