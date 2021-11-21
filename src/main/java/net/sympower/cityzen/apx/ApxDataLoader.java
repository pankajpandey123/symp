package net.sympower.cityzen.apx;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.sympower.cityzen.apx.pojo.APXParsedData;
import net.sympower.cityzen.apx.pojo.Quote;
import net.sympower.cityzen.apx.pojo.QuoteLabel;

@Service
public class ApxDataLoader {
	private static Logger LOGGER = LoggerFactory.getLogger(ApxDataLoader.class);
	private QuoteResponse quoteResponse = null;
	@Value("${apxDataLoader.url}")
	private String urlStr;
	URL url;
	private ObjectMapper mapper = new ObjectMapper();

	public void init() throws MalformedURLException {
		if (this.url == null) {
			System.out.println("urlstr   " + urlStr);
			this.url = new URL(urlStr);
		}
	}

	public QuoteResponse load() throws IOException {
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
		mapper.setVisibility(mapper.getSerializationConfig().getDefaultVisibilityChecker()
				.withFieldVisibility(JsonAutoDetect.Visibility.ANY).withGetterVisibility(JsonAutoDetect.Visibility.NONE)
				.withSetterVisibility(JsonAutoDetect.Visibility.NONE)
				.withCreatorVisibility(JsonAutoDetect.Visibility.NONE));
		try {
			quoteResponse = mapper.readValue(url, QuoteResponse.class);
		} catch (IOException ex) {
			LOGGER.error(ex.toString());
		}
		return quoteResponse;
	}

	public List<APXParsedData> parse() {
		List<APXParsedData> apxParsedDataList = new ArrayList<APXParsedData>();
		APXParsedData apxParsedData;
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
		mapper.setVisibility(mapper.getSerializationConfig().getDefaultVisibilityChecker()
				.withFieldVisibility(JsonAutoDetect.Visibility.ANY).withGetterVisibility(JsonAutoDetect.Visibility.NONE)
				.withSetterVisibility(JsonAutoDetect.Visibility.NONE));
		try {
			quoteResponse = mapper.readValue(url, QuoteResponse.class);
			for (Quote quotes : quoteResponse.getQuotes()) {
				apxParsedData = new APXParsedData();
				apxParsedData.setDate(quotes.getDate_applied().getTime());
				for (QuoteLabel label : quotes.getQuotLabels()) {
					if (label.gettLabel().equals(DataConstants.Order.label)
							|| label.gettLabel().equals(DataConstants.Hour.label)) {
						apxParsedData.setHour((int) label.getValue());
					}
					if (label.gettLabel().equals(DataConstants.Net_Volume.label)) {
						apxParsedData.setNet_volume(label.getValue());
					}
					if (label.gettLabel().equals(DataConstants.Price.label)) {
						apxParsedData.setPrice(label.getValue());
					}
				}
				apxParsedDataList.add(apxParsedData);
			}
		} catch (IOException ex) {
			LOGGER.error(ex.toString());
		}
		return apxParsedDataList;
	}

	enum DataConstants {
		Order("Order"), Hour("Hour"), Net_Volume("Net Volume"), Price("Price");

		public final String label;

		private DataConstants(String label) {
			this.label = label;
		}
	}
}
