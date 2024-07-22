package snippet;

public class Snippet {
	Calculator cal1;
		
		void setCalculator(Calculator calculator) {
			this.setName("USer1");
			this.cal1 = calculator;
		}
		
		void setMemory() {
			cal1.setMemory(100);
		}
}

