package com.microsoft.bingads.internal;

import static org.easymock.EasyMock.eq;
import static org.easymock.EasyMock.expect;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.net.MalformedURLException;
import java.net.URL;

import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.microsoft.bingads.OAuthScope;
import com.microsoft.bingads.OAuthTest;
import com.microsoft.bingads.OAuthTokens;
import com.microsoft.bingads.OAuthWebAuthCodeGrant;

@RunWith(EasyMockRunner.class)
public class OAuthAuthCodeForWebAppTest extends EasyMockSupport {

    @Mock
    private OAuthService oauthService;

    @Mock
    private OAuthTokens expectedTokenInfo;

    @Test
    public void GetAuthorizationUrl_ReturnsCorrectUrl() {
        try {
            OAuthAuthorization auth = OAuthTest.CreateWebAuth("test_id", "test_secret");

            URL authorizationUrl = auth.getAuthorizationEndpoint();

            URL expectedUrl = new URL("https://login.live.com/oauth20_authorize.srf?"
                    + "scope=bingads.manage&"
                    + "response_type=code&"
                    + "redirect_uri=https%3A%2F%2Ftest.com%2Flogin&"
                    + "client_id=test_id"
            );
            assertEquals(expectedUrl, authorizationUrl);
        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        } catch (Exception e) {
            fail("Failed create OAuthAuthorization");
        }
    }
    
    @Test
    public void GetAuthorizationUrl_ReturnsCorrectUrl_WithState() {
        try {
            OAuthAuthorization auth = OAuthTest.CreateWebAuth("test_id", "test_secret");
            
            auth.setState("state_test");

            URL authorizationUrl = auth.getAuthorizationEndpoint();

            URL expectedUrl = new URL("https://login.live.com/oauth20_authorize.srf?"
                    + "scope=bingads.manage&"
                    + "response_type=code&"
                    + "redirect_uri=https%3A%2F%2Ftest.com%2Flogin&"
                    + "state=state_test&"
                    + "client_id=test_id"
            );
            assertEquals(expectedUrl, authorizationUrl);
        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        } catch (Exception e) {
            fail("Failed create OAuthAuthorization");
        }
    }
    
    @Test
    public void GetAuthorizationUrl_ReturnsCorrectUrl_WithEmptyState() {
        try {
            OAuthAuthorization auth = OAuthTest.CreateWebAuth("test_id", "test_secret");
            
            auth.setState("");

            URL authorizationUrl = auth.getAuthorizationEndpoint();

            URL expectedUrl = new URL("https://login.live.com/oauth20_authorize.srf?"
                    + "scope=bingads.manage&"
                    + "response_type=code&"
                    + "redirect_uri=https%3A%2F%2Ftest.com%2Flogin&"
                    + "client_id=test_id"
            );
            assertEquals(expectedUrl, authorizationUrl);
        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        } catch (Exception e) {
            fail("Failed create OAuthAuthorization");
        }
    }


    @Test
    public void RequestAccessAndRefreshTokensUsingResponseUri_ReturnsCorrectTokens() {
        try {
            OAuthRequestParameters expectedRequestParameters = new OAuthRequestParameters(
                    "test_id",
                    "test_secret",
                    new URL("https://test.com/login"),
                    "authorization_code",
                    "code",
                    "123"
            );

            expect(oauthService.getAccessTokens(eq(expectedRequestParameters), eq(OAuthScope.BINGADS_MANAGE), eq("common"), eq(null))).andReturn(expectedTokenInfo);

            OAuthWebAuthCodeGrant auth = OAuthTest.CreateWebAuth("test_id", "test_secret", oauthService);

            replayAll();

            OAuthTokens tokens = auth.requestAccessAndRefreshTokens(new URL("http://test.com/login?code=123"));

            assertEquals(expectedTokenInfo, tokens);

        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        } catch (Exception e) {
            fail("Failed create OAuthAuthorization");
        }
    }

    @Test
    public void RequestAccessAndRefreshTokensUsingRefreshToken_ReturnsCorrectTokens() {
        try {
            expect(oauthService.getAccessTokens(new OAuthRequestParameters(
                    "test_id",
                    "test_secret",
                    null,
                    "refresh_token",
                    "refresh_token",
                    "xxx"
            ), OAuthScope.BINGADS_MANAGE, "common", null)).andReturn(expectedTokenInfo);

            OAuthWebAuthCodeGrant auth = OAuthTest.CreateWebAuth("test_id", "test_secret", oauthService);

            replayAll();

            OAuthTokens tokens = auth.requestAccessAndRefreshTokens("xxx");

            assertEquals(expectedTokenInfo, tokens);

        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        } catch (Exception e) {
            fail("Failed create OAuthAuthorization");
        }
    }
}
