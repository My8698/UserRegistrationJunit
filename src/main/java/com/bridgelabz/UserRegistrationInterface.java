package com.bridgelabz;

    @FunctionalInterface
    public interface UserRegistrationInterface {
        public abstract boolean validate(String value) throws InvalidUserInputException;

    }

