package base_lib;

import java.io.File;
import java.io.Serializable;

/**
 * @author CatDevil
 *
 */

public class Photos implements Serializable
{
	private static final long serialVersionUID = -7792891977172786562L;

	private File[] images; 
	
	public Photos(File[] images)
	{
		this.images = images;
	}

	public File[] getImages() 
	{
		return images;
	}

}
