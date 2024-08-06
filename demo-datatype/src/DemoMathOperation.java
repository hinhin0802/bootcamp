public class DemoMathOperation {
  public static void main(String[] arg){
    int x = 10 + 3;
    System.out.println(x);//13


    x = x + 3 - 9;
    System.out.println(x);//10

    x = x -5 * 2;
    System.out.println(x);//-3

    x = (x - 1) / 2;
    System.out.println(x);//-2

    int remainder = 5 % 2;
    System.out.println(remainder); // 1

    int remainder2 = 10 % 2;
    System.out.println(remainder2); // 0
    
    System.out.println(0/10); //0
    //System.out.println(10/0); //undefine
    //as a developer, you should avoid divided by zero

    int j = 2;
    System.out.println(10 / j);//5

    System.err.println("--------------------------------------------");

    double d2 = 10.5;
    System.out.println(d2+3);
    System.out.println(d2-3.5);
    System.out.println(d2*3);
    System.out.println(d2/3);
    System.err.println(d2+(3+3.5));
    
    //+1 operation
    int a = 1;
    a = a + 1;
    a++;
    ++a;
    a +=1;
    System.out.println(a);//5
    //+2 operation
    int b = 1;
    b = b + 2;
    b +=2;
    System.out.println(b);//5
    //- 1 operation
    a = a - 1;
    a--;
    --a;
    a-=1;
    System.out.println(a);//1

    //x2 operation
    b = b* 2;
    b *=2; 
    System.out.println(b); //20

    //Divide 3 operation
    int r = 99;
    r = r /3;
    r /= 3;
    System.out.println(r);//11
    //example
    int apple = 3;
    int oranges = 10;
    double priceperapple = 3.3;
    double priceperorange = 5.5;

    double totalamount;
    totalamount = priceperapple * apple + priceperorange * oranges;
    //int * double + int * double
    System.out.println(totalamount);

    //exmaple 2
    int math = 90;
    int english =78;
    int history =62;

//double avergeScore = (math + english + history) / 3; (wont work)
    //int + int + int / int
    //int / int --> int 
    //230 / 3 -> 76.6666

double avergeScore = (math + english +history) / 3.0;// make 3.0 as a double
    //int + int + int / double
    //int / double

    System.out.println(avergeScore);

  //++x, x++, --x, x--
  int k = 0;
  int o = k++ + 3; //3 
  //k++ + 3
  //k + 3
  //assignment
  // k + 1 
  System.out.println(o); //3 
  System.out.println(k); //1
  
  
  int u = 0;
  int e = ++u + 3;
  //1. u+1
  //2. u+3
  //3. assignment
  System.out.println(e);//4
  System.out.println(u);//1

  int o1 = 0;
  int p = --o1 + 3;
  System.out.println(o1); //-1
  System.out.println(p); //2

  int o2 = 0;
  int p2 = o2-- + 3;
  System.out.println(o2); //-1
  System.out.println(p2); //3 
  }
}
