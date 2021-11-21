package net.sympower.cityzen.apx;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ApxDataLoaderTest {

  @Test
  public void load() throws Exception {
    ApxDataLoader sut = new ApxDataLoader();
    sut.url = getClass().getResource("apx-data.json");
    QuoteResponse response = sut.load();
    assertNotNull(response);
    //TODO add more asserts
  }

}