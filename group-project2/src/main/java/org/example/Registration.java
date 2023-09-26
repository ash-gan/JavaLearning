package org.example;



public class Registration {

    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password){
        setEmail(email);
        setUserName(userName);
        setPassword(password);
    }

    public void setEmail(String email){
        if(email.contains("@yahoo"))
             this.email = email;
        else{
            System.out.println("Invalid email. Email domain should be of yahoo");
        }
    }

    public void setUserName(String userName){
        if (userName.length() != 0){
            if (userName.length() > 6) {
                this.userName = userName;
            }else{
                System.out.println("Invalid user name. User name minimum length needs to 6 or greater");
            }
        }else {
            System.out.println("Invalid userName, user name can not be empty");
        }
    }

    public void setPassword(String password){
        if(password.length() != 0){
            if(password.length() > 6){
                if(password.contains(userName)){
                    System.out.println("Invalid password, password can not contain user name.");
                }else{
                    this.password = password;
                }

            }else {
                System.out.println("Invalid password, can not be less than 6 characters");
            }
        }else{
            System.out.println("Invalid password. Password cannot be empty.");
        }
    }

    public String getEmail(){
        return this.email;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getPassword(){
        return this.password;
    }
}

class RegistrationTester{
    public static void main(String[] args) {

        Registration r = new Registration("newstudent@yahoo.com", "newStudent", "newpassword");
        System.out.println(r.getEmail());
        System.out.println(r.getUserName());
        System.out.println(r.getPassword());

        // test invalid email id
        r.setEmail("newstudent@gmail.com");

        //set empty username
        r.setUserName("");

        //set  username less than 6 characters
        r.setUserName("abcde");

        //set empty password
        r.setPassword("");

        //set  password less than 6 characters
        r.setPassword("abcde");

        //set password which has username in it
        r.setPassword("newStudent");
    }
}
