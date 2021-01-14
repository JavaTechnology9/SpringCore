package com.javatechnology;

public class PerformerImpl2 extends PerformerImpl{
	private Poem poem;
	
	public PerformerImpl2(Poem poem) {
		super();
		this.poem=poem;
	}
	public PerformerImpl2(int beanbags, Poem poem) {
		super(beanbags);
		this.poem=poem;
	}
	public void perform() {
		super.perform();
		System.out.println("perform method is called in PerformerImpl2");
		poem.recite();
	}

}
