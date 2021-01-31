package mx.rememberme.mantras.sapi.services;

import java.util.List;

import mx.rememberme.mantras.sapi.responses.Mantra;

public interface MantraManipulation {

	List<Mantra> getMantra();
	Mantra getMantra(int id);

}
