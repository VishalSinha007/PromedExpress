package com.init;

import java.util.Random;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		for (int i = 0; i < 20; i++) {
			int numNoRange = rand.nextInt(9);
			System.err.println(numNoRange);
		}
		
	}

}
