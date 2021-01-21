package com.javatechnology;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("performer")
public class InstrumentList implements Performer{
	@Value("Jingle bells")
	private String song;
	@SpringAutowire
	//@Inject
	//@Qualifier("guitar")  //@Named("guitar")
	private Instrument instrument;
	public InstrumentList() {
		// TODO Auto-generated constructor stub
	}
	//@Autowired
	public InstrumentList(Instrument instrument) {
		this.instrument=instrument;
	}

	public void setSong(String string) {
		song=string;
	}
	//@Autowired
	public void setInstrument(Instrument instrument) {
		this.instrument=instrument;
	}
	@Override
	public void perform() {
		System.out.println("Playing ...."+song+":");
		instrument.play();
	}
	public void tuneInstrument() {
		System.out.println("tuneInstrument method is called");
	}
	public void clearInstrument() {
		System.out.println("clearInstrument method is called");
	}

}
