package com.vastpro.patterns.main;

public class BikePattern {
	public static void main(String[] args) {
		BikeBuilder Pras=new PrashantBike();
		ConstructBike cb=new ConstructBike(Pras);
		cb.construct();
		System.out.println(cb.getBike());
		System.out.println("The cost your Bike is : "+cb.cost);
		System.out.println(cb.toString());
	}
}
interface BikePlan {
	public void engine(CustomeEngine eg);
	public void frame(CustomeBikeFrame frm);
	public void tyre(CustomeTyres tyre);
	public void handle(CustomeHandle BH);
}
class Bike implements BikePlan{
	private CustomeEngine eg;
	private CustomeBikeFrame frm;
	private CustomeTyres tyre;
	private CustomeHandle BH;
	
	@Override
	public String toString() {
		return "Bike [eg=" + eg + ", frm=" + frm + ", tyre=" + tyre + ", BH=" + BH + "]";
	}
	public CustomeEngine getEg() {
		return eg;
	}
	public CustomeBikeFrame getFrm() {
		return frm;
	}
	public CustomeTyres getTyre() {
		return tyre;
	}
	public CustomeHandle getBH() {
		return BH;
	}
	public void engine(CustomeEngine eg) {
		this.eg = eg;
	}
	public void frame(CustomeBikeFrame frm) {
		this.frm = frm;
	}
	public void tyre(CustomeTyres tyre) {
		this.tyre = tyre;
	}
	public void handle(CustomeHandle bH) {
		BH = bH;
	}
	
}
interface BikeBuilder{
	public void setEngine();
	public void setFrame();
	public void setTyre();
	public void setHandle();
	public Bike build();
}
class PrashantBike implements BikeBuilder{
	Engine eg;
	Tyres ty;
	BikeHandle bh;
	BikeFrame bf;
	Bike bike;
	public PrashantBike() {
		this.bike=new Bike();
		this.eg=new Engine();
		this.bh=new BikeHandle();
		this.bf=new BikeFrame();
		this.ty=new Tyres();
	}
	@Override
	public void setEngine() {
		CustomeEngine ce=new CustomeEngine(eg.getYamaha());
		//System.out.println(ce.cost);
		bike.engine(ce);
	}

	@Override
	public void setFrame() {
		CustomeBikeFrame cf=new CustomeBikeFrame(bf.getYamaha());
		bike.frame(cf);
		
	}

	@Override
	public void setTyre() {
		CustomeTyres ct=new CustomeTyres(ty.getYamaha());
		bike.tyre(ct);
		
	}

	@Override
	public void setHandle() {
		CustomeHandle ch=new CustomeHandle(bh.getYamaha());
		bike.handle(ch);
		
	}

	@Override
	public Bike build() {
		// TODO Auto-generated method stub
		return bike;
	}
	
}
class ConstructBike{
	int cost=0;
	BikeBuilder builder;
	public ConstructBike(BikeBuilder builder) {
		this.builder=builder;
	}
	public void construct()
	{
		builder.setEngine();
		builder.setFrame();
		builder.setTyre();
		builder.setHandle();
		Bike b=builder.build();
		cost+=b.getEg().cost;
		cost+=b.getBH().cost;
		cost+=b.getFrm().cost;
		cost+=b.getTyre().cost;
		
	}
	public Bike getBike()
	{
		return builder.build();
	}
}
class Engine {
	private int bajaj = 20000;
	private int KTM = 50000;
	private int yamaha = 100000;
	private int hero = 15000;
	private int honda = 90000;

	public int getBajaj() {
		return bajaj;
	}

	public int getKTM() {
		return KTM;
	}

	public int getYamaha() {
		return yamaha;
	}

	public int getHero() {
		return hero;
	}

	public int getHonda() {
		return honda;
	}
}

class BikeFrame {
	private int bajaj = 10000;
	private int KTM = 20000;
	private int yamaha = 80000;
	private int hero = 5000;
	private int honda = 75000;

	public int getBajaj() {
		return bajaj;
	}

	public int getKTM() {
		return KTM;
	}

	public int getYamaha() {
		return yamaha;
	}

	public int getHero() {
		return hero;
	}

	public int getHonda() {
		return honda;
	}

}

class Tyres {
	private int bajaj = 2000;
	private int KTM = 6000;
	private int yamaha = 8000;
	private int hero = 2500;
	private int honda = 5000;

	public int getBajaj() {
		return bajaj;
	}

	public int getKTM() {
		return KTM;
	}

	public int getYamaha() {
		return yamaha;
	}

	public int getHero() {
		return hero;
	}

	public int getHonda() {
		return honda;
	}
}

class BikeHandle {
	private int bajaj = 200;
	private int KTM = 500;
	private int yamaha = 1000;
	private int hero = 100;
	private int honda = 750;

	public int getBajaj() {
		return bajaj;
	}

	public int getKTM() {
		return KTM;
	}

	public int getYamaha() {
		return yamaha;
	}

	public int getHero() {
		return hero;
	}

	public int getHonda() {
		return honda;
	}
}
class CustomeEngine{
	public int cost;

	public CustomeEngine(int cost) {
		super();
		this.cost = cost;
	}
}
class CustomeBikeFrame{
	public int cost;

	public CustomeBikeFrame(int cost) {
		super();
		this.cost = cost;
	}
}
class CustomeTyres{
	public int cost;

	public CustomeTyres(int cost) {
		super();
		this.cost = cost;
	}
}
class CustomeHandle{
	public int cost;

	public CustomeHandle(int cost) {
		super();
		this.cost = cost;
	}
}