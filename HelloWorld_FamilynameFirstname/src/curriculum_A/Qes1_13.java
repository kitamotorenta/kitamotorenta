package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {

		// 問1
		// バイト型
		byte b;
		// 短整数型
		short s;
		// 整数型
		int i;
		// 長整数型
		long l;
		// 単精度浮動小数点数型
		float f;
		// 倍精度浮動小数点数型	
		double d;
		// 文字型
		char c;
		// 文字列型
		String str;
		// ブーリアン型
		boolean bo;
		// 問2それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		// バイト型
		b = 0;
		// 短整数型
		s = 0;
		// 整数型
		i = 0;
		// 長整数型
		l = 0L;
		// 単精度浮動小数点数型
		f = 0.0f;
		// 倍精度浮動小数点数型	
		d = 0.0d;
		// 文字型
		c = '\u0000';
		// 文字列型
		str = null;
		// ブーリアン型
		bo = false;

		// 問3
		// バイト型
		b = 10;
		// 短整数型
		s = 100;
		// 整数型
		i = 1000;
		// 長整数型
		l = 10000;
		// 単精度浮動小数点数型
		f = 9.5f;
		// 倍精度浮動小数点数型	
		d = 10.5d;
		// 文字型
		c = 'a';
		// 文字列型
		str = "ハロー";
		// ブーリアン型
		bo = true;

		// 問4　下記の通りにコンソールに出力されるようにしてください
		System.out.println(b + s + i + l);
		System.out.println(b + b);
		System.out.println(c + " " + str + " " + bo);
		System.out.println(b + s + i + l + f + d);
		System.out.println(b * s * i * l);
		System.out.println(d / s);
		System.out.println(b - s);

		// 問5　「ハローjava43」と表示させたいのですが、意図通りに動きません。正しく動作するように修正してください
		// バイト型に変数を代入する
		byte num = 20;
		// int型に変数を代入する
		int num1 = 23;

		// コンソールに出力
		System.out.println("\r\n");
		System.out.println("問5");
		System.out.println("ハローjava" + (num + num1));

		// 文字型の変数に初期値を代入し初期化する
		String name = null;
		// int型の変数に初期値を代入し初期化する
		int old = 0;
		// 単精度浮動小数点数型の変数に初期値を代入し初期化する
		float height = 0.0f;
		// 倍精度浮動小数点数型の変数に初期値を代入し初期化する
		double weight = 0.0d;
		// 文字列型の変数に初期値を代入し初期化する
		String favorite = null;

		// 変数に代入
		name = "山田太郎";
		// 変数に代入
		old = 18;
		// 変数に代入
		height = 170.5f;
		// 変数に代入
		weight = 62.2d;
		// 変数に代入
		favorite = "寿司";

		// コンソールに出力
		System.out.println("\r\n");
		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + old + "歳です」");
		System.out.println("「身長は" + height + "cmです」");
		System.out.println("「体重は" + weight + "kgです」");
		System.out.println("「好きな食べ物は" + favorite + "です」");

		// 問７ 問6で作成した自己紹介に続いてBMIが出力されるようにしてください
		String bmi = String.format("%.1f", weight / ((height / 100) * (height / 100)));
		System.out.println("「BMIは" + bmi + "です」");

		// 問８ 宣言した変数に再代入し下記の通りにコンソールに出力してください
		// 変数に代入
		name = "鈴木一郎";
		// 変数に代入
		old = 24;
		// 変数に代入
		height = 168.5f;
		// 変数に代入
		weight = 64.2d;
		// 変数に代入
		favorite = "オムライス";
		// 変数に代入
		bmi = String.format("%.1f", weight / ((height / 100) * (height / 100)));

		// コンソールに出力
		System.out.println("\r\n");
		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + old + "歳です」");
		System.out.println("「身長は" + height + "cmです」");
		System.out.println("「体重は" + weight + "kgです」");
		System.out.println("「好きな食べ物は" + favorite + "です」");
		System.out.println("「BMIは" + bmi + "です」");

		// 問9 ８で使用した変数を【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください

		// 変数に代入
		String bmith = String.format("%.2f", weight / ((height / 100) * (height / 100)) / 2);
		// 年齢を和算で自己代入
		old += 24;
		//　身長を和算で自己代入
		height += 168.5;
		// 体重を和算で自己代入
		weight += 64.2;
		// コンソールに出力
		System.out.println("\r\n");
		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + (old) + "歳です」");
		System.out.println("「身長は" + (height) + "cmです」");
		System.out.println("「体重は" + (weight) + "kgです」");
		System.out.println("「好きな食べ物は" + favorite + "です」");
		System.out.println("「BMIは" + bmith + "です」");

		// 問10 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません

		// 問８で使用した年齢に直す
		old = 24;
		// 問８で使用した身長に直す
		height = 168.5f;
		// 問８で使用した年齢に直す
		weight = 64.2d;
		// 年齢が25歳以上ならtrueが出力されるようにする
		boolean terms = true;
		terms = old >= 25;
		// コンソールに出力する処理
		System.out.println("\r\n");
		System.out.println(terms);

		// 問11 問8で使用した【年齢・身長・体重】を文字列型に型変換し出力してください
		// 過去の年齢
		String oldst = Integer.toString(old);
		// 過去の身長
		String heightst = Float.toString(height);
		// 過去の体重
		String weightst = Double.toString(weight);

		// コンソールに出力
		System.out.println("\r\n");
		System.out.println(oldst + heightst + weightst);

		// 問12　問11で変換した【年齢・身長】を整数型に変換して出力してください
		// 文字列型から整数型に変換
		int oldint = Integer.parseInt(oldst);
		// 文字列型から整数型に変換
		int heightint = (int) Double.parseDouble(heightst);

		// コンソールに出力
		System.out.println("\r\n");
		System.out.println(oldint + heightint);

		// 問13　問12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください

		boolean over = (oldint == 25) || (heightint >= 160);

		// コンソールに出力
		System.out.println("\r\n");
		System.out.println((over) + "\n");

	}
}
