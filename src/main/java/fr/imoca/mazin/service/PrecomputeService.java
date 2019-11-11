package fr.imoca.mazin.service;

import org.springframework.beans.factory.annotation.Autowired;

import fr.imoca.mazin.precompute.IPrecomputeSystemConfig;
import fr.imoca.mazin.precompute.PrecomputeSystem;

public class PrecomputeService
{
	@Autowired
	IPrecomputeSystemConfig config;

	public PrecomputeSystem getPcs() {
		return new PrecomputeSystem(config);
	}
}

