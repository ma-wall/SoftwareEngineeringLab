/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author maw136
 */
public class Hand {
    ArrayList<Card> hand = new ArrayList<Card>();
    
    public Hand(Card c1, Card c2, Card c3, Card c4, Card c5){
        hand.add(c1);
        hand.add(c2);
        hand.add(c3);
        hand.add(c4);
        hand.add(c5);
    }
    public Hand(){
        
    }
    
    public void sort(){
        Collections.sort(hand);
    }
       
    public void printAllCards(){
        System.out.println(hand);
    }
}
