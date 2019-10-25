package com.hk.blackjack;

public class Dealer extends Gamer{
	
	//내가 가진 카드의 합계가 16점 이하면
	//카드덱에게 카드한장을 빼와서
	//나의 카드 배열에 넣는다.
	public void needMoreCard(CardDeck cd) {
		if(sum <= 16) {
			addCard(cd.pick());
		}
	}
}
