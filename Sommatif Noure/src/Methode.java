
/*
*Author : noure-d-zobiri
*Date : Dec. 15, 2020
*/
import java.util.Scanner;

public class Methode
	{

		public static void main(String[] args)
			{
				//Methode pour genere 100 nombre par hasard dans le tableau
			int []myTab= new int[100];
			for(int i=0;i<10;i++)
			      
			{
				myTab[i]=(int)
						(Math.random()*(i+1));
			
			}
	
			for (int element:myTab); 
			
			}
			static int PrimeNum(int []myTab) {
						for(int i=0; i<myTab.length;i++) {
							boolean isPrime = true;	
							
							for(int j=2;j<i;j++) {
								if(i%j==0) {
									isPrime=false;
									break;}
							}
						}
				}
			
			static int SommePrime(int []myTab) {
			int somme=0;
			
	         for(int m=0; m<myTab.length;m++) 
			 {
				 somme=somme+ myTab[m];
			 }
			}
	}
			
			
			
		
			
  
	  
		  
		  
  
		

	
