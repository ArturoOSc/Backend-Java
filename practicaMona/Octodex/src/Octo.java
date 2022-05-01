public class Octo {
    private int id;
    private String name;
    private String activity;
    public Octo(int id, String name, String activity){
        this.id = id;
        this.name = name;
        this.activity = activity;
    }
    public int getId(){ return id; }
    public String getName(){ return name; }
    public String getActivity(){ return activity; }

    public boolean getId(int id){
        if(id > 0){
            this.id = id;
            return true;
        }else
            return false;
    }

    public boolean getName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean getActivity(String activity){
        if(!activity.isEmpty()){
            this.activity = activity;
            return true;
        }else
            return false;
    }

    public String showMess(){
        return
                "\nid: "+id+
                        " \nname: "+name+
                        " \nactivity: "+activity+" \n";
    }

}
