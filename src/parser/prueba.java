package parser;

import java.util.ArrayList;
import java.util.Arrays;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String cadena;
//		cadena = "adaasdasd1231.23434.25fg.fgfg.fg99.99";
//		//String [] arreglo = cadena.split("\\D");
//		String [] arreglo = cadena.split("\\.");
//		//String [] arreglo = cadena.split("-?[\\D]+(?:,[\\D]+)?");
//		System.out.println(arreglo.length);
//		System.out.println(arreglo[0]);
//		System.out.println(arreglo[1]);
//		System.out.println(arreglo[2]);
//		//System.out.println(arreglo[3]);
//		for(String parte : arreglo){
//			
//			System.out.println(parte.replaceAll("[^0-9]", ""));
//		}
//		try{
//			System.out.println(NumberParser.getDoubleFromString("#0028-4XX3.78,2//+3"));
//			System.out.println(NumberParser.getDoubleFromString("@@csd12.dds12.1234.rewg.4.78.gh.fgh.fj8.."));
//		}
//		catch(Exception exc){
//			System.out.println(exc.getMessage());
//		}
		
		String cadena = "adaasdasd1231.2-3434.25fg.fgfg.fg9--9.99";
		ArrayList<String> lista = new ArrayList<String>(Arrays.asList(cadena.split("[^\\d|.|-]")));
		
		for(int i=0;i<lista.size();i++){
			if(lista.get(i).isEmpty() || lista.get(i).contentEquals(".") || lista.get(i).contentEquals("")){
				lista.remove(i);
				i--;
			}
			
		}
		
		
		for(String cad: lista)
			System.out.println(cad);

}
}
