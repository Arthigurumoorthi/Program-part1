package javado;


public class Methodoverloading {
	

	public void log(int a, int b){
		System.out.println(a);
		}
		public void log1(float a, float b) {
			System.out.println(b);
		}
        public void log3(double a, double b) {
        	System.out.println(b);
        }
	public static void main(String[] args) {
    Methodoverloading li = new Methodoverloading();
			li.log(111, 222);
			li.log1(0, 1);
			li.log3(1.2, 1.3);

	}

}
