package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location_intent.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location_intent.BulkAdGroupLocationIntentCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupLocationIntentCriterion;
import com.microsoft.bingads.v13.campaignmanagement.AdGroupCriterionStatus;

@RunWith(Parameterized.class)
public class BulkAdGroupLocationIntentCriterionReadStatusTest extends BulkAdGroupLocationIntentCriterionTest {

    @Parameter(value = 1)
    public AdGroupCriterionStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"", null},
                        {null, null},
                        {"Active", AdGroupCriterionStatus.ACTIVE},
                        {"Paused", AdGroupCriterionStatus.PAUSED},
                        {"Deleted", AdGroupCriterionStatus.DELETED}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Status",
                datum,
                expectedResult,
                new Function<BulkAdGroupLocationIntentCriterion, AdGroupCriterionStatus>() {
                    @Override
                    public AdGroupCriterionStatus apply(BulkAdGroupLocationIntentCriterion c) {
                        return c.getBiddableAdGroupCriterion().getStatus();
                    }
                }
        );
    }
}
