public class Berserk extends Fighter {

    public Berserk(String name) {
        super (name, 10, 2);
    }

    @Override
    public Boolean special(Fighter enemy) {
        System.out.println(name + " did double damage!");
        damage = 4;
        Boolean enemyAttack;
        enemyAttack = attack(enemy);
        damage = 2;
        return enemyAttack;
    }
}