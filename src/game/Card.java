/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author maw136
 */
public class Card implements Comparable<Card>{
    private int faceValue;
    private int suit;
    private String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    private String[] values = {"Ace","2","3","4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King"};
    
    public Card(int faceValue, int suit){
        this.faceValue = faceValue;
        this.suit = suit;
    }
    
    public String getSuit(){
        return suits[this.suit];
    }
    public int getSuitValue(){
        return suit;
    }
    public String getFaceValue(){
        return values[this.faceValue];
    }
    
    public int getIntFaceValue(){
        return faceValue;
    }
    
    public String getImage(){
        return values[this.faceValue] + suits[this.suit] + ".png";
    }
    
    public String toString(){
        return "" + values[this.faceValue] + " of " + suits[this.suit] + "\n";
    }
    
    @Override
        public int compareTo(Card compareCard){
            int compareSuit = ((Card)compareCard).getSuitValue();
            int compareValue = ((Card)compareCard).getIntFaceValue();
            if(this.suit == compareSuit)
                return this.faceValue-compareValue;
            else 
                return this.suit - compareSuit;
        }
}
