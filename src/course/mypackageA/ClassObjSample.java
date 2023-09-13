package course.mypackageA;

public class ClassObjSample {
    public static void main(String[] args) {
        // an object for the person class
        Person alex = new Person();
        alex.name = "Alex";
        alex.age = 55;
        alex.gender = "Male";
        alex.sleep();

        Person mia = new Person();
        mia.name = "Mia";
        mia.age = 40;
        mia.gender = "Female";
        mia.sleep();

        Person james =  new Person();
        james.name = "James";
        james.age = 23;
        james.gender = "Male";
        james.sleep();

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
