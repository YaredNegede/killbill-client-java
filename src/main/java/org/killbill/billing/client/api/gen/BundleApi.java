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
import org.killbill.billing.client.model.gen.Bundle;
import org.killbill.billing.client.model.gen.CustomField;
import org.killbill.billing.client.model.gen.Tag;
import java.util.UUID;
import java.util.List;
import org.killbill.billing.client.model.CustomFields;
import org.killbill.billing.util.api.AuditLevel;
import org.killbill.billing.client.model.Bundles;
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
public class BundleApi {

    private final KillBillHttpClient httpClient;

    public BundleApi() {
        this(new KillBillHttpClient());
    }

    public BundleApi(final KillBillHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public BlockingState addBundleBlockingState(final BlockingState body, final UUID bundleId, final String requestedDate, final List<String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling addBundleBlockingState");
        Preconditions.checkNotNull(bundleId, "Missing the required parameter 'bundleId' when calling addBundleBlockingState");

        final String uri = "/1.0/kb/bundles/{bundleId}/block"
          .replaceAll("\\{" + "bundleId" + "\\}", bundleId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("requestedDate", String.valueOf(requestedDate));
        queryParams.put("pluginProperty", String.valueOf(pluginProperty));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPut(uri, body, BlockingState.class, requestOptions);
    }

    public CustomFields createCustomFields(final UUID bundleId, final CustomFields body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(bundleId, "Missing the required parameter 'bundleId' when calling createCustomFields");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createCustomFields");

        final String uri = "/1.0/kb/bundles/{bundleId}/customFields"
          .replaceAll("\\{" + "bundleId" + "\\}", bundleId.toString());


        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .build();


        return httpClient.doPost(uri, body, CustomFields.class, requestOptions);
    }

    public void createTags(final UUID bundleId, final String tagList,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(bundleId, "Missing the required parameter 'bundleId' when calling createTags");

        final String uri = "/1.0/kb/bundles/{bundleId}/tags"
          .replaceAll("\\{" + "bundleId" + "\\}", bundleId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("tagList", String.valueOf(tagList));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();


        httpClient.doPost(uri, null, requestOptions);
    }

    public void deleteCustomFields(final UUID bundleId, final String customFieldList,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(bundleId, "Missing the required parameter 'bundleId' when calling deleteCustomFields");

        final String uri = "/1.0/kb/bundles/{bundleId}/customFields"
          .replaceAll("\\{" + "bundleId" + "\\}", bundleId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("customFieldList", String.valueOf(customFieldList));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        httpClient.doDelete(uri, requestOptions);
    }

    public void deleteTags(final UUID bundleId, final String tagList,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(bundleId, "Missing the required parameter 'bundleId' when calling deleteTags");

        final String uri = "/1.0/kb/bundles/{bundleId}/tags"
          .replaceAll("\\{" + "bundleId" + "\\}", bundleId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("tagList", String.valueOf(tagList));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        httpClient.doDelete(uri, requestOptions);
    }

    public Bundle getBundle(final UUID bundleId, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(bundleId, "Missing the required parameter 'bundleId' when calling getBundle");

        final String uri = "/1.0/kb/bundles/{bundleId}"
          .replaceAll("\\{" + "bundleId" + "\\}", bundleId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Bundle.class, requestOptions);
    }

    public Bundle getBundleByKey(final String externalKey, final Boolean includedDeleted, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(externalKey, "Missing the required parameter 'externalKey' when calling getBundleByKey");

        final String uri = "/1.0/kb/bundles";

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("externalKey", String.valueOf(externalKey));
        queryParams.put("includedDeleted", String.valueOf(includedDeleted));
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Bundle.class, requestOptions);
    }

    public Bundles getBundles(final Long offset, final Long limit, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {


        final String uri = "/1.0/kb/bundles/pagination";

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("offset", String.valueOf(offset));
        queryParams.put("limit", String.valueOf(limit));
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Bundles.class, requestOptions);
    }

    public CustomFields getCustomFields(final UUID bundleId, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(bundleId, "Missing the required parameter 'bundleId' when calling getCustomFields");

        final String uri = "/1.0/kb/bundles/{bundleId}/customFields"
          .replaceAll("\\{" + "bundleId" + "\\}", bundleId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, CustomFields.class, requestOptions);
    }

    public Tags getTags(final UUID bundleId, final AuditLevel auditLevel, final Boolean includedDeleted,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(bundleId, "Missing the required parameter 'bundleId' when calling getTags");

        final String uri = "/1.0/kb/bundles/{bundleId}/tags"
          .replaceAll("\\{" + "bundleId" + "\\}", bundleId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("auditLevel", String.valueOf(auditLevel));
        queryParams.put("includedDeleted", String.valueOf(includedDeleted));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Tags.class, requestOptions);
    }

    public CustomFields modifyCustomFields(final UUID bundleId, final CustomFields body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(bundleId, "Missing the required parameter 'bundleId' when calling modifyCustomFields");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling modifyCustomFields");

        final String uri = "/1.0/kb/bundles/{bundleId}/customFields"
          .replaceAll("\\{" + "bundleId" + "\\}", bundleId.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        return httpClient.doPut(uri, body, CustomFields.class, requestOptions);
    }

    public void pauseBundle(final UUID bundleId, final String requestedDate, final List<String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(bundleId, "Missing the required parameter 'bundleId' when calling pauseBundle");

        final String uri = "/1.0/kb/bundles/{bundleId}/pause"
          .replaceAll("\\{" + "bundleId" + "\\}", bundleId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("requestedDate", String.valueOf(requestedDate));
        queryParams.put("pluginProperty", String.valueOf(pluginProperty));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

         httpClient.doPut(uri, null, requestOptions);
    }

    public Bundle renameExternalKey(final Bundle body, final UUID bundleId,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling renameExternalKey");
        Preconditions.checkNotNull(bundleId, "Missing the required parameter 'bundleId' when calling renameExternalKey");

        final String uri = "/1.0/kb/bundles/{bundleId}/renameKey"
          .replaceAll("\\{" + "bundleId" + "\\}", bundleId.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        return httpClient.doPut(uri, body, Bundle.class, requestOptions);
    }

    public void resumeBundle(final UUID bundleId, final String requestedDate, final List<String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(bundleId, "Missing the required parameter 'bundleId' when calling resumeBundle");

        final String uri = "/1.0/kb/bundles/{bundleId}/resume"
          .replaceAll("\\{" + "bundleId" + "\\}", bundleId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("requestedDate", String.valueOf(requestedDate));
        queryParams.put("pluginProperty", String.valueOf(pluginProperty));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

         httpClient.doPut(uri, null, requestOptions);
    }

    public Bundles searchBundles(final String searchKey, final Long offset, final Long limit, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(searchKey, "Missing the required parameter 'searchKey' when calling searchBundles");

        final String uri = "/1.0/kb/bundles/search/{searchKey}"
          .replaceAll("\\{" + "searchKey" + "\\}", searchKey.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("offset", String.valueOf(offset));
        queryParams.put("limit", String.valueOf(limit));
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Bundles.class, requestOptions);
    }

    public Bundle transferBundle(final Bundle body, final UUID bundleId, final String requestedDate, final String billingPolicy, final List<String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling transferBundle");
        Preconditions.checkNotNull(bundleId, "Missing the required parameter 'bundleId' when calling transferBundle");

        final String uri = "/1.0/kb/bundles/{bundleId}"
          .replaceAll("\\{" + "bundleId" + "\\}", bundleId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("requestedDate", String.valueOf(requestedDate));
        queryParams.put("billingPolicy", String.valueOf(billingPolicy));
        queryParams.put("pluginProperty", String.valueOf(pluginProperty));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPut(uri, body, Bundle.class, requestOptions);
    }

}