package com.vastpro.patterns.service;

public class VanjaramFishImpl extends Fish {
	MalaysiaKootansoru mk;

	public VanjaramFishImpl() {
		super();
	}

	public VanjaramFishImpl(MalaysiaKootansoru mk) {
		super();
		this.mk = mk;
	}

	@Override
	public int cost() {
		if (mk != null) {
			return 70 + mk.cost();
		} else {
			return 70;
		}

	}

}
