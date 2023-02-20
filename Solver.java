package puzzle8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solver {

	public static void main(String[] args) {
		
		// initial board set-up
		
		int [][] gameBoard = {{1,3,4},{8,0,2},{7,6,5}};
		
		BoardNode board = new BoardNode(gameBoard);
		
		// search waiting to be initialized
		Search search = null;
		
		// Simple UI which prompts the User to select an algorithm 
		boolean con = true;
	while(con==true)	{  //the loop keeps going till User says no
		System.out.println();
		System.out.println("Welcome to 8 puzzle");    //Below are the options asking User for which search and what difficulty to pick
		System.out.println("Please chose an Algorithm below:");
		System.out.println();
		System.out.println();
		
		System.out.println("1. DFS"); 
		
		System.out.println("2. UniformCost"); 
	
		System.out.println("3. BestFirst"); 
	
		System.out.println("4. A*"); 

		System.out.print("Please enter the value of your desired search algorithm: ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		switch(input) {    //switch is used to determine what search and difficulty to use
		
		case 1:
		search = new DFS(board);
		break;			
		case 2:
		search = new UniformCost(board);
		break;
		case 3:							
		search = new BestFirst(board);
		break;
		case 4:
		//final case for A* which provides options for both Heuristics
			System.out.println();
			System.out.println("This is the A* algorithm, please pick a heuristic: ");
			System.out.println();
			System.out.println("1. Misplaced Tiles");
			System.out.println("2. Manhattan");
			System.out.println();
			int input2 = scanner.nextInt();
			
			switch(input2){
			
			
				case 1: 
				search = new Astar(board,1);
				break;
			
				case 2:
				search = new Astar(board,2);
				break;
			}
					
		}
		
		System.out.println("The search will begin now: ");
		search.search(); //the search starts
		System.out.println("Do you want to continue?");
		System.out.println();
		System.out.println("1. Yes");
		System.out.println("2. No");
		int input3 = scanner.nextInt();
		if(input3==2) {
			con = false;
		}
		
			}
		


	}
	
	

	
	

	
	

	

	
}

	




