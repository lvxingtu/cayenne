/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/
package org.apache.cayenne.project.upgrade.v8;

import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Injector;
import org.apache.cayenne.project.upgrade.ProjectUpgrader;
import org.apache.cayenne.project.upgrade.UpgradeHandler;
import org.apache.cayenne.resource.Resource;

/**
 * A ProjectUpgrader that handles project upgrades from version 4.0.M3 and 7
 * to version 8.
 */
public class ProjectUpgrader_V8 implements ProjectUpgrader {

    @Inject
    protected Injector injector;

    @Override
    public UpgradeHandler getUpgradeHandler(Resource projectSource) {
        UpgradeHandler_V8 handler = new UpgradeHandler_V8(projectSource);
        injector.injectMembers(handler);
        return handler;
    }
}