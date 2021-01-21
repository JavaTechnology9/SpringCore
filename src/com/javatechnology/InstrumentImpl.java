package com.javatechnology;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class InstrumentImpl implements Instrument{
	public InstrumentImpl() {
		// TODO Auto-generated constructor stub
	}
	public InstrumentImpl(String value1,String value2,Poem poem) {
		// TODO Auto-generated constructor stub
	}
	
	public InstrumentImpl(String value1,Poem poem,Performer performer) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		System.out.println("TOOT TOOT TOOT");
		
	}

}
