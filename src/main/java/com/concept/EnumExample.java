package com.concept;

enum Heroin {
	ANUSHKA, UBANU(10), DEEPIKA(10, 20);
	Heroin() {
		System.out.println("ratan");
	}

	Heroin(int a) {
		System.out.println("raghava");
	}

	Heroin(int a, int b) {
		System.out.println("sanki");
	}
}

class EnumExample {
	public static void main(String[] arhss) {
		Heroin[] h = Heroin.values();
		for (Heroin h1 : h) {
			System.out.println(h1 + "----" + h1.ordinal());
		}
	}
};