package classe;

public class DataTeste {
public static void main(String[] args) {
	
	Data d1 = new Data(31, 12 , 1970);
	
	
	System.out.printf("%d/%d/%d\n" , d1.dia , d1.mes , d1.ano);
	
	var d2 = new Data(06 , 04, 2000);
	
	
	System.out.printf("%d/%d/%d" , d2.dia , d2.mes , d2.ano);
	
	String dataFormatada1 = d1.obterDataFormatada();
	
	System.out.println(dataFormatada1);
	System.out.println(d2.obterDataFormatada());
	
	d1.imprimrDataFormatada();
	d2.imprimrDataFormatada();

	
}
}
