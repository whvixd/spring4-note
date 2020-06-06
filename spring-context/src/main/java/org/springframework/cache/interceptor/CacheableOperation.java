/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cache.interceptor;

/**
 * Class describing a cache 'cacheable' operation.
 *
 * @author Costin Leau
 * @author Phillip Webb
 * @since 3.1
 */
public class CacheableOperation extends CacheOperation {

	private String unless;


	public String getUnless() {
		return unless;
	}

	public void setUnless(String unless) {
		this.unless = unless;
	}

	@Override
	protected StringBuilder getOperationDescription() {
		StringBuilder sb = super.getOperationDescription();
		sb.append(" | unless='");
		sb.append(this.unless);
		sb.append("'");
		return sb;
	}
}
