package com.microsoft.bingads.v13.api.test.entities.ads.responsive.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ads.responsive.BulkResponsiveAdTest;
import com.microsoft.bingads.v13.bulk.entities.BulkResponsiveAd;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;

public class BulkResponsiveAdWriteFromRowValuesLongHeadlinesTest extends BulkResponsiveAdTest {

    @Parameterized.Parameter(value = 1)
    public String expectedResult;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"[{\"id\":123456,\"text\":\"a sample long headline\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"},{\"id\":123456,\"text\":\"a sample long headline 2\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"}]",
            "[{\"id\":123456,\"text\":\"a sample long headline\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"},{\"id\":123456,\"text\":\"a sample long headline 2\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"}]"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Long Headlines", this.datum, this.expectedResult, new BiConsumer<BulkResponsiveAd, String>() {
            @Override
            public void accept(BulkResponsiveAd c, String v) {
                c.getResponsiveAd().setLongHeadlines(StringExtensions.parseTextAssetLinks(v));
            }
        });
    }
}
