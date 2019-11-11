package fr.imoca.mazin.config;

import java.util.Collection;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import fr.imoca.mazin.precompute.IPrecomputeSystemConfig;
import fr.imoca.mazin.precompute.bolt.Bolt;
import lombok.Getter;

@Getter
@Configuration
@PropertySource("classpath:application.properties")
public class PrecomputeSystemConfig implements IPrecomputeSystemConfig
{
	private Collection<Bolt> bolts;

	@Override
	public Collection<Bolt> getBolts()
	{
		return this.bolts;
	}
	
	@Override
	public void addBolt(Bolt bolt)
	{
		this.bolts.add(bolt);
	}
	//handle collection of node.
}
