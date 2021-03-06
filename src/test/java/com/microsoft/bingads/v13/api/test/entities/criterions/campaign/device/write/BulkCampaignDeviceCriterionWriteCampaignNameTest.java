package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.device.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.device.BulkCampaignDeviceCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignDeviceCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignDeviceCriterionWriteCampaignNameTest extends BulkCampaignDeviceCriterionTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Campaign",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignDeviceCriterion, String>() {
                    @Override
                    public void accept(BulkCampaignDeviceCriterion c, String v) {
                        c.setCampaignName(v);
                    }
                }
        );
    }
}
