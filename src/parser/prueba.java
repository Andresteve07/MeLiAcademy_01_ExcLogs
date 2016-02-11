package parser;

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
		try{
			System.out.println(NumberParser.getDoubleFromString("#0028-4XX3.78,2//+3"));
			System.out.println(NumberParser.getDoubleFromString("@@csd12.dds12.1234.rewg.4.78.965gh.fgh.fj8.."));
		}
		catch(Exception exc){
			System.out.println(exc.getMessage());
		}
	}

}
