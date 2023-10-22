package cas2;

public class Cas2 {
    public static void main(String[] args) {
        HeroDirector director = new HeroDirector();
        HeroBuilder customHeroBuilder = new CustomHeroBuilder();

        Hero defaultElf = director.makeElf(customHeroBuilder);
        Hero defaultHuman = director.makeHuman(customHeroBuilder);

        customHeroBuilder.reset();
        customHeroBuilder.setName("Rémy Hendricé");
        customHeroBuilder.setRace(Race.HUMAN);
        customHeroBuilder.setClass(HeroClass.PRIEST);
        customHeroBuilder.setArmor("T-shirt");
        customHeroBuilder.setWeapon("IntelliJ");

        Hero me = customHeroBuilder.getResult();

        System.out.println(defaultElf.getInfo());
        System.out.println(defaultHuman.getInfo());
        System.out.println(me.getInfo());
    }
}