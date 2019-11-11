package fr.imoca.mazin.precompute;

import java.util.Collection;

import fr.imoca.mazin.precompute.bolt.Bolt;

public interface IPrecomputeSystemConfig {
	public Collection<Bolt> getBolts();
	
	public void addBolt(Bolt bolt);
}
