package introduction;

class Person {

	public static int count = 0;
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	double bmi;
	public String print;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		Person.count++;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

	}

	// bmiメソッドを作成
	public double bmi() {
		double bmi = this.weight / (this.height * this.height);
		return bmi;

	}

	// printメソッドを作成
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + Math.floor(bmi()) + "です");
	}

	// printCountを作成
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}

}
