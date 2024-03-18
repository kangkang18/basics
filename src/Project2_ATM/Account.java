package Project2_ATM;

public class Account {
    private String cardId;
    private String userName;
    private  char sex;
    private String passWord;
    private double money;
    private  double limit;

    public String getCardId() {
        return cardId;
    }

    public String getUserName() {
        return userName + (sex == '男' ? "先生" : "女士");
    }

    public char getSex() {
        return sex;
    }

    public String getPassWord() {
        return passWord;
    }

    public double getMoney() {
        return money;
    }

    public double getLimit() {
        return limit;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
