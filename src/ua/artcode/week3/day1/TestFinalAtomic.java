package ua.artcode.week3.day1;

public class TestFinalAtomic {


    public static void main(String[] args) {
        AtomicStation atomicStation = new AtomicStation();
        Town town = new Town(atomicStation);

        town.wakeUp();
    }

}

/*class FakeAtomicStation extends AtomicStation {

    @Override
    public void start(int temperature) {
        System.out.println("Boom");
    }
}*/

final class AtomicStation {

    // constant
    private static final int CRITICAL_TEMPERATURE = 70;

    public AtomicStation() {
    }

    public final void start(int temperature){
        if(temperature < CRITICAL_TEMPERATURE){
            System.out.println("start station");
        } else {
            System.out.println("Save mode on");
        }
    }

    public void showStatus(){
        System.out.println("normal");
    }

}

class Town {

    private AtomicStation atomicStation;

    public Town(AtomicStation atomicStation) {
        this.atomicStation = atomicStation;
    }

    public void wakeUp(){
        atomicStation.start(35);
    }
}
