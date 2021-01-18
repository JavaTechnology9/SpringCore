package com.javatechnology.collection;

import java.util.Collection;
import java.util.Map;

import com.javatechnology.Instrument;
import com.javatechnology.Performer;

public class OneManband implements Performer{
	public OneManband() {
		// TODO Auto-generated constructor stub
	}
	/*private Collection<Instrument> instrument;
	
	public void setInstrument(Collection<Instrument> instrument) {
		this.instrument=instrument;
	}*/
	private Map<String, Instrument> instruments;
	
	public void setInstrument(Map<String, Instrument> instruments) {
		this.instruments=instruments;
	}

	@Override
	public void perform() {
		for(String key:instruments.keySet()) {
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
		
	}

}
