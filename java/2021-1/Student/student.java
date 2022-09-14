/*학번 : 20215247
이름 : 조아현
실습 목표 : 1. 객체의 구성
 1) 클래스의 구성
 3) 간단한 메서드 작성*/

package Student;

class student {

		private String studentNo;
		private String studentName;
		private int grade;
		private String dept;
		
		public String get_studentNo() {
			return studentNo;
		}
		public String get_studentName() {
			return studentName;
		}
		public int get_grade() {
			return grade;
		}
		public String get_dept() {
			return dept;
		}
		public void set_studentNo(String number) {
			studentNo = number;
		}
		public void set_studentName(String name) {
			studentName = name;
		}
		public void set_grade(int a) {
			grade = a;
		}
		public void set_dept(String b) {
			dept = b;
		}
		public String toString() {
			return "학번 : "+studentNo+"\n이름 : "+studentName+"\n학년 : "+grade+"\n학과 : "+dept;

		}

	}

	class StudentEx{
		public static void main(String[]args) {
			student std1 = new student();
			std1.set_studentNo("20210000");
			std1.set_studentName("홍길동");
			std1.set_grade(1);
			std1.set_dept("소프트웨어융합대학");
			
			student std2 = new student();
			std2.set_studentNo("20210001");
			std2.set_studentName("이순신");
			std2.set_grade(2);
			std2.set_dept("소프트웨어융합대학");
			
			student std3 = new student();
			std3.set_studentNo("20215247");
			std3.set_studentName("조아현");
			std3.set_grade(1);
			std3.set_dept("소프트웨어융합대학");
			
			System.out.println(std1.toString());
			System.out.println(std2.toString());
			System.out.println(std3.toString());
			
			
		}
	}