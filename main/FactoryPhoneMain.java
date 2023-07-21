package com.vastpro.patterns.main;

public class FactoryPhoneMain {

	public static void main(String[] args) {
		FactoryOS os = new FactoryOS(AndroidOS);
		FactoryOS obj = os;
		obj.os();
	}

}

abstract class OS {
	abstract void os();
}

class AndroidOS extends OS {

	@Override
	public void os() {
		System.out.println("High level OS");
	}

}

class AppleIOS extends OS {

	@Override
	public void os() {
		System.out.println("Secured OS");
	}

}

class WindowsOS extends OS {

	@Override
	public void os() {
		System.out.println("No optimised OS");
	}

}

class FactoryOS {
	OS os;

	public FactoryOS(OS os) {
		this.os = os;
	}

	public void os() {
		// TODO Auto-generated method stub
		
	}

}
