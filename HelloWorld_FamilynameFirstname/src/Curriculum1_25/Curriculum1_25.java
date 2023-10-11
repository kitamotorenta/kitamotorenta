package Curriculum1_25;

import java.util.Random;
import java.util.Scanner;

public class Curriculum1_25 {

	/*
	
	 名前を入力したら下記がコンソールに出力されるように作ってください
		条件：数値は毎回変わるように作ってください
		 	 サブクラスを使用してください
			 スーパークラスを使用してください
			 getterとsetterを使用してください
			 packageを2つ作ってメインと処理を分けてください
			 命名する場合は規則にのっとってください
			 コンストラクタを使用してください
	
		こんにちは 「 名前 」 さん
		ステータス
		HP：849
		MP：862
		攻撃力：375
		素早さ：937
		防御力：24
	
		さあ冒険に出かけよう！
	
	 */
	// 変数を作成
	String name;
	int hp;
	int mp;
	int attack;
	int speed;
	int def;

	// ランダム変数を作成
	Random r = new Random();
	// スキャナーを作成
	Scanner scan = new Scanner(System.in);

	// HPのセッターを作成
	public void setHp(int hp) {
		this.hp = hp;
	}

	// MPのセッターを作成
	public void setMp(int mp) {
		this.mp = mp;
	}

	// 攻撃力のセッターを作成
	public void setAttack(int attack) {
		this.attack = attack;
	}

	// 素早さのセッターを作成
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// 防御力のセッターを作成
	public void setDef(int def) {
		this.def = def;
	}

	// HPのゲッターを作成
	public int getHp() {
		return hp;
	}

	// MPのゲッターを作成
	public int getMp() {
		return mp;
	}

	// 攻撃力のゲッターを作成
	public int getAttack() {
		return attack;
	}

	// 素早さのゲッターを作成
	public int getSpeed() {
		return speed;
	}

	// 防御力のゲッターを作成
	public int getDef() {
		return def;
	}

	// getnameのゲッターを作成
	public String getName() {
		return name;

	}

	// suteの作成
	public void sute() {

	}

}