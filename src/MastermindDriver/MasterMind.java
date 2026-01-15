package MastermindDriver;

import java.util.*;

public class MasterMind {

	ArrayList secret;

	String naam;
	
	int ronde = 0;

	public void spelSpelen() {

		explanation();
		
		generateSecret();
		

	}

	public void explanation() {

		String antwoord = vraagStellenText(
				"Vandaag ga je het spel spelen van MasterMind, Wil jij hier instructie over?");

		System.out.println(antwoord);
		try{
			
		}catch(Exception e) {
			System.out.print("dit is de foutmelding" + e);
		}
		if (antwoord == "ja") {
			System.out.println("uitleg heel lang bericht");
			System.out.println("uitleg heel lang bericht");
			System.out.println("uitleg heel lang bericht");
			System.out.println("uitleg heel lang bericht");
			
		} 
		else if (antwoord == "nee") {
			System.out.println("Geen uitleg");
		} 
		else {
			System.out.println("foute waarde");
		}
	}

	public void generateSecret() {
		secret.add(1);
		secret.add(4);
		secret.add(3);
		secret.add(6);
	}

	public String vraagStellenText(String vraag) {
		Scanner Sc = new Scanner(System.in);

		System.out.println(vraag);

		return Sc.nextLine().toLowerCase();

	}

	public int vraagStellenInt(String vraag) {
		Scanner Sc = new Scanner(System.in);

		int antwoord = Sc.nextInt();

		return antwoord;
	}

}
