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

import org.junit.Test;

import de.vandermeer.skb.configuration.ETypeMap;

/**
 * Tests for the SKB ETypeMap Enumerate.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.2 build 140626 (26-Jun-14) with Java 1.8
 */
public class ETypeMap_Tests {

	@Test public final void testNumbers(){
		assertEquals(10, ETypeMap.values().length);
	}

	@Test public final void testGetClass(){
		assertEquals(String.class,		ETypeMap.JAVA_STRING.rhs());
		assertEquals(Character.class,	ETypeMap.JAVA_CHARACTER.rhs());
		assertEquals(Long.class,		ETypeMap.JAVA_LONG.rhs());
		assertEquals(Short.class,		ETypeMap.JAVA_SHORT.rhs());
		assertEquals(Integer.class,		ETypeMap.JAVA_INTEGER.rhs());
		assertEquals(Float.class,		ETypeMap.JAVA_FLOAT.rhs());
		assertEquals(Double.class,		ETypeMap.JAVA_DOUBLE.rhs());
		assertEquals(Byte.class,		ETypeMap.JAVA_BYTE.rhs());
		assertEquals(Boolean.class,		ETypeMap.JAVA_BOOLEAN.rhs());

		assertEquals(Object.class,		ETypeMap.UNKNOWN.rhs());
	}

	@Test public void testGetString(){
		assertEquals("skb.type.string",		ETypeMap.JAVA_STRING.lhs());
		assertEquals("skb.type.character",	ETypeMap.JAVA_CHARACTER.lhs());
		assertEquals("skb.type.long",		ETypeMap.JAVA_LONG.lhs());
		assertEquals("skb.type.short",		ETypeMap.JAVA_SHORT.lhs());
		assertEquals("skb.type.integer",	ETypeMap.JAVA_INTEGER.lhs());
		assertEquals("skb.type.float",		ETypeMap.JAVA_FLOAT.lhs());
		assertEquals("skb.type.double",		ETypeMap.JAVA_DOUBLE.lhs());
		assertEquals("skb.type.byte",		ETypeMap.JAVA_BYTE.lhs());
		assertEquals("skb.type.boolean",	ETypeMap.JAVA_BOOLEAN.lhs());

		assertEquals("__unknown__",			ETypeMap.UNKNOWN.lhs());
	}
}
