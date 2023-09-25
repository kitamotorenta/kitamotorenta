package basicClass;

public class Dog {

	// Q1：フィールドに動物の名前の変数を定義してください。
	// 動物の名前の変数を定義
	String name;

	// Q2：フィールドに動物の数の変数を定義してください。
	// 動物の数の変数を定義
	int num;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// コンストラクタを作成
	public Dog(String d) {
		// dをnamenに代入
		name = d;
	}
	// メソッド名
	public void dogName() {
		// 出力
		System.out.println(name);
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	// コンストラクタを作成
	public Dog(int n) {
		// nをnumに代入
		num = n;
	}
	// メソッド名
	public void dogNum() {
		// 出力
		System.out.println(num);
	}

}
