package curriculum27;

public class Curriculum27_1 {

	public void Curriculum27_2(String zatugaku) {

		// 入力された文字列をコンマで分割してanimals配列に格納
		String[] animals = zatugaku.split(",");
		// animals配列のループ
		for (String animal : animals) {
			// ダブルコロンで分割しanimalInfに格納
			String[] animalInf = animal.split(":");

			// 名前を格納
			String name = animalInf[0];
			// 体長を格納
			String length = animalInf[1] + "m";
			// 速度を格納
			String speed = animalInf[2] + "km/h";
			// ゲッターで学名を取得
			String gakusha = getGakusha(name);

			// 値がnullでなければ
			if (name != null && length != null && speed != null && gakusha != null) {
				// 出力
				System.out.println("動物園:" + name);
				System.out.println("身長:" + length);
				System.out.println("速度:" + speed);
				System.out.println("学者:" + gakusha);
				System.out.println();
			}

		}
	}

	private String getGakusha(String name) {
		// nameが
		switch (name) {
		// ライオンなら
		case "ライオン":
			// パンテラ レオを返す
			return "パンテラ レオ";
		// ゾウなら
		case "ゾウ":
			// ロキソドンタ・サイクロティスを返す
			return "ロキソドンタ・サイクロティス";
		// パンダなら
		case "パンダ":
			// アイルロポダ・メラノレウカを返す
			return "アイルロポダ・メラノレウカ";
		// チンパンジーなら
		case "チンパンジー":
			// パン・トゥログロディテスを返す
			return "パン・トゥログロディテス";
		// シマウマなら
		case "シマウマ":
			// チャップマンシマウマを返す
			return "チャップマンシマウマ";
		// インコなら
		case "インコ":
			// 不明を返す
			return "不明";
		// どれでもなければ
		default:
			// nullを返す
			return null;
		}

	}

}
