/*******************************************************************************
 * Copyright 2013-2019 Qaprosoft (http://www.qaprosoft.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.qaprosoft.zafira.models.stf;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "apps",
        "selected"
})
public class Browser {

    /**
     * 
     */
    @JsonProperty("apps")
    private List<App> apps = new ArrayList<App>();
    /**
     * 
     */
    @JsonProperty("selected")
    private Boolean selected;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *         The apps
     */
    @JsonProperty("apps")
    public List<App> getApps() {
        return apps;
    }

    /**
     * 
     * @param apps
     *            The apps
     */
    @JsonProperty("apps")
    public void setApps(List<App> apps) {
        this.apps = apps;
    }

    /**
     * 
     * @return
     *         The selected
     */
    @JsonProperty("selected")
    public Boolean getSelected() {
        return selected;
    }

    /**
     * 
     * @param selected
     *            The selected
     */
    @JsonProperty("selected")
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
