
public class Aplicacao {
	
	public static void main(String[] args) {
		
		//Integer i1 = new Integer(20);
		Integer i1 = new Integer("20");
		imprimir(i1);
		int x = i1.intValue();
		
		//Double i2 = new Double(23.5);
		Double i2 = new Double("23.5");
		imprimir(i2);
		double y = i2.doubleValue();
		
		int v1 = Integer.parseInt("345");
		System.out.println(v1);
		
		float v2 = Float.parseFloat("23.4");
		System.out.println(v2);
		
		String bin = "0111";
		int v3 = Integer.parseInt(bin, 2);
		System.out.println(v3);
		
		String bin2 = Integer.toBinaryString(7);
		System.out.println(bin2);
	}
	
	private static void imprimir(Object obj) {
		System.out.println(obj);
	}
}
