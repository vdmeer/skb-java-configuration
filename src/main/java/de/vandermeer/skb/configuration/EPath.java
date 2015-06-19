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
import de.vandermeer.skb.categories.IsPath;

/**
 * Enumerate maintaining paths.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.4 build 150619 (19-Jun-15) for Java 1.8
 */
public enum EPath implements IsPath {

	/** The root of a tree */
	ROOT				("/", "the root of a tree"),

	/** Path to some general SKB configuration information */
	CONFIGURATION		("/skb/context", "path to some general SKB configuration information"),
	;

	/** Path String */
	private String path;

	/** Description */
	private String description;

	/**
	 * Default constructor.
	 * @param path the path
	 * @param descr description of the path
	 */
	EPath(String path, String descr){
		this.path = path;
		this.description = descr;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public String _value() {
		return this.path;
	}

	@Override
	public String toString(){
		return Skb_ToStringStyle.parentKV(IsPath.class, this.getClass(), this.path()).toString();
	}
}
