package sasami;

public class Hero {

	// フィールド
	private int hp;
	private String name;
	private static int money;
	private Sword sword;

	// コンストラクタ
	Hero() {
		this("ダミー");
	}

	// コンストラクタ
	Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	// あばよメソッド
	void bye() {
		System.out.println("勇者は別れを告げた");
	}

	// おらあおっちぬぜメソッド
	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}

	// 眠って体力回復メソッド
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

	// いざ攻撃じゃーメソッド
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		// System.out.println("お化けキノコ" + m.suffix + "に" + h.getSword +
		// "ポイントのダメージを与えた");
		// m.hp -= h.getSword;

		if (m.hp <= 0) {
			System.out.println("お化けキノコ" + m.suffix + "を倒した！");
		} else {
			System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
			this.hp -= 2;
			if (this.hp <= 0) {
				this.die();
			}
		}
	}

	// お座りメソッド
	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒すわった！");
		System.out.println("HPが" + sec + "ポイント回復した.");
	}

	// 滑るメソッド
	void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ！");
		if (this.hp <= 0) {
			die();
		}
	}

	// 逃げるメソッド
	void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}

	// 所持金設定メソッド
	static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
	}

	// アクセッサメソッド
	public String getName() {
		return this.name;
	}

	public int getMoney() {
		return this.money;
	}

	public Sword getSword() {
		return this.sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断");
		} else if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる");
		} else if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断");
		}
		this.name = name;
	}

}
