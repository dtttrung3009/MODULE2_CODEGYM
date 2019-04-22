package LopVaDoiTuongTrongJava.stopwatch;

public class StopWatch {
    private long startTime=0;
    private long endTime=0;

    public StopWatch() {
        this.startTime=System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long getElapsedTime(){
        return (this.endTime-this.startTime);
    }
}
