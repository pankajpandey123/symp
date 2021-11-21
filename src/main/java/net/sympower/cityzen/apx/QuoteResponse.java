package net.sympower.cityzen.apx;

import java.util.List;

import net.sympower.cityzen.apx.pojo.Quote;

public class QuoteResponse {
	private List<Quote> quote;

	public QuoteResponse() {
	}

	public QuoteResponse(List<Quote> quotes) {
		super();
		this.quote = quotes;
	}

	/**
	 * @return the quote
	 */
	public List<Quote> getQuotes() {
		return quote;
	}

	/**
	 * @param quote the quote to set
	 */
	public void setQuotes(List<Quote> quotes) {
		this.quote = quotes;
	}

	@Override
	public String toString() {
		return "QuoteResponse [quote=" + quote + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((quote == null) ? 0 : quote.hashCode());
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
		if (quote == null) {
			if (other.quote != null)
				return false;
		} else if (!quote.equals(other.quote))
			return false;
		return true;
	}

}
