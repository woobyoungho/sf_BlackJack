package com.hk.blackjack;

public class CardDeck {
	private Card[] cards;
	
	//기본생성자 만들고
	//cards변수에 52개의 Card객체 주소값을
	//저장할 수 있는 배열을 객체화 하세요
	
	public CardDeck() {
		init();
	}
	
	private void init() {
		cards = new Card[52];
		//52개의 카드 생성!
		//배열에 주소값 넣기.
		int oneCardCnt = 13; //한 모양의 카드 갯수
		String[] shapes = {"SPADE", "HEART", "CLOVER", "DIAMOND"};
		
		int idx = 0;
		for(int i = 0; i < shapes.length; i++) { //4
			for(int j = 0; j < oneCardCnt; j++) { //13
				Card c = new Card(shapes[i], j);
				cards[idx++] = c;
			}
		}
		shuffleCards();
		
	}
	
	private void shuffleCards() {
		Card temp = null;
		//만들고자 하는 타입 찾기가 중요
		//항상 타입형을 신경쓰자.
		
		for(int i = 0; i < cards.length; i++) {
			int random = (int)(Math.random() * cards.length);
			//랜덤함수 중요
			//cards.length -> 52 이용
			temp = cards[i];
			cards[i] = cards[random];
			cards[random] = temp;
		}
	}
	
	public void showCards() {
		for(Card c : cards) {
			System.out.println(c);
		}
	}
	
	//카드 주소값 하나를 외부에 준다.
	public Card pick() {
		for (int i = 0; i < cards.length; i++) {
			if (cards[i] != null) {
				Card c = cards[i];
				cards[i] = null;
				return c;
			}
		}
		return null;
	}

}
