package com.hk.blackjack;

public class Gamer {
	protected Card[] myCards = new Card[10];
	// 주소값일 때는 null을 준다.
	protected int sum = 0;
	//여기에 sum 해줘야 다른 클래스에서 for문에 굳이 안넣어도 된다.
	
	public int getSum() {
		return sum;
	}

	// 카드 주소값을 외부로부터 받아서
	// myCards 배열에 저장한다.
	public void addCard(Card card) {
		//(Card card)는 메세지라고 한다.
		for (int i = 0; i < myCards.length; i++) {
			if (myCards[i] == null) {
				myCards[i] = card;
				sum += card.value;
				// card.value 값을 항상 sum에 넣어준다.
				return;
			}
		}
	}
	
	public void openCards() {
		for(int i = 0; i < myCards.length; i++) {
			Card c = myCards[i];
			if(c != null) {
				System.out.println(c);
			} else {
				System.out.println("sum : " + sum);
				break;
			}
		}
		
		/* 박도흠쌤
		for(Card c : myCards) {
			if(c != null) {
				System.out.println(c);
			}
		}
		System.out.println("sum : " + sum);
		*/
	}
	
}
