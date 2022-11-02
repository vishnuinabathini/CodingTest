package com.SpringBoot.CodingTest.Exception;

public class HnDException extends Exception {
        String mesg;
        public HnDException(String mesg){
            this.mesg = mesg;
        }
        public String getMessage(){
            return this.mesg;
        }

    }


