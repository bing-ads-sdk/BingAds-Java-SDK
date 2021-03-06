package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for ImportAdditionalField.
 */
public enum ImportAdditionalField {

    NONE("None"),
    NOTIFICATION_EMAIL("NotificationEmail"),
    AUTO_DEVICE_BID_OPTIMIZATION("AutoDeviceBidOptimization"),
    ACTIVE_AD_GROUPS_ONLY("ActiveAdGroupsOnly"),
    SEARCH_AND_REPLACE_FOR_CUSTOM_PARAMETERS("SearchAndReplaceForCustomParameters");
        
    private final String value;

    ImportAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportAdditionalField fromValue(String v) {
        for (ImportAdditionalField c : ImportAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}