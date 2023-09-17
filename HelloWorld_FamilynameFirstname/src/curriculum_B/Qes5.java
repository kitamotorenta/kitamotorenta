package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {

		//table変数に二次元配列を使用
		int[][] table = new int[10][21];
		//9回繰り返す
		for (int i = 1; i < 10; i++) {
			//20回繰り返す
			for (int j = 1; j <= 20; j++) {
				//iとjに掛けたものをtable変数を代入
				table[i][j] = i * j;

				//j*i＝tableを表示
				System.out.print(String.format("%03d", j) + "*" + String.format("%03d", i) + "="
						+ String.format("%03d", table[i][j]));
				//jが20未満の場合、||を付ける
				if (j < 20)
					System.out.print("||");
			}
			//自動改行
			System.out.println();
		}
	}

}
