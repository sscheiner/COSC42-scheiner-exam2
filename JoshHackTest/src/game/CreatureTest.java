package game;

import java.awt.Color;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CreatureTest</code> contains tests for the class <code>{@link Creature}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:26 AM
 * @author sam
 * @version $Revision: 1.0 $
 */
public class CreatureTest {
	/**
	 * Run the Creature(World,char,Color,String,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testCreature_1()
		throws Exception {
		World world = new World(new Tile[][][] {});
		char glyph = '';
		Color color = new Color(1);
		String name = "";
		int maxHp = 1;
		int attack = 1;
		int defense = 1;

		Creature result = new Creature(world, glyph, color, name, maxHp, attack, defense);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@52234641
		assertNotNull(result);
	}

	/**
	 * Run the Item armor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testArmor_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		Item result = fixture.armor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2f91daf3
		assertNotNull(result);
	}

	/**
	 * Run the int attackValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testAttackValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		int result = fixture.attackValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the int attackValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testAttackValue_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		int result = fixture.attackValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the boolean canEnter(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testCanEnter_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canEnter(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@21603869
		assertTrue(result);
	}

	/**
	 * Run the boolean canEnter(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testCanEnter_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canEnter(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@32a953c0
		assertTrue(result);
	}

	/**
	 * Run the boolean canEnter(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testCanEnter_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canEnter(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@450028a9
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testCanSee_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2b35a939
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testCanSee_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@599aac12
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testCanSee_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@33dd7ad6
		assertTrue(result);
	}

	/**
	 * Run the String causeOfDeath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testCauseOfDeath_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		String result = fixture.causeOfDeath();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3968376c
		assertNotNull(result);
	}

	/**
	 * Run the Color color() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testColor_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		Color result = fixture.color();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testCreature_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Creature result = fixture.creature(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1b0d1f33
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testCreature_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Creature result = fixture.creature(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3fbaba59
		assertNotNull(result);
	}

	/**
	 * Run the int defenseValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testDefenseValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		int result = fixture.defenseValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the int defenseValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testDefenseValue_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		int result = fixture.defenseValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the String details() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testDetails_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		String result = fixture.details();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@720f4784
		assertNotNull(result);
	}

	/**
	 * Run the void doAction(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testDoAction_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		String message = "";

		fixture.doAction(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@380e516d
	}

	/**
	 * Run the void doAction(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testDoAction_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		String message = "";

		fixture.doAction(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1e163993
	}

	/**
	 * Run the void doAction(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testDoAction_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		String message = "";

		fixture.doAction(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2bf7a62b
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testDoAction_4()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 0, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6719907f
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testDoAction_5()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@cde2d81
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testDoAction_6()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5af082bc
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testDoAction_7()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2f8d6e45
	}

	/**
	 * Run the void drop(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testDrop_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");

		fixture.drop(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4bf1d77e
	}

	/**
	 * Run the List<Effect> effects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testEffects_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		List<Effect> result = fixture.effects();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@60d4bf8c
		assertNotNull(result);
	}

	/**
	 * Run the int food() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testFood_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		int result = fixture.food();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@75d0dc87
		assertEquals(0, result);
	}

	/**
	 * Run the void gainXp(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testGainXp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.gainXp(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4bd7fada
	}

	/**
	 * Run the void gainXp(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testGainXp_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.gainXp(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@72fe0626
	}

	/**
	 * Run the char glyph() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testGlyph_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		char result = fixture.glyph();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(' ', result);
	}

	/**
	 * Run the int hp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testHp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		int result = fixture.hp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the Inventory inventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testInventory_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		Inventory result = fixture.inventory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean isPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testIsPlayer_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '@', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		boolean result = fixture.isPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@187d48c8
		assertTrue(result);
	}

	/**
	 * Run the boolean isPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testIsPlayer_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		boolean result = fixture.isPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@20cd735
		assertTrue(result);
	}

	/**
	 * Run the Item item(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testItem_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Item result = fixture.item(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@23c4e9d5
		assertNotNull(result);
	}

	/**
	 * Run the Item item(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testItem_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Item result = fixture.item(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@11f663af
		assertNotNull(result);
	}

	/**
	 * Run the int level() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testLevel_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		int result = fixture.level();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@58e7533c
		assertEquals(0, result);
	}

	/**
	 * Run the int mana() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		int result = fixture.mana();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@41f80f85
		assertEquals(0, result);
	}

	/**
	 * Run the int maxFood() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testMaxFood_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		int result = fixture.maxFood();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@607e27f8
		assertEquals(0, result);
	}

	/**
	 * Run the int maxHp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testMaxHp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		int result = fixture.maxHp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the int maxMana() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testMaxMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		int result = fixture.maxMana();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@fbe5d0a
		assertEquals(0, result);
	}

	/**
	 * Run the void meleeAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testMeleeAttack_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.meleeAttack(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@77c31c57
	}

	/**
	 * Run the void modifyAttackValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testModifyAttackValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int value = 1;

		fixture.modifyAttackValue(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void modifyDefenseValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testModifyDefenseValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int value = 1;

		fixture.modifyDefenseValue(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void modifyDetectCreatures(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testModifyDetectCreatures_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int amount = 1;

		fixture.modifyDetectCreatures(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2478d76b
	}

	/**
	 * Run the void modifyFood(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testModifyFood_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '@', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int amount = 1;

		fixture.modifyFood(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@59f3da70
	}

	/**
	 * Run the void modifyMana(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testModifyMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int amount = 1;

		fixture.modifyMana(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6ba4fbd7
	}

	/**
	 * Run the void modifyMaxHp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testModifyMaxHp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int amount = 1;

		fixture.modifyMaxHp(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void modifyMaxMana(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testModifyMaxMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int amount = 1;

		fixture.modifyMaxMana(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@277b2860
	}

	/**
	 * Run the void modifyRegenHpPer1000(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testModifyRegenHpPer1000_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int amount = 1;

		fixture.modifyRegenHpPer1000(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@791ee3d0
	}

	/**
	 * Run the void modifyRegenManaPer1000(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testModifyRegenManaPer1000_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int amount = 1;

		fixture.modifyRegenManaPer1000(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@10acb403
	}

	/**
	 * Run the void modifyVisionRadius(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testModifyVisionRadius_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int value = 1;

		fixture.modifyVisionRadius(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void moveBy(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testMoveBy_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int mx = 0;
		int my = 0;
		int mz = 1;

		fixture.moveBy(mx, my, mz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@571df5a3
	}

	/**
	 * Run the void moveBy(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testMoveBy_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int mx = 1;
		int my = 1;
		int mz = 2;

		fixture.moveBy(mx, my, mz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@45a9bcbf
	}

	/**
	 * Run the void moveBy(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testMoveBy_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int mx = 0;
		int my = 1;
		int mz = -1;

		fixture.moveBy(mx, my, mz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@b87fbf
	}

	/**
	 * Run the String name() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testName_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		String result = fixture.name();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String nameOf(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testNameOf_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");

		String result = fixture.nameOf(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@67ce89e2
		assertNotNull(result);
	}

	/**
	 * Run the void notify(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testNotify_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		String message = "";

		fixture.notify(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1f1207c9
	}

	/**
	 * Run the Tile realTile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testRealTile_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.realTile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1817aab6
		assertNotNull(result);
	}

	/**
	 * Run the void setCreatureAi(CreatureAi) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testSetCreatureAi_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		CreatureAi ai = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.setCreatureAi(ai);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void summon(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testSummon_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.summon(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2c151e9b
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testThrowItem_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@22ef964a
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testThrowItem_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@41efbf5a
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testThrowItem_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5c858fb
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testThrowItem_4()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@23015768
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testThrowItem_5()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@609a546f
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testThrowItem_6()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6613f30e
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testThrowItem_7()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7116bbbb
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testThrowItem_8()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@68b9721b
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testThrowItem_9()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1839b7f
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testThrowItem_10()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@14c4aee3
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testThrowItem_11()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@73644339
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testThrowItem_12()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3ecd3235
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testTile_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.tile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6737222c
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testTile_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.tile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@33bd863f
		assertNotNull(result);
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2794e8d6
	}

	/**
	 * Run the int visionRadius() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testVisionRadius_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		int result = fixture.visionRadius();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the Item weapon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testWeapon_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		Item result = fixture.weapon();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7669922b
		assertNotNull(result);
	}

	/**
	 * Run the int xp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testXp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.y = 1;
		fixture.z = 1;
		fixture.x = 1;

		int result = fixture.xp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@620366b2
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
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
	 * @generatedBy CodePro at 5/19/18 11:26 AM
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
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CreatureTest.class);
	}
}