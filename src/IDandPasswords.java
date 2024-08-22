import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginfo = new HashMap<String, String>();

    IDandPasswords(){

        loginfo.put("Bro", "pizza");
        loginfo.put("John", "password");
        loginfo.put("Bic", "ola");
    }

   protected HashMap getLoginInfo(){
        return loginfo;
    }


}
