package com.microsoft.bingads.v12.api.test.entities.campaign_product_scope.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.campaign_product_scope.BulkCampaignProductScopeTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignProductScope;

@RunWith(Parameterized.class)
public class ReadParentIdTest extends BulkCampaignProductScopeTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L},
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Parent Id",
                datum,
                expectedResult,
                new Function<BulkCampaignProductScope, Long>() {
                    @Override
                    public Long apply(BulkCampaignProductScope c) {
                        return c.getBiddableCampaignCriterion().getCampaignId();
                    }
                }
        );
    }
}