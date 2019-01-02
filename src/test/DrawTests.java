package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import main.Draw;

class DrawTests {

	@Test
	void negativeWidthShouldThrowException() {
	    Draw draw = new Draw();
	    assertThrows(Exception.class, ()->{ draw.drawSquare(-10, 5); });
	}
	
	@Test
	void negativeHeightShouldThrowException() {
	    Draw draw = new Draw();
	    assertThrows(Exception.class, ()->{ draw.drawSquare(5, -8); });
	}
	
	@Test
	void shouldDrawFourByFourSquare() throws Exception {
	    Draw draw = new Draw();
	    String expectedSquare = "┏ ━  ━ ┓\n" +
	    						"┃      ┃\n" +
	    						"┃      ┃\n" +
	    						"┗ ━  ━ ┛\n";
	    String drawnSquare = draw.drawSquare(4, 4);
	    assertEquals(drawnSquare, expectedSquare);
	}
	
	@Test
	void shouldDrawTwoByTwoSquare() throws Exception {
	    Draw draw = new Draw();
	    String expectedSquare = "┏┓\n" +
	    						"┗┛\n";
	    String drawnSquare = draw.drawSquare(2, 2);
	    assertEquals(drawnSquare, expectedSquare);
	}

	@Test
	void shouldDrawSixByThreeSquare() throws Exception {
	    Draw draw = new Draw();
	    String expectedSquare = "┏ ━  ━  ━  ━ ┓\n" +
	    						"┃            ┃\n" +
	    						"┗ ━  ━  ━  ━ ┛\n";
	    String drawnSquare = draw.drawSquare(6, 3);
	    assertEquals(drawnSquare, expectedSquare);
	}
	
	@Test
	void shouldDrawTwoByEightSquare() throws Exception {
	    Draw draw = new Draw();
	    String expectedSquare = "┏┓\n" +
	    						"┃┃\n" +
	    						"┃┃\n" +
	    						"┃┃\n" +
	    						"┃┃\n" +
	    						"┃┃\n" +
	    						"┃┃\n" +
	    						"┗┛\n";
	    String drawnSquare = draw.drawSquare(2, 8);
	    assertEquals(drawnSquare, expectedSquare);
	}
}
