package BoxingMatchFiles;

public class Main {

	public static void main(String[] args) {

	Fighter mike = new Fighter("Mike" , 15 , 100, 90, 0);
	Fighter george = new Fighter("George" , 10 , 95, 100, 0);
	Ring r = new Ring(mike, george , 90 , 100);
	r.run();
	}

}
