package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        if(order.getBasic() > 200) {
            return 0;
        } else if(order.getBasic() <= 200 && order.getBasic() >= 100){
            return 12;
        } else {
            return 20;
        }

    }
}
