package org.csiro.igsn.utilities;

import java.util.Set;

import org.csiro.igsn.entity.postgres.Prefix;
import org.csiro.igsn.jaxb.bindings.registration.Resources.Resource;

public class IGSNUtil {
	
	public static boolean resourceStartsWithAllowedPrefix(Set<Prefix> allowedPrefix,Resource r){
		boolean result = false;
		for(Prefix prefix:allowedPrefix){
			if(r.getResourceIdentifier().getValue().startsWith(prefix.getPrefix())){
				return true;
			};
		}
		return result;
	}
	
	public static boolean prefixStartsWithAllowedPrefix(Set<Prefix> allowedPrefix,String p){
		boolean result = false;
		for(Prefix prefix:allowedPrefix){
			if(p.startsWith(prefix.getPrefix())){
				return true;
			};
		}
		return result;
	}

}