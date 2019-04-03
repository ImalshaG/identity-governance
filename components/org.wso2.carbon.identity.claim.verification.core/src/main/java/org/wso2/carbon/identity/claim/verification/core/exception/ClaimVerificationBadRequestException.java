/*
 *  Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.wso2.carbon.identity.claim.verification.core.exception;

/**
 * Exception for claim verification failures.
 */
public class ClaimVerificationBadRequestException extends ClaimVerificationException {

    public ClaimVerificationBadRequestException() {

        super();
    }

    /**
     * Constructs a new exception with the specified message.
     *
     * @param message The detailed message.
     */
    public ClaimVerificationBadRequestException(String message) {

        super(message);
    }

    /**
     * Constructs a new exception with the specified message and cause.
     *
     * @param message The detailed message.
     * @param cause   The cause.
     */
    public ClaimVerificationBadRequestException(String message, Throwable cause) {

        super(message, cause);
    }

    /**
     * Constructs a new exception with the error code and the specified message.
     *
     * @param errorCode Error code.
     * @param message   The detailed message.
     */
    public ClaimVerificationBadRequestException(String errorCode, String message) {

        super(errorCode, message);
    }

    /**
     * Constructs a new exception with the error code, the specified message, and cause.
     *
     * @param errorCode Error code.
     * @param message   The detailed message.
     * @param cause     The cause.
     */
    public ClaimVerificationBadRequestException(String errorCode, String message, Throwable cause) {

        super(errorCode, message, cause);
    }
}
