import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int d=in.nextInt();
		int e=in.nextInt();
		int f=in.nextInt();
		
		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;

		System.out.print(king - a+" ");
		System.out.print(queen - b+" ");
		System.out.print(rook - c+" ");
		System.out.print(bishop - d+" ");
		System.out.print(knight - e+" ");
		System.out.print(pawn - f+" ");
	}
}