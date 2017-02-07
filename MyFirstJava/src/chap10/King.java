package chap10;

// 王さんクラス

public class King {

	// 王さんがしゃべる
	void talk(Hero h) {
		System.out.println("王様：ようこそ我が国へ、勇者" + h.getName() + "よ。");
		System.out.println("王様：長旅疲れたであろう、そこで横になって休むがよい");
		System.out.println("王様：まずは城下町を見てくるとよい。ではまた会おう。");
		h.bye(); // ここが不具合の原因。bye()の間違い。勇者がおっちぬ！
	}

}
