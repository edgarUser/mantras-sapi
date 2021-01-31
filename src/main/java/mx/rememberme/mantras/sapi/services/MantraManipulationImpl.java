package mx.rememberme.mantras.sapi.services;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mx.rememberme.mantras.sapi.responses.Mantra;

public class MantraManipulationImpl implements MantraManipulation {

	private List<Mantra> base;
	private static Logger logger = LogManager.getLogger(MantraManipulationImpl.class);

	public MantraManipulationImpl() {
		base = new ArrayList<Mantra>();
		Mantra m = new Mantra();
		m.setDesc("Come back to roots");
		m.setWords("");
		Mantra m1 = new Mantra();
		m1.setDesc("Gift of holly spirit");
		m1.setWords("Wisdom Understanding Counsel Fortitude Knowledge Piety Fear");
		base.add(m);
		base.add(m1);
	}

	@Override
	public List<Mantra> getMantra() {
		logger.debug("Number of mantras : {}", this.base.size());
		return this.base;
	}

	@Override
	public Mantra getMantra(int id) {
		return id < base.size() ? base.get(id) : base.get(0);
	}

}
