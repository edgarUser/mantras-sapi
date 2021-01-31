package mx.rememberme.mantras.sapi;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import mx.rememberme.mantras.sapi.endpoints.GetMantra;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
    	register(GetMantra.class);
    }

}
