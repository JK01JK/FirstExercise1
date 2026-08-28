package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderService extends ShippingService{

    public double total (Order order) {

        double orderAmountWithDiscount = (order.getBasic() - (order.getBasic()*order.getDiscount()*0.01));
        orderAmountWithDiscount += shipment(order);

        return orderAmountWithDiscount;
    }



}
