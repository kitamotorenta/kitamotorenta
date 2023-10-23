package curriculum29_1;

// scannerクラスをインポート
import java.util.Scanner;

// curriculum29_2.Prefectureクラスをインポート
import curriculum29_2.Prefecture;
// curriculum29_2.ascendingクラスをインポート
import curriculum29_2.ascending;
// curriculum29_2.descendingクラスをインポート
import curriculum29_2.descending;

public class curriculum29_1_1 {

	public static void main(String[] args) {
		// 都道府県の配列の作成
		Prefecture[] prefectures = {
				// 各都道府県の情報を配列に格納
				new Prefecture("北海道", "札幌市", 83424),
				new Prefecture("青森県", "青森市", 9646),
				new Prefecture("岩手県", "盛岡市", 15275),
				new Prefecture("宮城県", "仙台市", 7282),
				new Prefecture("秋田県", "秋田市", 11638),
				new Prefecture("山形県", "山形市", 9323),
				new Prefecture("福島県", "福島市", 13784),
				new Prefecture("茨城県", "水戸市", 6097),
				new Prefecture("栃木県", "宇都宮市", 6408),
				new Prefecture("群馬県", "前橋市", 6362),
				new Prefecture("埼玉県", "さいたま市", 3798)
		};
		// 入力を受け取る
		Scanner scan = new Scanner(System.in);
		// 都道府県の番号:と出力
		System.out.println("都道府県の番号:");

		// 入力された文字列をinputに格納
		String input = scan.nextLine();
		// 入力された文字列をカンマで区切り、indexStrings配列に格納
		String[] indexStrings = input.split(",");
		// 都道府県番号を格納する配列を格納
		int[] indices = new int[indexStrings.length];
		// indexStrings配列をループ
		for (int i = 0; i < indexStrings.length; i++) {
			// 文字列から整数に変換し、indices配列に格納
			indices[i] = Integer.parseInt(indexStrings[i].trim());
		}
		// 昇順 or 降順:を出力
		System.out.println("昇順 or 降順:");
		// ユーザーが入力した選択を読み取り、sortOrderInput変数に格納
		String sortOrderInput = scan.nextLine();
		// ユーザーの入力をisAscendingSort変数に格納
		boolean isAscendingSort = sortOrderInput.equalsIgnoreCase("昇順");
		// isAscendingSortがtrueなら
		if (isAscendingSort) {
			// ascending.sortPrefecturesメソッドで都道府県情報を昇順でソートした結果を取得
			for (Prefecture prefecture : ascending.sortPrefectures(prefectures, indices)) {
				// 都道府県情報を出力
				System.out.println(prefecture);
				// 改行
				System.out.println();
			}
			// falseなら
		} else {
			// descending.sortPrefecturesメソッドで都道府県情報を昇順でソートした結果を取得
			for (Prefecture prefecture : descending.sortPrefectures(prefectures, indices)) {
				// 都道府県情報を出力
				System.out.println(prefecture);
				// 改行
				System.out.println();
			}
		}
		// scanクラスを閉じる
		scan.close();
	}
}
