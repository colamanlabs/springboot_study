/*
 * Copyright 2019 the original author or authors.
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
package com.colamanlabs.springbootstudy.s0015;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.AfterStep;
import org.springframework.batch.core.annotation.BeforeStep;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Minella
 */
@Slf4j
public class LoggingStepStartStopListener {

	@BeforeStep
	public void beforeStep(StepExecution stepExecution) {
		log.info("[LoggingStepStartStopListener/beforeStep]" + stepExecution.getStepName() + " has begun!");
	}

	@AfterStep
	public ExitStatus afterStep(StepExecution stepExecution) {
	    log.info("[LoggingStepStartStopListener/afterStep]" + stepExecution.getStepName() + " has ended!");

		return stepExecution.getExitStatus();
	}
}
