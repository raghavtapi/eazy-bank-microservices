package com.raghavtapi.accounts.dto;

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
            description = "Account Number of Customer's Eazy Bank account",
            example = "3454433243"
    )
    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account Number must be 10 digits")
    private Long accountNumber;

    @Schema(
        defaultValue = "Account type of Eazy Bank account",
        example = "Savings"
    )
    @NotEmpty(message = "AccountType cannot be null or empty")
    private String accountType;


    @Schema(
            description = "Eazy Bank branch address",
            example = "123, New york"
    )
    @NotEmpty(message = "Branch Address cannot be null or empty")
    private String branchAddress;
}