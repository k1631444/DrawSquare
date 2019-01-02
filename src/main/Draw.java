package main;

public class Draw {
	// UTF-8 codes for the symbols used 
	private final char topLeftUnicode = 0x250F;
	private final char bottomLeftUnicode = 0x2517;
	private final char topRightUnicode = 0x2513;
	private final char bottomRightUnicode = 0x251B;
	private final char horizontalLineUnicode = 0x2501;
	private final char verticalLineUnicode = 0x2503;
	private final char whitespaceUnicode = 0x2000;
	
	/**
	 * Prints out a X by Y square to the console, where X = width and Y = height.
	 * 
	 * @param width of the square
	 * @param height of the square
	 * @return String representation of the square along with "\n" where the line breaks would be
	 * @throws Exception
	 */
	public String drawSquare(int width, int height) throws Exception {
		// Can't draw squares smaller than 2x2 hence we throw an exception
		if(width < 2 || height < 2) {
			throw new Exception("Width or Height is less than 2");
		}
		
		String square = "";
		
		// Draw the top row of the square
		square += drawRowOfSquare(topLeftUnicode, horizontalLineUnicode, topRightUnicode, width);
		
		// Draw the centre row(s) of the square
		for(int i = 0; i < height - 2; i++) {
			square += drawRowOfSquare(verticalLineUnicode, whitespaceUnicode, verticalLineUnicode, width);
		}
		
		// Draw the bottom row of the square
		square += drawRowOfSquare(bottomLeftUnicode, horizontalLineUnicode, bottomRightUnicode, width);
		
		System.out.println(square);
		return square;
	}
	
	private String drawRowOfSquare(char first, char filler, char last, int width) {
		String row = first + "";
		for(int i = 0; i < width - 2; i++) {
			row += " " + filler + " ";
		}
		row += last + "\n";
		return row;
	}
}
