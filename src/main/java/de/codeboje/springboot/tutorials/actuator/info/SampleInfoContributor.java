package de.codeboje.springboot.tutorials.actuator.info;

import java.security.SecureRandom;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class SampleInfoContributor implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		builder.withDetail("sample", new SecureRandom().nextLong());
	}

}
