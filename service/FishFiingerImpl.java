package com.vastpro.patterns.service;

public class FishFiingerImpl extends Fish {
	MalaysiaKootansoru mk;

	public FishFiingerImpl() {
		super();
	}

	public FishFiingerImpl(MalaysiaKootansoru mk) {
		super();
		this.mk = mk;
	}

	@Override
	public int cost() {
		if (mk != null) {
			return 30 + mk.cost();
		} else {
			return 30;
		}

	}
}
