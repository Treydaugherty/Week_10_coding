package Week05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck1 {
		List<Card1> cards = new ArrayList<Card1>();
		
		Deck1() {
			String[] suits = {"Clubs", "Diamonds","Herts","Spades"};
			String[] numbers = {"Two","Three","Four","Five","Six","Seven",
					"Eight","Nine","Ten","Jack","Queen","King","Ace"};
			
			for (String suit: suits) {
				int count = 2;
				for (String number : numbers) {
					Card1 card = new Card1(number, suit, count);
					this.cards.add(card);
					count++;
				}
			}
		}

		public List<Card1> getCards() {
			return cards;
		}

		public void setCards(List<Card1> cards) {
			this.cards = cards;
		}
		
		public void describe() {
			for (Card1 card : this.cards) {
				card.describe();
			}
		}
		public void shuffle() {
			Collections.shuffle(this.cards);
		}
		
		public Card1 draw() {
			Card1 card = this.cards.remove(0);
			return card;
		}

}
