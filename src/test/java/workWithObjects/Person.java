package workWithObjects;

import org.testng.annotations.Test;

public class Person {

    @Test
    public void doit(){
      //  System.out.println("Hello, my name is " + name + ".My age is" + age + ".And my speciality is " + speciality);
      //  System.out.println();

        Engineer engineerProgrammer = new Engineer("Jacky", 19);
        System.out.println(engineerProgrammer.engeneerName + ":" + engineerProgrammer.age);


        Engineer engineerQA = new Engineer("Amanda", 25);
        System.out.println(engineerQA.engeneerName + ":" + engineerQA.age);


        Engineer engineerPovar = new Engineer("Taras", 37);
        System.out.println(engineerPovar.engeneerName + ":" + engineerPovar.age);
    }

    int age = 25;
    String name = "Katerina";
    String speciality = "Automation";
}
