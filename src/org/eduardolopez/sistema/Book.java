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
public class Book extends Publication {
    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded ;
    
    public Book (){
        super();
    }
    
    public Book (String title, Date edititionDate, String editorial, String authors){
        super (title, edititionDate, editorial, authors);  
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }
    
    
    
}
