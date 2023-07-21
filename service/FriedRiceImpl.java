package com.vastpro.patterns.service;

public class FriedRiceImpl extends Rice {
	MalaysiaKootansoru mk;

	public FriedRiceImpl() {
		super();
	}

	public FriedRiceImpl(MalaysiaKootansoru mk) {
		super();
		this.mk = mk;
	}

	@Override
	public int cost() {
		if (mk != null) {
			return 50 + mk.cost();
		} else {
			return 50;
		}

	}
}
