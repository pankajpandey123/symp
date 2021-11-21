package net.sympower.cityzen.apx;

import org.junit.Test;

import net.sympower.cityzen.apx.pojo.APXParsedData;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

public class ApxDataLoaderTest {

	@Test
	public void load() throws Exception {
		ApxDataLoader sut = new ApxDataLoader();
		sut.url = getClass().getResource("apx-data.json");
		QuoteResponse response = sut.load();
		response.getQuotes().forEach(e -> System.out.println(e.toString()));
		assertNotNull(response);
		assertEquals(24, response.getQuotes().size());
		 
	}

	@Test
	public void parsed() throws Exception {
		ApxDataLoader sut = new ApxDataLoader();
		sut.url = getClass().getResource("apx-data.json");
		List<APXParsedData> response = sut.parse();
		response.forEach(e -> System.out.println(e.toString()));
		assertNotNull(response);
		assertEquals(24, response.size());
	}

}