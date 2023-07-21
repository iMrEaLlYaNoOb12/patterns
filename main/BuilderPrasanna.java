package com.vastpro.patterns.main;

public class BuilderPrasanna {
	public static void main(String[] args) {
		Builder prasanna=new PrashantHouse();
		Construct house=new Construct(prasanna);
		house.BuildHouse();
		System.out.println(house.getbuild().getBasement());
		Builder Prasanna=new LakshmiHouse();
		Construct House=new Construct(Prasanna);
		House.BuildHouse();
		System.out.println(House.getbuild().getBasement());
		
	}
}
interface HousePlan{
	public void basement(String basement);
	public void exterior(String exterior);
	public void interior(String interior);
	public void paint(String paint);
}
class House implements HousePlan{
	private String basement;
	private String exterior;
	private String interior;
	private String paint;
	
	public String getBasement() {
		return basement;
	}
	public String getExterior() {
		return exterior;
	}
	public String getInterior() {
		return interior;
	}
	public String getPaint() {
		return paint;
	}
	@Override
	public void basement(String basement) {
		this.basement=basement;
		
	}
	@Override
	public void exterior(String exterior) {
		this.exterior=exterior;
		
	}
	@Override
	public void interior(String interior) {
		this.interior=interior;
		
	}
	@Override
	public void paint(String paint) {
		this.paint=paint;
	}
}
interface Builder{
	public void buildbasement();
	public void buildexterior();
	public void buildinterior();
	public void applypaint();
	public House build();
}
class PrashantHouse implements Builder{
	House house;
	
	public PrashantHouse() {
		this.house = new House();
	}

	@Override
	public void buildbasement() {
		house.basement("Cement");
		
	}

	@Override
	public void buildexterior() {
		house.exterior("Batman house exterior");
		
	}

	@Override
	public void buildinterior() {
		house.interior("Varisu house Interior");
		
	}

	@Override
	public void applypaint() {
		house.paint("White");
		
	}

	@Override
	public House build() {
		return house;
	}	
}
class Construct{
	Builder Prasanna;

	public Construct(Builder prasanna) {
		super();
		Prasanna = prasanna;
	}
	public void BuildHouse()
	{
		Prasanna.buildbasement();
		Prasanna.buildexterior();
		Prasanna.buildinterior();
		Prasanna.applypaint();
	}
	public House getbuild()
	{
		return Prasanna.build();
	}
}
class LakshmiHouse implements Builder{
	House house;
	public LakshmiHouse() {
		this.house=new House();
	}
	@Override
	public void buildbasement() {
		house.basement("ICE Basement");
		
	}

	@Override
	public void buildexterior() {
		house.exterior("IronMan Extertior");
		
	}

	@Override
	public void buildinterior() {
		house.interior("Fall Cieling Interior");
		
	}

	@Override
	public void applypaint() {
		house.paint("Light Blue");
		
	}

	@Override
	public House build() {
		// TODO Auto-generated method stub
		return house;
	}
	
}