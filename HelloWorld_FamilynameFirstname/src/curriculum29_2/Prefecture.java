package curriculum29_2;

public class Prefecture {
	// フィールドを宣言
	String name;
	String capital;
	double area;

	// コンストラクタを定義
	public Prefecture(String name, String capital, double area) {
		// 引数で受け取った変数を、このクラスの変数に代入
		this.name = name;
		this.capital = capital;
		this.area = area;
	}

	// nameを取得するゲッター
	public String getName() {
		// nameを返す
		return name;
	}

	// capitalを取得するゲッター
	public String getCapital() {
		// capitalを返す
		return capital;
	}

	// areaを取得するゲッター
	public double getArea() {
		// areaを返す
		return area;
	}

	// オーバーライド
	@Override
	// オブジェクトの内容を文字列にするメソッド
	public String toString() {
		// 都道府県名、県庁所在地、面積を返す
		return "都道府県名:" + name + "\n県庁所在地:" + capital + "\n面積:" + area + "km2";

	}
}
