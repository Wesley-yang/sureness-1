package com.usthe.sureness.processor.exception;

import com.usthe.sureness.util.BaseSurenessException;

/** 鉴权异常
 * @author tomsun28
 * @date 13:00 2019-03-11
 */
public class SurenessAuthorizationException extends BaseSurenessException {

    public SurenessAuthorizationException(String message) {
        super(message);
    }
}
