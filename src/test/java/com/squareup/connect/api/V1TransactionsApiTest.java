/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.models.V1Refund;
import com.squareup.connect.models.V1CreateRefundRequest;
import com.squareup.connect.models.V1BankAccount;
import com.squareup.connect.models.V1Order;
import com.squareup.connect.models.V1Payment;
import com.squareup.connect.models.V1Settlement;
import com.squareup.connect.models.V1UpdateOrderRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VTransactionsApi
 */
@Ignore
public class V1TransactionsApiTest {

    private final V1TransactionsApi api = new V1TransactionsApi();

    
    /**
     * Issues a refund for a previously processed payment. You must issue a refund within 60 days of the associated payment.
     *
     * Issues a refund for a previously processed payment. You must issue a refund within 60 days of the associated payment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRefundTest() throws ApiException {
        String locationId = null;
        V1CreateRefundRequest body = null;
        V1Refund response = api.createRefund(locationId, body);

        // TODO: test validations
    }
    
    /**
     * Provides non-confidential details for all of a location&#39;s associated bank accounts. This endpoint does not provide full bank account numbers, and there is no way to obtain a full bank account number with the Connect API.
     *
     * Provides non-confidential details for all of a location&#39;s associated bank accounts. This endpoint does not provide full bank account numbers, and there is no way to obtain a full bank account number with the Connect API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listBankAccountsTest() throws ApiException {
        String locationId = null;
        List<V1BankAccount> response = api.listBankAccounts(locationId);

        // TODO: test validations
    }
    
    /**
     * Provides summary information for a merchant&#39;s online store orders.
     *
     * Provides summary information for a merchant&#39;s online store orders.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOrdersTest() throws ApiException {
        String locationId = null;
        String order = null;
        Integer limit = null;
        List<V1Order> response = api.listOrders(locationId, order, limit);

        // TODO: test validations
    }
    
    /**
     * Provides summary information for all payments taken by a merchant or any of the merchant&#39;s mobile staff during a date range. Date ranges cannot exceed one year in length. See Date ranges for details of inclusive and exclusive dates.
     *
     * Provides summary information for all payments taken by a merchant or any of the merchant&#39;s mobile staff during a date range. Date ranges cannot exceed one year in length. See Date ranges for details of inclusive and exclusive dates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPaymentsTest() throws ApiException {
        String locationId = null;
        String order = null;
        String beginTime = null;
        String endTime = null;
        Integer limit = null;
        List<V1Payment> response = api.listPayments(locationId, order, beginTime, endTime, limit);

        // TODO: test validations
    }
    
    /**
     * Provides the details for all refunds initiated by a merchant or any of the merchant&#39;s mobile staff during a date range. Date ranges cannot exceed one year in length.
     *
     * Provides the details for all refunds initiated by a merchant or any of the merchant&#39;s mobile staff during a date range. Date ranges cannot exceed one year in length.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRefundsTest() throws ApiException {
        String locationId = null;
        String order = null;
        String beginTime = null;
        String endTime = null;
        Integer limit = null;
        List<V1Refund> response = api.listRefunds(locationId, order, beginTime, endTime, limit);

        // TODO: test validations
    }
    
    /**
     * Provides summary information for all deposits and withdrawals initiated by Square to a merchant&#39;s bank account during a date range. Date ranges cannot exceed one year in length.
     *
     * Provides summary information for all deposits and withdrawals initiated by Square to a merchant&#39;s bank account during a date range. Date ranges cannot exceed one year in length. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSettlementsTest() throws ApiException {
        String locationId = null;
        String order = null;
        String beginTime = null;
        String endTime = null;
        Integer limit = null;
        String status = null;
        List<V1Settlement> response = api.listSettlements(locationId, order, beginTime, endTime, limit, status);

        // TODO: test validations
    }
    
    /**
     * Provides non-confidential details for a merchant&#39;s associated bank account. This endpoint does not provide full bank account numbers, and there is no way to obtain a full bank account number with the Connect API.
     *
     * Provides non-confidential details for a merchant&#39;s associated bank account. This endpoint does not provide full bank account numbers, and there is no way to obtain a full bank account number with the Connect API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveBankAccountTest() throws ApiException {
        String locationId = null;
        String bankAccountId = null;
        V1BankAccount response = api.retrieveBankAccount(locationId, bankAccountId);

        // TODO: test validations
    }
    
    /**
     * Provides comprehensive information for a single online store order, including the order&#39;s history.
     *
     * Provides comprehensive information for a single online store order, including the order&#39;s history.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveOrderTest() throws ApiException {
        String locationId = null;
        String orderId = null;
        V1Order response = api.retrieveOrder(locationId, orderId);

        // TODO: test validations
    }
    
    /**
     * Provides comprehensive information for a single payment.
     *
     * Provides comprehensive information for a single payment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrievePaymentTest() throws ApiException {
        String locationId = null;
        String paymentId = null;
        V1Payment response = api.retrievePayment(locationId, paymentId);

        // TODO: test validations
    }
    
    /**
     * Provides comprehensive information for a single settlement, including the entries that contribute to the settlement&#39;s total.
     *
     * Provides comprehensive information for a single settlement, including the entries that contribute to the settlement&#39;s total.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveSettlementTest() throws ApiException {
        String locationId = null;
        String settlementId = null;
        V1Settlement response = api.retrieveSettlement(locationId, settlementId);

        // TODO: test validations
    }
    
    /**
     * Updates the details of an online store order. Every update you perform on an order corresponds to one of three actions:
     *
     * Updates the details of an online store order. Every update you perform on an order corresponds to one of three actions:
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrderTest() throws ApiException {
        String locationId = null;
        String orderId = null;
        V1UpdateOrderRequest body = null;
        V1Order response = api.updateOrder(locationId, orderId, body);

        // TODO: test validations
    }
    
}