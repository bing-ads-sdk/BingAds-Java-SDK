package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender.read.BulkAdGroupGenderCriterionReadAdGroupNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender.read.BulkAdGroupGenderCriterionReadBidAdjustmentTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender.read.BulkAdGroupGenderCriterionReadCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender.read.BulkAdGroupGenderCriterionReadCashbackAdjustmentTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender.read.BulkAdGroupGenderCriterionReadIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender.read.BulkAdGroupGenderCriterionReadParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender.read.BulkAdGroupGenderCriterionReadStatusTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender.read.BulkAdGroupGenderCriterionReadTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupGenderCriterionReadIdTest.class,
        BulkAdGroupGenderCriterionReadParentIdTest.class,
        BulkAdGroupGenderCriterionReadStatusTest.class,
        BulkAdGroupGenderCriterionReadTargetTest.class,
        BulkAdGroupGenderCriterionReadAdGroupNameTest.class,
        BulkAdGroupGenderCriterionReadCampaignNameTest.class,
        BulkAdGroupGenderCriterionReadBidAdjustmentTest.class,
        BulkAdGroupGenderCriterionReadCashbackAdjustmentTest.class
})
public class BulkAdGroupGenderCriterionReadTests {
}
