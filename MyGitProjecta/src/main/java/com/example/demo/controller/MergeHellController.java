package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
		kadaiC();
	}

	private static void kadaiA() {
		int loopCount = 10;
		for (int i = 1; i <= loopCount; i++) {
			System.out.println("現在" + i + "回目のループです");
		}
	}

	static void kadaiB() {
		Random rand = new Random();
		int num = rand.nextInt(101) + 1;
		System.out.println(num);
	}

	private static void kadaiC() {
		int a = 50;
		int b = 70;
		int c = (a + b);
		System.out.print(c);
	}
}