package ua.artcode.week2.day1.interfaces;

/**
 * Created by serhii on 26.04.15.
 */
public class TestInterfaces {

    public static void main(String[] args) {
        Worker worker = new Worker();
        Student student = new Student();
        SuperPerson superPerson = new SuperPerson();


        Company company = new Company();

        company.doInterview(worker);
        company.doInterview(superPerson);


        University university = new University();
        university.testStudent(student);
        university.testStudent(superPerson);


    }

}

interface IWorker {

    public void work();

}

class Worker implements IWorker {

    public void work(){
        System.out.println("worker work method");
    }

}

class Company{

    void doInterview(IWorker worker){
        worker.work();
    }

}

interface IStudent {

    public void study();
}

class Student implements IStudent {

    public void study(){
        System.out.println("student study method");
    }

}

class University {

    public void testStudent(IStudent student){
        student.study();
    }

}

class SuperPerson implements IStudent, IWorker {

    public void work(){
        System.out.println("Super Person work");
    }

    public void study(){
        System.out.println("Super Person study");
    }

}