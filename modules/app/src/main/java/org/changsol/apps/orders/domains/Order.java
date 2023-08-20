package org.changsol.apps.orders.domains;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.changsol.apps.members.domains.Member;

@Entity
@Table(name = "orders")
public class Order {

	public enum OrderStatus {
		ORDER,
		CANCEL
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Member member;

	@NotNull
	private LocalDate orderDt;

	@NotNull
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
}
