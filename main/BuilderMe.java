package com.vastpro.patterns.main;

public class BuilderMe {

	public static void main(String[] args) {
		Cycle mangoose = new Cycle.CycleShop().setWheel(new Wheel()).build();
		System.out.println(mangoose);
	}

}

class Cycle {
	private Wheel wheel;
	private Frame frame;
	private Chain chain;
	private HandleBar handle;
	private Pedal pedal;
	private Seat seat;
	private MudGuard mud;

	public Cycle() {

	}

	public Cycle(CycleShop cs) {
		this.wheel = cs.wheel;
		this.frame = cs.frame;
		this.chain = cs.chain;
		this.handle = cs.handle;
		this.pedal = cs.pedal;
		this.seat = cs.seat;
		this.mud = cs.mud;
	}

	@Override
	public String toString() {
		return "Cycle [wheel=" + wheel + ", frame=" + frame + ", chain=" + chain + ", handle=" + handle + ", pedal="
				+ pedal + ", seat=" + seat + ", mud=" + mud + "]" + "\nTotal cost is : " + cycleTotalCost();
	}

	int cost;

	private int cycleTotalCost() {
		if (wheel != null) {
			return cost + wheel.cost;
		}
		if (frame != null) {
			return cost + frame.cost;
		}
		if (chain != null) {
			return cost + chain.cost;
		}
		if (handle != null) {
			return cost + handle.cost;
		}
		if (pedal != null) {
			return cost + pedal.cost;
		}
		if (seat != null) {
			return cost + seat.cost;
		}
		if (mud != null) {
			return cost + mud.cost;
		}
		return cost;

	}

	static class CycleShop {
		private Wheel wheel;
		private Frame frame;
		private Chain chain;
		private HandleBar handle;
		private Pedal pedal;
		private Seat seat;
		private MudGuard mud;

		public CycleShop setWheel(Wheel wheel) {
			this.wheel = wheel;
			return this;
		}

		public CycleShop setFrame(Frame frame) {
			this.frame = frame;
			return this;
		}

		public CycleShop setChain(Chain chain) {
			this.chain = chain;
			return this;
		}

		public CycleShop setHandle(HandleBar handle) {
			this.handle = handle;
			return this;
		}

		public CycleShop setPedal(Pedal pedal) {
			this.pedal = pedal;
			return this;
		}

		public CycleShop setSeat(Seat seat) {
			this.seat = seat;
			return this;
		}

		public CycleShop setMud(MudGuard mud) {
			this.mud = mud;
			return this;
		}

		public Cycle build() {
			return new Cycle(this);
		
		}

	}
}

class Wheel {
	int cost = 2000;
}

class Frame {
	int cost = 4000;
}

class Chain {
	int cost = 500;
}

class HandleBar {
	int cost = 2500;
}

class Pedal {
	int cost = 1000;
}

class Seat {
	int cost = 1000;
}

class MudGuard {
	int cost = 250;
}
