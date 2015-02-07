/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessNumber;

import java.io.Serializable;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author myx
 */
@ManagedBean(name = "UserNumberBean")
@SessionScoped
public class UserNumberBean implements Serializable {

    /**
     * Creates a new instance of UserNumberBean
     */
    Integer randomInt;
    Integer userNumber;
    String response;

    public String getResponse() {

        try {

            System.out.println("randomInt:" + randomInt + "\nuserNumber:" + userNumber);

            if (userNumber.compareTo(randomInt) == 0) {

                FacesContext context = FacesContext.getCurrentInstance();
                HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
                session.invalidate();

                return "Yay! You got it!";
            } else {

                return "<p>Sorry, " + userNumber + " isn't it.</p>"
                        + "<p>Guess again...</p>";
            }

        } catch (Exception e) {
            System.err.println(e);
        }

        return response;
    }

    public UserNumberBean() {

        Random randomGR = new Random();
        randomInt = new Integer(randomGR.nextInt(10));

        System.out.println("Myx's number :" + randomInt);
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        System.out.println("set userNumber :" + userNumber);
        this.userNumber = userNumber;
    }

}
