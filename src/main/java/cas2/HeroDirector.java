package cas2;

public class HeroDirector {
    public Hero makeElf(HeroBuilder builder){
        builder.reset();
        builder.setRace(Race.ELF);
        builder.setName("Link");
        builder.setClass(HeroClass.FIGHTER);
        builder.setWeapon("Master Sword");
        builder.setArmor("Green Tunic");
        return builder.getResult();
    }

    public Hero makeHuman(HeroBuilder builder){
        builder.reset();
        builder.setRace(Race.HUMAN);
        builder.setName("Mario");
        builder.setClass(HeroClass.MAGE);
        builder.setWeapon("Flame flower");
        builder.setArmor("Plumber's overalls");
        return builder.getResult();
    }
}
