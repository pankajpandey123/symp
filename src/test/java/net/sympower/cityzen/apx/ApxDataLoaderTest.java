package net.sympower.cityzen.apx;

import org.junit.Test;

import net.sympower.cityzen.apx.pojo.APXParsedData;
import net.sympower.cityzen.apx.pojo.Quote;
import net.sympower.cityzen.apx.pojo.QuoteLabel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Date;
import java.util.List;

public class ApxDataLoaderTest {
	
	@Test(expected = MalformedURLException.class)
	public void malformedURLExceptionThrown() throws Exception {
		ApxDataLoader sut = new ApxDataLoader();
		sut.url = getClass().getResource("apx-data.json");
	}
	@Test
	public void load()  {
		ApxDataLoader sut=null;
		try {
			sut = new ApxDataLoader();
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		sut.url = getClass().getResource("apx-data.json");
		QuoteResponse response=null;
		try {
			response = sut.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertNotNull(response);
		List<Quote> quotes = response.getQuotes();
		Quote quote = quotes.get(0);
		long date = 1573599600000L;
		assertEquals(new Date(date), quote.getDateApplied());

		List<QuoteLabel> labels = quote.getQuotLabels();
		QuoteLabel label = labels.get(0);
		assertEquals("Order", label.gettLabel());
		assertEquals(1, label.getValue(), Double.NaN);

		QuoteLabel label1 = labels.get(1);
		assertEquals("Hour", label1.gettLabel());
		assertEquals(01, label1.getValue(), Double.NaN);

		QuoteLabel label2 = labels.get(2);
		assertEquals("Net Volume", label2.gettLabel());
		assertEquals(4514.20, label2.getValue(), Double.NaN);

		QuoteLabel label3 = labels.get(3);
		assertEquals("Price", label3.gettLabel());
		assertEquals(34, label3.getValue(), Double.NaN);
	}

	@Test
	public void parsed() {
		ApxDataLoader sut=null;
		try {
			sut = new ApxDataLoader();
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		sut.url = getClass().getResource("apx-data.json");
		List<APXParsedData> response=null;
		try {
			response = sut.parse();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(response);
		APXParsedData parsedData = response.get(0);
		long date = 1573599600000L;
		assertEquals(new Date(date).getTime(), parsedData.getDate());
		assertEquals(01, parsedData.getHour());
		assertEquals(4514.20, parsedData.getNet_volume(), Double.NaN);
		assertEquals(34, parsedData.getPrice(), Double.NaN);
	}

}