package com.vastpro.patterns.main;

public class IbacoDemo {
	public static void main(String[] args) {
		// IbacoIceCream myiceCream = new Vanila(new StrawBerry(new Choclate(new
		// Cherries(new Vanila()))));
		IbacoIceCream myiceCream = new Vanila(new StrawBerry());

		System.out.println("Cost Of IceCream..:" + myiceCream.cost());
	}
}

abstract class IbacoIceCream {
	public abstract int cost();
}

abstract class Cream extends IbacoIceCream {
	public abstract int cost();
}

abstract class Topings extends IbacoIceCream {
	public abstract int cost();
}

class Vanila extends Cream {
	IbacoIceCream ic;

	public Vanila() {

	}

	public Vanila(IbacoIceCream ic) {
		this.ic = ic;
	}

	@Override
	public int cost() {

		if (ic != null) {
			return 10 + ic.cost();
		} else {
			return 10;
		}
	}
}

class StrawBerry extends Cream {
	public StrawBerry() {

	}

	IbacoIceCream ic;

	public StrawBerry(IbacoIceCream ic) {
		this.ic = ic;
	}

	@Override
	public int cost() {

		if (ic != null) {
			return 20 + ic.cost();
		} else {
			return 20;
		}
	}
}

class Cherries extends Topings {
	public Cherries() {

	}

	IbacoIceCream ic;

	public Cherries(IbacoIceCream ic) {
		this.ic = ic;
	}

	@Override
	public int cost() {
		if (ic != null) {
			return 5 + ic.cost();
		} else {
			return 5;
		}
	}
}

class Choclate extends Topings {
	public Choclate() {

	}

	IbacoIceCream ic;

	public Choclate(IbacoIceCream ic) {
		this.ic = ic;
	}

	@Override
	public int cost() {
		if (ic != null) {
			return 10 + ic.cost();
		} else {
			return 10;
		}
	}
}
