/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Manage AWS ECS cluster instances.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ECSEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Elastic Container Service (ECS)
     * component.
     */
    public interface ECSEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedECSEndpointBuilder advanced() {
            return (AdvancedECSEndpointBuilder) this;
        }
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param autoDiscoverClient the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder autoDiscoverClient(boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: common
         * 
         * @param autoDiscoverClient the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder autoDiscoverClient(String autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * To use a existing configured AWS ECS as client.
         * 
         * The option is a:
         * &lt;code&gt;com.amazonaws.services.ecs.AmazonECS&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param ecsClient the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder ecsClient(Object ecsClient) {
            doSetProperty("ecsClient", ecsClient);
            return this;
        }
        /**
         * To use a existing configured AWS ECS as client.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.amazonaws.services.ecs.AmazonECS&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param ecsClient the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder ecsClient(String ecsClient) {
            doSetProperty("ecsClient", ecsClient);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws.ecs.ECSOperations&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder operation(ECSOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.aws.ecs.ECSOperations&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the ECS client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the ECS client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the ECS client.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the ECS client.
         * 
         * The option is a: &lt;code&gt;com.amazonaws.Protocol&lt;/code&gt;
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder proxyProtocol(Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the ECS client.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.amazonaws.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: producer
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which ECS client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default ECSEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS Elastic Container Service (ECS)
     * component.
     */
    public interface AdvancedECSEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ECSEndpointBuilder basic() {
            return (ECSEndpointBuilder) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedECSEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedECSEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws.ecs.ECSOperations</code> enum.
     */
    enum ECSOperations {
        listClusters,
        describeCluster,
        createCluster,
        deleteCluster;
    }

    /**
     * Proxy enum for <code>com.amazonaws.Protocol</code> enum.
     */
    enum Protocol {
        HTTP,
        HTTPS;
    }

    public interface ECSBuilders {
        /**
         * AWS Elastic Container Service (ECS) (camel-aws-ecs)
         * Manage AWS ECS cluster instances.
         * 
         * Category: cloud,management
         * Since: 3.0
         * Maven coordinates: org.apache.camel:camel-aws-ecs
         * 
         * Syntax: <code>aws-ecs:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param path label
         * @return the dsl builder
         */
        default ECSEndpointBuilder awsEcs(String path) {
            return ECSEndpointBuilderFactory.endpointBuilder("aws-ecs", path);
        }
        /**
         * AWS Elastic Container Service (ECS) (camel-aws-ecs)
         * Manage AWS ECS cluster instances.
         * 
         * Category: cloud,management
         * Since: 3.0
         * Maven coordinates: org.apache.camel:camel-aws-ecs
         * 
         * Syntax: <code>aws-ecs:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path label
         * @return the dsl builder
         */
        default ECSEndpointBuilder awsEcs(String componentName, String path) {
            return ECSEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static ECSEndpointBuilder endpointBuilder(String componentName, String path) {
        class ECSEndpointBuilderImpl extends AbstractEndpointBuilder implements ECSEndpointBuilder, AdvancedECSEndpointBuilder {
            public ECSEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new ECSEndpointBuilderImpl(path);
    }
}