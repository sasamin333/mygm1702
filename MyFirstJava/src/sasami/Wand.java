package sasami;

// 魔法の杖くクラス

public class Wand {

	// フィールド
	private String name; // 杖の名前
	private double power; // 杖の魔力

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("異常");
		}
		this.name = name;
	}

	public double getPower() {
		return this.power;
	}

	public void setPower(double power) {
		if (power < 0.5 || power > 100.0) {
throw new IllegalArgumentException("パワー異常");
		}
		this.power = power;
	}

}
