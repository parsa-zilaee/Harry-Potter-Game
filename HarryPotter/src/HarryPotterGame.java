/**
 * Description: Here is a text based harry potter game,
 * in the game you are randomly doing spells. You have a time limit to escape.
 * Note: For the incorrect choices I was 
 * Author: Parsa Zilaee 
 * Section: Tuesday Thursday 9AM
 * Date: Feburary 16 2020
 */


import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class HarryPotterGame {

	public static void main (String args[]) {
		
		final int SPELL_ONE = 1;
		final int SPELL_TWO = 2;
		final int SPELL_THREE = 3;
		int choice, Winner = 0, loser =5;
		Scanner kbd = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("You are out past curfew and you hear Filch approaching.\n" + 
				"It sounds like he is about 5 minutes away from finding you.\n" + 
				"You need to get back to the common room before he catches you!\n" + 
				"You run down the hall, turn right, and then suddenly stop.");
		for (int time = 5; time > 0; time--) {
		
	
			for(int a=5; a > 0; a--) {
			
				System.out.println("\n There is a locked door ahead of you. You pull out your wand and yell...\n(Enter a value 1-3, you are a new wizard so who knows what spell you get(: )\n");
			kbd.nextLine();
			choice = rnd.nextInt(3) + 1;
			if(choice == SPELL_ONE) {
				System.out.println("\n Alohomora!\n Well done! The door creaks open and you run through.\n ");
				a -= 100;
			}
			else {
				if(choice == SPELL_TWO) {
				time--;
				loser--;
				System.out.println("\n Immobulus!\n Oh no your spell didn't work!\n");
				System.out.println("\n You have " + time + " minutes left ! Try again!");
				}
				if(choice == SPELL_THREE) {
					time--;
					loser--;
					System.out.println("\n Wingardium Leviosa\n Oh no your spell didn't work!\n");
					System.out.println("\n You have " + time + " minutes left ! Try again!\n");
				
				}
				if(time == 0) {
					a -= 10;
				}
				
			}
		
			}
			System.out.println("\n That was close! You sprint down the hallway toward your common room. \n As you near the potions classroom, you hear aloud crash.\n");
			System.out.println("A cloud of billiwigs erupts from the room.  Their jar must have fallen off of the desk.\n" + 
					"Sigh.  You don't need this right now...you can't get stung!\n" + 
					"");
	
	
			for(int b =5; b>0; b--) {
				System.out.println("You stare at the mass amount of billiwigs. You pull out your wand and yell...(press Enter)\n");
				kbd.nextLine();
				choice = rnd.nextInt(3) + 1;
				if(choice == SPELL_TWO) {
					System.out.println("Immobulus!\n" + 
							"Nice work! The pesky creatures are all frozen mid wing-flap.\n" + 
							"You weave your way through the bugs and continue toward your common room. ");
					b -= 100;
				}
				else {
					
					if(choice == SPELL_ONE) {
						time--;
						loser--;
						System.out.println(" Alohomora! \n Oh no your spell didn't work! ");
						System.out.println("\n You have " + time + " minutes left ! Try again!\n");
						
						}
					if(choice == SPELL_THREE) {
						time--;
						loser--;
						System.out.println("\n Wingardium Leviosa\n Oh no your spell didn't work!\n");
						System.out.println("\n You have " + time + " minutes left ! Try again!\n");
						}
					if(time == 0) {
						b -= 10;
					}
					
				}
				
				
			}
			
			for(int c=5 ; c > 0; c--) {
				System.out.println("You're almost there! The common room is right up the next stairwell.\n" + 
						"You race to the bottom of the stairs and come face to face with a massive pumpkin pasty blocking the stairs.\n" + 
						"Looks like the Weasley twins have been trying out new pranks.\n");
				System.out.println("You have to lift this huge pasty out of the way. You pull out your wand and yell...(press Enter)\n");		
				kbd.nextLine();
				choice = rnd.nextInt(3) + 1;
				
				if(choice == SPELL_THREE) {
				System.out.println("Wingardium Leviosa!\n" + 
						"The pasty floats up high enough for you to duck underneath.\n" + 
						"You take a quick bite as you go under. Delicious!\n");
				Winner = 10;
				time -= 10;
				

				}	
				else {
					if(choice == SPELL_TWO) {
						time--;
						loser--;
						System.out.println("\n Immobulus!\n Oh no your spell didn't work!\n");
						System.out.println("\n You have " + time + " minutes left ! Try again!");
						}
					if(choice == SPELL_THREE) {
						time--;
						loser--;
						System.out.println("\n Wingardium Leviosa\n Oh no your spell didn't work!\n");
						System.out.println("\n You have " + time + " minutes left ! Try again!\n");
						
				}
					if(time == 0) {
						c -= 10;
					}
				}
			}
	
	}
	if(loser == 0) {
		System.out.println("Filch grabs you by your collar." +
	"Aha! Out after curfew I see...detention for you!\" "+
	 "Filch marches you to the headmaster's office while muttering about his"+
	"great ideas for your detention.Game Over. ");
	
	}
	
	if (Winner == 10) {
		System.out.println("You reach the door of your common room and slip safely inside.\n" + 
				"Filch is no match for a student of your ability!\n" + 
				"You head to bed and for some reason dream of a chocolate frog the size of a house.\n" + 
				"Game over. You win!\n");
	}
}
}
