package org.changsol.apps.orders.domains;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import org.changsol.apps.products.domains.Product;

@Entity
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Order order;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Product product;

	@NotNull
	private Integer price;

	@NotNull
	private Integer qty;
}
