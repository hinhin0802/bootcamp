public class DemoPrimitive{
  public static void main(String[] args) {
    int x = 100;
    int y;
    y = -13;
    System.out.println(y); //-13
    //reassign y = 9
    y = 9;
    System.out.println(y); //9
    System.out.println(20); //20
    System.out.println(x); //100

    int age = 30;
    double q = 30.5;
    System.out.println(q); //30.5

    double u = 10; //10 is int value
    //When int value assigned to double type variable
    //Java will help auto-cvonvert int value to double value(10->10.0)
    //Finally, assignment -> 10.0 -> u
    double i = 10.0;
    //10.0 is a double value, assign to variable

    char c = 'i';
    char c2 = '9';
    char c3 = ' ';

    double d1 = 3.3;
    double d2 = 3.3d;// describe 3.3 is a double value
    
    //float f1 = 3.3; 3.3 is a double need to add f to assign it to a float variable
    float f1  = 3.3f;
    //float is a  lower level type comparing with double

    double f2 = 3.3f;
    //3.3f os a float value, lower value can be assigned to higher type
    int h = 4;
    long l1 = 4;// long is a higher level then int

    long l2 = 4L;// 4l is a long value
    
    //Primitive:
    //int, long, float, double
    // char, byte, short, boolean
    
    // integer:byte -> short -> int -> long
    byte b1 = 3;
    //assign int value to byte variable
    //inte value -> byte value(implicaitly)
    int i2 = 3;
    //byte b2 = i2; has already shown i2 is a interger range can be change don't work on byte (WRONG)
    // Java does not allow higher level type to lower level type

    int i3 = b1;

    b1 = -128;
    //b1 = -129; // out of range
    b1 = 127;
    //b1 = 128; // out of range

    short s1 = 3;

    short s2;
    //int i4 = s2;
    //short s3 = i4; //non acceptable range
    
    short s4 = -32768;
    //s4 = -32769;//out of range
    s4 = -32768;
    //s4 = 32769;//out of range
    
    int il = 3;
    long l3 = 3;

    //long il = l3// explicilly assign long value

    boolean bl = false;
    bl = true;

    boolean result = 3 > 2; // true
    System.out.println(result); //true
    System.out.println(2 > 3);// false

    int i9 = 300;
    System.out.println(i9 > 200);//true

    int age2 = 66;
    boolean iselderly = age2 > 65; //if age older then 65 result shows is elderly
    System.out.println(iselderly); //true
    
  }
}