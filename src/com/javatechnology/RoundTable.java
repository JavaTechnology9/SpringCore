package com.javatechnology;

public class RoundTable {
	private String name;
	private HolyGrail impl;
	
	public RoundTable(String name) {
		this.name=name;
	}
	
	public void embark() {
		impl.grail();
	}
	public void setHolyGrail(HolyGrail impl) {
		this.impl=impl;
	}

}
