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

import de.vandermeer.skb.base.Skb_Pair;
import de.vandermeer.skb.base.Skb_ToStringStyle;

/**
 * A map between string and a corresponding Java class as pair for a dictionary.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.2 build 140626 (26-Jun-14) with Java 1.8
 */
public enum ETypeMap implements Skb_Pair<String, Class<?>> {
	/** Generic pair for an unknown type mapped to an Object class */
	UNKNOWN 					("__unknown__", Object.class, "###"),

	/** Pair for a Java String */
	JAVA_STRING					("skb.type.string", String.class, "###"),

	/** Pair for a Java Long */
	JAVA_LONG					("skb.type.long", Long.class, "###"),

	/** Pair for a Java Character */
	JAVA_CHARACTER				("skb.type.character", Character.class, "###"),

	/** Pair for a Java Short */
	JAVA_SHORT					("skb.type.short", Short.class, "###"),

	/** Pair for a Java Integer */
	JAVA_INTEGER				("skb.type.integer", Integer.class, "###"),

	/** Pair for a Java Float */
	JAVA_FLOAT					("skb.type.float", Float.class, "###"),

	/** Pair for a Java Double */
	JAVA_DOUBLE					("skb.type.double", Double.class, "###"),

	/** Pair for a Java Byte */
	JAVA_BYTE					("skb.type.byte", Byte.class, "###"),

	/** Pair for a Java Boolean */
	JAVA_BOOLEAN				("skb.type.boolean", Boolean.class, "###"),
	;

	/** Local type string */
	private String type;

	/** Local class */
	private Class<?> clazz;

	/** Description for the pair */
	private String description;

	/**
	 * Enum constructor, associates type name with class.
	 * @param type string representation of the type
	 * @param clazz class associated with the type
	 * @param description for the enum
	 */
	private ETypeMap(String type, Class<?> clazz, String description){
		this.type = type;
		this.clazz = clazz;
		this.description = description;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public String lhs() {
		return this.type;
	}

	@Override
	public String left() {
		return this.type;
	}

	@Override
	public Class<?> rhs() {
		return this.clazz;
	}

	@Override
	public Class<?> right() {
		return this.clazz;
	}

	@Override
	public String toString(){
		return Skb_ToStringStyle.kv(this.getClass(), this.type, this.clazz, this.description).toString();
	}
}
