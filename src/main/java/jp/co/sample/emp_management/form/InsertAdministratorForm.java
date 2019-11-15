package jp.co.sample.emp_management.form;

import javax.validation.constraints.NotBlank;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message = "名前の入力は必須です")
	private String name;
	/** メールアドレス */
	@NotBlank(message = "メールアドレスの入力は必須です")
	private String mailAddress;
	/** パスワード */
	@NotBlank(message = "パスワードの入力は必須です")
	private String password;
	/** 確認用パスワード */
	@NotBlank(message = "確認用パスワードの入力は必須です")
	private String conPassword;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConPassword() {
		return conPassword;
	}

	public void setConPassword(String conPassword) {
		this.conPassword = conPassword;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", conPassword=" + conPassword + "]";
	}

}
