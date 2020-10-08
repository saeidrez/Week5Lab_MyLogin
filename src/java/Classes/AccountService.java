/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


public class AccountService {
    private String username;
    private String password;
    
    public AccountService() {
    username = "";
    password = "";

}

    public AccountService(String username, String password) {
       this.username = username;
       this.password = password;
    }

    public boolean login(String user, String pass){
        boolean success = false;
        this.username = user;
        this.password = pass;
        if (username.equals("abe") || username.equals("barb")) {
            if (password.equals("password")) {
                success = true;
            }
        }
        return success;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

