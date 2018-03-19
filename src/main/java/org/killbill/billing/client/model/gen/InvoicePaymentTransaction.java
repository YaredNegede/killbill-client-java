/*
 * Copyright 2014-2018 Groupon, Inc
 * Copyright 2014-2018 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.joda.time.DateTime;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.client.model.gen.AuditLog;
import org.killbill.billing.client.model.gen.InvoiceItem;
import org.killbill.billing.client.model.gen.PluginProperty;
import org.killbill.billing.payment.api.TransactionStatus;
import org.killbill.billing.payment.api.TransactionType;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class InvoicePaymentTransaction extends KillBillObject {

    private UUID transactionId = null;

    private String transactionExternalKey = null;

    private UUID paymentId = null;

    private String paymentExternalKey = null;

    private TransactionType transactionType = null;

    private BigDecimal amount = null;

    private Currency currency = null;

    private DateTime effectiveDate = null;

    private BigDecimal processedAmount = null;

    private String processedCurrency = null;

    private TransactionStatus status = null;

    private String gatewayErrorCode = null;

    private String gatewayErrorMsg = null;

    private String firstPaymentReferenceId = null;

    private String secondPaymentReferenceId = null;

    private List<PluginProperty> properties = null;

    private Boolean isAdjusted = false;

    private List<InvoiceItem> adjustments = null;



    public InvoicePaymentTransaction() {
    }

    public InvoicePaymentTransaction(final UUID transactionId,
                     final String transactionExternalKey,
                     final UUID paymentId,
                     final String paymentExternalKey,
                     final TransactionType transactionType,
                     final BigDecimal amount,
                     final Currency currency,
                     final DateTime effectiveDate,
                     final BigDecimal processedAmount,
                     final String processedCurrency,
                     final TransactionStatus status,
                     final String gatewayErrorCode,
                     final String gatewayErrorMsg,
                     final String firstPaymentReferenceId,
                     final String secondPaymentReferenceId,
                     final List<PluginProperty> properties,
                     final Boolean isAdjusted,
                     final List<InvoiceItem> adjustments,
                     final List<AuditLog> auditLogs) {
        super(auditLogs);
        this.transactionId = transactionId;
        this.transactionExternalKey = transactionExternalKey;
        this.paymentId = paymentId;
        this.paymentExternalKey = paymentExternalKey;
        this.transactionType = transactionType;
        this.amount = amount;
        this.currency = currency;
        this.effectiveDate = effectiveDate;
        this.processedAmount = processedAmount;
        this.processedCurrency = processedCurrency;
        this.status = status;
        this.gatewayErrorCode = gatewayErrorCode;
        this.gatewayErrorMsg = gatewayErrorMsg;
        this.firstPaymentReferenceId = firstPaymentReferenceId;
        this.secondPaymentReferenceId = secondPaymentReferenceId;
        this.properties = properties;
        this.isAdjusted = isAdjusted;
        this.adjustments = adjustments;

    }


    public InvoicePaymentTransaction setTransactionId(final UUID transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public InvoicePaymentTransaction setTransactionExternalKey(final String transactionExternalKey) {
        this.transactionExternalKey = transactionExternalKey;
        return this;
    }

    public String getTransactionExternalKey() {
        return transactionExternalKey;
    }

    public InvoicePaymentTransaction setPaymentId(final UUID paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    public UUID getPaymentId() {
        return paymentId;
    }

    public InvoicePaymentTransaction setPaymentExternalKey(final String paymentExternalKey) {
        this.paymentExternalKey = paymentExternalKey;
        return this;
    }

    public String getPaymentExternalKey() {
        return paymentExternalKey;
    }

    public InvoicePaymentTransaction setTransactionType(final TransactionType transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public InvoicePaymentTransaction setAmount(final BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public InvoicePaymentTransaction setCurrency(final Currency currency) {
        this.currency = currency;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public InvoicePaymentTransaction setEffectiveDate(final DateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public DateTime getEffectiveDate() {
        return effectiveDate;
    }

    public InvoicePaymentTransaction setProcessedAmount(final BigDecimal processedAmount) {
        this.processedAmount = processedAmount;
        return this;
    }

    public BigDecimal getProcessedAmount() {
        return processedAmount;
    }

    public InvoicePaymentTransaction setProcessedCurrency(final String processedCurrency) {
        this.processedCurrency = processedCurrency;
        return this;
    }

    public String getProcessedCurrency() {
        return processedCurrency;
    }

    public InvoicePaymentTransaction setStatus(final TransactionStatus status) {
        this.status = status;
        return this;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public InvoicePaymentTransaction setGatewayErrorCode(final String gatewayErrorCode) {
        this.gatewayErrorCode = gatewayErrorCode;
        return this;
    }

    public String getGatewayErrorCode() {
        return gatewayErrorCode;
    }

    public InvoicePaymentTransaction setGatewayErrorMsg(final String gatewayErrorMsg) {
        this.gatewayErrorMsg = gatewayErrorMsg;
        return this;
    }

    public String getGatewayErrorMsg() {
        return gatewayErrorMsg;
    }

    public InvoicePaymentTransaction setFirstPaymentReferenceId(final String firstPaymentReferenceId) {
        this.firstPaymentReferenceId = firstPaymentReferenceId;
        return this;
    }

    public String getFirstPaymentReferenceId() {
        return firstPaymentReferenceId;
    }

    public InvoicePaymentTransaction setSecondPaymentReferenceId(final String secondPaymentReferenceId) {
        this.secondPaymentReferenceId = secondPaymentReferenceId;
        return this;
    }

    public String getSecondPaymentReferenceId() {
        return secondPaymentReferenceId;
    }

    public InvoicePaymentTransaction setProperties(final List<PluginProperty> properties) {
        this.properties = properties;
        return this;
    }

    public InvoicePaymentTransaction addPropertiesItem(final PluginProperty propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<PluginProperty>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public List<PluginProperty> getProperties() {
        return properties;
    }

    public InvoicePaymentTransaction setIsAdjusted(final Boolean isAdjusted) {
        this.isAdjusted = isAdjusted;
        return this;
    }

    public Boolean isIsAdjusted() {
        return isAdjusted;
    }

    public InvoicePaymentTransaction setAdjustments(final List<InvoiceItem> adjustments) {
        this.adjustments = adjustments;
        return this;
    }

    public InvoicePaymentTransaction addAdjustmentsItem(final InvoiceItem adjustmentsItem) {
        if (this.adjustments == null) {
            this.adjustments = new ArrayList<InvoiceItem>();
        }
        this.adjustments.add(adjustmentsItem);
        return this;
    }

    public List<InvoiceItem> getAdjustments() {
        return adjustments;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvoicePaymentTransaction invoicePaymentTransaction = (InvoicePaymentTransaction) o;
        return Objects.equals(this.transactionId, invoicePaymentTransaction.transactionId) &&
        Objects.equals(this.transactionExternalKey, invoicePaymentTransaction.transactionExternalKey) &&
        Objects.equals(this.paymentId, invoicePaymentTransaction.paymentId) &&
        Objects.equals(this.paymentExternalKey, invoicePaymentTransaction.paymentExternalKey) &&
        Objects.equals(this.transactionType, invoicePaymentTransaction.transactionType) &&
        Objects.equals(this.amount, invoicePaymentTransaction.amount) &&
        Objects.equals(this.currency, invoicePaymentTransaction.currency) &&
        Objects.equals(this.effectiveDate, invoicePaymentTransaction.effectiveDate) &&
        Objects.equals(this.processedAmount, invoicePaymentTransaction.processedAmount) &&
        Objects.equals(this.processedCurrency, invoicePaymentTransaction.processedCurrency) &&
        Objects.equals(this.status, invoicePaymentTransaction.status) &&
        Objects.equals(this.gatewayErrorCode, invoicePaymentTransaction.gatewayErrorCode) &&
        Objects.equals(this.gatewayErrorMsg, invoicePaymentTransaction.gatewayErrorMsg) &&
        Objects.equals(this.firstPaymentReferenceId, invoicePaymentTransaction.firstPaymentReferenceId) &&
        Objects.equals(this.secondPaymentReferenceId, invoicePaymentTransaction.secondPaymentReferenceId) &&
        Objects.equals(this.properties, invoicePaymentTransaction.properties) &&
        Objects.equals(this.isAdjusted, invoicePaymentTransaction.isAdjusted) &&
        Objects.equals(this.adjustments, invoicePaymentTransaction.adjustments) &&
        Objects.equals(this.auditLogs, invoicePaymentTransaction.auditLogs);

    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId,
                            transactionExternalKey,
                            paymentId,
                            paymentExternalKey,
                            transactionType,
                            amount,
                            currency,
                            effectiveDate,
                            processedAmount,
                            processedCurrency,
                            status,
                            gatewayErrorCode,
                            gatewayErrorMsg,
                            firstPaymentReferenceId,
                            secondPaymentReferenceId,
                            properties,
                            isAdjusted,
                            adjustments,
                            auditLogs, super.hashCode());
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvoicePaymentTransaction {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    transactionExternalKey: ").append(toIndentedString(transactionExternalKey)).append("\n");
        sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
        sb.append("    paymentExternalKey: ").append(toIndentedString(paymentExternalKey)).append("\n");
        sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    processedAmount: ").append(toIndentedString(processedAmount)).append("\n");
        sb.append("    processedCurrency: ").append(toIndentedString(processedCurrency)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    gatewayErrorCode: ").append(toIndentedString(gatewayErrorCode)).append("\n");
        sb.append("    gatewayErrorMsg: ").append(toIndentedString(gatewayErrorMsg)).append("\n");
        sb.append("    firstPaymentReferenceId: ").append(toIndentedString(firstPaymentReferenceId)).append("\n");
        sb.append("    secondPaymentReferenceId: ").append(toIndentedString(secondPaymentReferenceId)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    isAdjusted: ").append(toIndentedString(isAdjusted)).append("\n");
        sb.append("    adjustments: ").append(toIndentedString(adjustments)).append("\n");
        sb.append("    auditLogs: ").append(toIndentedString(auditLogs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

