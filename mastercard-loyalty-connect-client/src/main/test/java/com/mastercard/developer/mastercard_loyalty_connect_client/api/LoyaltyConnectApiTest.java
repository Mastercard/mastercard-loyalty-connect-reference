/*
 * Mastercard Loyalty Connect Service
 * Connecting payment and retail loyalty into a single checkout experience
 *
 * The version of the OpenAPI document: 2.2.1
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.mastercard_loyalty_connect_client.api;

import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.EnrollLoyaltyConnectResponse;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.LoyaltyConnect;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.LoyaltyConnectResponse;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.MemberRefIdError;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.ServiceUnAvailableError;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.UnAuthAccessError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoyaltyConnectApi
 */
@Ignore
public class LoyaltyConnectApiTest {

    private final LoyaltyConnectApi api = new LoyaltyConnectApi();

    
    /**
     * Disconnects a specific payment card and Loyalty ID for a member
     *
     * Returns the Loyalty ID and payment card details for a member if the Loyalty ID exists as connected Delete a specific Loyalty ID and payment card connection for a member based on the unique reference key for the connection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLoyaltyConnectTest() throws ApiException {
        String xMerchantKey = null;
        String memberReferenceId = null;
        String loyaltyConnectReferenceId = null;
        api.deleteLoyaltyConnect(xMerchantKey, memberReferenceId, loyaltyConnectReferenceId);

        // TODO: test validations
    }
    
    /**
     * Connects payment card and Loyalty ID for a member
     *
     * Connects a member&#39;s payment card with Loyalty ID. The member must have the payment card and Loyalty ID enrolled before making this connection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enrollLoyaltyConnectTest() throws ApiException {
        String memberReferenceId = null;
        LoyaltyConnect loyaltyConnect = null;
        String xMerchantKey = null;
        EnrollLoyaltyConnectResponse response = api.enrollLoyaltyConnect(memberReferenceId, loyaltyConnect, xMerchantKey);

        // TODO: test validations
    }
    
    /**
     * Get a specific Loyalty ID and payment card connection details for a member
     *
     * Returns the Loyalty ID and payment card details for a member if the Loyalty ID exists as connected with the payment card based on the unique reference key for the connection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoyaltyConnectTest() throws ApiException {
        String xMerchantKey = null;
        String memberReferenceId = null;
        String loyaltyConnectReferenceId = null;
        LoyaltyConnectResponse response = api.getLoyaltyConnect(xMerchantKey, memberReferenceId, loyaltyConnectReferenceId);

        // TODO: test validations
    }
    
    /**
     * Get payment card and Loyalty ID connection details for a member
     *
     * Returns all payment card and Loyalty ID connections for the member. If the member wants to view the payment cards connected for a specific Loyalty ID, then the member merchant reference key must be provided. If the member wants to view the Loyalty IDs connected for a specific payment card, then the payment card reference key must be provided.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoyaltyConnectsTest() throws ApiException {
        String xMerchantKey = null;
        String memberReferenceId = null;
        String memberMerchantReferenceId = null;
        String paymentCardReferenceId = null;
        LoyaltyConnectResponse response = api.getLoyaltyConnects(xMerchantKey, memberReferenceId, memberMerchantReferenceId, paymentCardReferenceId);

        // TODO: test validations
    }
    
}
