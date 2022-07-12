abstract class Fighter {
    
    protected String name;
    protected int hitPoints; 
    protected int attacks = 0; 
    protected int blocks = 0; 
    protected int damage; 
    protected int ultimatesLeft = 3;


    public Fighter(String name, int hitPoints, int damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public Fighter() {

    }
    
    public Boolean attack(Fighter enemy) {
        if (attacks != enemy.getBlocks()) {
            switch (attacks) {
                case 1:
                    System.out.println(name + " Successful attack in head");
                    break;
                case 2:
                    System.out.println(name + " Successful attack in body");
                    break;
                case 3:
                    System.out.println(name + " Successful attack in smell");
                    break;
                case 4:
                    System.out.println(name + " Successful attack in legs");
                    break;
            }
            enemy.takeHits(damage);
            System.out.println("Health " + enemy.getName() + ": " + enemy.getHitPoints());
        } else switch (enemy.getBlocks()) {
            case 1:
                System.out.println(enemy.getName() + " Successful head defend");
                break;
            case 2:
                System.out.println(enemy.getName() + " Successful body defend");
                break;
            case 3:
                System.out.println(enemy.getName() + " Successful smell defend");
                break;
            case 4:
                System.out.println(enemy.getName() + " Successful legs defend");
                break;
        }


        if (enemy.getHitPoints() <= 0) return false;
        else return true;
    }
    
    public Boolean special(Fighter enemy) {
        if (enemy.getHitPoints() < 0) return false;
        else return true;
    }

    
    public void takeHits(int hits) {
        this.hitPoints -= hits;
    }
    
    public void setTactics(int attacks, int blocks) {
        this.attacks = attacks;
        this.blocks = blocks;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttacks() {
        return attacks;
    }

    public int getBlocks() {
        return blocks;
    }

    public String getName() {
        return name;
    }

    public int getUltimates() {
        return ultimatesLeft;
    }
}