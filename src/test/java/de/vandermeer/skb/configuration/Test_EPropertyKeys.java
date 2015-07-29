/* Copyright 2014 Sven van der Meer <vdmeer.sven@mykolab.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.vandermeer.skb.configuration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Collection;

import org.junit.Test;

import de.vandermeer.skb.base.Skb_Transformer;
import de.vandermeer.skb.base.categories.CategoryWithValue;
import de.vandermeer.skb.base.categories.OfGroup;

/**
 * Tests for property keys.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.4 build 150701 (01-Jul-15) for Java 1.8
 */
public class Test_EPropertyKeys {

	@Test public void testNumberOfTypes(){
		Collection<OfGroup> ar;
		EPropertyKeys[] values=EPropertyKeys.values();

		ar=OfGroup.GET_KEYS_FOR_GROUP(EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW, values);
		assertNotNull(ar);
		assertEquals(16, ar.size());

		ar=OfGroup.GET_KEYS_FOR_GROUP(EPropertyKeyGroups.EXIT_OPTION, values);
		assertNotNull(ar);
		assertEquals(4, ar.size());

		ar=OfGroup.GET_KEYS_FOR_GROUP(EPropertyKeyGroups.CONSTANT_RELEVANT, values);
		assertNotNull(ar);
		assertEquals(2, ar.size());
	}

	@Test public void test_Object2KeyValue(){
		Skb_Transformer<Object, String> tf=CategoryWithValue.CAT_TO_VALUESTRING();
		assertEquals("skb.app.name", tf.transform(EPropertyKeys.APPLICATION_NAME));
	}

	@Test public void test_key2Value(){
		assertNull(CategoryWithValue.GET_VALUESTRING(null));
		assertEquals("skb.app.name", CategoryWithValue.GET_VALUESTRING(EPropertyKeys.APPLICATION_NAME));
	}
}
