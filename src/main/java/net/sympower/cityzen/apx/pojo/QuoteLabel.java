package net.sympower.cityzen.apx.pojo;

public class QuoteLabel {

	private String tLabel;
	private String cLabel;
	private double value;
	private String unit;
	private int position;
	private boolean chartShow;
	private String chartType;
	private String color;
	private int precision;

	public QuoteLabel() {
	}

	public QuoteLabel(String tLabel, String cLabel, double value, String unit, int position, boolean chartShow,
			String chartType, String color, int precision) {
		this.tLabel = tLabel;
		this.cLabel = cLabel;
		this.value = value;
		this.unit = unit;
		this.position = position;
		this.chartShow = chartShow;
		this.chartType = chartType;
		this.color = color;
		this.precision = precision;
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
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}

	/**
	 * @return the chartShow
	 */
	public boolean isChartShow() {
		return chartShow;
	}

	/**
	 * @param chartShow the chartShow to set
	 */
	public void setChartShow(boolean chartShow) {
		this.chartShow = chartShow;
	}

	/**
	 * @return the chartType
	 */
	public String getChartType() {
		return chartType;
	}

	/**
	 * @param chartType the chartType to set
	 */
	public void setChartType(String chartType) {
		this.chartType = chartType;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the precision
	 */
	public int getPrecision() {
		return precision;
	}

	/**
	 * @param precision the precision to set
	 */
	public void setPrecision(int precision) {
		this.precision = precision;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cLabel == null) ? 0 : cLabel.hashCode());
		result = prime * result + (chartShow ? 1231 : 1237);
		result = prime * result + ((chartType == null) ? 0 : chartType.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + position;
		result = prime * result + precision;
		result = prime * result + ((tLabel == null) ? 0 : tLabel.hashCode());
		result = prime * result + ((unit == null) ? 0 : unit.hashCode());
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
		if (chartShow != other.chartShow)
			return false;
		if (chartType == null) {
			if (other.chartType != null)
				return false;
		} else if (!chartType.equals(other.chartType))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (position != other.position)
			return false;
		if (precision != other.precision)
			return false;
		if (tLabel == null) {
			if (other.tLabel != null)
				return false;
		} else if (!tLabel.equals(other.tLabel))
			return false;
		if (unit == null) {
			if (other.unit != null)
				return false;
		} else if (!unit.equals(other.unit))
			return false;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "QuoteLabel [tLabel=" + tLabel + ", cLabel=" + cLabel + ", value=" + value + ", unit=" + unit
				+ ", position=" + position + ", chartShow=" + chartShow + ", chartType=" + chartType + ", color="
				+ color + ", precision=" + precision + "]";
	}
}
