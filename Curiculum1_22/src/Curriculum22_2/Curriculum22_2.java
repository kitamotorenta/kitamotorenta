package Curriculum22_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Curriculum22_2 {
	
	String aisatu;

	String susi;

	String shurui;

	public Curriculum22_2() {

		this.aisatu = "こんにちは！ここは日本です！";

		this.susi = "この寿司はうまい！";

		this.shurui = "寿司は和食です";

		System.out.println(this.aisatu);

		System.out.println(this.susi);

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
