package com.quarto;

import java.util.Random;

public class App {
	public static void main(String[] args) {
		Field field = new Field();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				field.insert(genFigure(), i, j);
			}
		}
		System.out.println(field);
		System.out.println(field.isWiningGame());
	}

	private static Figure genFigure() {
		Random r = new Random();
		return new Figure(r.nextBoolean(), r.nextBoolean(), r.nextBoolean(), r.nextBoolean());

	}
}
