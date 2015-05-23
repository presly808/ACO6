package ua.artcode.week5.inner_cl;


import java.util.ArrayList;

public class Flat {

    private double price;
    private String address;
    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Window> windows = new ArrayList<>();


    public void addNewRoom(String name, int square, double price){
        Room room = new Room(name,square,price);
        rooms.add(room);
    }

    public void addWindow(int height, int width){
        Window window = new Window(height,width);
        windows.add(window);
    }

    //inner - non-static
    public class Room { // depends on outer class

        double price;
        String name;
        int square;

        public Room(String name, int square, double price) {
            this.name = name;
            this.square = square;
            this.price = price;
            Flat.this.price += price;
        }


        public void test(){
            price = 345;// get outer class object...
        }


    }

    // nested - static
    public static class Window {
        int height;
        int width;

        public Window() {
        }

        public Window(int height, int width) {
            this.height = height;
            this.width = width;
        }

        public void test(){
//            price++;
        }
    }



}
