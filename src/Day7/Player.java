package Day7;

public class Player {
    int stamina;
    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;
    public static int countPlayers = 0;
    public void run(){
        stamina--;
        if(stamina==MIN_STAMINA)
            countPlayers--;
    }
    public static void info(){
        if (countPlayers<6){
            int x = 6 - countPlayers;
            String words;
            switch (x){
                case (1):words = " свободное место";
                break;
                case(2):
                case(3):
                case(4):words = " свободных места";
                break;
                case(5):
                case(6):words = " свободных мест";
                break;
                default:words = "  свободных мест";            }
                System.out.println("Команды неполные, есть ещё "+x+words);
        }
        else
            System.out.println("Мест в командах больше нет");
    }
    public Player(){
        if(countPlayers<6)
            countPlayers++;
        stamina = (int)(Math.random()*11+90);
    }
}
