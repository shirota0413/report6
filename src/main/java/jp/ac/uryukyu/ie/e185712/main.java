package jp.ac.uryukyu.ie.e185712;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        String input;
        Card cards = new Card();
        cards.make();
        cards.player_point();
        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.println("hitもしくはstandを入力してください:");
            input = in.nextLine();
            if(input.equals("stand")){
                cards.game(input);
                break;
            }
            cards.game(input);
            cards.player_point();
        }

    }
}
