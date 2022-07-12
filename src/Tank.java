public class Tank extends Fighter {


    public Tank(String name) {
        super (name, 20, 1);
    }

    @Override
    public Boolean special(Fighter enemy) {
        System.out.println( name + " throw net at opponent");
        enemy.takeHits(damage);
        if (enemy.getHitPoints() < 0) return false;
        else return true; 
    }
}
