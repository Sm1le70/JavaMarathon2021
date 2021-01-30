package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    private int physAtt = 30;
    private int physDef = 80;
    private int magicDef = 0;

    public Warrior() {
        super.setPhysAtt(physAtt);
        super.setPhysDef(physDef);
        super.setMagicDef(magicDef);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getPhysAtt() - (this.getPhysAtt() * hero.getPhysDef() / 100)));
    }


}
