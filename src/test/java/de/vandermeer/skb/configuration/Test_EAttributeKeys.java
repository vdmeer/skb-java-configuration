package de.vandermeer.skb.configuration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.vandermeer.skb.base.Skb_Transformer;
import de.vandermeer.skb.base.utils.Skb_ClassUtils;
import de.vandermeer.skb.categories.CategoryWithValue;
import de.vandermeer.skb.categories.kvt.IsAttributeKey;
import de.vandermeer.skb.categories.kvt.IsKey_String;

public class Test_EAttributeKeys {

	@Test public void test_Object2KeyValue(){
		Skb_Transformer<Object, String> tf=CategoryWithValue.CAT_TO_VALUESTRING();
		assertEquals("value.cli", tf.transform(EAttributeKeys.VALUE_CLI));
	}

	@Test public void test_key2Value(){
		assertNull(CategoryWithValue.GET_VALUESTRING(null));
		assertEquals("value.cli", CategoryWithValue.GET_VALUESTRING(EAttributeKeys.VALUE_CLI));
	}

	@Test public void testInstanceOf(){
		assertTrue(Skb_ClassUtils.INSTANCE_OF(IsAttributeKey.class).test(EAttributeKeys.DEFAULT));
		assertTrue(Skb_ClassUtils.INSTANCE_OF(IsKey_String.class).test(EAttributeKeys.DEFAULT));
	}
}
