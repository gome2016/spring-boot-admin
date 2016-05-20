/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.codecentric.boot.admin;

import de.codecentric.boot.admin.config.AdminClientProperties;
import de.codecentric.boot.admin.config.AdminProperties;
import de.codecentric.boot.admin.services.ApplicationRegistrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.boot.context.ContextIdApplicationContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.util.List;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@ComponentScan(basePackages = "de.codecentric.boot")
public class SpringBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminApplication.class, args);
	}


	@Autowired
	private de.codecentric.boot.admin.config.AdminClientProperties adminClientProperties;
	@PostConstruct
	public void init(){
		adminClientProperties.setName("cccccccccccccc");

	}
}
