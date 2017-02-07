package chap10;

public class MainP378 {

	public static void main(String[] args) {

		// 勇者の生成と初期設定
		Hero h = new Hero("ミナト");
		// h.setName();
		Hero.setRandomMoney();
		System.out.println("名前" + h.getName() + "体力" + h.getHp() + "金" + h.getMoney());

		// 宿屋の生成
		Inn hotel = new Inn();

		// Hero h2 = new Hero("テスト");

		// 勇者は旅籠に入る
		hotel.checkIn(h);
		System.out.println("勇者は旅籠に入った");
		// System.out.println("名前" + h.name + "体力" + h.hp + "金" + h.money);
		// System.out.println("名前" + h2.name + "体力" + h2.hp + "金" + h2.money);

		// 王様の登場
		King king = new King();
		System.out.println("王様の登場");
		king.talk(h);

		Sword sword = new Sword();
		sword.setName("あああ");

		h.setSword(sword);
		System.out.println(h.getSword().getName() + "の攻撃力");
	}

}
