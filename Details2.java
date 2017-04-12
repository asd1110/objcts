class Employee{
int id;
String name;
int age;
double salary;
		void getId(int no){
		id=no;
	}
		void getName(String n){
		name=n;
	}
		void getAge(int a){
		age=a;
	}
		void getSalary(double s){
		salary=s;
	}
		void getEmployeedetails(){
			
			System.out.println(id+" "+name+" "+age+" "+salary);
		}
}

class Details2{
public static void main(String args[]){
System.out.println(args[0]);

Employee emp1=new Employee();
emp1.getId(1);
emp1.getName("dharani");
emp1.getAge(22);
emp1.getSalary(22000);
emp1.getEmployeedetails();


Employee emp2=new Employee();
emp2.getId(2);
emp2.getName("chandu");
emp2.getAge(22);
emp2.getSalary(22000);
emp2.getEmployeedetails();


Employee emp3=new Employee();
emp3.getId(3);
emp3.getName("sneha");
emp3.getAge(22);
emp3.getSalary(22000);
emp3.getEmployeedetails();


}



}


