package parser;

public class NumberParser {
	static private int CHAR_MAX=100;
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
		if(array.length==0)
			throw new Exception("vino sin punto");//vino sin punto
		
		for(int i=0;i<array.length;i++){
			part=array[i].replaceAll("[^0-9]", "");
			if(!part.isEmpty()){
					if(integerPart.isEmpty()){
						integerPart=part;
					}
					else{
						decimalPart = decimalPart+part;
					}
			}
		}

		if(integerPart.isEmpty())
			throw new Exception("parte entera vacia");
		if(decimalPart.isEmpty())
			throw new Exception("parte decimal vacia");
		parsedDouble = (1.0*Integer.parseInt(integerPart)) + (Integer.parseInt(decimalPart)/Math.pow(10, decimalPart.length()));
		return parsedDouble;
	}
}
