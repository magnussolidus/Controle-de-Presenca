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
@ManagedBean("managerBean")
@Dependent
public class managerBean implements Serializable{

    List<Integer> codes;
    List<aluno> alunos;
    professor prof;
    int _curId;
    /**
     * Creates a new instance of managerBean
     */
    public managerBean() {
        this.alunos = new ArrayList<aluno>();
        this.codes = new ArrayList<Integer>();
        this.prof = new professor();
        this._curId = prof.getId();
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
    }
}
