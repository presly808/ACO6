package ua.artcode.week3.day1;

/**
 * Created by master on 09.05.15.
 */
public class TestEquals {
    public static void main(String[] args) {
        ICup cup1 = new ICup(250, "plastic", 0.25);
        ICup cup2 = new ICup(250, "plastic", 0.25);
        ICup cup3 = cup1;


        System.out.printf("Reflectivity %s\n", cup1.equals(cup3));


        System.out.printf("Symmetric %s\n", cup1.equals(cup3) == cup3.equals(cup1));


        System.out.printf("Transitivity %s\n", cup1.equals(cup2) == cup2.equals(cup3) == cup1.equals(cup3));






        System.out.println(cup1 == cup2);
        System.out.println(cup1.equals(cup2));

    }

}

class ICup {

    private int size;
    private String material; // null
    private double price;

    public ICup(int size, String material, double price) {
        this.size = size;
        this.material = material;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isEqual(ICup cup){
        if(cup == null){
            return false;
        }

        if(this == cup){
            return true;
        }


        if(this.size == cup.size &&
                Double.compare(this.price, cup.price) == 0 &&
                (this.material != null && this.material.equals(cup.material))){
            return true;
        }

        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }

        if(this == obj){
            return true;
        }

        if(this.getClass() != obj.getClass()){
            return false;
        }

        ICup other = (ICup) obj;

        if(this.size == other.size &&
                Double.compare(this.price, other.price) == 0 &&
                (this.material != null && this.material.equals(other.material))){
            return true;
        }

        return false;
    }
}
