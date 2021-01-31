package mx.rememberme.mantras.sapi.endpoints;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import mx.rememberme.mantras.sapi.responses.Mantra;
import mx.rememberme.mantras.sapi.services.MantraManipulation;

@Path("/")
public class GetMantra {

	@Autowired
	MantraManipulation mantraManipulation;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("mantra")
	public List<Mantra> geMantra() {
		return mantraManipulation.getMantra();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("mantra/{id}")
	public Mantra geMantra(@PathParam("id") final int id) {
		return mantraManipulation.getMantra(id);
	}

}
