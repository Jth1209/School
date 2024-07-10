package Java0710;

public class BitAdd {

	public static void main(String[] args) {
		int a = 60;
		int b = -10;
		System.out.printf("[%32s] %d\n",Integer.toBinaryString(a),a);
		System.out.printf("[%32s] %d\n",Integer.toBinaryString(b),b);
		System.out.printf("[%32s] %d\n",Integer.toBinaryString(a&b),a&b);
		System.out.printf("[%32s] %d\n",Integer.toBinaryString(a|b),a|b);
	}

}
