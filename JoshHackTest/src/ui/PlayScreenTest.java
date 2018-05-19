package ui;

import java.awt.Component;
import java.awt.event.KeyEvent;
import org.junit.*;
import asciiPanel.AsciiPanel;
import game.AppletMain;
import static org.junit.Assert.*;

/**
 * The class <code>PlayScreenTest</code> contains tests for the class <code>{@link PlayScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:26 AM
 * @author sam
 * @version $Revision: 1.0 $
 */
public class PlayScreenTest {
	/**
	 * Run the PlayScreen() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testPlayScreen_1()
		throws Exception {

		PlayScreen result = new PlayScreen();

		// add additional test code here
		assertNotNull(result);
		assertEquals(10, result.getScrollX());
		assertEquals(9, result.getScrollY());
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testDisplayOutput_1()
		throws Exception {
		PlayScreen fixture = new PlayScreen();
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testDisplayOutput_2()
		throws Exception {
		PlayScreen fixture = new PlayScreen();
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
	}

	/**
	 * Run the int getScrollX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testGetScrollX_1()
		throws Exception {
		PlayScreen fixture = new PlayScreen();

		int result = fixture.getScrollX();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getScrollY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testGetScrollY_1()
		throws Exception {
		PlayScreen fixture = new PlayScreen();

		int result = fixture.getScrollY();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testRespondToUserInput_1()
		throws Exception {
		PlayScreen fixture = new PlayScreen();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
		//       at game.AppletMain.<init>(AppletMain.java:19)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testRespondToUserInput_2()
		throws Exception {
		PlayScreen fixture = new PlayScreen();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
		//       at game.AppletMain.<init>(AppletMain.java:19)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testRespondToUserInput_3()
		throws Exception {
		PlayScreen fixture = new PlayScreen();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
		//       at game.AppletMain.<init>(AppletMain.java:19)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:26 AM
	 */
	@Test
	public void testRespondToUserInput_4()
		throws Exception {
		PlayScreen fixture = new PlayScreen();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
		//       at game.AppletMain.<init>(AppletMain.java:19)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(PlayScreenTest.class);
	}
}