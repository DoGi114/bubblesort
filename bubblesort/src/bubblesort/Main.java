package bubblesort;

import java.util.Random;



public class Main {

	public static void sortg(int[] tab){
		int tmp = 0;
		int [] tab2 = new int[10000] ;
		
		for(int k = 0; k < tab.length; k++ ){
			tab2[k] = tab [k]; 
		}
		
		long Start = System.currentTimeMillis();
		boolean change ;
		for(int i = 0; i < tab2.length; i++){
			change = false;
			for(int j = 0; j < tab2.length-1; j++ ){
				if(tab[j]>tab2[j+1]){
					tmp = tab2[j];
					tab2[j] = tab2[j+1];
					tab2[j+1] = tmp;
					change = true;
				}
			}
			if(change == false) break;
		}
		long Stop = System.currentTimeMillis();
		long result = Stop-Start;
		System.out.println("Program z wartownikiem wykonał się w czasie:"+result);

	}

	public static void sort(int[] tab){
		int tmp = 0;
		int [] tab2 = new int[10000];

		for(int k = 0; k < tab.length; k++ ){
			tab2[k] = tab [k]; 
		}
		
		long Start = System.currentTimeMillis();
		boolean change;
		for(int i = 0; i < tab2.length; i++){
			change = false;
			for(int j = 0; j < tab2.length-1; j++ ){
				if(tab[j]>tab2[j+1]){
					tmp = tab2[j];
					tab2[j] = tab2[j+1];
					tab2[j+1] = tmp;
				
			}
		}
		
	}
		long Stop = System.currentTimeMillis();
		long result = Stop-Start;
		System.out.println("Program bez wartownika wykonał się w czasie:"+result);
	}
	
	
	public static void sortt(int[] tab){
		int tmp = 0;

		for(int i = 0; i < tab.length; i++){
			for(int j = 0; j < tab.length-1; j++ ){
				if(tab[j]>tab[j+1]){
					tmp = tab[j];
					tab[j] = tab[j+1];
					tab[j+1] = tmp;
				
			}
		}
		
	}
}

	public static void main(String[] args) {
		int [] tab = new int[10000];
		Random generator = new Random();
		
		for(int i = 0; i < tab.length; i++ ){
			tab[i] = generator.nextInt();

		}
		
		sort(tab);
		sortg(tab);
		
		sortt(tab);

		sort(tab);
		sortg(tab);

	}

}
