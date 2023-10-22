package cas2;

import static cas2.HeroClass.FIGHTER;
import static cas2.Race.HUMAN;

public class Hero {
    private String name;
    private String race;
    private String heroClass;
    private String armor;
    private String weapon;

    public void setRace(String race){
        this.race = race;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo(){
        return String.format("\n %s - %s %s : \n - Armor : %s \n - Weapon : %s  \n", name, race, heroClass, armor, weapon);
    }
}
