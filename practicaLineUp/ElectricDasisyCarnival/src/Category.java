public class Category {
    private String name;
    public Category(String name){
        this.name = name;
    }

    public String getName(){ return name; }

    public boolean setName(String name){
        if (!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                "\n                                         Artist: "+name+"\n";
    }
}

