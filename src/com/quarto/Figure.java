package com.quarto;

public class Figure {
	Figure(boolean isRound, boolean isSmall, boolean withHole, boolean isBright) {
		this.isRound = isRound;
		this.isSmall = isSmall;
		this.withHole = withHole;
		this.isBright = isBright;
	}

	private boolean isRound;
	private boolean isSmall;
	private boolean withHole;
	private boolean isBright;

	@Override
	public String toString() {
		return " " + isRound + " " + isSmall + " " + withHole + " "+isBright + " ";
	}

	public boolean isRound() {
		return isRound;
	}

	public boolean isSmall() {
		return isSmall;
	}

	public boolean isWithHole() {
		return withHole;
	}

	public boolean isBright() {
		return isBright;
	}
	
}
