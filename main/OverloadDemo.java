package com.vastpro.patterns.main;

public class OverloadDemo {
	public static void main(String[] args) {
		Human gokul = new Human();
		gokul.play(new BasketBall());
	}
}

class Human {
	public void play(FootBall fb) {
		System.out.println("play by leg...");
	}

	public void play(VolleyBall vb) {
		System.out.println("play by hand....");
	}

	public void play(HockeyStick hs) {
		System.out.println("play with stick....");
	}

	public void play(BasketBall bb) {
		System.out.println("playing basketball....");
	}
}

//class StructuredHuman{
//	public void play(Object obj) {
//		if(obj instanceof FootBall) {
//			System.out.println("play by leg......................................");
//		}
//		else if(obj instanceof VolleyBall) {
//			System.out.println("play by hand......................................");
//		}
//		else if(obj instanceof HockeyStick) {
//			System.out.println("play with stick....................................");
//		}
//	}
//}
class VolleyBall {
}

class FootBall {
}

class HockeyStick {
}

class BasketBall {
}
