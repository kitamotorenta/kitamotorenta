package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qes1_3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 問1 ログイン時の入力チェックシステムを下記条件で作成してください					

		//プレイヤーネーム入力
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		

		// ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください		

		//10文字以上の場合再度入力
		if (10 < str.length()) {
			System.out.println("名前を10文字以内で入力してください");
			return;
		}

		// ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		//ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力
		if (Objects.isNull(str) || str == "") {
			System.out.println("名前を入力してください");
			return;
		}

		// 問2 ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください	
		//ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
		
		Pattern pattern = Pattern.compile("^[0-9a-zA-Z]+$");
		Matcher matcher = pattern.matcher(str);
		if (matcher.find()) {
			
		}else {
			System.out.println("「半角英数字のみで入力してください」");
			return;
		}
		/*if (str.matches("[^0-9a-zA-Z]+$")) {
			System.out.println("「半角英数字のみで入力してください」");
			return;
		}*/
		// ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください	
		//ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力
		if (10 > str.length()) {
			System.out.println("ユーザー名" + str + "を登録しました");
		}
		// 問3じゃんけんのシステムを下記の条件で作成してください
		// ・「0はグー、1：チョキ、2：パー」とすること					
		// ・じゃんけんに勝つまでループすること					
		// ・一回ごとに自分の手と相手の手を下記の通り出力してください

		// ユーザー名「name」を登録しました		
		// nameの手は「パー」	
		// 相手の手は「グー」

		// ・条件分岐の設定		
		// ・自分がじゃんけんに勝った場合、下記が出力されるようにしてください	
		// やるやん。
		// 次は俺にリベンジさせて

		// ・自分がじゃんけんでグーに負けた場合、下記が出力されるようにしてください						
		// 俺の勝ち！					
		// 負けは次につながるチャンスです！
		// ネバーギブアップ！

		// ・自分がじゃんけんでチョキに負けた場合、下記が出力されるようにしてください						
		// 俺の勝ち！					
		// たかがじゃんけん、そう思ってないですか？	
		// それやったら次も、俺が勝ちますよ		

		// ・自分がじゃんけんでパーに負けた場合、下記が出力されるようにしてください						
		// 俺の勝ち！					
		// なんで負けたか、明日まで考えといてください。		
		// そしたら何かが見えてくるはずです	

		// ・あいこの場合、下記が出力されるようにしてください				
		// DRAW あいこ もう一回しましょう！

		// じゃんけんを行った回数を表示してください.
		// 勝つまでにかかった合計回数は1回です

		/*
		 * 名前入力チェック＆登録
		 */

		//(トライ回数)
		//（変数）挑戦した回数

		//自分が選んだじゃんけんの手
		int myselect = 0;
		//敵の選んだじゃんけんの手
		int enemyselect = 0;
		//挑戦した回数
		int trycnt = 1;
		//勝った時の判定
		boolean winflag = false;

		//winflagがtrueになるまで繰り返し処理
		while (winflag == false) {

			
			//自分の手を入力
			//Scanner mysele_scan = new Scanner(System.in);
			//選択したmysele_scanをmyseleに代入
			int mysele = scan.nextInt();
			
			//myseleを表示
			System.out.println(mysele);
			//myselectにmyseleに代入
			myselect = mysele;

			//ランダム変数rを指定
			Random r = new Random();
			//変数rをrandに代入
			int rand = r.nextInt(3);
			//randをenemyselectに代入
			enemyselect = rand;
			//myselectが0の場合、グー
			if (myselect == 0) {
				System.out.println(str + "の手は「グー」");
			}
			//myselectが１の場合、チョキ
			if (myselect == 1) {
				System.out.println(str + "の手は「チョキ」");
			}
			//myselectが2の場合、パー
			if (myselect == 2) {
				System.out.println(str + "の手は「パー」");
			}
			//enemyselectが0の場合、相手の手はグー
			if (enemyselect == 0) {
				System.out.println("相手の手は「グー」");
			}
			//enemyselectが１の場合、相手の手はチョキ
			if (enemyselect == 1) {
				System.out.println("相手の手は「チョキ」");
			}
			//enemyselectが２の場合、相手の手はパー
			if (enemyselect == 2) {
				System.out.println("相手の手は「パー」");
			}

			//あいこの場合の処理
			if (myselect == enemyselect) {
				System.out.println("「DRAWあいこ もう一回しましょう！」");
			}
			//勝った場合の処理
			if (myselect == 0 && enemyselect == 1) {
				System.out.println("「やるやん。次は俺にリベンジさせて」");
				//winflagをtrueにする処理
				winflag = true;

			}
			//負けた場合の処理
			if (myselect == 0 && enemyselect == 2) {
				System.out.println("「俺の勝ち、なんで負けたか、明日までに考えといてください。\r\nそしたら何かが見えてくるはずです」");
			}
			//負けた場合の処理
			if (myselect == 1 && enemyselect == 0) {
				System.out.println("「俺の勝ち、なんで負けたか、明日までに考えといてください。\r\nそしたら何かが見えてくるはずです」");
			}
			//勝った場合の処理
			if (myselect == 1 && enemyselect == 2) {
				System.out.println("「やるやん。次は俺にリベンジさせて」");
				//winflagをtrueにする処理
				winflag = true;
			}
			//勝った場合の処理
			if (myselect == 2 && enemyselect == 0) {
				System.out.println("「やるやん。次は俺にリベンジさせて」");
				//winflagをtrueにする処理
				winflag = true;
			}
			//負けた場合の処理
			if (myselect == 2 && enemyselect == 1) {
				System.out.println("「俺の勝ち、なんで負けたか、明日までに考えといてください。そしたら何かが見えてくるはずです」");
			}
			//winflagがtrueになったら勝つまでのtry回数を表示
			if (winflag == true) {
				System.out.println("勝つまでにかかった合計回数は" + trycnt + "回です。");
				scan.close();
			} else {
				//winfalgがfalseならtrycntに＋１する
				trycnt = trycnt + 1;
			}
		}
		
	}
}
