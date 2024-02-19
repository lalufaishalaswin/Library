import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner scan = new Scanner(System.in);
	Vector<BooksDetail> vecBooksDetails = new Vector<>();
	Random rand = new Random();

	BooksDetail b;
	int menu, borrowTime,number,subNumber,subMenu,subGenre,genreHorror , genreFantasy , genreAction , genreAdventure;
	String name, id, genre;

	public Main() {
		do {
			cls();
			System.out.println("Books List");
			System.out.println("================");
			System.out.println("1. Add Books");
			System.out.println("2. View Books");
			System.out.println("3. Remove Books");
			System.out.println("4. Exit");
			System.out.print("Choose >> ");
			menu = scan.nextInt();
			scan.nextLine();
			switch(menu){
			case 1:
				
				do {
					System.out.print("Insert Books's name [3 - 20 characters]: ");
					name = scan.nextLine();
				} while (name.length() < 3 || name.length() > 20);
				do {
					System.out.print("Choose books rarity [Horror|Adventure|Fantasy|Comedy|Romance|]: ");
					genre = scan.nextLine();
				} while (!genre.equals("Adventure") && !genre.equals("Horror") && !genre.equals("Comedy") && !genre.equals("Romance") && !genre.equals("Fantasy"));
				do {
					System.out.print("Input max borrow time [2 - 50]: ");
					borrowTime = scan.nextInt();
					scan.nextLine();
				} while (borrowTime < 2 || borrowTime > 50);

				id = "" + Math.abs(rand.nextInt() % 10) + Math.abs(rand.nextInt() % 10) + Math.abs(rand.nextInt() % 10);

				b = new BooksDetail(id, name, genre, borrowTime);
				vecBooksDetails.add(b);
				
				System.out.println("Insert Success!");
				scan.nextLine();
				
				break;
				
				case 2:
					cls();
					if (vecBooksDetails.size() == 0) {
						System.out.println("There are no book!");
						scan.nextLine();
					} else {
						viewBook();
						scan.nextLine();
					}
					break;
					
				case 3:
					cls();
					if (vecBooksDetails.size() == 0) {
						System.out.println("There are no books!");
						scan.nextLine();
					} else {
						viewBook();
						System.out.print("Insert books ID: ");
						id = scan.nextLine();
						int index = 0, flag = 0;
						for (BooksDetail booksDetails : vecBooksDetails) {
							if (booksDetails.getId().equals(id)) {
								flag = 1;
								vecBooksDetails.remove(index);
								break;
							}
							index++;
						}
						if (flag == 0) {
							System.out.println("Books not found!");
							scan.nextLine();
						}
					}
					break;
			}
		
	
	}while (menu != 4);
				
	}			
	private void viewBook() {
		System.out.println("Books List");
		System.out.println("===========");
		for (BooksDetail bookDetails : vecBooksDetails) {
			System.out.println(
					bookDetails.getId() + " " + bookDetails.getName() + " " + bookDetails.getgenre() + " " + bookDetails.getborrowTime());
		}
		System.out.println("===========");
	}
	
	private void cls() {
		for(int q=1;q<=100;q++)
			System.out.println();
	}

	public static void main(String[] args) {
		new Main();
	}
}
