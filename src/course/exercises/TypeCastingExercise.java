package course.exercises;

public class TypeCastingExercise {
  public static int printResult(float xValue){
    int algoIntVal = (int)xValue;
    return algoIntVal;
  }

  public static void main(String[] args) {
    float floatAlgoVal = 5.2f;
    System.out.println(TypeCastingExercise.printResult(floatAlgoVal));
  }
}
/*
 * >> For lesson 23 or Coding Exercise 4: Variables Understanding & Imports Understanding or 23. Solution Coding Exercise 4: variables understanding
 */