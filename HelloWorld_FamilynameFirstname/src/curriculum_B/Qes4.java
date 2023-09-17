package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {

		//iが10未満になるまで
		for (int i = 01; i < 10; i++) {
			//出力
			System.out.println();

			//jが10未満になるまで
			for (int j = 1; j < 10; j++) {
				//掛け算の値
				int num = i * j;

				if (num < 10)
					//10未満の場合の出力
					System.out.print("0" + i + "*" + "0" + j + "=" + "0" + num + " ");
				else
					//10以上の場合の出力
					System.out.print("0" + i + "*" + "0" + j + "=" + num + " ");

				//9以下に||を付ける
				if (j < 9)
					System.out.print("||");

			}
		}
	}
}