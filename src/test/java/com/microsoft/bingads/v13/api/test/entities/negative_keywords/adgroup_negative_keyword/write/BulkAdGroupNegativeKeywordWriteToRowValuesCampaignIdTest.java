package com.microsoft.bingads.v13.api.test.entities.negative_keywords.adgroup_negative_keyword.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.negative_keywords.adgroup_negative_keyword.BulkAdGroupNegativeKeywordTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupNegativeKeyword;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeKeywordWriteToRowValuesCampaignIdTest extends BulkAdGroupNegativeKeywordTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L}
        });
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Parent Id", this.datum, this.propertyValue, new BiConsumer<BulkAdGroupNegativeKeyword, Long>() {
            @Override
            public void accept(BulkAdGroupNegativeKeyword c, Long v) {
                c.setAdGroupId(v);
            }
        });
    }
}
