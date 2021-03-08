package blackjack.domain.gamer;

import blackjack.domain.card.Card;
import blackjack.domain.card.Hands;
import java.util.List;

public abstract class Gamer {

    protected final Hands hands;
    private final String name;

    protected Gamer(String name, Hands hands) {
        this.name = name;
        this.hands = hands;
    }

    public abstract List<Card> showOpenHands();

    public List<Card> showHands() {
        return hands.toList();
    }

    public String getName() {
        return name;
    }

    public boolean containsAce() {
        return hands.containsAce();
    }

    public int getPoint() {
        return hands.calculate();
    }

    public boolean hasBlackjack() {
        return hands.isBlackjack();
    }

    public void receiveCard(Card card) {
        hands.addCard(card);
    }
}
