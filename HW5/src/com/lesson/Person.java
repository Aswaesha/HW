package com.lesson;

    public class Person {
        protected String firstname;
        protected String lastname;

        public Person (String firstname,String lastname){
            this.firstname = firstname;
            this.lastname = lastname;
        }
        public void print(){
                System.out.println(firstname + " " + lastname);
            }

        public void salary() {

        }


    }
