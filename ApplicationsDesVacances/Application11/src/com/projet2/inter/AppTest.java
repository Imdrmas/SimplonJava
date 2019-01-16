package com.projet2.inter;


public class AppTest {

	public static void main(String[] args) {
		Complex c1 = new Complex(20, 12);
		Complex c2 = new Complex(-7, 11);

		Complex c3, c4;
		c3 = c1.plus(c2);
		c4 = c3.moins(c2);

		System.out.println(c3.affiche());
		System.out.println(c4.affiche());

	}

}