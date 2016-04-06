package main;

public class Easter {
	static String yourfunction(int year) {
		int a, b, c, k, p, q, M, N, d, e;
		int month = 0, day = 0;
		a = year % 19;
		b = year % 4;
		c = year % 7;
		k = year / 100;// Math.floor(), -2
		p = ((13 + 8 * k) / 25);
		q = k / 4;
		M = (15 - p + k - q) % 30;
		N = (4 + k - q) % 7;
		d = (19 * a + M) % 30;
		e = (2 * b + 4 * c + 6 * d + N) % 7;
		if (d + e <= 9) {
			month = 3;
			day = 22 + d + e;
		} else if (d + e > 9) {
			month = 4;
			day = d + e - 9;
		}
		if (d == 29 && e == 6) {
			month = 4;
			day = 19;
		}
		if (d == 28 && e == 6 && (11 * M + 11) % 30 < 19) {
			month = 4;
			day = 18;
		}
		return ("In" + year + ", Easter Sunday is : month =" + month + " and day =" + day);
	}
}
