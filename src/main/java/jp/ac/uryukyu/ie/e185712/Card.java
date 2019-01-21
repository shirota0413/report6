package jp.ac.uryukyu.ie.e185712;

import java.util.ArrayList;
import java.util.Collections;

public class Card {
    String ka ;
    String[] suit = {"♡","♤","♢","♧"};
    ArrayList<Integer> cards = new ArrayList<>();
    ArrayList<Integer> player_hand = new ArrayList<>() ;

    /**トランプを作る。♡:1~13,♤:14~26,♢:27~39,♧40~52とする
     * cardsに(1~52)の数字を入れる。
     * トランプをシャッフルする.
     * トランプを配る。
     * suitは,cardsのgetした値を13で割ることでマークを割り当てている。player_handに配ったカードを入れる。
    */

    public void make(){
        for(int i = 1; i <= 52; i++){
            cards.add(i-1,i-1);
        }

        Collections.shuffle(cards);

        for (int l = 1;l <=2; l++){
            ka = suit[cards.get(l-1) / 13];
            player_hand.add(l-1,cards.get(l-1)%13+1) ;
            System.out.println(ka + player_hand.get(l-1));
        }
    }
}