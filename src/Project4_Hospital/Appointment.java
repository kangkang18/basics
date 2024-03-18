package Project4_Hospital;

import java.time.LocalDateTime;

public class Appointment {

    private String userName;

    private char sex;

    private int age;

    private String desc;

    private String departName;

    private String doctorId;

    private LocalDateTime appointDateTime;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setAppointDateTime(LocalDateTime appointDateTime) {
        this.appointDateTime = appointDateTime;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getDesc() {
        return desc;
    }

    public String getDepartName() {
        return departName;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public LocalDateTime getAppointDateTime() {
        return appointDateTime;
    }
}
