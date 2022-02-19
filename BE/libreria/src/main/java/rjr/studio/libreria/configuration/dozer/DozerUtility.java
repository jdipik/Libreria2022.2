package rjr.studio.libreria.configuration.dozer;

import java.util.ArrayList;
import java.util.List;

import com.github.dozermapper.core.Mapper;

public class DozerUtility {
	
	public static <T, U> List<U> mapList(final Mapper mapper, final List<T> source, final Class<U> destType) {

	    final List<U> dest = new ArrayList<U>();

	    for (T element : source) {
	        dest.add(mapper.map(element, destType));
	    }

	    return dest;
	}

}
