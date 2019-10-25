package com.hk.blackjack;

public class Gamer {
	protected Card[] myCards = new Card[10];
	// 주소값일 때는 null을 준다.

	// 카드 주소값을 외부로부터 받아서
	// myCards 배열에 저장한다.
	public void addCard(Card card) {
		//(Card card)는 메세지라고 한다.
		for (int i = 0; i < myCards.length; i++) {
			if (myCards[i] == null) {
				myCards[i] = card;
				return;
			}
		}
	}
	
	public void openCards() {
		//내가 작성한 것
		int sum = 0;
		for(int i = 0; i < myCards.length; i++) {
			Card c = myCards[i];
			if(c != null) {
				System.out.println(c);
				sum += myCards[i].value;
			} else {
				System.out.println("sum : " + sum);
				break;
			}
		}
		
		/* 박도흠쌤
		for(Card c : myCards) {
			if(c != null) {
				System.out.println(c);
				sum += c.value;
			}
		}
		System.out.println("sum : " + sum);
		*/
	}
	
}
