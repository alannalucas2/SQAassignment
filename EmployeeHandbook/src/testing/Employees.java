package testing;

public class Employees {
	
	public Employees() {
	}

		public int numberOfEmployees(int[]numberOfEmps) {
			int answer = 0;
			int max = 5;
			int min = 1;
			
			if(numberOfEmps.length<= max || numberOfEmps.length >= min) {
				System.out.println(numberOfEmps.length);
				answer = numberOfEmps.length;
			}
			
			System.out.println(answer);
			return answer;
		
		}

}
