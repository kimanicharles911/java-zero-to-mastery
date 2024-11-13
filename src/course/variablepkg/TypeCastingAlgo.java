package course.variablepkg;

public class TypeCastingAlgo {
  float f = 10.52f;
  int x = (int)f; /* Explicit Type Casting */

  byte n = 10;
  byte y = 20;
  byte z = (byte) (n + y);

  public static void main(String[] args){
    TypeCastingAlgo algoOne = new TypeCastingAlgo();

    System.out.println(algoOne.x);
    System.out.println(algoOne.z);
  }
}

/* 
 *  Used in lesson 22 Type Casting ( Includes Implicit & Explicit Type Casting )
 */