package Java0711;

public class ArrayEx01 {
	public static void main(String[] args) {
		int[] scores = {83,59,95};
		int[] scores1 = new int[]{83,90,87};
		int sum = 0;
		double avg = 0;
		System.out.println(scores[2]);
		for(int i =0; i<scores1.length; i++) {
			sum += scores1[i];
		}
		System.out.println(sum);
		avg = (double)sum/scores1.length;
		System.out.println(avg);
		
	}

}
