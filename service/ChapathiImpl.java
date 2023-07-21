package com.vastpro.patterns.service;

public class ChapathiImpl extends TiffenItems {
	MalaysiaKootansoru mk;

	public ChapathiImpl() {
		super();
	}

	public ChapathiImpl(MalaysiaKootansoru mk) {
		super();
		this.mk = mk;
	}

	@Override
	public int cost() {
		if (mk != null) {
			return 15 + mk.cost();
		} else {
			return 15;
		}

	}
}
