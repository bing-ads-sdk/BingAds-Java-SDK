package com.microsoft.bingads.v13.api.test.entities.ad_extension.video;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignVideoAdExtension;

public abstract class BulkCampaignVideoAdExtensionTest extends BulkEntityTest<BulkCampaignVideoAdExtension> {
    @Override
    protected void onEntityCreation(BulkCampaignVideoAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignVideoAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignVideoAdExtension>() {
            @Override
            public BulkCampaignVideoAdExtension get() {
                return new BulkCampaignVideoAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignVideoAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignVideoAdExtension>() {
            @Override
            public BulkCampaignVideoAdExtension get() {
                return new BulkCampaignVideoAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignVideoAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignVideoAdExtension>() {
            @Override
            public BulkCampaignVideoAdExtension get() {
                return new BulkCampaignVideoAdExtension();
            }
        });
    }
}
