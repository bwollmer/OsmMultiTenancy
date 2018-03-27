package multiosm

import grails.gorm.MultiTenant
import grails.gorm.annotation.Entity

/*
* OpenSpeedMonitor (OSM)
* Copyright 2014 iteratec GmbH
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
/**
 * <p>
 * A web page test job definition.
 * </p>
 *
 * @see Script
 */
class Job implements MultiTenant<Job> {

    Long id;
    String user

    String label;
    Location location;
    Date lastRun;

    String description = "";
    int runs = 1;

    boolean active;
    boolean firstViewOnly = true
    boolean captureVideo = true
    boolean persistNonMedianResults = true;

    static constraints = {
        label(maxSize: 255, blank: false, unique: true)
        location(nullable: false)
        lastRun(nullable: true)

        description(widget: 'textarea', maxSize: 255)
        runs(range: 1..25)

        firstViewOnly(nullable: true)
        captureVideo(nullable: true)
        persistNonMedianResults(nullable: false)
    }

    static mapping = {
        persistNonMedianResults defaultValue: '1'
        tenantId name: "user"
    }
}
