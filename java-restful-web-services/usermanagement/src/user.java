import java.io.Serializable;
import javax.xml.*;

public class user implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String sector;
    public user(){};

    public user (int id, String name, String sector) {
        this.id = id;
        this.name = name;
        this.sector = sector;
    }
    public int getId(){
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getSector(){
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;

    }
}