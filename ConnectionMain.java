import java.util.List;

import
public class ConnectionMain {
    public static void main(String[] args){
        Conexion con = new Conexion();
        String txtJson=con.sendGet();
        System.out.println(txtJson);
        Gson gson = new Gson();
        List<Userexample
        con.sendGet();
    }
}
