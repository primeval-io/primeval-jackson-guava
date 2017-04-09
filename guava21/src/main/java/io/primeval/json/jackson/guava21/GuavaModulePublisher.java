package io.primeval.json.jackson.guava21;

import org.osgi.service.component.annotations.Component;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.guava.GuavaModule;

@Component(service = Module.class)
public final class GuavaModulePublisher extends GuavaModule {
    // Nothing, just publish GuavaModule
}
