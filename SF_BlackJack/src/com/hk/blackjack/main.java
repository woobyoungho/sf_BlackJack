package com.hk.blackjack;

public class main {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gm = new Gamer();
		
		Card c = cd.pick();
		gm.addCard(c);
		gm.addCard(cd.pick());
		
		gm.openCards();	
		System.out.println("---------");
		cd.showCards();
	}

}
