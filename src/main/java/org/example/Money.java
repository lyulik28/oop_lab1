package org.example;

/*
У класі Money перевизначено метод equals(),
що тепер перевіряє не лише посилання об'єктів,
а перевіряє чи є об'єкт класу Money, чи однакові значення полів об'єктів
 */
public class Money {
    private int value;
    private String type;

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        } if(obj instanceof Money
            && ((Money) obj).getValue() == value
                && ((Money) obj).getType() == type){
            return true;
        }
        return false;
    }

    public Money(int v, String t){
        value = v;
        type = t;
    }
    public Money add(Money m){
        return new Money(value + m.getValue(), type);
    }
    public Money div(Money m){
        return new Money(value / m.getValue(), type);
    }
    public int getValue(){
        return value;
    }

    public String getType() {
        return type;
    }

}
