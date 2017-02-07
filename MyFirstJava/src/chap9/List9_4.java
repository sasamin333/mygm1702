package chap9;

public class List9_4 {

	public static void main(String[] args) {
		// 剣の生成
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println("勇者の名前"+h.name+"勇者の体力"+h.hp);
		System.out.println("現在の武器は" + h.sword.name+"勇者の体力"+h.sword.name);
	}

}
