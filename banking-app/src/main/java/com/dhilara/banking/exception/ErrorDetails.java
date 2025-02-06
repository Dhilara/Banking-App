package com.dhilara.banking.exception;

import java.time.LocalDateTime;

public record ErrorDetails(LocalDateTime timestamp,
						   String message, 
						   String Details, 
						   String errorCode) {

}
