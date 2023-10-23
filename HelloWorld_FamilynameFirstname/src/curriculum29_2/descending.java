package curriculum29_2;

// ArrayListクラスをインポート
import java.util.ArrayList;
// Collectionsクラスをインポート
import java.util.Collections;
// Listクラスをインポート
import java.util.List;

public class descending {
	// 降順でソートするメソッドの定義
	public static List<Prefecture> sortPrefectures(Prefecture[] prefectures, int[] indices) {
		// 都道府県の情報を格納するリストを追加
		List<Prefecture> sortedPrefectures = new ArrayList<>();
		// indices配列の要素を順番に取り出すループ
		for (int index : indices) {
			// indicesから取り出した番号でprefectures配列から都道府県情報を取得し、sortedPrefectureリストに追加
			sortedPrefectures.add(prefectures[index]);
		}
		// sortedPrefecturesリストを降順でソート
		Collections.sort(sortedPrefectures, (p1, p2) -> p2.getName().compareTo(p1.getName()));
		// sortedPrefecturesを繰り返す
		return sortedPrefectures;
	}

}
