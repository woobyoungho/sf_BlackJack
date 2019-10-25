package com.hk.blackjack;

public class Rule {
	public static void getWinner(Gamer gm, Dealer dl) {
		// 둘다 21을 넘은 경우 > 비김
		// 지우고 한 번 만들어보자.
		int SCORE = 21;

		int gSum = gm.getSum();
		int dSum = dl.getSum();

		if (gSum > SCORE && dSum > SCORE || gSum == dSum) {
			System.out.println("비김");
		} else {
			if (gSum > SCORE) {
				System.out.println("딜러 이김");
			} else if (dSum > SCORE) {
				System.out.println("게이머 이김");

			} else {
				if (gSum > dSum) {
					System.out.println("게이머 이김");
				} else {
					System.out.println("딜러 이김");
				}
			}
		}
	}
}
