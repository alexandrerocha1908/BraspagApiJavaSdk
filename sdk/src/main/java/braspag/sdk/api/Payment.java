package braspag.sdk.api;

public class Payment {
	private Type type;
	private Integer amount;
	private Currency currency;
	private String country;
	private Provider provider;
	private Integer serviceTaxAmount;
	private Integer installments;
	private String interest;
	private boolean capture = false;
	private boolean authenticate = false;
	private boolean recurrent;
	private String softDescriptor = "";
	private String returnUrl;
	private Object extraDataCollection[];
	private CreditCard creditCard;
	private String acquirerTransactionId;
	private String proofOfSale;
	private String authorizationCode;
	private String paymentId;
	private String receivedDate;
	private Integer capturedAmount;
	private String capturedDate;
	private String reasonCode;
	private String reasonMessage;
	private String providerReturnCode;
	private String providerReturnMessage;
	private Integer status;
	private Object links[];
	private String authenticationUrl;
	private String url;
	private String expirationDate;
	private String boletoNumber;
	private String barCodeNumber;
	private String digitableLine;
	private String address;
	private RecurrentPayment recurrentPayment;

	public Payment(Integer amount, Integer installments) {
		setAmount(amount);
		setInstallments(installments);
	}

	public Payment(Integer amount) {
		this(amount, 1);
	}

	public String getAcquirerTransactionId() {
		return acquirerTransactionId;
	}

	public Payment setAcquirerTransactionId(String acquirerTransactionId) {
		this.acquirerTransactionId = acquirerTransactionId;
		return this;
	}

	public String getAuthenticationUrl() {
		return authenticationUrl;
	}

	public Payment setAuthenticationUrl(String authenticationUrl) {
		this.authenticationUrl = authenticationUrl;
		return this;
	}

	public String getProviderReturnCode() {
		return providerReturnCode;
	}

	public Payment setProviderReturnCode(String providerReturnCode) {
		this.providerReturnCode = providerReturnCode;
		return this;
	}

	public String getProviderReturnMessage() {
		return providerReturnMessage;
	}

	public Payment setProviderReturnMessage(String providerReturnMessage) {
		this.providerReturnMessage = providerReturnMessage;
		return this;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public Payment setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
		return this;
	}

	public String getReasonMessage() {
		return reasonMessage;
	}

	public Payment setReasonMessage(String reasonMessage) {
		this.reasonMessage = reasonMessage;
		return this;
	}

	public CreditCard creditCard(String securityCode, String brand) {
		setType(Type.CreditCard);
		setCreditCard(new CreditCard(securityCode, brand));

		return getCreditCard();
	}

	public RecurrentPayment recurrentPayment(boolean authorizeNow) {
		setRecurrentPayment(new RecurrentPayment(authorizeNow));

		return getRecurrentPayment();
	}

	public Integer getAmount() {
		return amount;
	}

	public Payment setAmount(Integer amount) {
		this.amount = amount;
		return this;
	}

	public boolean getAuthenticate() {
		return authenticate;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public Payment setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
		return this;
	}

	public boolean getCapture() {
		return capture;
	}

	public Integer getCapturedAmount() {
		return capturedAmount;
	}

	public Payment setCapturedAmount(Integer capturedAmount) {
		this.capturedAmount = capturedAmount;
		return this;
	}

	public String getCapturedDate() {
		return capturedDate;
	}

	public Payment setCapturedDate(String capturedDate) {
		this.capturedDate = capturedDate;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public Payment setCountry(String country) {
		this.country = country;
		return this;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public Payment setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
		return this;
	}

	public Currency getCurrency() {
		return currency;
	}

	public Payment setCurrency(Currency currency) {
		this.currency = currency;
		return this;
	}

	public Integer getInstallments() {
		return installments;
	}

	public Payment setInstallments(Integer installments) {
		this.installments = installments;
		return this;
	}

	public String getInterest() {
		return interest;
	}

	public Payment setInterest(String interest) {
		this.interest = interest;
		return this;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public Payment setPaymentId(String paymentId) {
		this.paymentId = paymentId;
		return this;
	}

	public String getProofOfSale() {
		return proofOfSale;
	}

	public Payment setProofOfSale(String proofOfSale) {
		this.proofOfSale = proofOfSale;
		return this;
	}

	public Provider getProvider() {
		return provider;
	}

	public Payment setProvider(Provider provider) {
		this.provider = provider;
		return this;
	}

	public String getReceivedDate() {
		return receivedDate;
	}

	public Payment setReceivedDate(String receivedDate) {
		this.receivedDate = receivedDate;
		return this;
	}

	public boolean isRecurrent() {
		return recurrent;
	}

	public Payment setRecurrent(boolean recurrent) {
		this.recurrent = recurrent;
		return this;
	}

	public RecurrentPayment getRecurrentPayment() {
		return recurrentPayment;
	}

	public Payment setRecurrentPayment(RecurrentPayment recurrentPayment) {
		this.recurrentPayment = recurrentPayment;
		return this;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public Payment setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
		return this;
	}

	public Integer getServiceTaxAmount() {
		return serviceTaxAmount;
	}

	public Payment setServiceTaxAmount(Integer serviceTaxAmount) {
		this.serviceTaxAmount = serviceTaxAmount;
		return this;
	}

	public String getSoftDescriptor() {
		return softDescriptor;
	}

	public Payment setSoftDescriptor(String softDescriptor) {
		this.softDescriptor = softDescriptor;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public Payment setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public Type getType() {
		return type;
	}

	public Payment setType(Type type) {
		this.type = type;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public Payment setAddress(String address) {
		this.address = address;
		return this;
	}

	public boolean isAuthenticate() {
		return authenticate;
	}

	public Payment setAuthenticate(boolean authenticate) {
		this.authenticate = authenticate;
		return this;
	}

	public String getBarCodeNumber() {
		return barCodeNumber;
	}

	public Payment setBarCodeNumber(String barCodeNumber) {
		this.barCodeNumber = barCodeNumber;
		return this;
	}

	public boolean isCapture() {
		return capture;
	}

	public Payment setCapture(boolean capture) {
		this.capture = capture;
		return this;
	}

	public String getDigitableLine() {
		return digitableLine;
	}

	public Payment setDigitableLine(String digitableLine) {
		this.digitableLine = digitableLine;
		return this;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public Payment setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}

	public Object[] getExtraDataCollection() {
		return extraDataCollection;
	}

	public Object[] getLinks() {
		return links;
	}

	public String getBoletoNumber() {
		return boletoNumber;
	}

	public Payment setBoletoNumber(String boletoNumber) {
		this.boletoNumber = boletoNumber;
		return this;
	}

	public String getUrl() {
		return url;
	}

	public Payment setUrl(String url) {
		this.url = url;
		return this;
	}

	public enum Provider {
		Bradesco, BancoDoBrasil, Simulado
	}

	public enum Type {
		CreditCard, DebitCard, ElectronicTransfer, Boleto
	}

	public enum Currency {
		BRL, USD, MXN, COP, CLP, ARS, PEN, EUR, PYN, UYU, VEB, VEF, GBP
	}
}