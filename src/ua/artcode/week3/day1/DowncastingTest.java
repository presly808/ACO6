package ua.artcode.week3.day1;

/**
 * Created by master on 09.05.15.
 */
public class DowncastingTest {
    public static void main(String[] args) {
        defineWorker(new Coder());
    }

    public static void defineWorker(Worker worker){

        // comparing type of object
        if(worker.getClass() == Tester.class){
            Tester tester = (Tester) worker;
        }
        // instance of
        // reference instance of Type(class)
        if(worker instanceof Coder){
            Coder coder = (Coder) worker;// downcasting
            coder.code();
        }
    }
}

class Worker {

    void work(){
        System.out.println("work worker");
    }

}

class Coder extends Worker {
    void code(){
        System.out.println("coding");
    }
}

class Tester extends Worker{
    void test(){
        System.out.println("testing");
    }
}
