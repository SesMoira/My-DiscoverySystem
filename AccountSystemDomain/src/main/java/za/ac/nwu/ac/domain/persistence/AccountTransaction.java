package za.ac.nwu.ac.domain.persistence;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NonNull
@Entity
@Table(name = "ACCOUNT_TX", schema = "HR")
public class AccountTransaction implements Serializable {

    private static final long serialVersionUID = -1214729332422174861L;

    private Long transactionId;
    private Long memberId;
    private Long amount;
    private AccountType accountType;
    private LocalDate transactionDate;

    private AccountTransactionDetails details;

    public AccountTransaction(){
    }
    public AccountTransaction(Long transactionId, AccountType accountType, Long memberId, Long amount, LocalDate transactionDate){
        this.transactionId = transactionId;
        this.accountType = accountType;
        this.memberId = memberId;
        this.amount= amount;
        this.transactionDate = transactionDate;
    }


    @Id
    @SequenceGenerator(name = "ACCOUNT_SEQ", sequenceName = "MY_SCHEMA.ACCOUNT_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACCOUNT_SEQ")
    @Column(name = "TX_ID")
    public Long getTransactionId(){
        return transactionId;
    }

    @Column(name = "MEMBER_ID")
    public Long getMemberId(){
        return memberId;
    }

    @Column(name = "AMOUNT")
    public Long getAmount(){
        return amount;
    }

    @Column(name = "TX_DATE")
    public LocalDate getTransactionDate(){
        return transactionDate;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
    public AccountType getAccountType(){
        return accountType;
    }

    @OneToOne(targetEntity = AccountTransactionDetails.class, fetch = FetchType.LAZY, mappedBy = "accountTransaction")
    public AccountTransactionDetails getDetails() {
        return details;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setDetails(AccountTransactionDetails details) {this.details = details; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransaction that = (AccountTransaction) o;
        return Objects.equals(transactionId, that.transactionId) && Objects.equals(accountType, that.accountType) && Objects.equals(memberId, that.memberId)&& Objects.equals(amount, that.amount) && Objects.equals(transactionDate, that.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, accountType, memberId, amount, transactionDate);
    }
    @Override
    public String toString() {
        return "AccountTransaction{" +
                "transactionId=" + transactionId +
                ", accountType='" + accountType  +
                ", memberId='" + memberId +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
