package presentation;

import java.util.ArrayList;
import java.util.List;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//déclaration
		List al= new ArrayList();
		
		//ajout
		al.add(12);
		al.add("fgregher");
		al.add(12f);
		al.add(true);
		al.add('d');
		al.add('d');
		
		
		
		//parcourir
		for (int i=0; i<al.size(); i++)
		{
			System.out.println("donnée a l'indice " + i + " = "+ al.get(i));
		}
		
	}

}
