package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private int physAtt = 15;
    private int physDef = 50;
    private int magicDef = 20;
    private int healHimself = 25;
    private int healTeammate = 10;

    public Paladin() {
        super.setPhysAtt(physAtt);
        super.setPhysDef(physDef);
        super.setMagicDef(magicDef);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + healTeammate);
    }

    @Override
    public void healHimself() {
        this.setHealth(this.getHealth() + healHimself);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getPhysAtt() - (this.getPhysAtt() * hero.getPhysDef() / 100)));
    }
}
