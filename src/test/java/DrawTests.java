package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import main.Draw;

class DrawTests {
	
	private final char topLeftUnicode = 0x250F;
	private final char bottomLeftUnicode = 0x2517;
	private final char topRightUnicode = 0x2513;
	private final char bottomRightUnicode = 0x251B;
	private final char horizontalLineUnicode = 0x2501;
	private final char verticalLineUnicode = 0x2503;
	private final char whitespaceUnicode = 0x2000;

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
	    String expectedSquare =
	    		topLeftUnicode + " " + horizontalLineUnicode + " " + " " + horizontalLineUnicode + " " + topRightUnicode + "\n" + 
	    		verticalLineUnicode + " " + whitespaceUnicode + " " + " " + whitespaceUnicode + " " + verticalLineUnicode + "\n" +
	    		verticalLineUnicode + " " + whitespaceUnicode + " " + " " + whitespaceUnicode + " " + verticalLineUnicode + "\n" +
	    		bottomLeftUnicode + " " + horizontalLineUnicode + " " + " " + horizontalLineUnicode + " " + bottomRightUnicode + "\n";
	    String drawnSquare = draw.drawSquare(4, 4);
	    assertEquals(expectedSquare, drawnSquare);
	}
	
	@Test
	void shouldDrawTwoByTwoSquare() throws Exception {
	    Draw draw = new Draw();
	    String expectedSquare =
	    		topLeftUnicode + "" +  topRightUnicode + "\n" + 
	    	    bottomLeftUnicode + "" +  bottomRightUnicode + "\n";
	    String drawnSquare = draw.drawSquare(2, 2);
	    assertEquals(expectedSquare, drawnSquare);
	}

	@Test
	void shouldDrawSixByThreeSquare() throws Exception {
	    Draw draw = new Draw();
	    String expectedSquare =
	    		topLeftUnicode + " " + horizontalLineUnicode + " " + " " + horizontalLineUnicode + " " + " " + horizontalLineUnicode + " " + " " + horizontalLineUnicode + " " + topRightUnicode + "\n" + 
	    	    verticalLineUnicode + " " + whitespaceUnicode + " " + " " + whitespaceUnicode + " " + " " + whitespaceUnicode + " " + " " + whitespaceUnicode + " " + verticalLineUnicode + "\n" +
	    	    bottomLeftUnicode + " " + horizontalLineUnicode + " " + " " + horizontalLineUnicode + " " + " " + horizontalLineUnicode + " " + " " + horizontalLineUnicode + " " + bottomRightUnicode + "\n";
	    String drawnSquare = draw.drawSquare(6, 3);
	    assertEquals(expectedSquare, drawnSquare);
	}
	
	@Test
	void shouldDrawTwoByEightSquare() throws Exception {
	    Draw draw = new Draw();
	    String expectedSquare =
	    	    topLeftUnicode + "" + topRightUnicode + "\n" +
	    	    verticalLineUnicode + "" + verticalLineUnicode + "\n" +
	    	    verticalLineUnicode + "" +  verticalLineUnicode + "\n" +
	    	    verticalLineUnicode + "" +  verticalLineUnicode + "\n" +
	    	    verticalLineUnicode + "" +  verticalLineUnicode + "\n" +
	    	    verticalLineUnicode + "" +  verticalLineUnicode + "\n" +
	    	    verticalLineUnicode + "" +  verticalLineUnicode + "\n" +
	    	    bottomLeftUnicode + "" +  bottomRightUnicode + "\n";
	    String drawnSquare = draw.drawSquare(2, 8);
	    assertEquals(expectedSquare, drawnSquare);
	}
}
