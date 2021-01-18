package com.javatechnology;

public class InstrumentList implements Performer{
	private String song;
	private Instrument instrument;
	public InstrumentList() {
		// TODO Auto-generated constructor stub
	}

	public void setSong(String string) {
		song=string;
	}
	
	public void setInstrument(Instrument instrument) {
		this.instrument=instrument;
	}
	@Override
	public void perform() {
		System.out.println("Playing ...."+song+":");
		instrument.play();
	}

}
