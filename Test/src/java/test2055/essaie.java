/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2055;

import etu2055.framework.Mapping;
import etu2055.framework.Modelview;
import etu2055.framework.servlet.Controller;
import etu2055.framework.servlet.Url;

//jar -cf Front.jar ./etu2055

/**
 *
 * @author ITU
 */
@Controller
public class essaie {
    @Url(nom = "nom")
    public Modelview view(){
        Modelview m = new Modelview();
        m.setView("essaie.jsp");
        return m;
    }
}
