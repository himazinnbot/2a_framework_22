package com.example.demo.controller;

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

	//void kadai〇(){
	//ここに課題を書く。メソッド名変えてね。
	//}
	private static void kadaiC() {
		// TODO 自動生成されたメソッド・スタブ
		int a = 50;
		int b = 70;
		int c = (a + b);

		System.out.print(c);
	}
}