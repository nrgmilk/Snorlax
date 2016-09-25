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

package com.icecream.snorlax.module.feature.mitm;

import com.google.auto.value.AutoValue;

import static POGOProtos.Networking.Envelopes.RequestEnvelopeOuterClass.RequestEnvelope;
import static POGOProtos.Networking.Envelopes.ResponseEnvelopeOuterClass.ResponseEnvelope;

@AutoValue
@SuppressWarnings({"unused", "FieldCanBeLocal", "WeakerAccess"})
public abstract class MitmEnvelope {

	static MitmEnvelope create(RequestEnvelope request, ResponseEnvelope response) {
		return new AutoValue_MitmEnvelope(request, response);
	}

	public abstract RequestEnvelope getRequest();

	public abstract ResponseEnvelope getResponse();
}
