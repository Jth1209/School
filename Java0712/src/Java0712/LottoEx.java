package Java0712;

import java.util.Random;
import java.util.HashSet;
import java.util.Set;


public class LottoEx {

	public static void main(String[] args) {
		Random rand = new Random();
		Set<Integer> lottoSet = new HashSet<>();//
        while(lottoSet.size() <6) {
        	int number = rand.nextInt(45) + 1;
        	lottoSet.add(number);
        } 
//		lottoSet.add(1);
//		lottoSet.add(1);
//		System.out.println(lottoSet.size());
        System.out.println(lottoSet);
	}

}
