package jp.ac.uryukyu.ie.e185712;

import java.util.ArrayList;
import java.util.Collections;

public class Card {
    String ka ;
    int count = 0;
    int sum = 0;
    int num;
    String[] suit = {"♡","♤","♢","♧"};
    ArrayList<Integer> cards = new ArrayList<>();
    ArrayList<Integer> player_hand = new ArrayList<>() ;
    ArrayList<Integer> points = new ArrayList<>();

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
    public void player_point(){
        /**点数を求める。
         *plaeyer_handの値をgetして、それをpointsに入れる.
         * pointsの値をsumに足して点数を求める
         */
        for(int h = 0 ; h  < player_hand.size(); h++){
            if(player_hand.get(count) ==  1){
                points.add(count,11);
                count++;
            }
            else if(player_hand.get(count) >= 10 ){
                points.add(count,10);
                count++;
            }
            else{
                points.add(count,player_hand.get(count));
                count ++;
            }
        }
        count = 0;

        for(int g  = 0 ; g <=player_hand.size()-1 ; g++) {
            sum += points.get(g);
        }
        System.out.println("あなたの現在の点数は"+ sum + "です");
    }

    /**
     * hitならトランプを追加し、standなら点数を表示し終了。
     * @param input
     */
    public void game(String input){
        if(input.equals("hit")) {
            num = player_hand.size();
            sum = 0;
            for (int s = 0; s <= num ;s++) {
                ka = suit[cards.get(s) / 13];
                System.out.println(ka + (cards.get(s)%13+1));
                if(num == s){
                    player_hand.add(cards.get(s)%13+1);
                }
            }
        }
        else if (input.equals("stand")){
            System.out.println("あなたの得点は" + sum + "です");
        }
    }
}