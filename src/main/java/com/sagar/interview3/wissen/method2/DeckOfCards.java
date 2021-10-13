package com.sagar.interview3.wissen.method2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

enum Suit {
    HEARTS, SPADES, CLUBS, DIAMONDS;
}

enum Rank {
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    JACK(11), QUEEN(12), KING(13), ACE(14);

    private final int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank.name() + " of " + suit.name();
    }
}

class Deck {
    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void sortDeck() {
        cards.sort(Comparator.comparing(Card::getSuit).thenComparing(Card::getRank, Comparator.comparingInt(Rank::getValue)));
    }

    public void printDeck() {
        cards.forEach(System.out::println);
    }

    public List<Card> getCards() {
        return cards;
    }
}

public class DeckOfCards {

    public static Card compareCards(Card card1, Card card2) {
        if (card1.getRank().getValue() > card2.getRank().getValue()) {
            return card1;
        } else if (card1.getRank().getValue() < card2.getRank().getValue()) {
            return card2;
        } else {
            return null; // They are equal in rank
        }
    }

    public static void main(String[] args) {
        // Creating a deck and shuffling it
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println("Shuffled deck:");
        deck.printDeck();

        // Sorting the deck
        deck.sortDeck();
        System.out.println("\nSorted deck:");
        deck.printDeck();

        // Comparing two cards
        Card card1 = new Card(Suit.HEARTS, Rank.ACE);
        Card card2 = new Card(Suit.SPADES, Rank.KING);
        System.out.println("\nComparing two cards:");
        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        Card biggerCard = compareCards(card1, card2);
        if (biggerCard != null) {
            System.out.println("Bigger card: " + biggerCard);
        } else {
            System.out.println("The cards are equal in rank.");
        }
    }
}
