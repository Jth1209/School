package Java0712;

import java.util.Random;
public class Ex3 {
	public static void main(String[] args) {
//		int[][] scores = new int[2][3];
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		for(int i =0; i < array.length; i++) {
			for(int j = 0; j< array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
	}
}
