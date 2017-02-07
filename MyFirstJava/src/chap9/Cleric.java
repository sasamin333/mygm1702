package chap9;

// 聖職者クラス

import java.util.Random;

public class Cleric {

	// フィールド
	String name; // 聖職者の名前
	int hp = 50; // 聖職者の体力
	static final int MAX_HP = 50; // 聖職者最大体力
	int mp = 10; // 聖職者の魔法力
	static final int MAX_MP = 10; // 聖職者の最大魔法力

	// コンストラクタＡ
	// 引数 名前name 体力hp 魔力mp
	// 名前 体力 魔力を設定
	public Cleric(String name, int hp, int mp) {
		// this(name,hp,mp);
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	// コンストラクタＢ
	// 引数 名前name 体力hp
	// 名前 体力 魔力を最大に設定
	public Cleric(String name, int hp) {
		this(name, hp, Cleric.MAX_MP);
	}

	// コンストラクタＣ
	// 引数 名前name
	// 名前 を設定
	public Cleric(String name) {
		this(name, Cleric.MAX_MP);
	}

	// 魔法の呪文メソッド(聖職者の体力が最大に戻る)
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.hp = this.MAX_HP;
		this.mp -= 5;
		System.out.println("体力HPが最大(50)まで回復した。");
	}

	// お祈りメソッド(聖職者の魔法力が recoverActual 分だけ回復する)
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");

		// 論理上の回復量を乱数を用いて決定する
		int recover = new Random().nextInt(3) + sec;
		System.out.println("recover" + recover);

		// 実際の回復量を計算する
		// 聖職者の最大魔法力から今現在の魔法力を引いた値と乱数から導いた値を比べて
		// どちらか小さい方を回復量とする(回復量が最大魔法力を超えることはない)
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

		this.mp += recoverActual;
		System.out.println("魔法力MPが" + recoverActual + "回復した。：現在の魔法力MP = " + mp + "   現在の体力HP = " + hp);
		return recoverActual;
	}
}