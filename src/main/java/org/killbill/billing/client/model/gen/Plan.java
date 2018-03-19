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
import org.killbill.billing.catalog.api.BillingPeriod;
import org.killbill.billing.client.model.gen.Phase;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Plan {

    private String name = null;

    private String prettyName = null;

    private BillingPeriod billingPeriod = null;

    private List<Phase> phases = null;


    public Plan() {
    }

    public Plan(final String name,
                     final String prettyName,
                     final BillingPeriod billingPeriod,
                     final List<Phase> phases) {
        this.name = name;
        this.prettyName = prettyName;
        this.billingPeriod = billingPeriod;
        this.phases = phases;

    }


    public Plan setName(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Plan setPrettyName(final String prettyName) {
        this.prettyName = prettyName;
        return this;
    }

    public String getPrettyName() {
        return prettyName;
    }

    public Plan setBillingPeriod(final BillingPeriod billingPeriod) {
        this.billingPeriod = billingPeriod;
        return this;
    }

    public BillingPeriod getBillingPeriod() {
        return billingPeriod;
    }

    public Plan setPhases(final List<Phase> phases) {
        this.phases = phases;
        return this;
    }

    public Plan addPhasesItem(final Phase phasesItem) {
        if (this.phases == null) {
            this.phases = new ArrayList<Phase>();
        }
        this.phases.add(phasesItem);
        return this;
    }

    public List<Phase> getPhases() {
        return phases;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Plan plan = (Plan) o;
        return Objects.equals(this.name, plan.name) &&
        Objects.equals(this.prettyName, plan.prettyName) &&
        Objects.equals(this.billingPeriod, plan.billingPeriod) &&
        Objects.equals(this.phases, plan.phases);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
                            prettyName,
                            billingPeriod,
                            phases);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Plan {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    prettyName: ").append(toIndentedString(prettyName)).append("\n");
        sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
        sb.append("    phases: ").append(toIndentedString(phases)).append("\n");
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

