/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAC;

import java.io.Serializable;
import java.util.Random;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Magno
 */
@Named(value = "codeGeneratorBean")
@Dependent
public class codeGeneratorBean implements Serializable {

    Random _seed;
    Integer randomCode;
    String response;
    
    public Integer generateNewCode()
    {
        _seed = new Random();
        return _seed.nextInt();
    }
    
    public String getResponse(Integer uCode) 
    {
        if(uCode == randomCode)
        {
            FacesContext context = FacesContext.getCurrentInstance();
            HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
            session.invalidate();
            return "Presença Confirmada!";
        }
        else
        {
            return "Ocorreu um erro, procure o professor!";
        }
    }

    public codeGeneratorBean() {
        Random seed = new Random();
        randomCode = seed.nextInt();
        System.out.println("Code: " + randomCode);
    }
    
}
