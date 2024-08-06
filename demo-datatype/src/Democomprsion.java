public class Democomprsion {

  public static void main(String[]arg){
    // >, <, >=, <=
    System.out.println(3 >= 2);//true
    int x = 10;
    int y = 11;
    boolean isYlargerthanX = y > x;
    System.out.println(isYlargerthanX); // true

    System.out.println(x + 3 < y + 2); //false
    boolean result = x + 3 < y + 2;

    //==, !=
    // single "=" --> assignment
    int x2 = 3;
    // double "==" --> compare
    System.out.println(x2 == 4); // false
    System.out.println(x2 == 3);// true
    // "!=" --> not equal 
    System.out.println(x2 != 3);// false
    System.out.println(x2 != 4);// true

    double d1 = 10.4; 
    System.out.println(d1 <= 10.4);// true
    
//more then one event
int j1=10;
int j2=12;
System.out.println(j1 > j2);//false
//OR ||
//and &&
System.out.println(j1 > j2|| j1 < 11);//true
System.out.println(j1 > j2&& j1 < 11);//false

System.out.println(true&&true);// ture
System.out.println(true&&false);//falase
System.out.println(true||false);//ture
System.out.println(false||false);//false


  }

}
