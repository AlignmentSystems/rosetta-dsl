package com.rosetta.model.lib.recursebuilder;

import com.rosetta.model.lib.RosettaModelObjectBuilder;
import com.rosetta.model.lib.path.RosettaPath;

import java.util.function.Consumer;
import java.util.function.Supplier;

public interface RecursiveBuilder {

	<T extends RosettaModelObjectBuilder> void buildMeA(RosettaPath path, Class<?> clazz, String fieldName, 
			Supplier<T> constructor, Consumer<T> setter);
	<T extends RosettaModelObjectBuilder> void buildMeAListOf(RosettaPath path, Class<?> clazz, String fieldName, 
			Supplier<T> constructor, Consumer<T> setter);
}
