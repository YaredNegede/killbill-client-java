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


import org.killbill.billing.client.model.gen.Overdue;

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
public class OverdueApi {

    private final KillBillHttpClient httpClient;

    public OverdueApi() {
        this(new KillBillHttpClient());
    }

    public OverdueApi(final KillBillHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Overdue getOverdueConfigJson( final RequestOptions inputOptions) throws KillBillClientException {


        final String uri = "/1.0/kb/overdue";


        final RequestOptions requestOptions = inputOptions.extend().build();

        return httpClient.doGet(uri, Overdue.class, requestOptions);
    }

    public Overdue uploadOverdueConfigJson(final Overdue body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling uploadOverdueConfigJson");

        final String uri = "/1.0/kb/overdue";


        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .build();


        return httpClient.doPost(uri, body, Overdue.class, requestOptions);
    }

}