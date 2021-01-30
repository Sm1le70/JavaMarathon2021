package day11.task2;

public abstract class Hero {
    public static final int MAX_HEALTH = 100, MIN_HEALTH = 0;
    private int health = 100;
    private int physAtt;
    private int magicAtt;
    private int physDef;
    private int magicDef;

    public void setHealth(int health) {
        if (health > MAX_HEALTH) {
            this.health = MAX_HEALTH;
        } else if (health < MIN_HEALTH) {
            this.health = MIN_HEALTH;
        } else this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getPhysDef() {
        return physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }

    public String toString() {
        return (this.getClass().getSimpleName() + "{health=" + this.getHealth() + "}");
    }
}
