import java.util.List;
import com.google.gson.Gson;

public class ConnectionMain {
    public static void main(String[] args){
        /*Conexion con = new Conexion();
        String txtJson = con.sendGet();*/
        //System.out.ptintln(txtJson);

        User u = new User(1, 0, "titulo texto", "este es el usuario 0");
        String resJson;
        Serializar serial = new Serializar();
        resJson = serial.user(u);
        System.out.println(resJson);
        serial.userAdd(u);
        resJson = serial.lista_Json();
        System.out.println(resJson);
        User u2 = new User(2, 1, "titulo texto 2", "usuario 1");
        serial.userAdd(u2);
        resJson = serial.lista_Json();
        System.out.println(resJson);


        /*Gson gson = new Gson();
        List<UserExample> lista = gson.fromJson(txtJson, List.class);
        System.out.println("numero de registros: " + lista.size());
        
      for(UserExample user : lista){
        System.out.println(user.getId());
      }*/
    }
}