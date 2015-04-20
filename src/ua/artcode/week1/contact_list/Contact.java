package ua.artcode.week1.contact_list;

// Create , Write template
// class contains :
// data - fields
// action - methods
public class Contact {


    // DEFAULT construct - without args
    public Contact(){

    }

    public Contact(String name, String phone, int age){
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    // Fields
    private String name; //null
    private String phone; // null
    private int age; // 0

    // Methods
    public void showContact(){
        System.out.println("name : " + name +
                            " phone : " + phone +
                            " age : " + age);
    }

    public void setName(String name){
       this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    private void testThis(){
        Contact me = this;

    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void initContact(String name, String phone, int age){
        this.name = name;
        this.phone = phone;
        this.age = age;
    }
}
