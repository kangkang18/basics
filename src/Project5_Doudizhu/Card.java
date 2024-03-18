package Project5_Doudizhu;

public class Card {
    private String number;
    private String color;

    private int size;

    public Card() {
    }

    public Card(String number, String color, int size) {
        this.number = number;
        this.color = color;
        this.size = size;
    }

    public String getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return
                "number='" + number + '\'' +
                ", color='" + color + '\'' +
                 +
                '}';
    }
}
