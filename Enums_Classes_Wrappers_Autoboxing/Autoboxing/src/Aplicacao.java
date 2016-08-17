
public class Aplicacao {
	
	public static void main(String[] args) {
	
		Handler h = new Handler();
		
		//h.setObj(new Integer(10));
		//Integer i = (Integer) h.getObj();
		//int v = i.intValue();
		
		h.setObj(10);
		int v = (int) h.getObj();
		System.out.println(v);
		
		Double d1 = new Double(20);
		Double d2 = new Double(5.5);
		System.out.println(somar(d1, d2));
		
		//Integer i1 = new Integer(40);
		//int x = i1.intValue();
		//x++;
		//Integer i2 = new Integer(x);
		
		Integer i = 40;
		i++;
		
		System.out.println(i);
	}
	
	private static double somar(double v1, double v2) {
		return v1 + v2;
	}
}
