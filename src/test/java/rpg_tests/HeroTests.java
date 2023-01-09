package rpg_tests;

import org.junit.Test;
import org.mockito.Mock.*;

import rpg_lab.Hero;
import rpg_lab.Target;
import rpg_lab.Weapon;

import java.util.Random;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class HeroTests {

    private static final int TARGET_XP = 10;
    private static final String HERO_NAME = "Niki";

    @Test
    public void testHeroGainsXPbyKillingTargets() {
        Weapon weapon = mock(Weapon.class);
        Target target = mock(Target.class);

        when(target.giveExperience()).thenReturn(TARGET_XP);
        when(target.isDead()).thenReturn(true);


        Hero hero = new Hero(HERO_NAME, weapon);
        hero.attack(target);

        assertEquals("Wrong Experience",TARGET_XP, hero.getExperience());
    }
    @Test
    public void testItemDropShouldDropCorrectly(){
        Weapon weapon = mock(Weapon.class);
        Hero hero = new Hero(HERO_NAME, weapon);
        Target target = mock(Target.class);

        Random random = mock(Random.class);
        when(random.nextInt(anyInt())).thenReturn(2);
        Weapon weapon1 = mock(Weapon.class);
        Weapon weapon2 = mock(Weapon.class);
        Weapon weapon3 = mock(Weapon.class);

        //when(target.dropWeapon(random)).thenReturn()
    }
}
