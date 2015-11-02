package assignment1;

import java.awt.Color;

import edu.princeton.cs.introcs.Picture;

public class ComponentImage {
	
	Picture picture;
	private Picture pic;
	
	public static void main(String[] args) {
		
	}
	
	
	/**
	 * Initialize fields
	 * 
	 * @param fileLocation
	 */
	public ComponentImage(String filelocation)
	{
		Picture pic = new Picture("images/bacteria.bmp");
		this.pic = pic;
	}
	
	/**
	 * Returns the number of components identified in the image.
	 * 
	 * @return the number of components (between 1 and N)
	 */
	public int countComponents() 
	{
		getPicture();
		pic.show();
		return 0;
	}
	
	/**
	 * Returns the original image with each object bounded by a red box.
	 * 
	 * @return a picture object with all components surrounded by a red box
	 */
	public Picture identifyComponentImage()
	{
		return null;
	}
	
	/**
	 * Returns a picture with each object updated to a random colour.
	 * 
	 * @return a picture object with all components coloured.
	 */
	public Picture colourComponentImage()
	{
		return null;
	}
	 
	public Picture getPicture()
	{
		return pic;
	}
	
	/**
	 * Returns a binarised version of the original image
	 * 
	 * @return a picture object with all components surrounded by a red box
	 */
	public Picture binaryComponentImage()
	{
		Picture pic = new Picture("images/bacteria.bmp");
		
		int maxX = 0;
		int minX = pic.width();
		int maxY = 0;
		int minY = pic.height();

		for (int x = 0; x < pic.width(); x++) {
			for (int y = 0; y < pic.height(); y++) {
				if (!pic.get(x, y).equals(Color.WHITE) ) {

					if (x < minX)
						minX = x;
					if (x > maxX)
						maxX = x;
					if (y < minY)
						minY = y;
					if (y > maxY)
						maxY = y;

				}
			}
		}
		return pic;
	}
}