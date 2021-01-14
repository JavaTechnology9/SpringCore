package com.javatechnology;

public class PerformerImpl implements Performer{
	private int beanbags=3;
	
	public PerformerImpl() {
		// TODO Auto-generated constructor stub
	}
	public PerformerImpl(int beanbags) {//bean id ="" class="PerformerImpl"
		// Performer perform=new PerformerImpl(15);
		this.beanbags=beanbags;
	}

	@Override
	public void perform() {
		System.out.println("BEANBAGS: "+beanbags);//15
		
	}

}
