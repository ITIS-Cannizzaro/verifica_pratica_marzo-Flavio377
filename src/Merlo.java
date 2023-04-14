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
				es2();
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


	// Accordino: ci sei andato vicino ma ancora non ci siamo, 1 pt
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
				somma += array[n];// Accordino: dovevi solo stampare i pari non sommarli! 
			}
			System.out.println(somma); // Accordino: così stampi 10 volte la somma che si incrementa con i numeri pari
		}
	}
	// Accordino: hai trovato il minimo ma non la posizione: 1pt
	static void es1() 
	{
		int [] array = new int [10];
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = (int)((Math.random()*11)-6); //Accordino -5, non -6 (sennò i numeri partono da -6)

		}
		for (int i = 0; i < array.length; i++) 
		{      
			for (int j=0; j< array.length;j++) 
			{
				if (array[i]<array[j]) 
				{
					swap(array, i, j); // Accordino:  Questo è un algoritmo di ordinamento, facendo così perdi la posizione
				}
			}
		}
		System.out.println("il suo valore minimo è " +array[0]); // Accordino: infatti hai stampato il minimo ma non la posizione

	}
	// Queto metodo statico è appartenente all'es 3
	public static void swap(int [] arrayTemp, int a, int b) 
	{
		int temp = arrayTemp[a];
		arrayTemp[a] = arrayTemp[b];
		arrayTemp[b] = temp;
	}
	
	// Accordino: questo proprio non va, mi dispiace: 0pt
	static void es2() 
	{
		for (int i = 0; i <= 3; i++) 
		{
			System.out.print("indovina 5 parole ");
			String parola= in.nextLine();// Accordino: così chiedi 5 parole che poi perdi perché parola "muore" dopo in ciclo!
		} 
		String [] array = new String []{"casa", "piscina", "montagna", "scuola", " televisione"}; // Accordino: questo l'hai creato ma non l'hai usato
		String [] parola= new String [array.length]; // Accordino: parola è un array di 5 stringhe vuote
		String [] parola1= new String [array.length];// Accordino: parola1 è altro un array di 5 stringhe vuote
		for (int i = 0; i < array.length; i++)	
		{
			if (parola[i].equals(parola1[i])) // Accordino: stai chiedendo se due array di stringhe vuote sono uguali, le 5 parole erano su "array"
			{
				System.out.println("prima indovinata! ");
			}
			else 
			{
				System.out.println("i tentativisono finiti "); // Accordino: se metti qui l'else la frase spunta ogni volta che non indovini, quindi anche prima che i tentativi sono finiti 
			}
		}
	}
}
