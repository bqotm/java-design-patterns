package dev.bqot.builder;

import lombok.ToString;

@ToString
public class User {

    private String fname, lname, id;
    private boolean isDead;

    public User(String fname, String lname, String id, boolean isDead) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
        this.isDead = isDead;
    }

    public User(Builder builder) {
        this.fname = builder.fname;
        this.lname = builder.lname;
        this.id = builder.id;
        this.isDead = builder.isDead;
    }

    static class Builder {

        private String fname, lname, id;
        private boolean isDead;

        public Builder() {
        }

        public Builder fname(String fname) {
            this.fname=fname;
            return this;
        }

        public Builder lname(String lname) {
            this.lname=lname;
            return this;
        }
        public Builder id(String id) {
            this.id=id;
            return this;
        }
        public Builder isDead(boolean id) {
            this.isDead=id;
            return this;
        }

        public User create() {
            return new User(this);
        }
    }

}
