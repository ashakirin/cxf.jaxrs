/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package demo.jaxrs.server;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.jaxrs.server.CustomerService;
import demo.jaxrs.server.PolicyTO;
import demo.jaxrs.server.PolicyType;




public final class BasicSpringServer {

    private BasicSpringServer() {
    }

    public static void main(String args[]) throws Exception {
        // Initialize the spring context and fetch our test client
        ClassPathXmlApplicationContext context 
            = new ClassPathXmlApplicationContext(new String[] {"classpath:server-applicationContext.xml"});
        Thread.sleep(100000000);
    }
}
