package Curriculum22_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Curriculum22_2 {
	
	// 変数を作成
	String aisatu;
	// 変数を作成
	String susi;
	// 変数を作成
	String shurui;

	// コンストラクターを定義
	public Curriculum22_2() {
		// 初期値の設定
		this.aisatu = "こんにちは！ここは日本です！";
		// 初期値の設定
		this.susi = "この寿司はうまい！";
		// 初期値の設定
		this.shurui = "寿司は和食です";
		// 出力
		System.out.println(this.aisatu);
		// 出力
		System.out.println(this.susi);
		// 出力
		System.out.println(this.shurui);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// カレンダーオブジェクトを生成
		Calendar cl = Calendar.getInstance();
		// SimpleDateFormatクラスでフォーマットパターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		// 出力
		System.out.println(sdf.format(cl.getTime()));
	}

}
