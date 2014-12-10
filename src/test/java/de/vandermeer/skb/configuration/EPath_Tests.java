package de.vandermeer.skb.configuration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.vandermeer.skb.base.Skb_Transformer;
import de.vandermeer.skb.categories.CategoryWithValue;

public class EPath_Tests {

	@Test public void test_Object2PathValue(){
		Skb_Transformer<Object, String> tf=CategoryWithValue.CAT_TO_VALUESTRING();
		assertEquals("/skb/context", tf.transform(EPath.CONFIGURATION));
		assertEquals("/", tf.transform(EPath.ROOT));
	}

	@Test public void test_path2Value(){
		assertEquals("/skb/context", CategoryWithValue.GET_VALUESTRING(EPath.CONFIGURATION));
		assertEquals("/", CategoryWithValue.GET_VALUESTRING(EPath.ROOT));
	}
}
