package iNeuronJavaPrograms.MiniProject_1;

import java.util.Scanner;

class Guesser{
	int numToGuess;
	Scanner sc;
	int guesserNumber() {
		sc = new Scanner(System.in);
		System.out.print("Guesser kindly guess the number: ");
		numToGuess = sc.nextInt();
		return numToGuess;
	}
}

class Player{
	int numGuessByPlayer;
	Scanner sc;
	int guessNumByPlayer(int i) {
		sc = new Scanner(System.in);
		System.out.print("Please kindly guess the number player "+i+": ");
		numGuessByPlayer = sc.nextInt();
		return numGuessByPlayer;
	}
}

class Umpire{
	int guesserNum;
	int numGuessByPlayer1;
	int numGuessByPlayer2;
	int numGuessByPlayer3;
	int numGuessByPlayer4;
	int countWonPlayer1 = 0;
	int countWonPlayer2 = 0;
	int countWonPlayer3 = 0;
	int countWonPlayer4 = 0;
	
	Scanner sc;
	int st, en;
	boolean isCheck = false;
	
	void takeGuesserNum() {
		sc = new Scanner(System.in);
		System.out.print("Please kindly provide Guesser start point of range: ");
		st = sc.nextInt();
		System.out.print("Please kindly provide Guesser end point of range: ");
		en = sc.nextInt();
		
		Guesser g = new Guesser();
		int tempGuesserNum = g.guesserNumber();
		if(tempGuesserNum >= st && tempGuesserNum <= en) {
			guesserNum = tempGuesserNum;
			isCheck = true;
		}else {
			System.out.println("Please kindly Guesser guess the number between "+ st +" to "+ en +".");
			Guesser g1 = new Guesser();
			int tempGuesserNum1 = g1.guesserNumber();
			if(tempGuesserNum1 >= st && tempGuesserNum1 <= en) {
				guesserNum = tempGuesserNum1;
				isCheck = true;
			}
		}
	}
	
	void takePlayersNum() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		
		System.out.println("Players guess the number between "+st+" to "+en+".");
		
		numGuessByPlayer1 = p1.guessNumByPlayer(1);
		while(!(numGuessByPlayer1 >= st && numGuessByPlayer1 <= en)) {
			System.out.println("Player 1 guess the number between "+st+" to "+en);
			numGuessByPlayer1 = p1.guessNumByPlayer(1);
		} 
		
		numGuessByPlayer2 = p2.guessNumByPlayer(2);
		while(!(numGuessByPlayer2 >= st && numGuessByPlayer2 <= en)){
			System.out.println("Player 2 guess the number between "+st+" to "+en);
			numGuessByPlayer2 = p2.guessNumByPlayer(2);
		}
		
		numGuessByPlayer3 = p3.guessNumByPlayer(3);
		while(!(numGuessByPlayer3 >= st && numGuessByPlayer3 <= en)){
			System.out.println("Player 3 guess the number between "+st+" to "+en);
			numGuessByPlayer3 = p3.guessNumByPlayer(3);
		}
		
		numGuessByPlayer4 = p4.guessNumByPlayer(4);
		while(!(numGuessByPlayer4 >= st && numGuessByPlayer4 <= en)){
			System.out.println("Player 3 guess the number between "+st+" to "+en);
			numGuessByPlayer4 = p4.guessNumByPlayer(4);
		}
	}
	
	void usualGame() {
		if(guesserNum == numGuessByPlayer1) {
			if(guesserNum == numGuessByPlayer2) {
				if(guesserNum == numGuessByPlayer3) {
					if(guesserNum == numGuessByPlayer4) {
						countWonPlayer1 += 1;
						countWonPlayer2 += 1;
						countWonPlayer3 += 1;
						countWonPlayer4 += 1;
					}else {
						countWonPlayer1 += 1;
						countWonPlayer2 += 1;
						countWonPlayer3 += 1;
					}
				}else if(guesserNum == numGuessByPlayer4){
					countWonPlayer1 += 1;
					countWonPlayer2 += 1;
					countWonPlayer4 += 1;
				}else {
					countWonPlayer1 += 1;
					countWonPlayer2 += 1;
				}
			}else if(guesserNum == numGuessByPlayer3){
				if(guesserNum == numGuessByPlayer4) {
					countWonPlayer1 += 1;
					countWonPlayer3 += 1;
					countWonPlayer4 += 1;
				}else {
					countWonPlayer1 += 1;
					countWonPlayer3 += 1;
				}
			}else if(guesserNum == numGuessByPlayer4){
				countWonPlayer1 += 1;
				countWonPlayer4 += 1;
			}else {
				countWonPlayer1 += 1;
			}
		}else if(guesserNum == numGuessByPlayer2) {
			if(guesserNum == numGuessByPlayer3) {
				if(guesserNum == numGuessByPlayer4) {
					countWonPlayer2 += 1;
					countWonPlayer3 += 1;
					countWonPlayer4 += 1;
				}else {
					countWonPlayer2 += 1;
					countWonPlayer3 += 1;
				}
			}else if(guesserNum == numGuessByPlayer4){
				countWonPlayer2 += 1;
				countWonPlayer4 += 1;
			}else {
				countWonPlayer2 += 1;
			}
		}else if(guesserNum == numGuessByPlayer3) {
			if(guesserNum == numGuessByPlayer4) {
				countWonPlayer3 += 1;
				countWonPlayer4 += 1;
			}else {
				countWonPlayer3 += 1;
			}
		}else if(guesserNum == numGuessByPlayer4) {
			countWonPlayer4 += 1;
		}else {
			System.out.println("No one will guessed right number.");
		}
	}
	
	void takeSemiFinalPlayers(int[] sfp) {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		int p = 0, idx = 0;
		
		System.out.println("Players guess the number between "+st+" to "+en+".");
		
		for(int i=0; i<sfp.length; i++) {
			if(sfp[i] != 0) {
				p = sfp[i];
				idx = i;
				break;
			}
		}
		numGuessByPlayer1 = p1.guessNumByPlayer(p);
		while(!(numGuessByPlayer1 >= st && numGuessByPlayer1 <= en)) {
			System.out.println("Player "+p+ "guess the number between "+st+" to "+en);
			numGuessByPlayer1 = p1.guessNumByPlayer(p);
		} 
		
		
		for(int i=idx+1; i<sfp.length; i++) {
			if(sfp[i] != 0) {
				p = sfp[i];
				idx = i;
				break;
			}
		}
		numGuessByPlayer2 = p2.guessNumByPlayer(p);
		while(!(numGuessByPlayer2 >= st && numGuessByPlayer2 <= en)){
			System.out.println("Player "+p+" guess the number between "+st+" to "+en);
			numGuessByPlayer2 = p2.guessNumByPlayer(p);
		}
		
		
		for(int i=idx+1; i<sfp.length; i++) {
			if(sfp[i] != 0) {
				p = sfp[i];
				break;
			}
		}
		numGuessByPlayer3 = p3.guessNumByPlayer(p);
		while(!(numGuessByPlayer3 >= st && numGuessByPlayer3 <= en)){
			System.out.println("Player "+p+" guess the number between "+st+" to "+en);
			numGuessByPlayer3 = p3.guessNumByPlayer(p);
		}
	}
	
	void semiFinalGame() {
		int[] arr = {countWonPlayer1, countWonPlayer2, countWonPlayer3, countWonPlayer4};
		int[] sfp = new int[4]; 
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			if(min != arr[i]) {
				sfp[j] = i+1;
			}else {
				sfp[j] = 0;
			}
			j+=1;
		}
		
		int count = 0;
		for(int i=0; i<sfp.length; i++) {
			if(sfp[i] != 0) {
				count += 1;
			}
		}
		if(count == 0) {
			for(int i=0; i<5; i++) {
				takePlayersNum();
				usualGame();
			}
		}
		else if(count == 2) {
			System.out.println("These players play final game: "+sfp[0]+", "+sfp[1]);
			takeGuesserNum();
			finalGame(sfp[0], sfp[1]);
		}else if(count == 1){
			for(int i=0; i<sfp.length; i++) {
				if(sfp[i] != 0) {
					System.out.println("Player "+sfp[i]+" won the final game.");
				}
			}
		}else {
			System.out.print("These players play semi final game out of 4 players: ");
			for(int p: sfp) {
				if(p!=0) {
					System.out.print(p+" ");
				}
			}
			
			System.out.println();
			takeGuesserNum();
			
			countWonPlayer1 = 0;
			countWonPlayer2 = 0;
			countWonPlayer3 = 0;
			
			for(int i=0; i<3; i++) {
				takeSemiFinalPlayers(sfp);
				
				if(guesserNum == numGuessByPlayer1) {
					if(guesserNum == numGuessByPlayer2) {
						if(guesserNum == numGuessByPlayer3) {
							countWonPlayer1 += 1;
							countWonPlayer2 += 1;
							countWonPlayer3 += 1;
						}else {
							countWonPlayer1 += 1;
							countWonPlayer2 += 1;
						}
					}else {
						countWonPlayer1 += 1;
					}
				}else if(guesserNum == numGuessByPlayer2) {
					if(guesserNum == numGuessByPlayer3) {
						countWonPlayer2 += 1;
						countWonPlayer3 += 1;
					}else {
						countWonPlayer2 += 1;
					}
				}else if(guesserNum == numGuessByPlayer3){
					countWonPlayer3 += 1;
				}else {
					System.out.println("No one will guessed right number.");
				}
			}
			
			int[] arr1 = {countWonPlayer1, countWonPlayer2, countWonPlayer3};
			int[] fp = new int[2];
			int min1 = Integer.MAX_VALUE;
			int pos = 0;
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i] < min1) {
					min1 = arr1[i];
					if(sfp[i] == 0) 
						pos = i+1;
					else
						pos = i;
				}
			}
			for(int i=0; i<sfp.length; i++) {
				if(sfp[i] != 0 && sfp[pos] == sfp[i]) {
					sfp[pos] = 0;
				}
			}
			
			int j1 = 0;
			for(int i=0; i<sfp.length; i++) {
				if(sfp[i] != 0) {
					fp[j1] = sfp[i];
					j1 += 1;
				}
			}
			
			int pp1 = fp[0], pp2 = fp[1];
			System.out.println("These players play final game: "+pp1+", "+pp2);
			takeGuesserNum();
			finalGame(pp1, pp2);
		}
	}
	
	void finalGame(int pn1, int pn2) {
		
		Player p1 = new Player();
		Player p2 = new Player();
		
		System.out.println("Players guess the number between "+st+" to "+en+".");
		
		numGuessByPlayer1 = p1.guessNumByPlayer(pn1);
		while(!(numGuessByPlayer1 >= st && numGuessByPlayer1 <= en)) {
			System.out.println("Player "+pn1+ "guess the number between "+st+" to "+en);
			numGuessByPlayer1 = p1.guessNumByPlayer(pn1);
		} 
		
		numGuessByPlayer2 = p2.guessNumByPlayer(pn2);
		while(!(numGuessByPlayer2 >= st && numGuessByPlayer2 <= en)){
			System.out.println("Player "+pn2+" guess the number between "+st+" to "+en);
			numGuessByPlayer2 = p2.guessNumByPlayer(pn2);
		}
		
		if(guesserNum == numGuessByPlayer1) {
			if(guesserNum == numGuessByPlayer2) {
				System.out.print("Player "+pn1+" and "+pn2+" won the final game.");
			}else {
				System.out.print("Player "+pn1+" won the final game.");
			}
		}else if(guesserNum == numGuessByPlayer2) {
			System.out.print("Player "+pn2+" won the final game.");
		}else {
			System.out.println("Game Tied! No one guessed the correct number.");
			finalGame(pn1, pn2);
		}
	}	
}

public class GuesserGame {

	public static void main(String[] args) {
		Umpire um = new Umpire();
		um.takeGuesserNum();
		if(um.isCheck) {
			for(int i=0; i<5; i++) {
				um.takePlayersNum();
				um.usualGame();
			}
			um.semiFinalGame();
		}
	}
}