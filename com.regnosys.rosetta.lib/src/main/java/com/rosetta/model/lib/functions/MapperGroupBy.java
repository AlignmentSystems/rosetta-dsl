package com.rosetta.model.lib.functions;

import java.util.Map;

public interface MapperGroupBy<T,G> extends Mapper<T> {

	Map<MapperS<G>, Mapper<T>> getGroups();
}
