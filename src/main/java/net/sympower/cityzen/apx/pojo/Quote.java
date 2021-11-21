package net.sympower.cityzen.apx.pojo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quote {
	private String market;
	@JsonProperty("date_applied")
	private Date dateApplied;
	private List<QuoteLabel> values;

	public Quote(String market, Date dateApplied, List<QuoteLabel> quotLabels) {
		 
		this.market = market;
		this.dateApplied = dateApplied;
		this.values = quotLabels;
	}

	public Quote() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateApplied == null) ? 0 : dateApplied.hashCode());
		result = prime * result + ((market == null) ? 0 : market.hashCode());
		result = prime * result + ((values == null) ? 0 : values.hashCode());
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
		Quote other = (Quote) obj;
		if (dateApplied == null) {
			if (other.dateApplied != null)
				return false;
		} else if (!dateApplied.equals(other.dateApplied))
			return false;
		if (market == null) {
			if (other.market != null)
				return false;
		} else if (!market.equals(other.market))
			return false;
		if (values == null) {
			if (other.values != null)
				return false;
		} else if (!values.equals(other.values))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Quote [market=" + market + ", dateApplied=" + dateApplied + ", values=" + values + "]";
	}

	/**
	 * @return the market
	 */
	public String getMarket() {
		return market;
	}

	/**
	 * @param market the market to set
	 */
	public void setMarket(String market) {
		this.market = market;
	}

	/**
	 * @return the date_applied
	 */
	public Date getDateApplied() {
		return dateApplied;
	}

	/**
	 * @param date_applied the date_applied to set
	 */
	public void setDate_applied(Date dateApplied) {
		this.dateApplied = dateApplied;
	}

	/**
	 * @return the values
	 */
	public List<QuoteLabel> getQuotLabels() {
		return values;
	}

	/**
	 * @param values the values to set
	 */
	public void setQuotLabels(List<QuoteLabel> quotLabels) {
		this.values = quotLabels;
	}

}
