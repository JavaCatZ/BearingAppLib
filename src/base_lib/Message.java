package base_lib;

import java.io.Serializable;

public abstract class Message implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private final int msgType; 
	
	public Message(int msgType)
	{
		this.msgType = msgType;
	}

	public int getMsgType() 
	{
		return msgType;
	}
}
