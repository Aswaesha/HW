package com.lesson;

    public class Person {
        protected String firstname;
        protected String lastname;

        public Person (String firstname,String lastname){
            this.firstname = firstname;
            this.lastname = lastname;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    '}';
        }
    }
