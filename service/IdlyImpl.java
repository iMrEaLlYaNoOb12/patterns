package com.vastpro.patterns.service;

public class IdlyImpl extends TiffenItems {
	MalaysiaKootansoru mk;

	public IdlyImpl() {
		super();
	}

	public IdlyImpl(MalaysiaKootansoru mk) {
		super();
		this.mk = mk;
	}

	@Override
	public int cost() {
		if (mk != null) {
			return 5 + mk.cost();
		} else {
			return 5;
		}

	}

}
