package com.microsoft.bingads.v13.api.test.entities.ad_extension.video.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.video.BulkVideoAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideoAdExtension;

public class BulkVideoAdExtensionReadFromRowValuesThumbnailUrlTest extends BulkVideoAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {        
        return Arrays.asList(new Object[][] {
        	{null, null},
            {"", ""},
            {"http://www.test 1.com", "http://www.test 1.com"},
            {"https://www.test2.com", "https://www.test2.com"},
        });
    }
    
    @Test
    public void testRead() {
        this.testReadProperty("Thumbnail Url", this.datum, this.expectedResult, new Function<BulkVideoAdExtension, String>() {
            @Override
            public String apply(BulkVideoAdExtension c) {
                return c.getVideoAdExtension().getThumbnailUrl();
            }
        });
    }
}
