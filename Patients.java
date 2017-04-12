class Patient{
	String name;
public double bmi(double h,double w){
//double h=height;
//double w=weight;
double b=((w/(h*h))*703);
return b;
}
}

class Patients{
	
public static void main(String args[]){
Patient p1=new Patient();
p1.name="dharani";
double result1=p1.bmi(63.7,121.2);

Patient p2=new Patient();
p2.name="chandu";
double result2=p2.bmi(65.7,140.2);

System.out.println("name of patient is:"+p1.name+" "+"& BMI is"+result1);
System.out.println("name of patient is:"+p2.name+" "+"& BMI is"+result2);
}
}



