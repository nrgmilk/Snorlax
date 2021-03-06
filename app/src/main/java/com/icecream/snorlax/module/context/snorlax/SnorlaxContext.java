/*
 * Copyright (c) 2016. Pedro Diaz <igoticecream@gmail.com>
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

package com.icecream.snorlax.module.context.snorlax;

import android.content.Context;
import android.content.ContextWrapper;

import com.icecream.snorlax.R;

@SuppressWarnings({"unused", "FieldCanBeLocal", "WeakerAccess"})
final class SnorlaxContext extends ContextWrapper {

	SnorlaxContext(Context base) {
		super(base);
		setTheme(R.style.Snorlax);
	}

	@Override
	public Context getApplicationContext() {
		return this;
	}
}
