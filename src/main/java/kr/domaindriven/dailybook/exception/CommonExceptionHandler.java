package kr.domaindriven.dailybook.exception;

import javassist.tools.web.BadHttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;

/**
 * Created by Donghoon Lee on 2016-03-04.
 */

@ControllerAdvice("kr.domaindriven.dailybook")
public class CommonExceptionHandler extends Exception {

    private final String APP_DIR = "dailybook/error/";

    /**
     * 500 error 처리.
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    public String handleRuntimeException() {
        return APP_DIR + "server-error";
    }

    /**
     * 400 error 처리.
     * @return
     */
    @ExceptionHandler(BadHttpRequest.class)
    public String handleBadRequest() {
        return APP_DIR + "badrequest-error";
    }
}
