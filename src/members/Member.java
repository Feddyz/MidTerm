package members;
import java.util.*;
public class Member {
    private String name = "";
    private String address = "";
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setName(String newname){
        name = newname;
    }
    public void setAddress(String newAdd) {
        address = newAdd;
    }
}
