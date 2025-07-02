package com.example.HibernateValidator.Model;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

public class HibernateValidator {

	// User ID (required, not null)
	@NotNull(message = "Invalid ID. Please enter your ID.")
	private Long geekUserId;

	// User name (required, not empty, size between 3 and 20)
	@Size(max = 20, min = 3, message = "Invalid name. Size should be between 3 to 20.")
	@NotEmpty(message = "Please enter your name.")
	private String geekUserName;

	// User email ID (required, not empty, valid email format)
	@Email(message = "Invalid email address. Please enter a proper email ID.")
	@NotEmpty(message = "Please enter your email ID.")
	private String geekUserEmailId;

	// User age (digits only, 3 digits max)
	@Digits(integer = 3, fraction = 0, message = "Invalid age. Maximum valid number for age is 3 digits.")
	private int geekAge;

	// Maximum allowed articles to write per day (max value 5)
	@Max(value = 5, message = "Invalid number of articles. Maximum allowed is 5.")
	private String currentTimeOfWritingArticles;

	// Minimum allowed articles for review (min value 3)
	@Min(value = 3, message = "Invalid number of articles for review. Minimum should be 3.")
	private String allowedForArticleReviewing;

	// Proficiency level 3 (required, not blank)
	@NotBlank(message = "Proficiency level 3 should not be blank.")
	private String proficiency3;

	// Proficiency level 4 (optional, must be null)
	@Null(message = "Proficiency level 4 should be null.")
	private String proficiency4;

	// Proficiency level 5 (required, must match Y/N pattern, case-insensitive)
	@Pattern(regexp = "YN", flags = {
			Pattern.Flag.CASE_INSENSITIVE }, message = "Invalid proficiency level 5. Enter Y or N.")
	private String proficiency5;

	// User rating (positive value only)
	@Positive(message = "Invalid rating. Value should be positive.")
	private int rating;

	// Blocklisted status (negative or zero only)
	@NegativeOrZero(message = "Invalid blocklisted status. Input number should be negative or zero.")
	private int blocklisted;

	// Future date (must be after today)
	@Future(message = "Invalid date. It should be provided as a future date.")
	private Date futureDate;

	// Future or present date (must be today or later)
	@FutureOrPresent(message = "Invalid date. It should be provided as a future or present date.")
	private Date futureOrPresent;

	// Past or present date (must be today or earlier)
	@PastOrPresent(message = "Invalid date. It should be provided as a past or present date.")
	private Date pastOrPresent;

	// Range example (value between 1 and 3)
	@Range(min = 1, max = 3, message = "Invalid range. Range should be within 1 to 3.")
	private int rangeExample;

	// URL example (must be a valid URL)
	@URL(message = "Invalid URL. Please provide a valid URL.")
	private String urlExample;

	// Credit card example (must be a valid credit card number)
	@CreditCardNumber(message = "Invalid credit card number. It should not contain invalid characters.")
	private String creditCardExample;

	public HibernateValidator(Long geekUserId, String geekUserName, String geekUserEmailId, int geekAge,
			String currentTimeOfWritingArticles, String allowedForArticleReviewing, String proficiency3,
			String proficiency4, String proficiency5, int rating, int blocklisted, Date futureDate,
			Date futureOrPresent, Date pastOrPresent, int rangeExample, String urlExample, String creditCardExample) {
		super();
		this.geekUserId = geekUserId;
		this.geekUserName = geekUserName;
		this.geekUserEmailId = geekUserEmailId;
		this.geekAge = geekAge;
		this.currentTimeOfWritingArticles = currentTimeOfWritingArticles;
		this.allowedForArticleReviewing = allowedForArticleReviewing;
		this.proficiency3 = proficiency3;
		this.proficiency4 = proficiency4;
		this.proficiency5 = proficiency5;
		this.rating = rating;
		this.blocklisted = blocklisted;
		this.futureDate = futureDate;
		this.futureOrPresent = futureOrPresent;
		this.pastOrPresent = pastOrPresent;
		this.rangeExample = rangeExample;
		this.urlExample = urlExample;
		this.creditCardExample = creditCardExample;
	}

	public Long getGeekUserId() {
		return geekUserId;
	}

	public void setGeekUserId(Long geekUserId) {
		this.geekUserId = geekUserId;
	}

	public String getGeekUserName() {
		return geekUserName;
	}

	public void setGeekUserName(String geekUserName) {
		this.geekUserName = geekUserName;
	}

	public String getGeekUserEmailId() {
		return geekUserEmailId;
	}

	public void setGeekUserEmailId(String geekUserEmailId) {
		this.geekUserEmailId = geekUserEmailId;
	}

	public int getGeekAge() {
		return geekAge;
	}

	public void setGeekAge(int geekAge) {
		this.geekAge = geekAge;
	}

	public String getCurrentTimeOfWritingArticles() {
		return currentTimeOfWritingArticles;
	}

	public void setCurrentTimeOfWritingArticles(String currentTimeOfWritingArticles) {
		this.currentTimeOfWritingArticles = currentTimeOfWritingArticles;
	}

	public String getAllowedForArticleReviewing() {
		return allowedForArticleReviewing;
	}

	public void setAllowedForArticleReviewing(String allowedForArticleReviewing) {
		this.allowedForArticleReviewing = allowedForArticleReviewing;
	}

	public String getProficiency3() {
		return proficiency3;
	}

	public void setProficiency3(String proficiency3) {
		this.proficiency3 = proficiency3;
	}

	public String getProficiency4() {
		return proficiency4;
	}

	public void setProficiency4(String proficiency4) {
		this.proficiency4 = proficiency4;
	}

	public String getProficiency5() {
		return proficiency5;
	}

	public void setProficiency5(String proficiency5) {
		this.proficiency5 = proficiency5;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getBlocklisted() {
		return blocklisted;
	}

	public void setBlocklisted(int blocklisted) {
		this.blocklisted = blocklisted;
	}

	public Date getFutureDate() {
		return futureDate;
	}

	public void setFutureDate(Date futureDate) {
		this.futureDate = futureDate;
	}

	public Date getFutureOrPresent() {
		return futureOrPresent;
	}

	public void setFutureOrPresent(Date futureOrPresent) {
		this.futureOrPresent = futureOrPresent;
	}

	public Date getPastOrPresent() {
		return pastOrPresent;
	}

	public void setPastOrPresent(Date pastOrPresent) {
		this.pastOrPresent = pastOrPresent;
	}

	public int getRangeExample() {
		return rangeExample;
	}

	public void setRangeExample(int rangeExample) {
		this.rangeExample = rangeExample;
	}

	public String getUrlExample() {
		return urlExample;
	}

	public void setUrlExample(String urlExample) {
		this.urlExample = urlExample;
	}

	public String getCreditCardExample() {
		return creditCardExample;
	}

	public void setCreditCardExample(String creditCardExample) {
		this.creditCardExample = creditCardExample;
	}

	/**
	 * @param geekUserId                   - It should not be null
	 * @param geekUserName                 - It should not be empty and its size
	 *                                     should be between 3 to 20
	 * @param geekUserEmailId              - It should not be empty and should be a
	 *                                     proper emailId
	 * @param geekAge                      - Age value should be in 3 digit
	 * @param currentTimeOfWritingArticles - Maximum currentTimeOfWritingArticles is
	 *                                     5
	 * @param proficiency2                 - Minimum Length of proficiency2 is 3
	 * @param proficiency3                 - Proficiency 3 Should not be blank
	 * @param proficiency4                 - Proficiency 4 should be null
	 * @param proficiency5                 - Invalid Proficiency 5, Enter text not
	 *                                     matches with the standards
	 * @param rating                       - Invalid Rating, Value should be
	 *                                     positive
	 * @param blocklisted                  - Invalid value for blocklisted, Input
	 *                                     Number should be negative or Zero
	 * @param futureDate                   - Invalid date, It should be provided as
	 *                                     future date
	 * @param futureOrPresent              - Invalid date, It should be as future or
	 *                                     present date
	 * @param pastOrPresent                - Invalid date, It should be as Past or
	 *                                     present date
	 * @param rangeExample                 - Invalid Range is given, Range should be
	 *                                     within 1 to 3
	 * @param urlExample                   - Invalid Url, Please provide a valid URL
	 * @param creditCardExample            - Invalid Creditcard, It should not
	 *                                     contain invalid character
	 */

}