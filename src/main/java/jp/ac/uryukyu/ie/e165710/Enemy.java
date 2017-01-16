package jp.ac.uryukyu.ie.e165710;

/**
 * Created by e165710 on 2017/01/16.
 */
public class Enemy extends LivingThing{
    public Enemy (String name, int maximumHP, int attack){
        super (name, maximumHP, attack);
    }
    @Override
    public void attack(LivingThing e) {
        if (!isDead()) {
            int damage = (int) (Math.random() * getAttack());
            if (damage == 0) {
                System.out.printf("%sの攻撃!,,,だが、%sは攻撃を回避\n", getName(), e.getName());
            } else {
                int judge = (int) (Math.random() * 10);
                if (judge <= 1) {
                    damage = damage *5;
                    System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！！\n", getName(), e.getName(), damage * 2);
                } else {
                    System.out.printf("%sの攻撃!%sに%dのダメージを与えた！！\n", getName(), e.getName(), damage);
                }
                e.wounded(damage);
            }
        }
    }

}
