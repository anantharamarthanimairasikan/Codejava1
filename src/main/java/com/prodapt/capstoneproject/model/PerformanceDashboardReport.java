package com.prodapt.capstoneproject.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PerformanceDashboardReport {
	private BigDecimal recoveryRate;
	private BigDecimal effectiveness;
	private BigDecimal avgResponseTime;
	private Long total_notifications;
	private Long total_accounts;
	private Long ignored_responses;
	private Long undeliverable_responses;
	
	

}
