package com.microsoft.bingads.v13.api.test.entities;

import com.microsoft.bingads.v13.campaignmanagement.PageVisitorsRule;

public class PageVisitorsRuleComparer implements EqualityComparerWithDescription<PageVisitorsRule> {

    @Override
    public Boolean equals(PageVisitorsRule x, PageVisitorsRule y) {      
        if (x == null || y == null) {
        	return x == y;
        }  
        if (x.getNormalForm() != y.getNormalForm())
        	return false;
        return RuleItemGroupsComparer.equals(x.getRuleItemGroups().getRuleItemGroups(), y.getRuleItemGroups().getRuleItemGroups());
    }

    @Override
    public String getDescription(PageVisitorsRule obj) {
        String result = "";      
        if (obj != null) {
        	result = RuleItemGroupsComparer.getDescription(obj.getRuleItemGroups().getRuleItemGroups());
        }      
        return result;
    }
    
}
