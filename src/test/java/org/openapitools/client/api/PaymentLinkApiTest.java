/*
 * Hub Token
 * Generate Token
 *
 * The version of the OpenAPI document: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.PaymentLinkRequestDTO;
import org.openapitools.client.model.ResultDTO;
import org.openapitools.client.model.StatusOrExpiryDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentLinkApi
 */
@Ignore
public class PaymentLinkApiTest {

    private final PaymentLinkApi api = new PaymentLinkApi();

    
    /**
     * change status and expiry for paymentLink 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeStatusOrExpiryTest() throws ApiException {
        String id = null;
        String mid = null;
        StatusOrExpiryDTO statusOrExpiryDTO = null;
        ResultDTO response = api.changeStatusOrExpiry(id, mid, statusOrExpiryDTO);

        // TODO: test validations
    }
    
    /**
     * Create PaymentLinks
     *
     * create single payment link
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentLinkTest() throws ApiException {
        String mid = null;
        PaymentLinkRequestDTO paymentLinkRequestDTO = null;
        ResultDTO response = api.createPaymentLink(mid, paymentLinkRequestDTO);

        // TODO: test validations
    }
    
    /**
     * Get all PaymentLinks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllPaymentLinkTest() throws ApiException {
        String dateFrom = null;
        String dateTo = null;
        String mid = null;
        Integer pageOffset = null;
        Integer pageSize = null;
        String orderBy = null;
        String order = null;
        String searchText = null;
        List<String> status = null;
        ResultDTO response = api.getAllPaymentLink(dateFrom, dateTo, mid, pageOffset, pageSize, orderBy, order, searchText, status);

        // TODO: test validations
    }
    
    /**
     * Get Custom Attributes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMerchantCustomAttributesTest() throws ApiException {
        String mid = null;
        ResultDTO response = api.getMerchantCustomAttributes(mid);

        // TODO: test validations
    }
    
    /**
     * Get Transaction details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentLinkTransactionsTest() throws ApiException {
        String dateFrom = null;
        String dateTo = null;
        String id = null;
        String mid = null;
        Integer pageOffset = null;
        Integer pageSize = null;
        String orderBy = null;
        String order = null;
        String searchText = null;
        String searchTerm = null;
        List<String> status = null;
        ResultDTO response = api.getPaymentLinkTransactions(dateFrom, dateTo, id, mid, pageOffset, pageSize, orderBy, order, searchText, searchTerm, status);

        // TODO: test validations
    }
    
    /**
     * Get Single PaymentLink
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSinglePaymentLinkTest() throws ApiException {
        String id = null;
        String mid = null;
        ResultDTO response = api.getSinglePaymentLink(id, mid);

        // TODO: test validations
    }
    
    /**
     * send PaymentLink
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendPaymentLinkTest() throws ApiException {
        List<String> channelList = null;
        String id = null;
        String mid = null;
        ResultDTO response = api.sendPaymentLink(channelList, id, mid);

        // TODO: test validations
    }
    
    /**
     * Details of paymentlinks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void summaryTest() throws ApiException {
        String mid = null;
        ResultDTO response = api.summary(mid);

        // TODO: test validations
    }
    
}
