package in.laxmi.binding;

import java.io.Serializable;

import lombok.Data;

@Data
public class Country implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private Integer sNo;
	private String name;
	private String countryCode;

	public Integer getsNo() {
		return sNo;
	}

	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}

}
