package ua.artcode.week3.day2;

/**
 * Created by serhii on 10.05.15.
 */
public class Game {
    public static void main(String[] args) {
        Bow bow = new Bow();
        Axe axe = new Axe();
        Sword sword = new Sword();

        GameCharacter human = new GameCharacter(500,"Vania");
        human.setWeapon(sword);

        GameCharacter ork = new GameCharacter(100,"Petro");
        ork.setWeapon(axe);

        human.fight(ork);
    }


}



interface Weapon {

    int use();

}

class Axe implements Weapon {

   public int use(){
       return 70;
   }
}

class Bow implements Weapon {

    @Override
    public int use() {
        return 30;
    }


}

class Sword implements Weapon {

    @Override
    public int use() {
        return 60;
    }
}

class GameCharacter {

    private int health;
    private String name;
    private Weapon weapon;

    public GameCharacter(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }

    public void hit(GameCharacter enemy){
                    //if(weapon == null) {
                    // damage =  10;
                    // } else {
                    // damage =  weapon.use();
                    // }
        int damage = (weapon == null ? 10 : weapon.use());
        enemy.takeDamage(damage);
    }

    public void fight(GameCharacter enemy){
        while(true){

            this.hit(enemy);
            if(enemy.health < 0){
                System.out.println("You won");
                break;
            }

            enemy.hit(this);
            if(this.health < 0){
                System.out.println("Loose fight");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", weapon=" + weapon +
                '}';
    }
}
