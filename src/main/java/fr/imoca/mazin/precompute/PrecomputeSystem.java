package fr.imoca.mazin.precompute;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import fr.imoca.mazin.precompute.bolt.Bolt;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class PrecomputeSystem implements IPrecompute
{
	private IPrecomputeSystemConfig config;
	private HashMap<String, Bolt> bolts = new HashMap<String, Bolt>();
	
	public PrecomputeSystem(IPrecomputeSystemConfig config)
	{
		this.config = config;
	}

    @Override
	public void run() {
    	for (Bolt bolt : this.config.getBolts()) {
    		this.bolts.put(bolt.getAlias(), bolt);
        }
        
    }
}