package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private int physAtt = 10;
    private int magicAtt = 15;
    private int physDef = 20;
    private int magicDef = 20;
    private int healHimself = 50;
    private int healTeammate = 30;

    public Shaman() {
        super.setPhysAtt(physAtt);
        super.setMagicAtt(magicAtt);
        super.setPhysDef(physDef);
        super.setMagicDef(magicDef);
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getMagicAtt() - (this.getMagicAtt() * hero.getMagicDef() / 100)));
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getPhysAtt() - (this.getPhysAtt() * hero.getPhysDef() / 100)));
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + healTeammate);
    }

    @Override
    public void healHimself() {
        this.setHealth(this.getHealth() + healHimself);
    }
}
