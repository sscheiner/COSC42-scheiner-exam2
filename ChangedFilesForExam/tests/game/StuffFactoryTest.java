package game;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>StuffFactoryTest</code> contains tests for the class <code>{@link StuffFactory}</code>.
 *
 * @generatedBy CodePro at 5/18/18 7:34 PM
 * @author sam
 * @version $Revision: 1.0 $
 */
public class StuffFactoryTest {
	/**
	 * Run the StuffFactory(World) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testStuffFactory_1()
		throws Exception {
		World world = new World(new Tile[][][] {});

		StuffFactory result = new StuffFactory(world);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature newBat(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewBat_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Creature result = fixture.newBat(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newBlueMagesSpellbook(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewBlueMagesSpellbook_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newBlueMagesSpellbook(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3af42210
		assertNotNull(result);
	}

	/**
	 * Run the Item newBow(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewBow_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newBow(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newBread(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewBread_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newBread(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newDagger(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewDagger_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newDagger(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newEdibleWeapon(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewEdibleWeapon_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newEdibleWeapon(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newFruit(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewFruit_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newFruit(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature newFungus(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewFungus_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Creature result = fixture.newFungus(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature newGoblin(int,Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewGoblin_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;
		Creature player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		Creature result = fixture.newGoblin(depth, player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newHeavyArmor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewHeavyArmor_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newHeavyArmor(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5411e509
		assertNotNull(result);
	}

	/**
	 * Run the Item newLightArmor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewLightArmor_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newLightArmor(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newMediumArmor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewMediumArmor_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newMediumArmor(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4edb326c
		assertNotNull(result);
	}

	/**
	 * Run the Creature newPlayer(List<String>,FieldOfView) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewPlayer_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		List<String> messages = new LinkedList();
		FieldOfView fov = new FieldOfView(new World(new Tile[][][] {}));

		Creature result = fixture.newPlayer(messages, fov);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newPotionOfArcher(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewPotionOfArcher_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newPotionOfArcher(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@12270ebb
		assertNotNull(result);
	}

	/**
	 * Run the Item newPotionOfExperience(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewPotionOfExperience_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newPotionOfExperience(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@43a5bf7f
		assertNotNull(result);
	}

	/**
	 * Run the Item newPotionOfHealth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewPotionOfHealth_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newPotionOfHealth(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@9f3985b
		assertNotNull(result);
	}

	/**
	 * Run the Item newPotionOfMana(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewPotionOfMana_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newPotionOfMana(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2d79ea1f
		assertNotNull(result);
	}

	/**
	 * Run the Item newPotionOfPoison(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewPotionOfPoison_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newPotionOfPoison(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@31bef7b7
		assertNotNull(result);
	}

	/**
	 * Run the Item newPotionOfSlowHealth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewPotionOfSlowHealth_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newPotionOfSlowHealth(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@ba68477
		assertNotNull(result);
	}

	/**
	 * Run the Item newPotionOfWarrior(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewPotionOfWarrior_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newPotionOfWarrior(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@67073526
		assertNotNull(result);
	}

	/**
	 * Run the Item newRock(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewRock_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newRock(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newStaff(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewStaff_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newStaff(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newSword(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewSword_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newSword(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newVictoryItem(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewVictoryItem_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newVictoryItem(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newWhiteMagesSpellbook(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewWhiteMagesSpellbook_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newWhiteMagesSpellbook(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6483d2d7
		assertNotNull(result);
	}

	/**
	 * Run the Creature newZombie(int,Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testNewZombie_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;
		Creature player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		Creature result = fixture.newZombie(depth, player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item randomArmor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomArmor_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomArmor(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@75885f97
		assertNotNull(result);
	}

	/**
	 * Run the Item randomArmor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomArmor_2()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomArmor(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@45b283ed
		assertNotNull(result);
	}

	/**
	 * Run the Item randomArmor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomArmor_3()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomArmor(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1ca273be
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomPotion_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5b7d5ac4
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomPotion_2()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@18825739
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomPotion_3()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3893b784
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomPotion_4()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3f379e42
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomPotion_5()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2f8eebd9
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomPotion_6()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@43973fa6
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomPotion_7()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2da11881
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomPotion_8()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@ad0c8ee
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomPotion_9()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@10d97d76
		assertNotNull(result);
	}

	/**
	 * Run the Item randomSpellBook(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomSpellBook_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomSpellBook(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1cbe5ed1
		assertNotNull(result);
	}

	/**
	 * Run the Item randomSpellBook(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomSpellBook_2()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomSpellBook(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1a551c66
		assertNotNull(result);
	}

	/**
	 * Run the Item randomWeapon(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomWeapon_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomWeapon(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4573f4b4
		assertNotNull(result);
	}

	/**
	 * Run the Item randomWeapon(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomWeapon_2()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomWeapon(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7ecf4618
		assertNotNull(result);
	}

	/**
	 * Run the Item randomWeapon(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomWeapon_3()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomWeapon(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4c87fe51
		assertNotNull(result);
	}

	/**
	 * Run the Item randomWeapon(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Test
	public void testRandomWeapon_4()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomWeapon(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1747789
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/18/18 7:34 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(StuffFactoryTest.class);
	}
}