package com.dblackker.prosperlending.data.entity;

import com.google.gson.annotations.SerializedName;

public class SearchListing {
    @SerializedName("member_key")
    private String memberKey;
    @SerializedName("listing_number")
    private int listingNumber;
    @SerializedName("credit_pull_date")
    private String creditPullDate;
    @SerializedName("listing_start_date")
    private String listingStartDate;
    @SerializedName("listing_creation_date")
    private String listingCreationDate;
    @SerializedName("listing_status")
    private int listingStatus;
    @SerializedName("listing_status_reason")
    private String listingStatusReason;
    @SerializedName("verification_stage")
    private int verificationStage;
    @SerializedName("listing_amount")
    private int listingAmount;
    @SerializedName("amount_funded")
    private double amountFunded;
    @SerializedName("amount_remaining")
    private double amountRemaining;
    @SerializedName("percent_funded")
    private double percentFunded;
    @SerializedName("partial_funding_indicator")
    private boolean partialFundingIndicator;
    @SerializedName("funding_threshold")
    private double fundingThreshold;
    @SerializedName("prosper_rating")
    private String prosperRating;
    @SerializedName("estimated_return")
    private double estimatedReturn;
    @SerializedName("estimated_loss_rate")
    private double estimatedLossRate;
    @SerializedName("lender_yield")
    private double lenderYield;
    @SerializedName("effective_yield")
    private double effectiveYield;
    @SerializedName("borrower_rate")
    private double borrowerRate;
    @SerializedName("borrower_apr")
    private double borrowerApr;
    @SerializedName("listing_term")
    private int listingTerm;
    @SerializedName("listing_monthly_payment")
    private double listingMonthlyPayment;
    @SerializedName("scorex")
    private String scorex;
    @SerializedName("fico_score")
    private String ficoScore;
    @SerializedName("prosper_score")
    private int prosperScore;
    @SerializedName("listing_category_id")
    private int listingCategoryId;
    @SerializedName("listing_title")
    private String listingTitle;
    @SerializedName("income_range")
    private int incomeRange;
    @SerializedName("income_range_description")
    private String incomeRangeDescription;
    @SerializedName("stated_monthly_income")
    private double statedMonthlyIncome;
    @SerializedName("income_verifiable")
    private boolean incomeVerifiable;
    @SerializedName("dti_wprosper_loan")
    private double dtiWprosperLoan;
    @SerializedName("employment_status_description")
    private String employmentStatusDescription;
    @SerializedName("months_employed")
    private int monthsEmployed;
    @SerializedName("borrower_state")
    private String borrowerState;
    @SerializedName("borrower_city")
    private String borrowerCity;
    @SerializedName("borrower_metropolitan_area")
    private String borrowerMetropolitanArea;
    @SerializedName("prior_prosper_loans_active")
    private int priorProsperLoansActive;
    @SerializedName("prior_prosper_loans")
    private int priorProsperLoans;
    @SerializedName("lender_indicator")
    private int lenderIndicator;
    @SerializedName("group_indicator")
    private boolean groupIndicator;
    @SerializedName("channel_code")
    private String channelCode;
    @SerializedName("amount_participation")
    private int amountParticipation;
    @SerializedName("monthly_debt")
    private int monthlyDebt;
    @SerializedName("current_delinquencies")
    private int currentDelinquencies;
    @SerializedName("delinquencies_last7_years")
    private int delinquenciesLast7Years;
    @SerializedName("public_records_last10_years")
    private int publicRecordsLast10Years;
    @SerializedName("public_records_last12_months")
    private int publicRecordsLast12Months;
    @SerializedName("first_recorded_credit_line")
    private String firstRecordedCreditLine;
    @SerializedName("credit_lines_last7_years")
    private int creditLinesLast7Years;
    @SerializedName("inquiries_last6_months")
    private int inquiriesLast6Months;
    @SerializedName("amount_delinquent")
    private int amountDelinquent;
    @SerializedName("current_credit_lines")
    private int currentCreditLines;
    @SerializedName("open_credit_lines")
    private int openCreditLines;
    @SerializedName("bankcard_utilization")
    private double bankcardUtilization;
    @SerializedName("total_open_revolving_accounts")
    private int totalOpenRevolvingAccounts;
    @SerializedName("installment_balance")
    private int installmentBalance;
    @SerializedName("real_estate_balance")
    private int realEstateBalance;
    @SerializedName("revolving_balance")
    private int revolvingBalance;
    @SerializedName("real_estate_payment")
    private int realEstatePayment;
    @SerializedName("revolving_available_percent")
    private int revolvingAvailablePercent;
    @SerializedName("total_inquiries")
    private int totalInquiries;
    @SerializedName("total_trade_items")
    private int totalTradeItems;
    @SerializedName("satisfactory_accounts")
    private int satisfactoryAccounts;
    @SerializedName("now_delinquent_derog")
    private int nowDelinquentDerog;
    @SerializedName("was_delinquent_derog")
    private int wasDelinquentDerog;
    @SerializedName("oldest_trade_open_date")
    private String oldestTradeOpenDate;
    @SerializedName("delinquencies_over30_days")
    private int delinquenciesOver30Days;
    @SerializedName("delinquencies_over60_days")
    private int delinquenciesOver60Days;
    @SerializedName("delinquencies_over90_days")
    private int delinquenciesOver90Days;
    @SerializedName("investment_typeid")
    private int investmentTypeid;
    @SerializedName("investment_type_description")
    private String investmentTypeDescription;
    @SerializedName("is_homeowner")
    private boolean isHomeowner;
    @SerializedName("dt_iwprosper_loan")
    private double dtIwprosperLoan;
    @SerializedName("occupation")
    private String occupation;

    public SearchListing(Builder builder) {
        memberKey = builder.memberKey;
        listingNumber = builder.listingNumber;
        creditPullDate = builder.creditPullDate;
        listingStartDate = builder.listingStartDate;
        listingCreationDate = builder.listingCreationDate;
        listingStatus = builder.listingStatus;
        listingStatusReason = builder.listingStatusReason;
        verificationStage = builder.verificationStage;
        listingAmount = builder.listingAmount;
        amountFunded = builder.amountFunded;
        amountRemaining = builder.amountRemaining;
        percentFunded = builder.percentFunded;
        partialFundingIndicator = builder.partialFundingIndicator;
        fundingThreshold = builder.fundingThreshold;
        prosperRating = builder.prosperRating;
        estimatedReturn = builder.estimatedReturn;
        estimatedLossRate = builder.estimatedLossRate;
        lenderYield = builder.lenderYield;
        effectiveYield = builder.effectiveYield;
        borrowerRate = builder.borrowerRate;
        borrowerApr = builder.borrowerApr;
        listingTerm = builder.listingTerm;
        listingMonthlyPayment = builder.listingMonthlyPayment;
        scorex = builder.scorex;
        ficoScore = builder.ficoScore;
        prosperScore = builder.prosperScore;
        listingCategoryId = builder.listingCategoryId;
        listingTitle = builder.listingTitle;
        incomeRange = builder.incomeRange;
        incomeRangeDescription = builder.incomeRangeDescription;
        statedMonthlyIncome = builder.statedMonthlyIncome;
        incomeVerifiable = builder.incomeVerifiable;
        dtiWprosperLoan = builder.dtiWprosperLoan;
        employmentStatusDescription = builder.employmentStatusDescription;
        monthsEmployed = builder.monthsEmployed;
        borrowerState = builder.borrowerState;
        borrowerCity = builder.borrowerCity;
        borrowerMetropolitanArea = builder.borrowerMetropolitanArea;
        priorProsperLoansActive = builder.priorProsperLoansActive;
        priorProsperLoans = builder.priorProsperLoans;
        lenderIndicator = builder.lenderIndicator;
        groupIndicator = builder.groupIndicator;
        channelCode = builder.channelCode;
        amountParticipation = builder.amountParticipation;
        monthlyDebt = builder.monthlyDebt;
        currentDelinquencies = builder.currentDelinquencies;
        delinquenciesLast7Years = builder.delinquenciesLast7Years;
        publicRecordsLast10Years = builder.publicRecordsLast10Years;
        publicRecordsLast12Months = builder.publicRecordsLast12Months;
        firstRecordedCreditLine = builder.firstRecordedCreditLine;
        creditLinesLast7Years = builder.creditLinesLast7Years;
        inquiriesLast6Months = builder.inquiriesLast6Months;
        amountDelinquent = builder.amountDelinquent;
        currentCreditLines = builder.currentCreditLines;
        openCreditLines = builder.openCreditLines;
        bankcardUtilization = builder.bankcardUtilization;
        totalOpenRevolvingAccounts = builder.totalOpenRevolvingAccounts;
        installmentBalance = builder.installmentBalance;
        realEstateBalance = builder.realEstateBalance;
        revolvingBalance = builder.revolvingBalance;
        realEstatePayment = builder.realEstatePayment;
        revolvingAvailablePercent = builder.revolvingAvailablePercent;
        totalInquiries = builder.totalInquiries;
        totalTradeItems = builder.totalTradeItems;
        satisfactoryAccounts = builder.satisfactoryAccounts;
        nowDelinquentDerog = builder.nowDelinquentDerog;
        wasDelinquentDerog = builder.wasDelinquentDerog;
        oldestTradeOpenDate = builder.oldestTradeOpenDate;
        delinquenciesOver30Days = builder.delinquenciesOver30Days;
        delinquenciesOver60Days = builder.delinquenciesOver60Days;
        delinquenciesOver90Days = builder.delinquenciesOver90Days;
        investmentTypeid = builder.investmentTypeid;
        investmentTypeDescription = builder.investmentTypeDescription;
        isHomeowner = builder.isHomeowner;
        dtIwprosperLoan = builder.dtIwprosperLoan;
        occupation = builder.occupation;
    }

    public String getMemberKey() {
        return memberKey;
    }

    public int getListingNumber() {
        return listingNumber;
    }

    public String getCreditPullDate() {
        return creditPullDate;
    }

    public String getListingStartDate() {
        return listingStartDate;
    }

    public String getListingCreationDate() {
        return listingCreationDate;
    }

    public int getListingStatus() {
        return listingStatus;
    }

    public String getListingStatusReason() {
        return listingStatusReason;
    }

    public int getVerificationStage() {
        return verificationStage;
    }

    public int getListingAmount() {
        return listingAmount;
    }

    public double getAmountFunded() {
        return amountFunded;
    }

    public double getAmountRemaining() {
        return amountRemaining;
    }

    public double getPercentFunded() {
        return percentFunded;
    }

    public boolean isPartialFundingIndicator() {
        return partialFundingIndicator;
    }

    public double getFundingThreshold() {
        return fundingThreshold;
    }

    public String getProsperRating() {
        return prosperRating;
    }

    public double getEstimatedReturn() {
        return estimatedReturn;
    }

    public double getEstimatedLossRate() {
        return estimatedLossRate;
    }

    public double getLenderYield() {
        return lenderYield;
    }

    public double getEffectiveYield() {
        return effectiveYield;
    }

    public double getBorrowerRate() {
        return borrowerRate;
    }

    public double getBorrowerApr() {
        return borrowerApr;
    }

    public int getListingTerm() {
        return listingTerm;
    }

    public double getListingMonthlyPayment() {
        return listingMonthlyPayment;
    }

    public String getScorex() {
        return scorex;
    }

    public String getFicoScore() {
        return ficoScore;
    }

    public int getProsperScore() {
        return prosperScore;
    }

    public int getListingCategoryId() {
        return listingCategoryId;
    }

    public String getListingTitle() {
        return listingTitle;
    }

    public int getIncomeRange() {
        return incomeRange;
    }

    public String getIncomeRangeDescription() {
        return incomeRangeDescription;
    }

    public double getStatedMonthlyIncome() {
        return statedMonthlyIncome;
    }

    public boolean isIncomeVerifiable() {
        return incomeVerifiable;
    }

    public double getDtiWprosperLoan() {
        return dtiWprosperLoan;
    }

    public String getEmploymentStatusDescription() {
        return employmentStatusDescription;
    }

    public int getMonthsEmployed() {
        return monthsEmployed;
    }

    public String getBorrowerState() {
        return borrowerState;
    }

    public String getBorrowerCity() {
        return borrowerCity;
    }

    public String getBorrowerMetropolitanArea() {
        return borrowerMetropolitanArea;
    }

    public int getPriorProsperLoansActive() {
        return priorProsperLoansActive;
    }

    public int getPriorProsperLoans() {
        return priorProsperLoans;
    }

    public int getLenderIndicator() {
        return lenderIndicator;
    }

    public boolean isGroupIndicator() {
        return groupIndicator;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public int getAmountParticipation() {
        return amountParticipation;
    }

    public int getMonthlyDebt() {
        return monthlyDebt;
    }

    public int getCurrentDelinquencies() {
        return currentDelinquencies;
    }

    public int getDelinquenciesLast7Years() {
        return delinquenciesLast7Years;
    }

    public int getPublicRecordsLast10Years() {
        return publicRecordsLast10Years;
    }

    public int getPublicRecordsLast12Months() {
        return publicRecordsLast12Months;
    }

    public String getFirstRecordedCreditLine() {
        return firstRecordedCreditLine;
    }

    public int getCreditLinesLast7Years() {
        return creditLinesLast7Years;
    }

    public int getInquiriesLast6Months() {
        return inquiriesLast6Months;
    }

    public int getAmountDelinquent() {
        return amountDelinquent;
    }

    public int getCurrentCreditLines() {
        return currentCreditLines;
    }

    public int getOpenCreditLines() {
        return openCreditLines;
    }

    public double getBankcardUtilization() {
        return bankcardUtilization;
    }

    public int getTotalOpenRevolvingAccounts() {
        return totalOpenRevolvingAccounts;
    }

    public int getInstallmentBalance() {
        return installmentBalance;
    }

    public int getRealEstateBalance() {
        return realEstateBalance;
    }

    public int getRevolvingBalance() {
        return revolvingBalance;
    }

    public int getRealEstatePayment() {
        return realEstatePayment;
    }

    public int getRevolvingAvailablePercent() {
        return revolvingAvailablePercent;
    }

    public int getTotalInquiries() {
        return totalInquiries;
    }

    public int getTotalTradeItems() {
        return totalTradeItems;
    }

    public int getSatisfactoryAccounts() {
        return satisfactoryAccounts;
    }

    public int getNowDelinquentDerog() {
        return nowDelinquentDerog;
    }

    public int getWasDelinquentDerog() {
        return wasDelinquentDerog;
    }

    public String getOldestTradeOpenDate() {
        return oldestTradeOpenDate;
    }

    public int getDelinquenciesOver30Days() {
        return delinquenciesOver30Days;
    }

    public int getDelinquenciesOver60Days() {
        return delinquenciesOver60Days;
    }

    public int getDelinquenciesOver90Days() {
        return delinquenciesOver90Days;
    }

    public int getInvestmentTypeid() {
        return investmentTypeid;
    }

    public String getInvestmentTypeDescription() {
        return investmentTypeDescription;
    }

    public boolean isHomeowner() {
        return isHomeowner;
    }

    public double getDtIwprosperLoan() {
        return dtIwprosperLoan;
    }

    public String getOccupation() {
        return occupation;
    }

    public static class Builder {
        private String memberKey;
        private int listingNumber;
        private String creditPullDate;
        private String listingStartDate;
        private String listingCreationDate;
        private int listingStatus;
        private String listingStatusReason;
        private int verificationStage;
        private int listingAmount;
        private double amountFunded;
        private double amountRemaining;
        private double percentFunded;
        private boolean partialFundingIndicator;
        private double fundingThreshold;
        private String prosperRating;
        private double estimatedReturn;
        private double estimatedLossRate;
        private double lenderYield;
        private double effectiveYield;
        private double borrowerRate;
        private double borrowerApr;
        private int listingTerm;
        private double listingMonthlyPayment;
        private String scorex;
        private String ficoScore;
        private int prosperScore;
        private int listingCategoryId;
        private String listingTitle;
        private int incomeRange;
        private String incomeRangeDescription;
        private double statedMonthlyIncome;
        private boolean incomeVerifiable;
        private double dtiWprosperLoan;
        private String employmentStatusDescription;
        private int monthsEmployed;
        private String borrowerState;
        private String borrowerCity;
        private String borrowerMetropolitanArea;
        private int priorProsperLoansActive;
        private int priorProsperLoans;
        private int lenderIndicator;
        private boolean groupIndicator;
        private String channelCode;
        private int amountParticipation;
        private int monthlyDebt;
        private int currentDelinquencies;
        private int delinquenciesLast7Years;
        private int publicRecordsLast10Years;
        private int publicRecordsLast12Months;
        private String firstRecordedCreditLine;
        private int creditLinesLast7Years;
        private int inquiriesLast6Months;
        private int amountDelinquent;
        private int currentCreditLines;
        private int openCreditLines;
        private double bankcardUtilization;
        private int totalOpenRevolvingAccounts;
        private int installmentBalance;
        private int realEstateBalance;
        private int revolvingBalance;
        private int realEstatePayment;
        private int revolvingAvailablePercent;
        private int totalInquiries;
        private int totalTradeItems;
        private int satisfactoryAccounts;
        private int nowDelinquentDerog;
        private int wasDelinquentDerog;
        private String oldestTradeOpenDate;
        private int delinquenciesOver30Days;
        private int delinquenciesOver60Days;
        private int delinquenciesOver90Days;
        private int investmentTypeid;
        private String investmentTypeDescription;
        private boolean isHomeowner;
        private double dtIwprosperLoan;
        private String occupation;

        public Builder withMemberKey(String memberKey) {
            this.memberKey = memberKey;
            return this;
        }

        public Builder withListingNumber(int listingNumber) {
            this.listingNumber = listingNumber;
            return this;
        }

        public Builder withCreditPullDate(String creditPullDate) {
            this.creditPullDate = creditPullDate;
            return this;
        }

        public Builder withListingStartDate(String listingStartDate) {
            this.listingStartDate = listingStartDate;
            return this;
        }

        public Builder withListingCreationDate(String listingCreationDate) {
            this.listingCreationDate = listingCreationDate;
            return this;
        }

        public Builder withListingStatus(int listingStatus) {
            this.listingStatus = listingStatus;
            return this;
        }

        public Builder withListingStatusReason(String listingStatusReason) {
            this.listingStatusReason = listingStatusReason;
            return this;
        }

        public Builder withVerificationStage(int verificationStage) {
            this.verificationStage = verificationStage;
            return this;
        }

        public Builder withListingAmount(int listingAmount) {
            this.listingAmount = listingAmount;
            return this;
        }

        public Builder withAmountFunded(double amountFunded) {
            this.amountFunded = amountFunded;
            return this;
        }

        public Builder withAmountRemaining(double amountRemaining) {
            this.amountRemaining = amountRemaining;
            return this;
        }

        public Builder withPercentFunded(double percentFunded) {
            this.percentFunded = percentFunded;
            return this;
        }

        public Builder withPartialFundingIndicator(boolean partialFundingIndicator) {
            this.partialFundingIndicator = partialFundingIndicator;
            return this;
        }

        public Builder withFundingThreshold(double fundingThreshold) {
            this.fundingThreshold = fundingThreshold;
            return this;
        }

        public Builder withProsperRating(String prosperRating) {
            this.prosperRating = prosperRating;
            return this;
        }

        public Builder withEstimatedReturn(double estimatedReturn) {
            this.estimatedReturn = estimatedReturn;
            return this;
        }

        public Builder withEstimatedLossRate(double estimatedLossRate) {
            this.estimatedLossRate = estimatedLossRate;
            return this;
        }

        public Builder withLenderYield(double lenderYield) {
            this.lenderYield = lenderYield;
            return this;
        }

        public Builder withEffectiveYield(double effectiveYield) {
            this.effectiveYield = effectiveYield;
            return this;
        }

        public Builder withBorrowerRate(double borrowerRate) {
            this.borrowerRate = borrowerRate;
            return this;
        }

        public Builder withBorrowerApr(double borrowerApr) {
            this.borrowerApr = borrowerApr;
            return this;
        }

        public Builder withListingTerm(int listingTerm) {
            this.listingTerm = listingTerm;
            return this;
        }

        public Builder withListingMonthlyPayment(double listingMonthlyPayment) {
            this.listingMonthlyPayment = listingMonthlyPayment;
            return this;
        }

        public Builder withScorex(String scorex) {
            this.scorex = scorex;
            return this;
        }

        public Builder withFicoScore(String ficoScore) {
            this.ficoScore = ficoScore;
            return this;
        }

        public Builder withProsperScore(int prosperScore) {
            this.prosperScore = prosperScore;
            return this;
        }

        public Builder withListingCategoryId(int listingCategoryId) {
            this.listingCategoryId = listingCategoryId;
            return this;
        }

        public Builder withListingTitle(String listingTitle) {
            this.listingTitle = listingTitle;
            return this;
        }

        public Builder withIncomeRange(int incomeRange) {
            this.incomeRange = incomeRange;
            return this;
        }

        public Builder withIncomeRangeDescription(String incomeRangeDescription) {
            this.incomeRangeDescription = incomeRangeDescription;
            return this;
        }

        public Builder withStatedMonthlyIncome(double statedMonthlyIncome) {
            this.statedMonthlyIncome = statedMonthlyIncome;
            return this;
        }

        public Builder withIncomeVerifiable(boolean incomeVerifiable) {
            this.incomeVerifiable = incomeVerifiable;
            return this;
        }

        public Builder withDtiWprosperLoan(double dtiWprosperLoan) {
            this.dtiWprosperLoan = dtiWprosperLoan;
            return this;
        }

        public Builder withEmploymentStatusDescription(String employmentStatusDescription) {
            this.employmentStatusDescription = employmentStatusDescription;
            return this;
        }

        public Builder withMonthsEmployed(int monthsEmployed) {
            this.monthsEmployed = monthsEmployed;
            return this;
        }

        public Builder withBorrowerState(String borrowerState) {
            this.borrowerState = borrowerState;
            return this;
        }

        public Builder withBorrowerCity(String borrowerCity) {
            this.borrowerCity = borrowerCity;
            return this;
        }

        public Builder withBorrowerMetropolitanArea(String borrowerMetropolitanArea) {
            this.borrowerMetropolitanArea = borrowerMetropolitanArea;
            return this;
        }

        public Builder withPriorProsperLoansActive(int priorProsperLoansActive) {
            this.priorProsperLoansActive = priorProsperLoansActive;
            return this;
        }

        public Builder withPriorProsperLoans(int priorProsperLoans) {
            this.priorProsperLoans = priorProsperLoans;
            return this;
        }

        public Builder withLenderIndicator(int lenderIndicator) {
            this.lenderIndicator = lenderIndicator;
            return this;
        }

        public Builder withGroupIndicator(boolean groupIndicator) {
            this.groupIndicator = groupIndicator;
            return this;
        }

        public Builder withChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }

        public Builder withAmountParticipation(int amountParticipation) {
            this.amountParticipation = amountParticipation;
            return this;
        }

        public Builder withMonthlyDebt(int monthlyDebt) {
            this.monthlyDebt = monthlyDebt;
            return this;
        }

        public Builder withCurrentDelinquencies(int currentDelinquencies) {
            this.currentDelinquencies = currentDelinquencies;
            return this;
        }

        public Builder withDelinquenciesLast7Years(int delinquenciesLast7Years) {
            this.delinquenciesLast7Years = delinquenciesLast7Years;
            return this;
        }

        public Builder withPublicRecordsLast10Years(int publicRecordsLast10Years) {
            this.publicRecordsLast10Years = publicRecordsLast10Years;
            return this;
        }

        public Builder withPublicRecordsLast12Months(int publicRecordsLast12Months) {
            this.publicRecordsLast12Months = publicRecordsLast12Months;
            return this;
        }

        public Builder withFirstRecordedCreditLine(String firstRecordedCreditLine) {
            this.firstRecordedCreditLine = firstRecordedCreditLine;
            return this;
        }

        public Builder withCreditLinesLast7Years(int creditLinesLast7Years) {
            this.creditLinesLast7Years = creditLinesLast7Years;
            return this;
        }

        public Builder withInquiriesLast6Months(int inquiriesLast6Months) {
            this.inquiriesLast6Months = inquiriesLast6Months;
            return this;
        }

        public Builder withAmountDelinquent(int amountDelinquent) {
            this.amountDelinquent = amountDelinquent;
            return this;
        }

        public Builder withCurrentCreditLines(int currentCreditLines) {
            this.currentCreditLines = currentCreditLines;
            return this;
        }

        public Builder withOpenCreditLines(int openCreditLines) {
            this.openCreditLines = openCreditLines;
            return this;
        }

        public Builder withBankcardUtilization(double bankcardUtilization) {
            this.bankcardUtilization = bankcardUtilization;
            return this;
        }

        public Builder withTotalOpenRevolvingAccounts(int totalOpenRevolvingAccounts) {
            this.totalOpenRevolvingAccounts = totalOpenRevolvingAccounts;
            return this;
        }

        public Builder withInstallmentBalance(int installmentBalance) {
            this.installmentBalance = installmentBalance;
            return this;
        }

        public Builder withRealEstateBalance(int realEstateBalance) {
            this.realEstateBalance = realEstateBalance;
            return this;
        }

        public Builder withRevolvingBalance(int revolvingBalance) {
            this.revolvingBalance = revolvingBalance;
            return this;
        }

        public Builder withRealEstatePayment(int realEstatePayment) {
            this.realEstatePayment = realEstatePayment;
            return this;
        }

        public Builder withRevolvingAvailablePercent(int revolvingAvailablePercent) {
            this.revolvingAvailablePercent = revolvingAvailablePercent;
            return this;
        }

        public Builder withTotalInquiries(int totalInquiries) {
            this.totalInquiries = totalInquiries;
            return this;
        }

        public Builder withTotalTradeItems(int totalTradeItems) {
            this.totalTradeItems = totalTradeItems;
            return this;
        }

        public Builder withSatisfactoryAccounts(int satisfactoryAccounts) {
            this.satisfactoryAccounts = satisfactoryAccounts;
            return this;
        }

        public Builder withNowDelinquentDerog(int nowDelinquentDerog) {
            this.nowDelinquentDerog = nowDelinquentDerog;
            return this;
        }

        public Builder withWasDelinquentDerog(int wasDelinquentDerog) {
            this.wasDelinquentDerog = wasDelinquentDerog;
            return this;
        }

        public Builder withOldestTradeOpenDate(String oldestTradeOpenDate) {
            this.oldestTradeOpenDate = oldestTradeOpenDate;
            return this;
        }

        public Builder withDelinquenciesOver30Days(int delinquenciesOver30Days) {
            this.delinquenciesOver30Days = delinquenciesOver30Days;
            return this;
        }

        public Builder withDelinquenciesOver60Days(int delinquenciesOver60Days) {
            this.delinquenciesOver60Days = delinquenciesOver60Days;
            return this;
        }

        public Builder withDelinquenciesOver90Days(int delinquenciesOver90Days) {
            this.delinquenciesOver90Days = delinquenciesOver90Days;
            return this;
        }

        public Builder withInvestmentTypeid(int investmentTypeid) {
            this.investmentTypeid = investmentTypeid;
            return this;
        }

        public Builder withInvestmentTypeDescription(String investmentTypeDescription) {
            this.investmentTypeDescription = investmentTypeDescription;
            return this;
        }

        public Builder withIsHomeowner(boolean isHomeowner) {
            this.isHomeowner = isHomeowner;
            return this;
        }

        public Builder withDtIwprosperLoan(double dtIwprosperLoan) {
            this.dtIwprosperLoan = dtIwprosperLoan;
            return this;
        }

        public Builder withOccupation(String occupation) {
            this.occupation = occupation;
            return this;
        }

        public SearchListing build() {
            return new SearchListing(this);
        }
    }
}
