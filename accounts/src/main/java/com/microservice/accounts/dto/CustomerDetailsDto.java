package com.microservice.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "CustomerDetails",
        description = "Schema to hold customer, account, cards, loans information"
)
public class CustomerDetailsDto {

    @Schema(
            description = "Name of the customer",
            example = "Raksharam patel"
    )
    @NotEmpty(message = "Name can not be null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer should be between 5 to 30")
    private String name;

    @Schema(
            description = "Email address of the customer",
            example = "raksh123@gmail.com"
    )
    @NotEmpty(message = "Email can not be null or empty")
    @Email(message = "Email address should be valid value")
    private String email;

    @Schema(
            description = "Mobile Number of the customer",
            example = "9876543210"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of customer"
    )
    private AccountsDto accountsDto;

    @Schema(
            description = "Cards details of customer"
    )
    private CardsDto cardsDto;

    @Schema(
            description = "Loans details of customer"
    )
    private LoansDto loansDto;
}
