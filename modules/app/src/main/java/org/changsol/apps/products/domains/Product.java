package org.changsol.apps.products.domains;

import com.google.common.collect.Sets;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.changsol.apps.orders.domains.Order;
import org.changsol.apps.orders.domains.OrderItem;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String name;

	@NotNull
	private Integer price;

	@NotNull
	@ColumnDefault("0")
	private Integer stockQty = 0;

	@OneToMany(mappedBy = "product")
	@OrderBy("id asc ")
	private Set<OrderItem> orderItems = Sets.newHashSet();
}
