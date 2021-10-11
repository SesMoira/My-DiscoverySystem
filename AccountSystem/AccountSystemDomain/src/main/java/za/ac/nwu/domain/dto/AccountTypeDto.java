package za.ac.nwu.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import za.ac.nwu.domain.persistence.AccountType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
public class AccountTypeDto implements Serializable {

    private static final long serialVersionUID = 244537531348045025L;

    private String mnemonic;
    private String accountTypeName;
    private LocalDate creationDate;

    public AccountTypeDto(){
    }

    public AccountTypeDto(String mnemonic, String accountTypeName, LocalDate creationDate){
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }

    public AccountTypeDto(AccountType accountType){
        this.setAccountTypeName(accountType.getAccountTypeName());
        this.setCreationDate(accountType.getCreationDate());
        this.setMnemonic(accountType.getMnemonic());
    }

    @ApiModelProperty(position = 1,
            value = "AccountType Mnemonic",
            name = "Mnemonic",
            notes = "Identifies Account Type Uniquely",
            dataType = "java.lang.String",
            example = "Miles",
            required = true)
    public String getMnemonic() {return mnemonic;}

    public void setMnemonic(String mnemonic) {this.mnemonic = mnemonic;}

    @ApiModelProperty(position = 2,
            value = "AccountType name",
            name = "Name",
            notes = "Name of the Account Type",
            dataType = "java.lang.String",
            example = "Miles",
            required = true)
    public String getAccountTypeName(){return accountTypeName;}

    public void setAccountTypeName(String accountTypeName) {this.accountTypeName = accountTypeName;}

    @ApiModelProperty(position = 3,
            value = "Account creation Date",
            name = "CreationDate",
            notes = "Date the Account Type was Created",
            dataType = "java.lang.String",
            example = "2020-09-21",
            allowEmptyValue = true)
    public LocalDate getCreationDate(){return creationDate;}

    public void setCreationDate(LocalDate creationDate) {this.creationDate = creationDate;}

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        AccountTypeDto that = (AccountTypeDto) o;
        return Objects.equals(mnemonic, that.mnemonic) && Objects.equals(accountTypeName, that.accountTypeName)
                && Objects.equals(creationDate, that.creationDate);
    }

    @JsonIgnore
    public AccountType getAccountType(){
        return new AccountType(getMnemonic(), getAccountTypeName(), getCreationDate());
    }
    @Override
    public int hashCode() {return Objects.hash(mnemonic, accountTypeName, creationDate);}

    @Override
    public String toString(){
        return "AccountTypeDto{" +
                "mnemonic='" + mnemonic + '\'' +
                ",accountTypeName='" + accountTypeName +'\'' +
                ", creationDate=" + creationDate +
                '}';

    }

}