package Curriculum1_25;

public class Curriculum1_25_1 extends Curriculum1_25 {

	// オーバーライドでgetnameを書き換える
	public String getName() {
		System.out.println("名前を入力してください");
		name = scan.nextLine();
		System.out.println("こんにちは「" + name + "」さん");
		System.out.println("ステータス");
		scan.close();
		return name;
	}

	// 新しく作る
	public void sute() {
		// for文で全ての要素を一回ずつ出力する
		for (int i = 0; i < 5; i++) {
			// 1000までのランダムな数字を入れプログラムを作る
			int suuji = r.nextInt(1000);
			// switch文でHP,MP,攻撃力,素早さ,防御力の5つそれぞれにi=0,1,2,3,4,を割りふる
			switch (i) {
			// i=0の時
			case 0:
				// HPのセッターの値をsuujiにする
				setHp(suuji);
				// 出力
				System.out.println("HP:" + getHp());
				break;
			// i=1の時
			case 1:
				// MPセッターの値をsuujiにする
				setMp(suuji);
				// 出力
				System.out.println("MP:" + getMp());
				break;
			// i=2の時
			case 2:
				// 攻撃力のセッターの値をsuujiにする
				setAttack(suuji);
				// 出力
				System.out.println("攻撃力:" + getAttack());
				break;
			// i=3の時
			case 3:
				// 素早さのセッターの値をsuujiにする
				setSpeed(suuji);
				// 出力
				System.out.println("素早さ:" + getSpeed());
				break;
			// i=4の時
			case 4:
				// 防御力のセッターの値をsuujiにする
				setDef(suuji);
				// 出力
				System.out.println("防御力:" + getDef());
				break;
			}
		}
		// 出力
		System.out.println("さあ冒険に出かけよう！");
	}
}
