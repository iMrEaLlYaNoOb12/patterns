package com.vastpro.patterns.service;

public class KushkaRiceImpl extends Rice {
	MalaysiaKootansoru mk;

	public KushkaRiceImpl() {
		super();
	}

	public KushkaRiceImpl(MalaysiaKootansoru mk) {
		super();
		this.mk = mk;
	}

	@Override
	public int cost() {
		if (mk != null) {
			return 55 + mk.cost();
		} else {
			return 55;
		}

	}

}
