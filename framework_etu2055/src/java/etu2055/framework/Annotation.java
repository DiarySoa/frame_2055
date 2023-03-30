/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu2055.framework;

/**
 *
 * @author ITU
 */
import java.io.File;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@Target({ElementType.TYPE , ElementType.METHOD})
@Retention (RetentionPolicy.RUNTIME)
public @interface Annotation 
{
	    String nom()default "";
//	    String prenom()default "";
//	    int age()default 0;   
}
