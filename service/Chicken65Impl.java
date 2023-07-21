package com.vastpro.patterns.service;

public class Chicken65Impl extends Chicken {
	MalaysiaKootansoru mk;

	public Chicken65Impl() {
		super();
	}

	public Chicken65Impl(MalaysiaKootansoru mk) {

		this.mk = mk;
	}

	@Override
	public int cost() {
		if (mk != null) {
			return 65 + mk.cost();
		} else {
			return 65;
		}

	}

}
