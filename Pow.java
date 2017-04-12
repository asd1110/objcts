class Calculator{
static double powerInt(double num1,int num2){
double i=num1;
int j=num2;
double x=Math.pow(i,j);
return(x);
}
}

class Pow{
public static void main(String args[]){
//Calculator my=new Calculator();
double result=Calculator.powerInt(2.0,3);
System.out.println("result from main  :"+result);



}






}