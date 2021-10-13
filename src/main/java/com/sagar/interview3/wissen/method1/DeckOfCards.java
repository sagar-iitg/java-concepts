package com.sagar.interview3.wissen.method1;


/*
*
* You have to design a solution (classes, interfaces, etc etc)
for DeckofCards. Each card has a suit (heart, spade, club, diamond)

and a rank (ace, king, queen jack, 10, 9, 8, 7, 6, 5, 4, 3, 2).

Problem 1 Write a function to Compare two cards and return bigger one.
Suit doesnt matter.

Problem 2 You are given a shuffled deck of cards.
You have to sort them (by suit and then by rank)
* */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

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

    public void customShuffle() {
        Random rand = new Random();
        for (int i = cards.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    public void sortDeck(Comparator<Card> comparator) {
        cards.sort(comparator);
    }

    public void printDeck() {
        cards.forEach(System.out::println);
    }

    public List<Card> getCards() {
        return cards;
    }
}

public class DeckOfCards {

    public static void main(String[] args) {
        // Creating a deck and shuffling it
        Deck deck = new Deck();
        deck.customShuffle();
        System.out.println("Shuffled deck:");
        deck.printDeck();

        // Sorting the deck by rank and then by suit
        Comparator<Card> cardComparator = Comparator
            .comparing(Card::getSuit)
            .thenComparing(Comparator.comparing(Card::getRank).reversed());
        deck.sortDeck(cardComparator);
        System.out.println("\nSorted deck:");
        deck.printDeck();
    }
}
