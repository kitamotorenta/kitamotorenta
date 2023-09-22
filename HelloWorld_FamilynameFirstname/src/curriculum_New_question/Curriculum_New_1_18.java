package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {

	public static void main(String[] args) {

		// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

		// メソッド名Ｑ1に「Hello JavaSE 11」を渡す
		Q1("Hello JavaSE", 11);

		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

		// メソッド名Q2に引数に５、３を渡す
		Q2(5, 3);

		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

		// Q3の配列を作る
		int[] Q3 = { 7, 8, 6 };
		// メソッド名q3に引数に配列を渡す
		q3(Q3);

		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

		// Q2の引数に渡す
		Q2(1.5, 2.5);

		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。

		// 配列を作る
		int[] num = random(4);
		// 配列の要素をnumberに代入していく
		for (int number : num) {
			// 出力
			System.out.println(number);
		}
		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。

		// メソッドの戻り値を代入
		double avg = result(num);
		// 出力
		System.out.println(avg);

		// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

		// メソッドの戻り値を代入
		boolean num50 = Over50(avg);
		// 出力
		System.out.println(num50);
	}

	// Q1の引数としてmojiとsuujiを受け取る
	public static void Q1(String moji, int suuji) {
		// 出力
		System.out.println(moji + "" + suuji);
	}

	// Q2の5と3を受け取る
	public static void Q2(int i, int j) {
		// 掛け算
		int result = i * j;
		// 出力
		System.out.println(result);
	}

	// q3の配列を受け取る
	public static void q3(int[] Q3) {
		// aが配列数より少ない時1を足していく
		for (int a = 0; a < Q3.length; a++) {
			// 出力
			System.out.println(Q3[a]);
		}
	}

	// double型として受け取る
	public static void Q2(double d, double e) {
		// 足し算
		double result = d + e;
		// 出力
		System.out.println(result);
	}

	// Q5のメソッドの宣言
	public static int[] random(int rand) {
		// ランダムクラス作成
		Random r = new Random();
		// randのint型の配列を作成
		int[] num = new int[rand];
		// randの回数繰り返す
		for (int i = 0; i < rand; i++) {
			// 1-100までのランダムな整数を得る
			int number = r.nextInt(100) + 1;
			// numのi番目の要素に、変数numberの値を代入
			num[i] = number;
		}
		// 戻り値としてnumを返す
		return num;
	}

	// Q6メソッドの宣言
	public static double result(int[] num) {
		// 初期値を0
		int sum = 0;
		// numの各要素に対して繰り返し処理を行う
		for (int number : num) {
			// sumとnumberの値を加算
			sum += number;
		}
		// 結果を戻り値として返す
		return (double) sum / num.length;
	}

	// メソッドの定義
	public static boolean Over50(double avg) {
		// 50以上の場合true
		return avg >= 50;
	}

}
