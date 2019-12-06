/*******************************************************************************
 * Copyright 2013-2019 Qaprosoft (http://www.qaprosoft.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.qaprosoft.zafira.util;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsyncUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncUtil.class);

    private static final int CONNECT_TIMEOUT = 60000;

    public static <I> I get(CompletableFuture<I> async, Supplier<CompletableFuture<I>> initFunctionality) {
        if(async == null) {
            async = initFunctionality.get();
        }
        return getAsync(async);
    }

    public static <I> I getAsync(CompletableFuture<I> async) {
        return getAsync(async, null);
    }

    public static <I> I getAsync(CompletableFuture<I> async, String errorMessage) {
        I result = null;
        if (async != null) {
            try {
                result = async.get(CONNECT_TIMEOUT, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                String message = errorMessage != null ? e.getMessage() + ". " + errorMessage : e.getMessage();
                LOGGER.error(message, e);
            }
        }
        return result;
    }

}
