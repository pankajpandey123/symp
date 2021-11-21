package net.sympower.cityzen.apx.pojo;



public class APXParsedData {
	private long date;
	private int hour;
	private double net_volume;
	private double price;
	
	
	public APXParsedData(long date, int hour, double net_volume, double price) {
		
		this.date = date;
		this.hour = hour;
		this.net_volume = net_volume;
		this.price = price;
	}


	public APXParsedData() {
		super();
	}


	/**
	 * @return the date
	 */
	public long getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(long date) {
		this.date = date;
	}


	/**
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}


	/**
	 * @param hour the hour to set
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}


	/**
	 * @return the net_volume
	 */
	public double getNet_volume() {
		return net_volume;
	}


	/**
	 * @param net_volume the net_volume to set
	 */
	public void setNet_volume(double net_volume) {
		this.net_volume = net_volume;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (date ^ (date >>> 32));
		result = prime * result + hour;
		long temp;
		temp = Double.doubleToLongBits(net_volume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		APXParsedData other = (APXParsedData) obj;
		if (date != other.date)
			return false;
		if (hour != other.hour)
			return false;
		if (Double.doubleToLongBits(net_volume) != Double.doubleToLongBits(other.net_volume))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "APXParsedData [date=" + date + ", hour=" + hour + ", net_volume=" + net_volume + ", price=" + price
				+ "]";
	}





	
	
}
