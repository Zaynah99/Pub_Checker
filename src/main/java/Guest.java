public class Guest {

    private final int money;
    private int age;
    private String name;
    private int sober;
    public boolean bannedFromPub;


    public Guest(String name, int age, int money, int sober, boolean bannedFromPub){
        this.name = name;
        this.age = age;
        this.money = money;
        this.sober = sober;
        this.bannedFromPub = bannedFromPub;
    }
    public int getAge(){
        return this.age;
    }

    public int getMoney() {
        return this.money;
    }

    public int getSober(){
        return this.sober;
    }
    public boolean banned(){
        return this.bannedFromPub;
    }



    }

