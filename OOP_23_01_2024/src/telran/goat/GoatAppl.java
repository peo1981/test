package telran.goat;

import telran.goat.mode.Goat;

public class GoatAppl {

	public static void main(String[] args) {
		Goat goatling1=new Goat();
		
		for (int i = 0; i < goatling1.getCount(); i++) {
			goatling1.increment();
		}
           System.out.println(goatling1.getCount());
           Goat goatling2=new Goat();
   		
   		for (int i = 0; i <goatling2.getMax(); i++) {
   			goatling2.increment();;
   		}
              System.out.println(goatling2.getCount()); 
	}

}
