package com.jokerchen.pattern.behavior.chain;

/**
 * @author joker
 * @date 2018-10-04 20:36
 */
public class ChainTest {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger debuggerLogger = new DebuggerLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        errorLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(debuggerLogger);

        return errorLogger;
    }

    public static void main(String[] args){
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
