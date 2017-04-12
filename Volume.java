class Box{
int h;
int b;
int l;
public int vol(int h,int b,int l){
return(h*b*l);
}
}


class Volume{
public static void main(String args[]){
Box my=new Box();
int result=my.vol(1,2,3);
System.out.println("main:"+result);
}
}
