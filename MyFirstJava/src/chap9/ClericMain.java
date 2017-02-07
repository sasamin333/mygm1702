package chap9;

public class ClericMain {

	public static void main(String[] args) {

		Cleric c = new Cleric("アサカ", 40, 5);
		// c.name = "Cleric";
		// c.mp = 5;
		c.pray(3);
		c.selfAid();

		Cleric d = new Cleric("アサカ", 35);
		d.pray(5);
		d.selfAid();

		Cleric e = new Cleric("アサカ");
		e.pray(2);
		e.selfAid();
	}
}
