/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplomvcsencillo.main;

import com.mycompany.ejemplomvcsencillo.beans.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author eduardo
 */
public class Principal {
    public static void main(String[] args) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("app.xml");
        
        //Esto se deja para crear un gancho que se ejecute cuando acabe el hilo principal
        AbstractApplicationContext a  = (AbstractApplicationContext) ctx;
        a.registerShutdownHook();
        
        System.out.println("Contexto cargado");
        
        Persona bean = ctx.getBean(Persona.class);
        System.out.println(bean);

    }
}
