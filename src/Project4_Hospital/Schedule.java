package Project4_Hospital;

import java.time.LocalDate;

public class Schedule {
    private LocalDate today;
    //上午
    private boolean morning;
    private LocalDate mstart;

    private LocalDate mend;
    private int mTotalNumber;
    private int mAppointNumber;

    //下午
    private boolean afternoon;
    private LocalDate astart;

    private LocalDate aend;
    private int aTotalNumber;
    private int aAppointNumber;

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public void setMorning(boolean morning) {
        this.morning = morning;
    }

    public void setMstart(LocalDate mstart) {
        this.mstart = mstart;
    }

    public void setMend(LocalDate mend) {
        this.mend = mend;
    }

    public void setmTotalNumber(int mTotalNumber) {
        this.mTotalNumber = mTotalNumber;
    }

    public void setmAppointNumber(int mAppointNumber) {
        this.mAppointNumber = mAppointNumber;
    }

    public void setAfternoon(boolean afternoon) {
        this.afternoon = afternoon;
    }

    public void setAstart(LocalDate astart) {
        this.astart = astart;
    }

    public void setAend(LocalDate aend) {
        this.aend = aend;
    }

    public void setaTotalNumber(int aTotalNumber) {
        this.aTotalNumber = aTotalNumber;
    }

    public void setaAppointNumber(int aAppointNumber) {
        this.aAppointNumber = aAppointNumber;
    }

    public LocalDate getToday() {
        return today;
    }

    public boolean isMorning() {
        return morning;
    }

    public LocalDate getMstart() {
        return mstart;
    }

    public LocalDate getMend() {
        return mend;
    }

    public int getmTotalNumber() {
        return mTotalNumber;
    }

    public int getmAppointNumber() {
        return mAppointNumber;
    }

    public boolean isAfternoon() {
        return afternoon;
    }

    public LocalDate getAstart() {
        return astart;
    }

    public LocalDate getAend() {
        return aend;
    }

    public int getaTotalNumber() {
        return aTotalNumber;
    }

    public int getaAppointNumber() {
        return aAppointNumber;
    }
}
