public class Spiderverse {
    private int id;
    private String name;
    private String universe;
    private String superhero_name;
    public  Spiderverse(int id, String name, String universe, String superhero_name){
        this.id = id;
        this.name = name;
        this.universe = universe;
        this.superhero_name = superhero_name;
    }
    public int getId(){ return id; }
    public String getName(){ return name; }
    public String getUniverse(){ return universe; }
    public String getSuperhero_name(){ return superhero_name; }

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

    public boolean setUniverse(String universe){
        if(!universe.isEmpty()){
            this.universe = universe;
            return true;
        }else
            return false;
    }

    public boolean setSuperhero_name(){
        if(!superhero_name.isEmpty()){
            this.superhero_name = superhero_name;
            return true;
        }else
            return false;
    }

    public String showMess(){
        return
                "\nid: "+id+
                        "\nname: "+name+
                        "\nuniverse: "+universe+
                        "\nsuperhero name: "+superhero_name+"\n";
    }
}
