package Curriculum1_23;

public class Curriculum1_23_1 {

	public static void main(String[] args) {

		/*
		
		下記がコンソールに出力されるように作成してください
		※thisとsetterとgetterとフィールドを使ってください
		
		動物名：ライオン
		体長：2.1m
		速度：80km/h
		
		*/

		// インスタンスを作成
		Curriculum1_23_2 lion = new Curriculum1_23_2();
		// 名前を設定
		lion.setName("ライオン");
		// 体重を設定
		lion.setWeight(2.1);
		// 速度を設定
		lion.setSpeed(80);

		// 出力
		System.out.println("動物名:" + lion.getName());
		// 出力
		System.out.println("身長:" + lion.getWeight());
		// 出力
		System.out.println("体重:" + lion.getSpeed());
	}

}
