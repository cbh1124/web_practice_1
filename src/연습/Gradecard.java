package ����;

public class Gradecard {
	/*
	 *  1. �����ʹ� Ű����� �Է¹޾� �迭�� �����մϴ� .
	 *  2. ���� �Է��� 5������ �ϵ� ������ �Է��� �����ϵ��� �ۼ��մϴ�.
	 *  3. ��ȣ, �̸�, ����, ����, ������ �Է��ϰ�, ������ ����� ���Ͽ� ����մϴ�.
	 *  4. ����� �Ҽ��� ���� 2�ڸ������� �մϴ�.
	 *  5. ������ �̿��Ͽ� ������ ���մϴ�.
	 *  6. �Է� ������ ���Ͽ� ���ܹٻ� ��Ȳ�� ���� ó�����մϴ�. 
	 *  
	 *  �ش� ������ Ǫ�� �ð� 50�� 
	 *  
	 *  ��ŸƮ �迭 ���� = ��ü�� ���� ������ �� 
	 *  ��ȣ �̸� ���� ���� ������ �Է��ϰ�, ������ ����� �ڵ�        ���� : ��ȣ , �̸�, ����, ����, ����  5�� ���� ����
	 *  
	 * */
		// �ʵ� ����
		private int numbers;
		private String name;
		private int kor;
		private int eng;
		private int math;
		private int sumpoint;
		private int avg;
		private int rank;
		
		// ������ ����
		public Gradecard(int numbers, String name, int kor, int eng, int math, int sumpoint, int avg, int rank) {
			this.numbers = numbers;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			this.sumpoint = sumpoint;
			this.avg = avg;
			this.rank = rank;
		}
		
		// getter setter
		public int getNumbers() {
			return numbers;
		}

		public void setNumbers(int numbers) {
			this.numbers = numbers;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getKor() {
			return kor;
		}

		public void setKor(int kor) {
			this.kor = kor;
		}

		public int getEng() {
			return eng;
		}

		public void setEng(int eng) {
			this.eng = eng;
		}

		public int getMath() {
			return math;
		}

		public void setMath(int math) {
			this.math = math;
		}

		public int getSumpoint() {
			return sumpoint;
		}

		public void setSumpoint(int sumpoint) {
			this.sumpoint = sumpoint;
		}

		public int getAvg() {
			return avg;
		}

		public void setAvg(int avg) {
			this.avg = avg;
		}

		public int getRank() {
			return rank;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}
		
		
		


		
		
		
		
		
		
	
		
}
