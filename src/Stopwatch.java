import java.util.Date;

public class Stopwatch {
    private long startTime;
    private long endTime;
    Date date = new Date();


    Stopwatch(){
        getStartTime();
        getEndTime();
        getElapsedTime();
    }
    public void setStartTime(long startTime){
        this.startTime = startTime;
    }
    public void setEndTime(long endTime){
        this.endTime = endTime;
    }
    public long getStartTime(){
        start();
        return this.startTime;
    }
    public long getEndTime(){
        return 0;
    }
    public void start(){
        this.startTime = date.getTime();
    }
    public void stop(){
        this.endTime = date.getTime();
    }


    public long getElapsedTime(){
        return getStartTime() - getEndTime();
    }

}
