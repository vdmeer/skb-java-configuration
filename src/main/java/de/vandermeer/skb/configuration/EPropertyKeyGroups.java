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

import de.vandermeer.skb.base.Skb_ToStringStyle;
import de.vandermeer.skb.categories.IsGroup;

/**
 * Enumerate for types of property keys.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.4-SNAPSHOT build 150618 (18-Jun-15) for Java 1.8
 */
public enum EPropertyKeyGroups implements IsGroup {
	/** Default property type. */
	DEFAULT						("a default type w/o special meaning"),

	/** Rows that are automatically added to a property table. */
	AUTOMATIC_PROPERTY_ROW		("a type that automatically generates a property row"),

	/** An type that results in exiting a programme or application. */
	EXIT_OPTION					("a type representing an exit option, if used programme should do the option and exit"),

	/** A type that results in printing some information to standard out or standard error */
	PRINT_OPTION				("a type representing an exit option, if used programme will print some information"),

	/** A type that is relevant for constants, for example for code generation.. */
	CONSTANT_RELEVANT			("a type that is relevant for constants"),

	/** A type that is used in a file table, as a column, experimental. */
	FILE_TABLE_COLUMN			("a type for file tables"),

	/** A type that is used a column on a symbol table, experimental. */
	SYMBOL_TABLE_COLUMN			("a type for symbol tables"),
	;

	/** Type descriptions */
	String description;

	/**
	 * Constructor.
	 * @param descr description for the group
	 */
	EPropertyKeyGroups(String descr){
		this.description = descr;
	}

	@Override
	public String _value() {
		return this.name();
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public String toString(){
		return Skb_ToStringStyle.parentKV(IsGroup.class, this.getClass(), this.group()).toString();
	}
}
