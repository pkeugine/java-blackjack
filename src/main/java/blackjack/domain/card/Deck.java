package blackjack.domain.card;

public class Deck {

    private final CardStack cards;

    private Deck(CardStack cards) {
        this.cards = cards;
    }

    public static Deck create() {
        return new Deck(CardStack.create());
    }

    public Hands giveFirstHand() {
        return new Hands(cards.getTwoCards());
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}
