/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAC;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Magno
 */
@Named(value = "managerBean")
@Dependent
public class managerBean {

    List<Integer> codes;
    List<aluno> alunos;
    /**
     * Creates a new instance of managerBean
     */
    public managerBean() {
        this.alunos = new ArrayList<aluno>();
        this.codes = new ArrayList<Integer>();
    }
    
    public boolean addAluno(aluno a)
    {
        return alunos.add(a);
    }
    
}
