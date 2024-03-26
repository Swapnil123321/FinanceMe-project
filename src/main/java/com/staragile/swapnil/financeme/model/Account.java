package com.staragile.swapnil.financeme.model;
import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNo;
    
    @Column(name = "account_holder_first_name",nullable = false)
    private String accountHolderFirstName;
    
    @Column(name = "account_holder_last_name",nullable = false)
    private String accountHolderLastName;
    
    @Column(name = "balance")
    private Long balance;
    
    @Column(name = "account_open_date")
    private LocalDateTime accountOpenDate;
    
    @Column(name = "account_status",nullable = false)
    private Boolean accountStatus;
    
    @Column(name = "pan_no",nullable = false)
    private String panNo;
    
    @Column(name = "aadhar_no",nullable = true)
    private String aadharNo;
    
    @Column(name = "kyc_status",nullable = false)
    private Boolean kycStatus;
    
    @Column(name = "nominee_name",nullable = false)
    private String nomineeName;

	public Account() {
		super();
	}

	public Account(Long accountNo, String accountHolderFirstName, String accountHolderLastName, Long balance,
			LocalDateTime accountOpenDate, Boolean accountStatus, String panNo, String aadharNo, Boolean kycStatus,
			String nomineeName) {
		super();
		this.accountNo = accountNo;
		this.accountHolderFirstName = accountHolderFirstName;
		this.accountHolderLastName = accountHolderLastName;
		this.balance = balance;
		this.accountOpenDate = accountOpenDate;
		this.accountStatus = accountStatus;
		this.panNo = panNo;
		this.aadharNo = aadharNo;
		this.kycStatus = kycStatus;
		this.nomineeName = nomineeName;
	}

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderFirstName() {
		return accountHolderFirstName;
	}

	public void setAccountHolderFirstName(String accountHolderFirstName) {
		this.accountHolderFirstName = accountHolderFirstName;
	}

	public String getAccountHolderLastName() {
		return accountHolderLastName;
	}

	public void setAccountHolderLastName(String accountHolderLastName) {
		this.accountHolderLastName = accountHolderLastName;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public LocalDateTime getAccountOpenDate() {
		return accountOpenDate;
	}

	public void setAccountOpenDate(LocalDateTime accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public Boolean getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(Boolean accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public Boolean getKycStatus() {
		return kycStatus;
	}

	public void setKycStatus(Boolean kycStatus) {
		this.kycStatus = kycStatus;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountNo, other.accountNo);
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolderFirstName=" + accountHolderFirstName
				+ ", accountHolderLastName=" + accountHolderLastName + ", balance=" + balance + ", accountOpenDate="
				+ accountOpenDate + ", accountStatus=" + accountStatus + ", panNo=" + panNo + ", aadharNo=" + aadharNo
				+ ", kycStatus=" + kycStatus + ", nomineeName=" + nomineeName + "]";
	}
    

    // standard constructors

    // standard getters and setters
}