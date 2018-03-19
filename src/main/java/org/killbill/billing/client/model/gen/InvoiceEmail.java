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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.killbill.billing.client.model.gen.AuditLog;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class InvoiceEmail extends KillBillObject {

    private UUID accountId = null;

    private Boolean isNotifiedForInvoices = false;



    public InvoiceEmail() {
    }

    public InvoiceEmail(final UUID accountId,
                     final Boolean isNotifiedForInvoices,
                     final List<AuditLog> auditLogs) {
        super(auditLogs);
        this.accountId = accountId;
        this.isNotifiedForInvoices = isNotifiedForInvoices;

    }


    public InvoiceEmail setAccountId(final UUID accountId) {
        this.accountId = accountId;
        return this;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public InvoiceEmail setIsNotifiedForInvoices(final Boolean isNotifiedForInvoices) {
        this.isNotifiedForInvoices = isNotifiedForInvoices;
        return this;
    }

    public Boolean isIsNotifiedForInvoices() {
        return isNotifiedForInvoices;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvoiceEmail invoiceEmail = (InvoiceEmail) o;
        return Objects.equals(this.accountId, invoiceEmail.accountId) &&
        Objects.equals(this.isNotifiedForInvoices, invoiceEmail.isNotifiedForInvoices) &&
        Objects.equals(this.auditLogs, invoiceEmail.auditLogs);

    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId,
                            isNotifiedForInvoices,
                            auditLogs, super.hashCode());
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvoiceEmail {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    isNotifiedForInvoices: ").append(toIndentedString(isNotifiedForInvoices)).append("\n");
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

