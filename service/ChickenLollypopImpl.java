package com.vastpro.patterns.service;

public class ChickenLollypopImpl extends Chicken {
	MalaysiaKootansoru mk;

	public ChickenLollypopImpl() {
		super();
	}

	public ChickenLollypopImpl(MalaysiaKootansoru mk) {
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
