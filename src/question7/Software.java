package question7;

import java.io.Serializable;

public class Software implements Serializable {
    private String title;
    public Software (String title){
        this.title = title;
        System.out.println("Software ");
    }
    public String toString(){ return title;}
}
