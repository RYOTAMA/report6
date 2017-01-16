package jp.ac.uryukyu.ie.e165710;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by e165710 on 2017/01/16.
 */
public class EnemyTest {
    @Test
    public void attack() throws Exception {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        enemy.setdead(true);
        for(int i=0; i<10; i++) {
            enemy.attack(hero);
        }
        assertEquals(heroHP, hero.gethitPoint());
    }

}
