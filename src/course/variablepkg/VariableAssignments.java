package course.variablepkg;

public class VariableAssignments {
  int x = 2147483647;
  long f = 2147483648L;
  boolean b = false;
  char h = 't';
  String j = "hello";
  float a = 10.52F;
  float c = 1.79769313486231570e+30f;
  double g = 1.79769313486231570e+308;
  byte d;
  short e;
  public static void main(String[] args){
    VariableAssignments obj = new VariableAssignments();
    System.out.println("x => " + obj.x);
    System.out.println("f => " + obj.f);
    System.out.println("b => " + obj.b);
    System.out.println("h => " + obj.h);
    System.out.println("j => " + obj.j);
    System.out.println("a => " + obj.a);
    System.out.println("c => " + obj.c);
    System.out.println("g => " + obj.g);
    System.out.println("d => " + obj.d);
    System.out.println("e => " + obj.e);
  }
}
/* 
 * >> Used in lesson 21. Variable Assignments
 */
