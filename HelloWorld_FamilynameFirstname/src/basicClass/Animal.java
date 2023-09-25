package basicClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// Dogクラスのインスタンスを作成
		Dog dog = new Dog("犬");
		// メソッドを呼び出す
		dog.dogName();

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// Dogクラスのインスタンスを作成
		Dog dogs = new Dog(3);
		// メソッドを作成
		dogs.dogNum();

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// カレンダーオブジェクトを生成
		Calendar cl = Calendar.getInstance();
		// SimpleDateFormatクラスでフォーマットパターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		// 出力
		System.out.println(sdf.format(cl.getTime()));

	}

}
