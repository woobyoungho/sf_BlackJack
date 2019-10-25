package com.hk.blackjack;

import java.util.Scanner;

public class main {
	// github.com/ParkDoheum
	//'배민 객체지향' 검색
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gm = new Gamer();
		Dealer dl = new Dealer();

		dl.addCard(cd.pick());
		gm.addCard(cd.pick());
		dl.addCard(cd.pick());
		gm.addCard(cd.pick());
		dl.needMoreCard(cd);

		Scanner sc = new Scanner(System.in);

		while (true) {
			gm.openCards();
			System.out.print("카드 더 받는다 (y) : ");
			String answer = sc.next();

			if (answer.equals("y")) {
				gm.addCard(cd.pick());
			} else {
				break;
			}
		}
		sc.close();
		Rule.getWinner(gm, dl);
	}

}
