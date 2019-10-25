package com.hk.blackjack;

public class Card {
	public final String shape; //"스페이드"
	public final String mark; //"A", "K", "Q", "J"
	public final int value; //정수값
	
	public Card(String shape, int value) {
		//생성자
		this.shape = shape;
		this.mark = getMark(value);
		this.value = getValue(value);
	}
	
	//0 > "A"
	//1 > "2"
	//2 > "3"
	//....
	//10 > "J"
	//11 > "Q"
	//12 > "K"
	private String getMark(int value) {
		switch(value) {
		case 0:
			return "A";
		case 10:
			return "J";
		case 11:
			return "Q";
		case 12:
			return "K";
		default : //1 ~ 9
			return Integer.toString(value+1);
		}
	}
	
	//0 > 1
	//1 > 2
	//....
	//9 > 10
	//10 > 10
	//11 > 10
	//12 > 10
	private int getValue(int value) {
		/*
		if(value > 9) {
			return 10;
		} else {
			return value +1;
		}
		*/
		switch(value) {
		case 10: case 11: case 12:
			return 10;
		default:
			return value+1;
		}
	}
	
	//오버라이딩 중요!!
	@Override
	public String toString() {
		return String.format("%s - %s - %d", shape, mark, value);
	}
	
}
