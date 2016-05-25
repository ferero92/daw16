//This program tells us the current time in some different countries around the world
public class WhatTimeIsIt {

	public static void main(String[] args) {
		
		long millis = System.currentTimeMillis();//This method is the key of the program
		
		long seconds = millis / 1000;
		
		long secondsIndia = millis / 1000 + 19800;
		
		long currentSeconds = seconds % 60;
		
		long currentSecondsIndia = secondsIndia % 60;
		
		long minutes = (seconds / 60) % 60;
		
		long minutesIndia = (secondsIndia / 60) % 60;
		
		long hoursIndia = (secondsIndia / 60) / 60 % 24;
				
		long hoursPortugal = (seconds / 60) / 60 % 24 + 1;
		
		long hoursSpain = (seconds / 60) / 60 % 24 + 2;
		
		long hoursTurkey = (seconds / 60) / 60 % 24 + 3;
		
		long hoursCosta = (seconds / 60) / 60 % 24 - 6;
		
		long hoursJapan = (seconds / 60) / 60 % 24 + 9;
		
		long hoursArgentina = (seconds / 60) / 60 % 24 - 3;
							
		System.out.println("The current time in Spain is " + hoursSpain + ":" + minutes + ":" + currentSeconds);
		System.out.println("The current time in Portugal is " + hoursPortugal + ":" + minutes + ":" + currentSeconds);
		System.out.println("The current time in Turkey is " + hoursTurkey + ":" + minutes + ":" + currentSeconds);
		System.out.println("The current time in Costa Rica is " + hoursCosta + ":" + minutes + ":" + currentSeconds);
		System.out.println("The current time in Japan is " + hoursJapan + ":" + minutes + ":" + currentSeconds);
		System.out.println("The current time in Argentina is " + hoursArgentina + ":" + minutes + ":" + currentSeconds);
		System.out.println("The current time in India is " + hoursIndia + ":" + minutesIndia + ":" + currentSecondsIndia);
	}	
}