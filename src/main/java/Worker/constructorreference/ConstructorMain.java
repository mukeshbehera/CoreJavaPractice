package Worker.constructorreference;



public class ConstructorMain {

	public static void main(String[] args) {
		
		System.out.println("Learning Constructor Reference");
		
		
		//Lamda
		StudentProvider studentProviderLamda = () -> {
			return new Student();
		};
		Student studentObj = studentProviderLamda.getStudent();
		studentObj.display();
		
		
		
		System.out.println("\n");
		
		
		//constructor reference ( ClassName::new )
		StudentProvider studentProviderConstructor = Student::new;
		Student student = studentProviderConstructor.getStudent();
		student.display();
	}
}
