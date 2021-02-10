package base_lib;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author CatDevil
 *
 */

public class Serializer 
{
	public static byte[] serialize(Object obj) throws IOException 
	{
	    try(ByteArrayOutputStream baos = new ByteArrayOutputStream())
	    {
	       try(ObjectOutputStream oos = new ObjectOutputStream(baos))
	       {
	          oos.writeObject(obj);
	       }
	       
	       return baos.toByteArray();
	    }
	}

	public static Object deserialize(byte[] bytes) throws IOException, ClassNotFoundException 
	{
	    try(ByteArrayInputStream bays = new ByteArrayInputStream(bytes))
	    {
	       try(ObjectInputStream ois = new ObjectInputStream(bays))
	       {
	          return ois.readObject();
	       }
	    }
	}
}
