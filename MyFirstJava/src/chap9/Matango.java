package chap9;

public class Matango {

	// フィールドの宣言
	int hp;         // 体力
	final int LEVEL = 10;
	char suffix;  // 識別符号

	//逃げるメソッド
	void run(){
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した。");
	}
}
