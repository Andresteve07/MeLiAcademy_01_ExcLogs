package parser;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberParser {
	static private int CHAR_MAX=100;
	//static private String MAX_DEC_PART="123432";
	//static private String MAX_INT_PART=;
	
	
	static public double getDoubleFromString(String cadena) throws Exception{
		double parsedDouble = 0.0;
		String integerPart="";
		String decimalPart="";
		String part ="";
		if(cadena.isEmpty())
			throw new Exception("cadena vacia");
		if(cadena.length()>CHAR_MAX){
			throw new Exception("cadena demasiado grande");
		}
		String [] array = cadena.split("\\.");
		//ArrayList<String> numberParts= new ArrayList<>(Arrays.asList(cadena.split("\\.")));
		if(array.length==0)
			throw new Exception("vino sin punto");//vino sin puntos
		if(array[0].isEmpty())
			array = Arrays.copyOfRange(array, 1, array.length);
		
		for(int i=0;i<array.length;i++){
			part=array[i].replaceAll("[^0-9]", "");
			if(!part.isEmpty()){
					if(integerPart.isEmpty()){
						integerPart=part;
					}
					else{
						decimalPart = decimalPart+part;//concateno las cifras decimales
					}
			}
		}

		if(integerPart.isEmpty())
			throw new Exception("parte entera vacia");
		if(decimalPart.isEmpty())
			throw new Exception("parte decimal vacia");
		//if(decimalPart.length()>DEC_CIF_MAX)//los valores limites
		System.out.println(integerPart);
		System.out.println(decimalPart);
		parsedDouble = (1.0*Integer.parseInt(integerPart)) + (Integer.parseInt(decimalPart)/Math.pow(10, decimalPart.length()));
		System.out.println(parsedDouble);
		return parsedDouble;
	}
}
