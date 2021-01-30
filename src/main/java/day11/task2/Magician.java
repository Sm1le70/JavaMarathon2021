package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private int physAtt = 5;
    private int magicAtt = 20;
    private int physDef = 0;
    private int magicDef = 80;

    public Magician() {
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
}
