package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TileTest</code> contains tests for the class <code>{@link Tile}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:26 AM
 * @author sam
 * @version $Revision: 1.0 $
 */
public class TileTest {


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
		Tile fixture = Tile.BOUNDS;

		Color result = fixture.color();

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.awt.Color[r=128,g=128,b=128]", result.toString());
		assertEquals(-8355712, result.getRGB());
		assertEquals(128, result.getGreen());
		assertEquals(128, result.getBlue());
		assertEquals(128, result.getRed());
		assertEquals(255, result.getAlpha());
		assertEquals(1, result.getTransparency());
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
		Tile fixture = Tile.BOUNDS;

		String result = fixture.details();

		// add additional test code here
		assertEquals("Beyond the edge of the world.", result);
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
		Tile fixture = Tile.BOUNDS;

		char result = fixture.glyph();

		// add additional test code here
		assertEquals('x', result);
	}

	/**
	 * Run the boolean isDiggable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testIsDiggable_1()
		throws Exception {
		Tile fixture = Tile.BOUNDS;

		boolean result = fixture.isDiggable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDiggable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testIsDiggable_2()
		throws Exception {
		Tile fixture = Tile.BOUNDS;

		boolean result = fixture.isDiggable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isGround() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testIsGround_1()
		throws Exception {
		Tile fixture = Tile.BOUNDS;

		boolean result = fixture.isGround();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isGround() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testIsGround_2()
		throws Exception {
		Tile fixture = Tile.BOUNDS;

		boolean result = fixture.isGround();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isGround() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testIsGround_3()
		throws Exception {
		Tile fixture = Tile.BOUNDS;

		boolean result = fixture.isGround();

		// add additional test code here
		assertEquals(false, result);
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
		new org.junit.runner.JUnitCore().run(TileTest.class);
	}
}