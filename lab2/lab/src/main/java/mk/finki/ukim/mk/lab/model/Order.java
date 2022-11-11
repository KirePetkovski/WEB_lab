package mk.finki.ukim.mk.lab.model;

import lombok.Data;

@Data
public class Order {
    public String balloonColor;
    public String balloonSize;
    public String clientName;
    public String clientAddress;
    public Long orderId;

    public Order(String balloonColor, String balloonSize, String clientName, String clientAddress, Long orderId) {
        this.balloonColor = balloonColor;
        this.balloonSize = balloonSize;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.orderId = orderId;
    }
}
