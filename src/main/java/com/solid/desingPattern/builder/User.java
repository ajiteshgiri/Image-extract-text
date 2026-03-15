package com.solid.desingPattern.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
public class User {
    private final String userId;
    private final String userName;
    private final String emailId;

    private User(UserBuilder builder){
        //intialize
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.emailId = builder.emailId;
    }

    //inner class to create to object

    @Setter
    static class UserBuilder{
        private String userId;
        private  String userName;
        private String emailId;

        public UserBuilder(){

        }
        public UserBuilder setUserId(String userId){
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName){
            this.userName = userName;
            return this;
        }
        public UserBuilder setEmailId(String emailId){
            this.emailId = emailId;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }


    }

}
