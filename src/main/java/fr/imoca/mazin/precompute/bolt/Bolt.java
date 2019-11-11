package fr.imoca.mazin.precompute.bolt;

import java.util.Collection;

import fr.imoca.mazin.precompute.state.IState;
import lombok.Getter;

@Getter
public class Bolt {
	private String alias;
	private Collection<String> dependencies;
	private IState state;
	
	public Bolt(String alias, Collection<String> dependencies, IState state)
	{
		this.alias = alias;
		this.dependencies = dependencies;
		this.state = state;
	}
	
	public IState execute()
	{
		return this.state.execute();
	}
	
}
