public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drink(){
         volume -= 10;
         return this.volume;
    }

    public int empty(){
        volume -= 100;
        return this.volume;
    }

    public int fill(){
        volume += 100;
        return this.volume;
    }
}

