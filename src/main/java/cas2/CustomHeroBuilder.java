package cas2;

public class CustomHeroBuilder implements HeroBuilder{

    private Hero hero;

    @Override
    public void setRace(String race) {
        hero.setRace(race);
    }

    @Override
    public void setName(String name) {
        hero.setName(name);
    }

    @Override
    public void setClass(String heroClass) {
        hero.setHeroClass(heroClass);
    }

    @Override
    public void setArmor(String armor) {
        hero.setArmor(armor);
    }

    @Override
    public void setWeapon(String weapon) {
        hero.setWeapon(weapon);
    }

    @Override
    public void reset() {
        hero = new Hero();
    }

    @Override
    public Hero getResult() {
        return hero;
    }
}
