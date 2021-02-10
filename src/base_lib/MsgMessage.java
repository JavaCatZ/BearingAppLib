package base_lib;

/**
 * @author CatDevil
 * @version 1.0
 */

public class MsgMessage extends Message
{		
	private static final long serialVersionUID = 186412922118464478L;
	
	private int id_sender;
	private String sender_role;
	private int id_packet;
	private String vessel_info;
	private String packet_theme;
	private String packet_desc;
	private String date_time;
	
	/**
	 * 
	 * @param id_sender - number of the sender of this package
	 * @param sender_role - the sender's role as the current user (ADMIN or USER)
	 * @param id_packet - id number of the currently transmitted packet
	 * @param vessel_info - identifier of current vessel for this packet
	 * @param packet_theme - the subject of the message being sent
	 * @param packet_desc - a description of the problem in the transmitted message
	 * @param date_time - date and time of package's sending
	 */
	
	public MsgMessage(int id_sender, String sender_role, int id_packet, String vessel_info, String packet_theme, String packet_desc, String date_time)
	{
		super(40);
		this.id_sender = id_sender;
		this.sender_role = sender_role;
		this.id_packet = id_packet;
		this.vessel_info = vessel_info;
		this.packet_theme = packet_theme;
		this.packet_desc = packet_desc;
		this.date_time = date_time;
	}

/*********************Setters****************************/	
	
	public void setIdSender(int id_sender)
	{
		this.id_sender = id_sender;
	}
	
	public void setSenderRole(String sender_role)
	{
		this.sender_role = sender_role;
	}
	
	public void setIdPacket(int id_packet)
	{
		this.id_packet = id_packet;
	}
	
	public void setVessel(String vessel_info)
	{
		this.vessel_info = vessel_info;
	}
		
	public void setPacketTheme(String packet_theme)
	{
		this.packet_theme = packet_theme;
	}
	
	public void setPacketDesc(String packet_desc)
	{
		this.packet_desc = packet_desc;
	}
	
	public void setDateTime(String date_time)
	{
		this.date_time = date_time;
	}

	/*********************Getters****************************/
	
	public int getIdSender()
	{
		return id_sender;
	}
	
	public String getSenderRole()
	{
		return sender_role;
	}
	
	public int getIdPacket()
	{
		return id_packet;
	}
	
	public String getVessel()
	{
		return vessel_info;
	}
	
	public String getPacketTheme()
	{
		return packet_theme;
	}
	
	public String getPacketDesc()
	{
		return packet_desc;
	}
	
	public String getDateTime()
	{
		return date_time;
	}
}