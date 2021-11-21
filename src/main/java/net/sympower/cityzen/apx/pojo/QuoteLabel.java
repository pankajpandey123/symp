 package net.sympower.cityzen.apx.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class QuoteLabel {

	private String tLabel;
	private String cLabel;
	private double value;

	public QuoteLabel(String tLabel, String cLabel, double value) {

		this.tLabel = tLabel;
		this.cLabel = cLabel;
		this.value = value;
	}

	public QuoteLabel() {

	}

	/**
	 * @return the tLabel
	 */
	public String gettLabel() {
		return tLabel;
	}

	/**
	 * @param tLabel the tLabel to set
	 */
	public void settLabel(String tLabel) {
		this.tLabel = tLabel;
	}

	/**
	 * @return the cLabel
	 */
	public String getcLabel() {
		return cLabel;
	}

	/**
	 * @param cLabel the cLabel to set
	 */
	public void setcLabel(String cLabel) {
		this.cLabel = cLabel;
	}

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cLabel == null) ? 0 : cLabel.hashCode());
		result = prime * result + ((tLabel == null) ? 0 : tLabel.hashCode());
		long temp;
		temp = Double.doubleToLongBits(value);
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
		QuoteLabel other = (QuoteLabel) obj;
		if (cLabel == null) {
			if (other.cLabel != null)
				return false;
		} else if (!cLabel.equals(other.cLabel))
			return false;
		if (tLabel == null) {
			if (other.tLabel != null)
				return false;
		} else if (!tLabel.equals(other.tLabel))
			return false;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "QuoteLabel [tLabel=" + tLabel + ", cLabel=" + cLabel + ", value=" + value + "]";
	}
}
