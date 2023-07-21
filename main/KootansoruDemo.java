package com.vastpro.patterns.main;

import com.vastpro.patterns.service.Chicken65Impl;
import com.vastpro.patterns.service.FriedRiceImpl;
import com.vastpro.patterns.service.KushkaRiceImpl;
import com.vastpro.patterns.service.MalaysiaKootansoru;

public class KootansoruDemo {

	public static void main(String[] args) {
		MalaysiaKootansoru kootansoru = new Chicken65Impl(new KushkaRiceImpl(new FriedRiceImpl()));
		System.out.println("Cost of Kootansoru : " + kootansoru.cost());

	}

}
