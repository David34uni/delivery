public class User {
    private int userId;
    private int id;
    private String title;
    private String body;
    private String userName;
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getName(){
        return name;
    }

    public String getUserName(){
        return userName;
    }
    
    public User(){
        this.userId = 0;
        this.id = 0;
        this.title = "";
        this.body = "";
    }
    public User(int userId, int id, String title, String body){
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getId() {
        return 0;
    }

    public void setId(int parseInt) {
    }
}
