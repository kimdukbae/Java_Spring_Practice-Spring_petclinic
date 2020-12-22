package org.springframework.samples.petclinic.sample;

import org.springframework.stereotype.Controller;

@Controller
public class SampleController {

	SampleConfig sampleConfig;

	public SampleController(SampleConfig sampleConfig) {
		this.sampleConfig = sampleConfig;
	}

}
