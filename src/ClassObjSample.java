public class ClassObjSample {
    public static void main(String[] args) {

    }
}

class Person {
    String name;
    int age;
    String gender;

    // sleep method of this person class
    void sleep() {
        if(age < 10){
            System.out.println(name  + " will sleep more than 12 hours in a day.");
        }else if(age >= 10 && age <= 50){
            System.out.println(name + " will sleep less than 10 hours in a day.");
        }else{
            System.out.println(name + " will sleep an average of 10 hours in a day.");
        }
    }
}
