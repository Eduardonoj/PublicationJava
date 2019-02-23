/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eduardolopez.sistema;

import java.util.Date;

/**
 *
 * @author EDUARDO
 */
public class Magazine extends Publication {
    int id;
    
    public Magazine(String title, Date editition, String editorial){
        super(title, editition, editorial);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
