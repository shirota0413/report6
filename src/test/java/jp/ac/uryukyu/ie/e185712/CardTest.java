package jp.ac.uryukyu.ie.e185712;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    public void play() {
        String input = "hit";
        Card cards = new Card();
        cards.make();
        cards.player_point();
        while (true) {
            if (cards.sum > 21) {
                System.out.println("完了");
                break;
            }
            cards.game(input);
            cards.player_point();
        }
    }
}