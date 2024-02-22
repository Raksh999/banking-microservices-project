package com.microservice.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
            description = "Account Number of Bank Account",
            example = "3440224646"
    )
    @NotEmpty(message = "Account Number can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account Number must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account Type of Bank Account",
            example = "Savings"
    )
    @NotEmpty(message = "Account Type can not be null or empty")
    private String accountType;

    @Schema(
            description = "Branch Address of Bank ",
            example = "pune"
    )
    @NotEmpty(message = "Branch Address can not be null or empty")
    private String branchAddress;
}
