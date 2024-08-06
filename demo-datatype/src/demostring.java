public class demostring {
  
  public static void main(String[]arg){
    String s;
    s = "abc";
    
    String s2 = "def"; //"def" is a String value, and then assign to String varible

    String s3 = "3";
    s3 = s3 +1;
    //String value + int value
    //string value + string value
    System.out.println(s3);//31

    int i = 1;
    String s4 = "1 + 0 =";
    System.out.println(s4 += i);

    //In String, there is no -, *, /, %

    //exmaple 1 
    int age = 40; 
    String message = " I'm " + age + " years old";
    System.out.println(message);

    //+= exmaple
    String firstname = "mynon";
    String lastname = "Man";
    String fullname = "";

    fullname += firstname + " " + lastname;
    System.out.println(fullname); //mynon man

    //primitive for math operation or comparsion (<, > ,<=, >=, ==, !=)
    //string is not a primitive, we use method (tools) to compare their value

    String s10 = "hello";
    String s20 = "hello";
    System.out.println(s10.equals(s20));//true

    //equals
    boolean isvalueSame = "abc".equals(s20); //false

    //charAt()
    char result = s10.charAt(1);//second character of the string value
    System.out.println(result);//e 
    System.out.println(s10.charAt(0));//h
    System.out.println(5);//out of range
    //s10.charAt(1L)
    //s10.charAt(1.0)

    System.out.println(s10.charAt(2) =='l');//true
    System.out.println(s10.charAt(2) !='l');//false 

    //lenght()
    System.out.println(s10.length());//5
    System.out.println(s10.length()>= 5);// true
  }
}
