import java.util.Scanner;
public class Merlo
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			case 1:
				es3();
				break;
			case 2:
				es1();
				break;
			case 3:
				//es2();
				break;
			case 4:
				break;
			default:
				System.out.println("Scelta errata, riprova!");


			}
		}
	}
	static void stampaMenu()
	{

		System.out.println("1 - StampaPari");
		System.out.println("2 - MinimoDiArray:");
		System.out.println("3 - paroleMisteriose");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}

	static void es3() 
	{
		int [] array = new int [20];
		int somma = 0;
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = (int)(Math.random()*10)+1;
		}
		for (int i = 0; i < array.length; i++) 
		{
			for (int j= 0; j < array.length; j++) 
			{
				if (array[i] < array[j]) 
				{
					swap(array, i, j);
				}
			}
		}
		for (int n = 0; n < array.length; n++) 
		{
			if (array[n]%2==0) 
			{
				somma += array[n];
			}
			System.out.println(somma);
		}
	}

	static void es1() 
	{
		int [] array = new int [10];
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = (int)((Math.random()*11)-6);
			
		}
		for (int i = 0; i < array.length; i++) 
		{      
			for (int j=0; j< array.length;j++) 
			{
				if (array[i]<array[j]) 
				{
					swap(array, i, j);
				}
			}
		}
			System.out.println("il suo valore minimo è " +array[0]);
		
	}
	// Queto metodo statico è appartenente all'es 3
	public static void swap(int [] arrayTemp, int a, int b) 
	{
		int temp = arrayTemp[a];
		arrayTemp[a] = arrayTemp[b];
		arrayTemp[b] = temp;
	}
	static void es2() 
	{
		for (int i = 0; i <= 3; i++) 
		{
			System.out.print("indovina 5 parole ");
			String parola= in.nextLine();
		} 
		String [] array = new String []{"casa", "piscina", "montagna", "scuola", " televisione"};
		String [] parola= new String [array.length];
		String [] parola1= new String [array.length];
		for (int i = 0; i < array.length; i++)	
		{
			if (parola[i].equals(parola1[i]))
			{
			  System.out.println("prima indovinata! ");
			}
			else 
			{
			  System.out.println("i tentativisono finiti ");
			}
		}
	}
}
