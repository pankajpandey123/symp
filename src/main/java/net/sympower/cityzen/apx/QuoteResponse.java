package net.sympower.cityzen.apx;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import net.sympower.cityzen.apx.pojo.Quote;

public class QuoteResponse {
	@JsonProperty("quote")
	private List<Quote> quotes;

	public QuoteResponse() {
	}

	public QuoteResponse(List<Quote> quotes) {
 		this.quotes = quotes;
	}

	/**
	 * @return the quote
	 */
	public List<Quote> getQuotes() {
		return quotes;
	}

	/**
	 * @param quotes the quote to set
	 */
	public void setQuotes(List<Quote> quotes) {
		this.quotes = quotes;
	}

	@Override
	public String toString() {
		return "QuoteResponse [quotes=" + quotes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((quotes == null) ? 0 : quotes.hashCode());
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
		QuoteResponse other = (QuoteResponse) obj;
		if (quotes == null) {
			if (other.quotes != null)
				return false;
		} else if (!quotes.equals(other.quotes))
			return false;
		return true;
	}

}
