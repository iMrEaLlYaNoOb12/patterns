package com.vastpro.patterns.service;

public class DosaImpl extends TiffenItems {
	MalaysiaKootansoru mk;

	public DosaImpl() {
		super();
	}

	public DosaImpl(MalaysiaKootansoru mk) {
		super();
		this.mk = mk;
	}

	@Override
	public int cost() {
		if (mk != null) {
			return 10 + mk.cost();
		} else {
			return 10;
		}

	}

}
