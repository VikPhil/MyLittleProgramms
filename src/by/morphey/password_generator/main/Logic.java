package by.morphey.password_generator.main;

import java.util.Random;

public class Logic {

	public static String randomizer(int size) {
		Random random = new Random();
		String str = "";
		int j = 0;
		for (int i = 0; i < size; i++) {
			j = random.nextInt(127 - 33) + 33;
			str += (char) j;
		}
		return str;
	}
}
