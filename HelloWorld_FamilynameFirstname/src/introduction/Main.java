package introduction;

class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		//Person BMI = new Person();
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		System.out.println();
		person1.print();
		person1.bmi();
		System.out.println();
		System.out.println("合計" + Person.count + "人です");
	}
}
