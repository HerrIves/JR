package com.javarush.task.task23.task2308;

/* 
Рефакторинг, вложенные классы
*/

public class Solution {
    Constants constants = new Constants();
    public class ServerNotAccessibleException extends Exception {
        public ServerNotAccessibleException() {
            super(constants.SERVER_IS_CURRENTLY_NOT_ACCESSIBLE);
        }

        public ServerNotAccessibleException(Throwable cause) {
            super(constants.SERVER_IS_CURRENTLY_NOT_ACCESSIBLE, cause);
        }
    }

    public class UnauthorizedUserException extends Exception {
        public UnauthorizedUserException() {
            super(constants.USER_IS_NOT_AUTHORIZED);
        }

        public UnauthorizedUserException(Throwable cause) {
            super(constants.USER_IS_NOT_AUTHORIZED, cause);
        }
    }

    public class BannedUserException extends Exception {
        public BannedUserException() {
            super(constants.ACCESS_IS_DENIED);
        }

        public BannedUserException(Throwable cause) {
            super(constants.USER_IS_BANNED, cause);
        }
    }

    public class RestrictionException extends Exception {
        public RestrictionException() {
            super(constants.ACCESS_IS_DENIED);
        }

        public RestrictionException(Throwable cause) {
            super(Constants.ACCESS_IS_DENIED, cause);
        }
    }

    public static void main(String[] args) {

    }
    public static final class Constants{
        final static public String SERVER_IS_CURRENTLY_NOT_ACCESSIBLE = "The server is not currently accessible.";
        final static public String USER_IS_NOT_AUTHORIZED = "The user is not authorized.";
        final static public String USER_IS_BANNED = "The user is banned.";
        final static public String ACCESS_IS_DENIED = "Access is denied.";
    }
}
