/*
 * Copyright 2016 Red Hat, Inc.
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
package org.jboss.migration.wfly8;

import org.jboss.migration.core.ProductInfo;
import org.jboss.migration.core.env.MigrationEnvironment;
import org.jboss.migration.core.jboss.JBossExtensions;
import org.jboss.migration.core.jboss.JBossServer;

import java.nio.file.Path;

/**
 * The WildFly 8 {@link org.jboss.migration.core.Server}.
 * @author emmartins
 */
public class WildFlyServer8 extends JBossServer<WildFlyServer8> {

    public static final JBossServer.Extensions EXTENSIONS = JBossServer.Extensions.builder()
            .extension(JBossExtensions.BATCH)
            .extension(JBossExtensions.CONNECTOR)
            .extension(JBossExtensions.DEPLOYMENT_SCANNER)
            .extension(JBossExtensions.EE)
            .extension(JBossExtensions.EJB3)
            .extension(JBossExtensions.INFINISPAN)
            .extension(JBossExtensions.IO)
            .extension(JBossExtensions.JACORB)
            .extension(JBossExtensions.JAXRS)
            .extension(JBossExtensions.JDR)
            .extension(JBossExtensions.JGROUPS)
            .extension(JBossExtensions.JMX)
            .extension(JBossExtensions.JPA)
            .extension(JBossExtensions.JSF)
            .extension(JBossExtensions.JSR77)
            .extension(JBossExtensions.LOGGING)
            .extension(JBossExtensions.MAIL)
            .extension(JBossExtensions.MESSAGING)
            .extension(JBossExtensions.MODCLUSTER)
            .extension(JBossExtensions.NAMING)
            .extension(JBossExtensions.POJO)
            .extension(JBossExtensions.REMOTING)
            .extension(JBossExtensions.SAR)
            .extension(JBossExtensions.SECURITY)
            .extension(JBossExtensions.TRANSACTIONS)
            .extension(JBossExtensions.UNDERTOW)
            .extension(JBossExtensions.WEB)
            .extension(JBossExtensions.WEBSERVICES)
            .extension(JBossExtensions.WELD)
            .build();

    public WildFlyServer8(String migrationName, ProductInfo productInfo, Path baseDir, MigrationEnvironment migrationEnvironment) {
        super(migrationName, productInfo, baseDir, migrationEnvironment, EXTENSIONS);
    }

    protected WildFlyServer8(String migrationName, ProductInfo productInfo, Path baseDir, MigrationEnvironment migrationEnvironment, Extensions extensions) {
        super(migrationName, productInfo, baseDir, migrationEnvironment, extensions);
    }
}
