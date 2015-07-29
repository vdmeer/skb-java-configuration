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

import java.util.Arrays;
import java.util.List;

import de.vandermeer.skb.base.Skb_ToStringStyle;
import de.vandermeer.skb.base.categories.IsGroup;
import de.vandermeer.skb.base.categories.kvt.IsPropertyKey;

/**
 * Enumerate for property keys.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.4 build 150701 (01-Jul-15) for Java 1.8
 */
public enum EPropertyKeys implements IsPropertyKey {

	/*
	 * Field keys for application specific items
	 */
	/** Key for a field holding the application name */
	APPLICATION_NAME					("skb.app.name", "the name of an application",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW}),

	/** Key for a field holding copyright information for the application */
	APPLICATION_COPYRIGHT				("skb.app.copyright", "copyright information for an application",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW}),

	/** Key for a field holding information about software used to build the application */
	APPLICATION_BUILD_WITH				("skb.app.buildwith", "information about tools/libraries used to build an application",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW}),

	/** Key for a field holding additional information about application, used for usage/help screens */
	APPLICATION_ADDITIONAL				("skb.app.additional", "any additional information about an application",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW}),

	/** Key for a field holding the version of an application */
	APPLICATION_VERSION					("skb.app.version", "the version of an application",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW}),

	/** Key for a field holding the build of an application */
	APPLICATION_BUILD					("skb.app.build", "information about the build of an application",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW}),

	/** Key for a field holding the build date of an application */
	APPLICATION_BUILD_DATE				("skb.app.builddate", "date the application was build",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW}),

	/** Key for a field with the name of the application directory, for instance user-dir */
	APPLICATION_DIRECTORY				("skb.app.directory", "directory where the application resides",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW}),


	/*
	 * Field Keys for general command line options
	 */
	/** Key for a field that holds information on whether to show version information or not */
	CLI_OPTION_SHOWVERSION				("skb.clioption.show-version", "cli option to show version information",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW, EPropertyKeyGroups.PRINT_OPTION, EPropertyKeyGroups.EXIT_OPTION}),

	/** Key for a field that holds information on whether to show help information or not */
	CLI_OPTION_SHOWHELP					("skb.clioption.show-help", "cli option to show help information",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW, EPropertyKeyGroups.PRINT_OPTION, EPropertyKeyGroups.EXIT_OPTION}),

	/** Key for a field that indicates to load configuration from a file */
	CLI_OPTION_CFGLOAD					("skb.clioption.cfg-load", "cli option to load configuration information",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW}),

	/** Key for a field that indicates to save configuration to a file */
	CLI_OPTION_CONFIGSAFE				("skb.clioption.cfg-save", "cli option tp safe a configuration",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW}),

	/** Key for a field that indicates whether default options are to be shown */
	CLI_OPTION_DEFAULT_OPTIONS			("skb.clioption.default-options", "cli option to show default options",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW, EPropertyKeyGroups.EXIT_OPTION}),

	/** Key to a field that holds the file name for the report manager StringTemplate */
	CLI_OPTION_REPORTMGR_STG			("skb.clioption.repmgr-stg", "cli option naming a template for a report manager",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW}),

	/** Key to a field that indicates whether the Tribe StringTempltate should be printed */
	CLI_OPTION_PRT_STGFILE_REPORTMGR	("skb.clioption.pr-stg-reportmgr", "cli option to print the report manager's template file",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW, EPropertyKeyGroups.PRINT_OPTION, EPropertyKeyGroups.EXIT_OPTION}),

	/** Key to a field that indicates if quiet mode is on */
	CLI_OPTION_QUIET					("skb.clioption.quiet", "cli option to put an application in quiet mode",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.AUTOMATIC_PROPERTY_ROW, EPropertyKeyGroups.PRINT_OPTION}),

//	/** Key to a field that indicates if verbose mode is on */
//	CLI_OPTION_VERBOSE					("skb.clioption.verbose", new SkbEPropertyTypes[]{SkbEPropertyTypes.AUTOMATIC_PROPERTY_ROW, SkbEPropertyTypes.PRINT_OPTION}),


	/*
	 * Field keys for constant processing
	 */
	CONSTANT_IDENT						("skb.constant.ident", "an identifier for a constant",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.CONSTANT_RELEVANT}),

	CONSTANT_JAVADOC					("skb.constant.javadoc", "javadoc information for a constant",
										new EPropertyKeyGroups[]{EPropertyKeyGroups.CONSTANT_RELEVANT}),

	;

	/** String representation of the key */
	private String key;

	/** String for the description */
	private String description;

	/** Type of the key */
	private List<IsGroup> keyGroups;

	/** Default constructor */

	/**
	 * Constructor.
	 * @param key the key
	 * @param description description of the key
	 * @param keyGroups group associated
	 */
	private EPropertyKeys(String key, String description, IsGroup[] keyGroups){
		this.key = key;
		this.description = description;
		this.keyGroups = Arrays.asList(keyGroups);
	}

	@Override
	public String toString(){
		return Skb_ToStringStyle.parentKV(IsPropertyKey.class, this.getClass(), this.key()).toString();
	}

	@Override
	public String _value() {
		return this.key;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public List<IsGroup> getGroups() {
		return this.keyGroups;
	}
}
