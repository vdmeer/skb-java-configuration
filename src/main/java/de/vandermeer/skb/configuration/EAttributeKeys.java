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
import de.vandermeer.skb.categories.kvt.IsAttributeKey;

/**
 * Enumerate for property attributes.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.3 build 150618 (18-Jun-15) for Java 1.8
 */
public enum EAttributeKeys implements IsAttributeKey {
	/** The default key */
	DEFAULT								("default", "the default attribute key"),

	/*
	 * Attributes for value specifications and processing
	 */
	/** Key for a field that specifies the (expected) type of a value */
	VALUE_TYPE							("value.type", "field that specifies the (expected) type of a value"),

	/** Key for a field that holds a default value */
	VALUE_DEFAULT						("value.default", "field that holds a default value"),

	/** Key for a field that holds a value read from a file, for instance a property file */
	VALUE_FILE							("value.file", "field that holds a value read from a file, for instance a property file"),

	/** Key for a field that holds a value read from command line arguments */
	VALUE_CLI							("value.cli", "field that holds a value read from command line arguments"),

	/** Key for a field that holds a value set by user of a table */
	VALUE_SET							("value.set", "field that holds a value set by user of a table"),


	/*
	 * Attributes for command line specifications and processing
	 */
	/** Key for a field that specifies a short command line option, should be only 1 character */
	CLI_PARAMETER_SHORT					("skb.cli.parameter.short", "field that specifies a short command line option, should be only 1 character"),

	/** Key for a field that specifies a long command line option, should start with "--" */
	CLI_PARAMETER_LONG					("skb.cli.parameter.long", "field that specifies a long command line option, should start with '--'"),

	/** Key for a field that specifies the type of a command line option, for instance String, Integer */
	CLI_PARAMETER_TYPE					("skb.cli.parameter.type", "field that specifies the type of a command line option, for instance String, Integer"),

	/** Key for a field that specifies that a command line option can have arguments, should be an integer stating the number of expected arguments */
	CLI_PARAMETER_ARGUMENTS				("skb.cli.parameter.arguments", "field that specifies that a command line option can have arguments, should be an integer stating the number of expected arguments"),

	/** Key for a field that specifies the separator for arguments of a command line option */
	CLI_PARAMETER_ARGUMENTS_SEPARATOR	("skb.cli.parameter.arguments.separator", "field that specifies the separator for arguments of a command line option"),

	/** Key for a field that specifies the description for a command line option, can be used in usage output */
	CLI_PARAMETER_DESCRIPTION_SHORT		("skb.cli.descr.short", "field that specifies the description for a command line option, can be used in usage output"),

	/** Key for a field that specifies the description for a command line option, can be used in usage output */
	CLI_PARAMETER_DESCRIPTION_LONG		("skb.cli.descr.long", "field that specifies the description for a command line option, can be used in usage output"),

	/** Key for a field that specifies the description for arguments (if any allowed) */
	CLI_PARAMETER_DESCRIPTION_ARGUMENTS	("skb.cli.descr.arguments", "field that specifies the description for arguments (if any allowed)"),

	;

	/** The key */
	private String key;

	/** The description */
	private String description;

	EAttributeKeys(String key, String descr){
		this.key = key;
		this.description = descr;
	}

	@Override
	public String toString() {
		return Skb_ToStringStyle.parentKV(IsAttributeKey.class, this.getClass(), this.key()).toString();
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public String _value() {
		return this.key;
	}
}
