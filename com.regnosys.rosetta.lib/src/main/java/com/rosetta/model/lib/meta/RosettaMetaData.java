package com.rosetta.model.lib.meta;

import java.util.List;
import java.util.function.Function;

import com.rosetta.model.lib.RosettaModelObject;
import com.rosetta.model.lib.qualify.QualifyFunctionFactory;
import com.rosetta.model.lib.qualify.QualifyResult;
import com.rosetta.model.lib.validation.Validator;
import com.rosetta.model.lib.validation.ValidatorWithArg;

public interface RosettaMetaData<T extends RosettaModelObject> {

	List<Validator<? super T>> dataRules();
    
	List<Validator<? super T>> choiceRuleValidators();
	
	/**
	 *  Use {@link RosettaMetaData#getQualifyFunctions(QualifyFunctionFactory)} instead
	 * @return an empty List
	 */
	@Deprecated
	List<Function<? super T, QualifyResult>> getQualifyFunctions();
	
	default List<Function<? super T, QualifyResult>> getQualifyFunctions(QualifyFunctionFactory factory) {
		return getQualifyFunctions();
	}
	
	Validator<? super T> validator();
	
	ValidatorWithArg<? super T,String> onlyExistsValidator();
}
