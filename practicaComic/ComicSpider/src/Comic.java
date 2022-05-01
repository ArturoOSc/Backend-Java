public class Comic {
    private int id;
    private String name;
    public Comic(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName(){ return name; }

    public boolean setId(int id){
        if(id > 0){
            this.id = id;
            return true;
        }else
            return false;
    }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }
    public String showMessa(){
        return
                "\nid: "+id+
                        "\nComic: "+name+"\n";

    }
}
