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


package org.killbill.billing.client.api.gen;


import org.killbill.billing.client.model.gen.BlockingState;
import org.killbill.billing.client.model.gen.BulkSubscriptionsBundle;
import org.killbill.billing.client.model.gen.Bundle;
import org.killbill.billing.client.model.gen.CustomField;
import org.killbill.billing.client.model.gen.Subscription;
import org.killbill.billing.client.model.gen.Tag;
import java.util.UUID;
import java.util.List;
import org.killbill.billing.client.model.CustomFields;
import org.killbill.billing.client.model.Subscriptions;
import org.killbill.billing.client.model.Bundles;
import org.killbill.billing.client.model.BulkSubscriptionsBundles;
import org.killbill.billing.util.api.AuditLevel;
import org.killbill.billing.client.model.Tags;

import com.google.common.collect.Multimap;
import com.google.common.base.Preconditions;
import com.google.common.base.MoreObjects;
import com.google.common.collect.HashMultimap;

import org.killbill.billing.client.KillBillClientException;
import org.killbill.billing.client.KillBillHttpClient;
import org.killbill.billing.client.RequestOptions;


/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
public class SubscriptionApi {

    private final KillBillHttpClient httpClient;

    public SubscriptionApi() {
        this(new KillBillHttpClient());
    }

    public SubscriptionApi(final KillBillHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public BlockingState addSubscriptionBlockingState(final BlockingState body, final UUID subscriptionId, final String requestedDate, final List<String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling addSubscriptionBlockingState");
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling addSubscriptionBlockingState");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/block"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("requestedDate", String.valueOf(requestedDate));
        queryParams.put("pluginProperty", String.valueOf(pluginProperty));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPut(uri, body, BlockingState.class, requestOptions);
    }

    public void cancelEntitlementPlan(final UUID subscriptionId, final String requestedDate, final Boolean callCompletion, final Long callTimeoutSec, final String entitlementPolicy, final String billingPolicy, final Boolean useRequestedDateForBilling, final List<String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling cancelEntitlementPlan");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("requestedDate", String.valueOf(requestedDate));
        queryParams.put("callCompletion", String.valueOf(callCompletion));
        queryParams.put("callTimeoutSec", String.valueOf(callTimeoutSec));
        queryParams.put("entitlementPolicy", String.valueOf(entitlementPolicy));
        queryParams.put("billingPolicy", String.valueOf(billingPolicy));
        queryParams.put("useRequestedDateForBilling", String.valueOf(useRequestedDateForBilling));
        queryParams.put("pluginProperty", String.valueOf(pluginProperty));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        httpClient.doDelete(uri, requestOptions);
    }

    public Subscription changeEntitlementPlan(final Subscription body, final UUID subscriptionId, final String requestedDate, final Boolean callCompletion, final Long callTimeoutSec, final String billingPolicy, final List<String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling changeEntitlementPlan");
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling changeEntitlementPlan");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("requestedDate", String.valueOf(requestedDate));
        queryParams.put("callCompletion", String.valueOf(callCompletion));
        queryParams.put("callTimeoutSec", String.valueOf(callTimeoutSec));
        queryParams.put("billingPolicy", String.valueOf(billingPolicy));
        queryParams.put("pluginProperty", String.valueOf(pluginProperty));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPut(uri, body, Subscription.class, requestOptions);
    }

    public CustomFields createCustomFields(final UUID subscriptionId, final CustomFields body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling createCustomFields");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createCustomFields");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/customFields"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());


        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .build();


        return httpClient.doPost(uri, body, CustomFields.class, requestOptions);
    }

    public Subscription createEntitlement(final Subscription body, final String requestedDate, final String entitlementDate, final String billingDate, final Boolean renameKeyIfExistsAndUnused, final Boolean migrated, final Integer bcd, final Boolean callCompletion, final Long callTimeoutSec, final List<String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createEntitlement");

        final String uri = "/1.0/kb/subscriptions";

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("requestedDate", String.valueOf(requestedDate));
        queryParams.put("entitlementDate", String.valueOf(entitlementDate));
        queryParams.put("billingDate", String.valueOf(billingDate));
        queryParams.put("renameKeyIfExistsAndUnused", String.valueOf(renameKeyIfExistsAndUnused));
        queryParams.put("migrated", String.valueOf(migrated));
        queryParams.put("bcd", String.valueOf(bcd));
        queryParams.put("callCompletion", String.valueOf(callCompletion));
        queryParams.put("callTimeoutSec", String.valueOf(callTimeoutSec));
        queryParams.put("pluginProperty", String.valueOf(pluginProperty));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();


        return httpClient.doPost(uri, body, Subscription.class, requestOptions);
    }

    public Bundle createEntitlementWithAddOns(final Subscriptions body, final String requestedDate, final String entitlementDate, final String billingDate, final Boolean migrated, final Boolean renameKeyIfExistsAndUnused, final Boolean callCompletion, final Long callTimeoutSec, final List<String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createEntitlementWithAddOns");

        final String uri = "/1.0/kb/subscriptions/createEntitlementWithAddOns";

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("requestedDate", String.valueOf(requestedDate));
        queryParams.put("entitlementDate", String.valueOf(entitlementDate));
        queryParams.put("billingDate", String.valueOf(billingDate));
        queryParams.put("migrated", String.valueOf(migrated));
        queryParams.put("renameKeyIfExistsAndUnused", String.valueOf(renameKeyIfExistsAndUnused));
        queryParams.put("callCompletion", String.valueOf(callCompletion));
        queryParams.put("callTimeoutSec", String.valueOf(callTimeoutSec));
        queryParams.put("pluginProperty", String.valueOf(pluginProperty));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();


        return httpClient.doPost(uri, body, Bundle.class, requestOptions);
    }

    public Bundles createEntitlementsWithAddOns(final BulkSubscriptionsBundles body, final String requestedDate, final String entitlementDate, final String billingDate, final Boolean renameKeyIfExistsAndUnused, final Boolean migrated, final Boolean callCompletion, final Long callTimeoutSec, final List<String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createEntitlementsWithAddOns");

        final String uri = "/1.0/kb/subscriptions/createEntitlementsWithAddOns";

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("requestedDate", String.valueOf(requestedDate));
        queryParams.put("entitlementDate", String.valueOf(entitlementDate));
        queryParams.put("billingDate", String.valueOf(billingDate));
        queryParams.put("renameKeyIfExistsAndUnused", String.valueOf(renameKeyIfExistsAndUnused));
        queryParams.put("migrated", String.valueOf(migrated));
        queryParams.put("callCompletion", String.valueOf(callCompletion));
        queryParams.put("callTimeoutSec", String.valueOf(callTimeoutSec));
        queryParams.put("pluginProperty", String.valueOf(pluginProperty));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();


        return httpClient.doPost(uri, body, Bundles.class, requestOptions);
    }

    public void createTags(final UUID subscriptionId, final String tagList,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling createTags");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/tags"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("tagList", String.valueOf(tagList));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();


        httpClient.doPost(uri, null, requestOptions);
    }

    public void deleteCustomFields(final UUID subscriptionId, final String customFieldList,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling deleteCustomFields");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/customFields"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("customFieldList", String.valueOf(customFieldList));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        httpClient.doDelete(uri, requestOptions);
    }

    public void deleteTags(final UUID subscriptionId, final String tagList,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling deleteTags");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/tags"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("tagList", String.valueOf(tagList));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        httpClient.doDelete(uri, requestOptions);
    }

    public CustomFields getCustomFields(final UUID subscriptionId, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling getCustomFields");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/customFields"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, CustomFields.class, requestOptions);
    }

    public Subscription getEntitlement(final UUID subscriptionId, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling getEntitlement");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Subscription.class, requestOptions);
    }

    public Tags getTags(final UUID subscriptionId, final AuditLevel auditLevel, final Boolean includedDeleted,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling getTags");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/tags"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("auditLevel", String.valueOf(auditLevel));
        queryParams.put("includedDeleted", String.valueOf(includedDeleted));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Tags.class, requestOptions);
    }

    public CustomFields modifyCustomFields(final UUID subscriptionId, final CustomFields body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling modifyCustomFields");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling modifyCustomFields");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/customFields"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        return httpClient.doPut(uri, body, CustomFields.class, requestOptions);
    }

    public void uncancelEntitlementPlan(final UUID subscriptionId, final List<String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling uncancelEntitlementPlan");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/uncancel"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("pluginProperty", String.valueOf(pluginProperty));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

         httpClient.doPut(uri, null, requestOptions);
    }

    public void undoChangeEntitlementPlan(final UUID subscriptionId, final List<String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling undoChangeEntitlementPlan");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/undoChangePlan"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("pluginProperty", String.valueOf(pluginProperty));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

         httpClient.doPut(uri, null, requestOptions);
    }

    public Subscription updateSubscriptionBCD(final Subscription body, final UUID subscriptionId, final String effectiveFromDate, final Boolean forceNewBcdWithPastEffectiveDate,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling updateSubscriptionBCD");
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling updateSubscriptionBCD");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/bcd"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("effectiveFromDate", String.valueOf(effectiveFromDate));
        queryParams.put("forceNewBcdWithPastEffectiveDate", String.valueOf(forceNewBcdWithPastEffectiveDate));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPut(uri, body, Subscription.class, requestOptions);
    }

}