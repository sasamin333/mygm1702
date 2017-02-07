package sasami;

public class Main {

	public static void main(String[] args) {
		Wand wand = new Wand();

		wand.setName("aaa");
		System.out.println(wand.getName());

		wand.setPower(94.5);
		System.out.println(wand.getPower());

		Wizard wizard = new Wizard();

		wizard.setHp(17);
		System.out.println(wizard.getHp());
		wizard.setMp(33);
		System.out.println(wizard.getMp());
		wizard.setName("ささみ");
		System.out.println(wizard.getName());
		wizard.setWand(null);
		System.out.println(wizard.getWand());
	}

}
