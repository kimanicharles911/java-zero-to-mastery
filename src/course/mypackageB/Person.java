package course.mypackageB;

public class Person {
    public String name;
    public int age;
    public String gender;

    // sleep method of this person class
    public void sleep() {
        if(age < 10){
            System.out.println(name  + " will sleep more than 12 hours in a day.");
        }else if(age >= 10 && age <= 50){
            System.out.println(name + " will sleep less than 10 hours in a day.");
        }else{
            System.out.println(name + " will sleep an average of 10 hours in a day.");
        }
    }
}

/* 
 * >> Also referenced in Lesson 19. Introduction to Java Variables
 */