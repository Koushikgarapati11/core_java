package com.javacube;

public class Movie {

//	Declaration
//	Static variable 
	static String theatreName = "shashikala";
	static String location = "mosapet";
// Instance variable 
	String moviename;
	int moviebudget;
	String releasedate;

	void display() {
		System.out.println("moviename:" + moviename);
		System.out.println("moviebudget:" + moviebudget);
		System.out.println("releasedate:" + releasedate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("theatreName:" + theatreName);
		System.out.println(location);
		Movie m1 = new Movie();
		m1.moviebudget = 2000000;
		m1.moviename = "IRUMUDI";
		m1.releasedate = "21 - 04 - 26";
		m1.display();

		System.out.println(theatreName);
		System.out.println(location);
		Movie m2 = new Movie();
		m2.moviebudget = 6700000;
		m2.moviename = "TOXIC";
		m2.releasedate = "21 - 08 - 26";
		m2.display();

		System.out.println(theatreName);
		System.out.println(location);

		Movie m3 = new Movie();
		m3.moviebudget = 9800000;
		m3.moviename = "Korean kanaka raku";
		m3.releasedate = " 05- 02 - 26";
		m3.display();

		System.out.println(theatreName);
		System.out.println(location);

		Movie m4 = new Movie();
		m4.moviebudget = 5600000;
		m4.moviename = "Husharu pittalu";
		m4.releasedate = "26 - 04 - 26";
		m4.display();
	}

}
