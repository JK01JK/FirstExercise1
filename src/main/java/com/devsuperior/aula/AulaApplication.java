package com.devsuperior.aula;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Código do pedido: ");
		Integer code = Integer.parseInt(sc.nextLine());
		System.out.print("Valor básico: ");
		Double basic = Double.parseDouble(sc.nextLine());
		System.out.print("Porcentagem de desconto: ");
		Double discount = Double.parseDouble(sc.nextLine());

		Order order = new Order(code, basic, discount);

		sc.close();

		System.out.println("Codigo do produto: " + code);
		System.out.printf("Valor total: %.2f", orderService.total(order));

	}
}
