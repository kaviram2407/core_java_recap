package collections;

import java.util.Scanner;
import java.util.TreeSet;

class Card implements Comparable<Card>{
    private String symbol;
    private String number;
    public Card(String symbol,String number)
    {
        this.symbol=symbol;
        this.number=number;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card otherCard) {
        int symbolComparison = symbol.compareTo(otherCard.getSymbol());
        if (symbolComparison != 0) {
            return symbolComparison;
        }
        return number.compareTo(otherCard.getNumber());
    }

    @Override
    public String toString() {
        return symbol + number;
    }
}
public class cardsproblem {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        TreeSet<Card> deck=new TreeSet<>();
        while(deck.size()<4){
            String a= sc.next();
            String n= sc.next();
            sc.nextLine();
            c++;
            deck.add(new Card(a,n));
        }
        System.out.println("total cards :"+c);
        for(Card card:deck)
        {
            System.out.println(card);
        }
    }
}
