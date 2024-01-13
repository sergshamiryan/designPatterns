package org.example.creational.builder.sofarchandcleandesign.chained;

public class Account {
    private String userId;
    private String token;

    private Account() {

    }

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public static Builder newBuilder() {
        return new Account().new Builder();
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId='" + userId + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    class Builder {

        private Builder() {

        }

        public Builder userId(String userId) {
            Account.this.userId = userId;
            return this;
        }

        public Builder token(String token) {
            Account.this.token = token;
            return this;
        }

        public Account build() {
            return Account.this;
        }
    }
}
