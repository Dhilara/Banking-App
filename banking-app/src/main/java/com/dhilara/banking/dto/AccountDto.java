package com.dhilara.banking.dto;

/*
 * @Data
 * 
 * @AllArgsConstructor public class AccountDto {
 * 
 * private Long id;
 * 
 * private String accountHolderName;
 * 
 * private double balance;
 * 
 * }
 */

public record AccountDto(long id, String accountHolderName, Double balance) {
	
}
