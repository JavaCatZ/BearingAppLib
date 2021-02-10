package base_lib;

/**
 * @author CatDevil
 * @version 1.0
 */

public class CoordMessage extends Message
{	
	private static final long serialVersionUID = 665223497890094492L;
	
	private int id_sender;
	private String sender_role;
	private int id_packet;
	private String vessel_info;
	private String latitude;
	private String longitude;
	private String date_time;
	
	/**
	 * 
	 * @param id_sender - number of the sender of this package
	 * @param sender_role - the sender's role as the current user (ADMIN or USER)
	 * @param id_packet - id number of the currently transmitted packet
	 * @param vessel_info - identifier of current vessel for this packet
	 * @param latitude - latitude coordinate of the sender's location
	 * @param longitude - longitude coordinate of the sender's location
	 * @param date_time - date and time of package's sending
	 */
	
	public CoordMessage(int id_sender, String sender_role, int id_packet, String vessel_info, String latitude, String longitude, String date_time)
	{
		super(20);
		this.id_sender = id_sender;
		this.sender_role = sender_role;
		this.id_packet = id_packet;
		this.vessel_info = vessel_info;
		this.latitude = latitude;
		this.longitude = longitude;
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
	
	public void setLatitude(String latitude)
	{
		this.latitude = latitude;
	}
	
	public void setLongitude(String longitude)
	{
		this.longitude = longitude;
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
	
	public String getLatitude()
	{
		return latitude;
	}
	
	public String getLongitude()
	{
		return longitude;
	}
	
	public String getDateTime()
	{
		return date_time;
	}
}