package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		//変数宣言と初期化
		int totalnum = 0;
		int num = 1;
		int NumStudents = 0;
		int sumEnglish = 0;
		int sumMath = 0;
		int sumScience = 0;
		int sumSociety = 0;
		double sumSubject;
		double aveSubject;
		double aveEnglish = 0;
		double aveMath = 0;
		double aveScience = 0;
		double aveSociety = 0;

		//人数を入力
		Scanner scan = new Scanner(System.in);
		System.out.println("生徒の人数を入力してください(２以上)");

		//入力した値を変数に代入
		NumStudents = scan.nextInt();
		//変数に各教科代入
		String[] subject = { "英語", "数学", "理科", "社会", };
		//1つの変数に人数と教科を代入
		int[][] studentScore = new int[NumStudents][subject.length];

		do {
			//各教科の点数入力
			for (int i = 0; i < subject.length; i++) {
				System.out.println(num + "人目の「" + subject[i] + "」の点数を入力してください：");

				studentScore[totalnum][i] = scan.nextInt();
			}
			System.out.println();
			//下記の変数＋１
			totalnum++;
			num++;
			  //生徒の人数がnum以上の場合繰り返す
		} while (num <= NumStudents);
		//配列の要素を0に初期化
		totalnum = 0;
		
		//jがnumStudrnt以下の場合繰り返す
		for (int j = 1; j <= NumStudents; j++) {

			//全教科の合計
			sumSubject = studentScore[totalnum][0] + studentScore[totalnum][1] + studentScore[totalnum][2]
					+ studentScore[totalnum][3];

			//各教科の点数
			sumEnglish += studentScore[totalnum][0];

			sumMath += studentScore[totalnum][1];

			sumScience += studentScore[totalnum][2];

			sumSociety += studentScore[totalnum][3];

			//平均点数
			aveSubject = sumSubject / 4.0;
			System.out.println(j + "人目の平均点は" + (String.format("%.2f", aveSubject)) + "点です。");
			//下記の変数＋１
			totalnum++;
		}
		//改行
		System.out.println();
		//全生徒の総合点
		double allSum = sumEnglish + sumMath + sumScience + sumSociety;

		//英語の平均点
		aveEnglish = sumEnglish / (double) NumStudents;

		//数学の平均点
		aveMath = sumMath / (double) NumStudents;

		//理科の平均点
		aveScience = sumScience / (double) NumStudents;

		//社会の平均点
		aveSociety = sumSociety / (double) NumStudents;
		//全体の平均点
		double allAve = allSum / (NumStudents * 4.0);

		//各平均点の出力
		System.out.println("英語の平均点は" + (String.format("%.2f", aveEnglish)) + "点です。");
		System.out.println("数学の平均点は" + (String.format("%.2f", aveMath)) + "点です。");
		System.out.println("理科の平均点は" + (String.format("%.2f", aveScience)) + "点です。");
		System.out.println("社会の平均点は" + (String.format("%.2f", aveSociety)) + "点です。");
		System.out.println("全体の平均点は" + (String.format("%.2f", allAve)) + "点です。");
		scan.close();
	}
	

}
