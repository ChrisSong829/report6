package report6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivingThingTest {

    @Test
    void attack() {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 3);
        Enemy enemy = new Enemy("テストスライム", 10, 3);

        enemy.escape = true;
        for (int i = 0; i < 20; i++){
            enemy.attack(hero);
        }

        assertEquals(heroHP, hero.hitPoint);
    }

    @Test
    void escape(){
        Hero hero = new Hero("テスト勇者", 10, 3);
        Enemy enemy = new Enemy("テストスライム", 10, 3);

        double random = 0.1;
        double perHitPoint = 0.2;
        for (int i = 0; i < 20; i++){
            enemy.escape(random, perHitPoint);
        }

        assertTrue(enemy.escape);
    }
}