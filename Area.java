//circle 2r,rect l*w,square a*a


class Area
{

public static int formulaOfArea(int l,int w){
int area=l*w;
return area;
}

public static int formulaOfArea(int a){
int area= a*a;
return area;
}

public static double formulaOfArea(double r){
double area= 2*r;
return area;
}

public static void main(String args[]){

int rec=Area.formulaOfArea(25,35);
int squ=Area.formulaOfArea(20);
int cir=Area.formulaOfArea(2);
System.out.println("Area of a rectangle is" +rec);
System.out.println("Area of a square is" +squ);
System.out.println("Area of a circle is" +cir);
}
}