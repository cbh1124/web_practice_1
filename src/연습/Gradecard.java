package 연습;

public class Gradecard {
	/*
	 *  1. 데이터는 키보드로 입력받아 배열에 저장합니다 .
	 *  2. 성적 입력은 5명으로 하되 무제한 입력이 가능하도록 작성합니다.
	 *  3. 번호, 이름, 국어, 영어, 수학을 입력하고, 총점과 평균을 구하여 출력합니다.
	 *  4. 평균은 소숫점 이하 2자리까지로 합니다.
	 *  5. 총점을 이용하여 석차를 구합니다.
	 *  6. 입력 오류에 대하여 예외바생 상황에 대한 처리를합니다. 
	 *  
	 *  해당 문제를 푸는 시간 50분 
	 *  
	 *  스타트 배열 저장 = 객체로 만들어서 생성할 것 
	 *  번호 이름 국어 영어 수학을 입력하고, 총점과 평균은 자동        변수 : 번호 , 이름, 국어, 영어, 수학  5개 변수 선언
	 *  
	 * */
		// 필드 선언
		private int numbers;
		private String name;
		private int kor;
		private int eng;
		private int math;
		private int sumpoint;
		private int avg;
		private int rank;
		
		// 생성자 선언
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
