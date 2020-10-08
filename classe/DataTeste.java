package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data ();
		
		var d2 = new Data(25, 02, 1926);
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
	}
}
