
import java.util.*;
public class Ex1_1 {

	public static void main(String[] args) {
		Storage l = new Storage();
		Incrementable sf= new Incrementable();
		Incrementable xx= new Incrementable();
		sf.increment();
		int i=0;
		i=l.storage("mananana");
		int ix=2;
		Integer iy=ix;
		
		
		System.out.println("x="+ sf.x + "ch=" +xx.x);
	}

}
