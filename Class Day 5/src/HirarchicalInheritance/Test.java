package HirarchicalInheritance;

public class Test {

	public static void main(String[] args) {

		Employee em = new Employee();
		Student st = new Student();

		em.input();
		em.input_emp();
		em.show_EmpDetails();
		System.out.println("****************");
		st.input();
		st.input_Student();
		st.showStudentDetails();

	}

}
