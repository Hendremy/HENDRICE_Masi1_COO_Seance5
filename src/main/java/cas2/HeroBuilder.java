package cas2;

public interface HeroBuilder {
    public void setRace(String race);
    public void setName(String name);

    public void setClass(String heroClass);

    public void setArmor(String armor);

    public void setWeapon(String weapon);

    public void reset();

    public Hero getResult();
}
