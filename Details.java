class Employee{
String name;
int age;
double salary;
static String companyname="wipro";
}
class Details{
public static void main(String args[]){
	int ch=Integer.parseInt(args[0]);

Employee emp1=new Employee();
emp1.name="dharani";
emp1.age=22;
emp1.salary=22000;



Employee emp2=new Employee();
emp2.name="chandu";
emp2.age=21;
emp2.salary=22000;


Employee emp3=new Employee();
emp3.name="sneha";
emp3.age=21;
emp3.salary=22000;


switch(ch){
case 1 :
System.out.println(emp1.name+" "+emp1.age+" "+emp1.salary+" "+emp1.companyname);
break;

case 2 :
System.out.println(emp2.name+" "+emp2.age+" "+emp2.salary+" "+emp2.companyname);
break;

case 3:
System.out.println(emp3.name+" "+emp3.age+" "+emp3.salary+" "+emp3.companyname);
break;

default:
System.out.println("employee doesnt exist");
}


}
}



