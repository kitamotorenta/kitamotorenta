package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		//入力変数宣言
		Scanner scan = new Scanner(System.in);
		//dateに入力変数を代入
		String date = scan.nextLine();
		//区切るための文字列を指定
		String kaden[] = date.split("、");
		//ランダム変数rにランダムな数字を代入
		Random r = new Random();

		//for_Eachを使用
		for (String Kaden : kaden) {
			//flagを初期化
			boolean flag = false;

			//変数rを代入
			int nokoriKaden = r.nextInt(11);
			//swich文を使用
			//各カテゴリのcaseを作成
			switch (Kaden) {

			case "パソコン":
				System.out.println("パソコンの残り台数は" + nokoriKaden + "台です");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + nokoriKaden + "台です");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + nokoriKaden + "台です");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + nokoriKaden + "台です");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + nokoriKaden + "台です");
				break;
			case "テレビ":
				flag = true;
			case "ディスプレイ":
				System.out.println((flag) ? "テレビの残り台数は" + nokoriKaden + "台です"
						: "ディスプレイの残り台数は" + (11 - nokoriKaden) + "台です");
				break;
			default:
				System.out.println("『受け取った値』" + "は指定の商品ではありません");
				break;
			}
		}
		scan.close();
	}

}
