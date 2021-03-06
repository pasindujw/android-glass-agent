/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 *
 */
package com.wso2.glass.picavi.picaviglass.constants;

/**
 * This hold constants related to android_sense.
 */
public class Constants {
    public final static String DEVICE_TYPE = "picavi";
    public final static String DEVICE_API_CONTEXT = "/picavi";
    public final static String DCR_CONTEXT = "/dynamic-client-web";
    public final static String TOKEN_ISSUER_CONTEXT = "/oauth2";
    public final static String API_APPLICATION_REGISTRATION_CONTEXT = "/api-application-registration";
    public final static String EXECUTION_PLAN_EXTRA = "execution_plan";

    public final static String MESSAGE = "MESSAGE";

    public final class Request {
        public final static String REQUEST_SUCCESSFUL = "200";
        public final static int MAX_ATTEMPTS = 2;
    }
}
