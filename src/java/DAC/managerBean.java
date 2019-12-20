/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Magno
 */

@ManagedBean(value="managerBean")
@Dependent
public class managerBean implements Serializable{

    List<Integer> codes;
    List<aluno> alunos;
    professor prof;
    int _curId;
    
    // receiving data
    public String inputString;
    Integer inputCode;
    
    /**
     * Creates a new instance of managerBean
     */
    public managerBean() {
        this.alunos = new ArrayList<aluno>();
        this.codes = new ArrayList<Integer>();
        this.prof = new professor();
        this._curId = prof.getId();
    }

    public String getrString() {
        return inputString;
    }

    public void setrString(String _rString) {
        this.inputString = _rString;
    }

    public Integer getrCode() {
        return inputCode;
    }

    public void setrCode(Integer _rCode) {
        this.inputCode = _rCode;
    }
    
    
    
    public boolean addAluno(aluno a)
    {
        return alunos.add(a);
    }
    
    public boolean addCode(Integer c)
    {
        return codes.add(c);
    }
    
    public boolean isCodeValid(Integer code)
    {
        for(int _c:codes)
        {
            if(_c == code)
                return true;
        }
        return false;
    }

    public boolean checkAluno(aluno a)
    {
        for(aluno _a:alunos)
        {
            if(_a == a)
                return true;
        }
        return false;
    }
    
    public aluno getSpecificAluno(String aName)
    {
        for(aluno _a:alunos)
            if(_a.getName().equals(aName))
                return _a;
        
        return new aluno("Desconhecido");
    }
    
    public void checkPresenca(aluno a, Integer code)
    {
        if(!isCodeValid(code))
            return;
        
        if(!checkAluno(a))
        {
            this.addAluno(a);
        }
        
        a.addCode(true, _curId);
    }
    
    public void receiveInput(String s, Integer code)
    {
        aluno _a;
        if(getSpecificAluno(s).getName().equals("Desconhecido"))
        {
            _a = new aluno(s);
            this.addAluno(_a);
        }
       
        _a = getSpecificAluno(s);
        checkPresenca(_a, code);
    }
    
}
